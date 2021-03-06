package edu.aku.hassannaqvi.foodfortification_marketsurvey.ui;

import static edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.foodfortification_marketsurvey.R;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.models.EnumBlocks;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.models.Form;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.ui.sections.SectionAActivity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> distNames;
    private ArrayList<String> distCodes;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private Intent openIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        populateSpinner();

        openIntent = new Intent();
        switch (MainApp.idType) {
            case 1:
                bi.btnContinue.setText(R.string.open_hh_form);
                MainApp.form = new Form();
                openIntent = new Intent(this, SectionAActivity.class);
                break;
         /*   case 2:
                bi.btnContinue.setText(R.string.open_anhtro_form);
                MainApp.anthro = new Anthro();
                openIntent = new Intent(this, SectionAnthroActivity.class);
                break;
            case 3:
                bi.btnContinue.setText(R.string.open_blood_form);
                //     MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;
            case 4:
                bi.btnContinue.setText(R.string.open_stool_form);
                //    MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;*/

        }

        setupListeners();
      /*  bi.a105.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.a109.setText(null);  // Village
                bi.a105.setText(null);  // EnumBlock
                //   bi.a110.setText(null);
                // bi.ahhead.setText(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
            }
        });

        bi.a109.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.ahhead.setText(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
            }
        });
*/

    }

    private void setupListeners() {

        bi.ebCheck.setOnCheckedChangeListener((compoundButton, b) -> {
            Clear.clearAllFields(bi.a105, !b);
        });

    }


    private void populateSpinner() {
        Log.d(TAG, "populateSpinner: ");
        Collection<EnumBlocks> districts = db.getAllDistricts();
        distNames = new ArrayList<>();
        distCodes = new ArrayList<>();

        distNames.add("...");
        distCodes.add("...");

        for (EnumBlocks ebDist : districts) {

            distNames.add(ebDist.getDistrictName());
            distCodes.add(ebDist.getDistrictCode());

        }
        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            distNames.add("Test Dist 9");
            distNames.add("Test Dist 8");
            distNames.add("Test Dist 7");
            distCodes.add("999");
            distCodes.add("888");
            distCodes.add("777");


        }
        // Apply the adapter to the spinner
        bi.a107.setAdapter(new ArrayAdapter<>(IdentificationActivity.this, R.layout.custom_spinner, distNames));
        Log.d(TAG, "populateSpinner: setAdapter107");
        bi.a107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.a108.setAdapter(null);
                bi.a109.setText(null);
                bi.a105.setText(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                //  bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                //  bi.checkHousehold.setEnabled(true);

                if (position == 0) return;
                Collection<EnumBlocks> tehsil = db.getTehsilByDist(distCodes.get(position));
                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();
                tehsilNames.add("...");
                tehsilCodes.add("...");

                for (EnumBlocks ebTehsil : tehsil) {
                    tehsilNames.add(ebTehsil.getTehsilName());
                    tehsilCodes.add(ebTehsil.getTehsilCode());

                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    tehsilNames.add("Test Tehsil 1 " + distNames.get(position));
                    tehsilNames.add("Test Tehsil 2 " + distNames.get(position));
                    tehsilNames.add("Test Tehsil 3 " + distNames.get(position));

                    tehsilCodes.add("1" + distCodes.get(position));
                    tehsilCodes.add("2" + distCodes.get(position));
                    tehsilCodes.add("3" + distCodes.get(position));

                }
                // Apply the adapter to the spinner
                bi.a108.setAdapter(new ArrayAdapter<>(IdentificationActivity.this, R.layout.custom_spinner, tehsilNames));
                Log.d(TAG, "onItemSelected: setAdapter108");
/*                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);*/
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.btnContinue.setEnabled(true);
/*                if (position == 0) return;
                Collection<HealthFacilities> healthFacility = db.getHealthFacilityByDist(distCodes.get(position));
                healthFacilityNames = new ArrayList<>();
                healthFacilityCodes = new ArrayList<>();
                healthFacilityNames.add("...");
                healthFacilityCodes.add("...");

                for (HealthFacilities hf : healthFacility) {
                    healthFacilityNames.add(hf.getHfName());
                    healthFacilityCodes.add(hf.getHfCode());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    healthFacilityNames.add("Test HealthFacility 1 " + distNames.get(position));
                    healthFacilityNames.add("Test HealthFacility 2 " + distNames.get(position));
                    healthFacilityNames.add("Test HealthFacility 3 " + distNames.get(position));
                    healthFacilityCodes.add(distCodes.get(position) + "001");
                    healthFacilityCodes.add(distCodes.get(position) + "002");
                    healthFacilityCodes.add(distCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.a110.setAdapter(new ArrayAdapter<>(LhwIdentificationActivity.this, R.layout.custom_spinner, healthFacilityNames));*/

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        switch (MainApp.idType) {
            case 1:
                if (!hhExists())
                    saveDraftForm();
                finish();
                startActivity(openIntent);
                break;
            /*case 2:
                if (hhExists()) {
                    saveDraftAnthro();
                    finish();
                    startActivity(openIntent);
                } else {
                    Toast.makeText(this, getString(R.string.info_hh_form_not_exist), Toast.LENGTH_LONG).show();
                }
                break;
            case 3:
            case 4:
                if (hhExists()) {
                    saveDraftSamples();
                    finish();
                    startActivity(openIntent);
                } else {
                    Toast.makeText(this, getString(R.string.info_hh_form_not_exist), Toast.LENGTH_LONG).show();
                }
                break;*/

        }
    }


    private void saveDraftForm() {
        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.form.setA107(distCodes.get(bi.a107.getSelectedItemPosition()));
        MainApp.form.setA108(tehsilCodes.get(bi.a108.getSelectedItemPosition()));
        MainApp.form.setA109(bi.a109.getText().toString());
        MainApp.form.setA105(bi.a105.getText().toString());
        MainApp.form.setA114a(bi.a114a.getText().toString());

        // Shop's Unique ID
        MainApp.form.setShopNo(distCodes.get(bi.a107.getSelectedItemPosition()) + "-" + bi.a114a.getText().toString());

    }

   /* private void saveDraftAnthro() {
        MainApp.anthro = new Anthro();

        MainApp.anthro.setUserName(MainApp.user.getUserName());
        MainApp.anthro.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.anthro.setDeviceId(MainApp.deviceid);
        MainApp.anthro.setAppver(MainApp.versionName + "." + MainApp.versionCode);

    }

    private void saveDraftSamples() {

        MainApp.samples = new Samples();
        MainApp.samples.setUserName(MainApp.user.getUserName());
        MainApp.samples.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.samples.setDeviceId(MainApp.deviceid);
        MainApp.samples.setAppver(MainApp.versionName + "." + MainApp.versionCode);
    }*/


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    /*public void checkHousehold(View view) {
        RandomHH testRand = new RandomHH();
        testRand.setShopNo("1");
        testRand.setEbcode("909090909");
        testRand.setHeadhh("Test Head");
        testRand.setHhno("999-99");
        RandomHH randHH = new RandomHH();
        if (!bi.a105.getText().toString().equals("909090909")) {
            randHH = db.getHHbyEnumBlocks(bi.a105.getText().toString(), bi.a110.getText().toString());
        } else {
            randHH = testRand;
        }
        if (!randHH.getEbcode().equals("")) {
            bi.ahhead.setError(null);
            bi.ahhead.setText(randHH.getHeadhh());
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);

            MainApp.currentHousehold = randHH;

        } else {
            bi.ahhead.setError("Not Found!");
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
        }
        *//*ArrayList<String> households = new ArrayList<String>();
        for (RandomHH r : randHH) {
            households.add(r.getHhno());
            headHH = new ArrayList<String>();
            headHH.add(r.getHeadhh());
        }*//*
    }*/

    private boolean hhExists() {

        MainApp.form = new Form();

        try {
            MainApp.form = db.getFormByShopNo(distCodes.get(bi.a107.getSelectedItemPosition()) + "-" + bi.a114a.getText().toString());
        } catch (JSONException e) {
            Toast.makeText(this, "JSONException(form): " + e.getMessage(), Toast.LENGTH_SHORT).show();

        }

        return MainApp.form != null;

    }
}

