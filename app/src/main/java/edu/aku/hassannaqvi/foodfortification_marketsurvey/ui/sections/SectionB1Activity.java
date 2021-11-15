package edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.foodfortification_marketsurvey.R;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.databinding.ActivitySectionB1Binding;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.EndingActivity;

public class SectionB1Activity extends AppCompatActivity {
    private static final String TAG = "SectionB1Activity";
    ActivitySectionB1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b1);
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
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SB, form.sBtoString());
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
            startActivity(new Intent(this, SectionB2Activity.class).putExtra("complete", true));
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

    public boolean onTouch(View v, MotionEvent event) {
        boolean eventConsumed = true;
        int x = (int) event.getX();
        int y = (int) event.getY();

        int action = event.getAction();
        boolean dragging = false;
        if (action == MotionEvent.ACTION_DOWN) {
            dragging = true;
            eventConsumed = false;

        } else if (action == MotionEvent.ACTION_UP) {

//          if (dragging) {
//              emptyLetterView.getHitRect(hitRect);
//              if (hitRect.contains(x, y))
//                  setSameAbsoluteLocation(letterView, emptyLetterView);
//          }
            dragging = false;
            eventConsumed = false;

        } else if (action == MotionEvent.ACTION_MOVE) {
            if (dragging) {
                setAbsoluteLocationCentered(v, x, y);
            }
        }

        return eventConsumed;

    }

    private void setSameAbsoluteLocation(View v1, View v2) {
        AbsoluteLayout.LayoutParams alp2 = (AbsoluteLayout.LayoutParams) v2.getLayoutParams();
        setAbsoluteLocation(v1, alp2.x, alp2.y);
    }

    //This method helps the image to keep center of your touch point
    private void setAbsoluteLocationCentered(View v, int x, int y) {
        setAbsoluteLocation(v, x - v.getWidth() / 2, y - v.getHeight() / 2);
    }

    // this method help to place the image in exact position when your finger moved up (that is Action UP)
    private void setAbsoluteLocation(View v, int x, int y) {
        AbsoluteLayout.LayoutParams alp = (AbsoluteLayout.LayoutParams) v.getLayoutParams();

// don't forget to comment this line

        //alp.x = x;
        alp.y = y;
        v.setLayoutParams(alp);
    }
}