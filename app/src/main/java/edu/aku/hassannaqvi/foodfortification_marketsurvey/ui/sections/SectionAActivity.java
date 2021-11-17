package edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.foodfortification_marketsurvey.R;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.EndingActivity;

public class SectionAActivity extends AppCompatActivity {
    private static final String TAG = "SectionAActivity";
    ActivitySectionABinding bi;
    private DatabaseHelper db;
    private boolean respAgeCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        bi.setForm(form);
        bi.setCallback(this);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
    }


    public void ageSkip(CharSequence s, int i, int i1, int i2) {
        if (TextUtils.isEmpty(bi.a112.getText())) return;
        if (Integer.parseInt(bi.a112.getText().toString()) < 18) {
            Clear.clearAllFields(bi.fldGrpCVa11201);
            bi.fldGrpCVa11201.setVisibility(View.GONE);
            bi.btnContinue.setVisibility(View.GONE);
            respAgeCheck = false;
        } else {
            bi.fldGrpCVa11201.setVisibility(View.VISIBLE);
            bi.btnContinue.setVisibility(View.VISIBLE);
            respAgeCheck = true;
        }
    }

    private boolean insertNewRecord() {
        if (!form.getUid().equals("")) return true;
        MainApp.form.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addForm(form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SA, form.sAtoString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;
        if (form.getA110().equals("1")) {
            int total = Integer.parseInt(bi.a11802.getText().toString()) + Integer.parseInt(bi.a11803.getText().toString());

            if (total != Integer.parseInt(bi.a11801.getText().toString()))
                return Validator.emptyCustomTextBox(this, bi.a11801, "Invalid count");
        }

        return true;
    }


    private void saveDraft() {
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            if (form.getA110().equals("2"))
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

            else if (form.getA123().equals("1") || form.getA123().equals("2") || form.getA123().equals("3"))
                startActivity(new Intent(this, SectionB1Activity.class).putExtra("complete", true));

            else if (form.getA123().equals("4") || form.getA123().equals("5") || form.getA123().equals("6") || form.getA123().equals("7") ||
                    form.getA123().equals("8") || form.getA123().equals("9") || form.getA123().equals("10"))
                startActivity(new Intent(this, SectionC1Activity.class).putExtra("complete", true));

            else if (form.getA123().equals("11") || form.getA123().equals("12"))
                startActivity(new Intent(this, SectionD1Activity.class).putExtra("complete", true));
            else if (form.getA123().equals("96"))
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

            else
                startActivity(new Intent(this, SectionE1Activity.class).putExtra("complete", true));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }
}