/*    public void searchEB(View view) {
        bi.btnContinue.setEnabled(false);
        EnumBlocks testEb = new EnumBlocks();
        testEb.setEnumBlock("909090909");
        testEb.setDistrictName("Test District 9");
        testEb.setTehsilName("Test Tehsil 9");
        EnumBlocks enumBlock = new EnumBlocks();
        if (!bi.a105.getText().toString().equals(testEb.getEnumBlock())) {
            enumBlock = db.getEnumBlocks(bi.a105.getText().toString());
        } else {
            enumBlock = testEb;
        }

        *//*distCode = new ArrayList<>();
        districtNames = new ArrayList<>();
        tehsilNames = new ArrayList<>();
        for (EnumBlocks eb : enumBlocks) {
            distCode.add(eb.getEnumBlock());
            districtNames.add(eb.getDistrictName());
            tehsilNames.add(eb.getTehsilName()); //
        }*//*
        if (!enumBlock.getEnumBlock().equals("")) {
            bi.a107.setError(null);
            bi.a108.setError(null);
            bi.a107.setText(enumBlock.getDistrictName());
            bi.a108.setText(enumBlock.getTehsilName());
            bi.fldGrpHH.setVisibility(View.VISIBLE);

        } else {
            bi.a107.setError("Not Found!");
            bi.a108.setError("Not Found!");
            bi.a110.setText(null);
            bi.ahhead.setText(null);
            bi.fldGrpHH.setVisibility(View.GONE);
        }
    }*/

