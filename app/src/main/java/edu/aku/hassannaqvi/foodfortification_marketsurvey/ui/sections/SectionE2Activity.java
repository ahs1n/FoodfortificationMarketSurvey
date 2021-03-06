package edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp.form;
import static edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.foodfortification_marketsurvey.R;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.databinding.ActivitySectionE2Binding;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.EndingActivity;

public class SectionE2Activity extends AppCompatActivity {
    private static final String TAG = "SectionE2Activity";
    ActivitySectionE2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e2);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        setupSkips();
    }


    private void setupSkips() {
    }


    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SE, form.sEtoString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}