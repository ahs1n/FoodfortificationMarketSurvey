package edu.aku.hassannaqvi.foodfortification_marketsurvey.models;

import static edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.foodfortification_marketsurvey.BR;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String distCode = _EMPTY_;
    private String tehsilCode = _EMPTY_;
    private String shopNo = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // SECTION VARIABLES
    private String sA = _EMPTY_;
    private String sB = _EMPTY_;
    private String sC = _EMPTY_;
    private String sD = _EMPTY_;
    private String sE = _EMPTY_;


    // FIELD VARIABLES
    private String a101 = _EMPTY_;
    private String a101d = _EMPTY_;
    private String a101m = _EMPTY_;
    private String a101y = _EMPTY_;
    private String a102 = _EMPTY_;
    private String a102h = _EMPTY_;
    private String a102m = _EMPTY_;
    private String a103 = _EMPTY_;
    private String a103a = _EMPTY_;
    private String a104 = _EMPTY_;
    private String a104a = _EMPTY_;
    private String a105 = _EMPTY_;
    private String a106 = _EMPTY_;
    private String a107 = _EMPTY_;
    private String a108 = _EMPTY_;
    private String a109 = _EMPTY_;
    private String a110 = _EMPTY_;
    private String a111 = _EMPTY_;
    private String a112 = _EMPTY_;
    private String a113 = _EMPTY_;
    private String a114 = _EMPTY_;
    private String a114a = _EMPTY_;
    private String a115 = _EMPTY_;
    private String a11502 = _EMPTY_;
    private String a11503 = _EMPTY_;
    private String a11504 = _EMPTY_;
    private String a116 = _EMPTY_;
    private String a117 = _EMPTY_;
    private String a11801 = _EMPTY_;
    private String a11802 = _EMPTY_;
    private String a11803 = _EMPTY_;
    private String a119 = _EMPTY_;
    private String a11901x = _EMPTY_;
    private String a11902x = _EMPTY_;
    private String a11903x = _EMPTY_;
    private String a120 = _EMPTY_;
    private String a12096x = _EMPTY_;
    private String a121 = _EMPTY_;
    private String a122 = _EMPTY_;
    private String a123 = _EMPTY_;
    private String a12396x = _EMPTY_;
    private String a124 = _EMPTY_;
    private String a12496x = _EMPTY_;
    private String b101 = _EMPTY_;
    private String b10101 = _EMPTY_;
    private String b10102 = _EMPTY_;
    private String b10103 = _EMPTY_;
    private String b10104 = _EMPTY_;
    private String b10196 = _EMPTY_;
    private String b10196x = _EMPTY_;
    private String b10198 = _EMPTY_;
    private String b102 = _EMPTY_;
    private String b10201 = _EMPTY_;
    private String b10202 = _EMPTY_;
    private String b10203 = _EMPTY_;
    private String b10296 = _EMPTY_;
    private String b103 = _EMPTY_;
    private String b10396x = _EMPTY_;
    private String b104 = _EMPTY_;
    private String b10401x = _EMPTY_;
    private String b10402x = _EMPTY_;
    private String b10403x = _EMPTY_;
    private String b10404x = _EMPTY_;
    private String b10496x = _EMPTY_;
    private String b105 = _EMPTY_;
    private String b10501 = _EMPTY_;
    private String b10502 = _EMPTY_;
    private String b10503 = _EMPTY_;
    private String b10504 = _EMPTY_;
    private String b10505 = _EMPTY_;
    private String b10506 = _EMPTY_;
    private String b10596 = _EMPTY_;
    private String b10596x = _EMPTY_;
    private String b10598 = _EMPTY_;
    private String b106 = _EMPTY_;
    private String b10601x = _EMPTY_;
    private String b107 = _EMPTY_;
    private String b10701x = _EMPTY_;
    private String b10702x = _EMPTY_;
    private String b10703x = _EMPTY_;
    private String b10704x = _EMPTY_;
    private String b10705x = _EMPTY_;
    private String b10706x = _EMPTY_;
    private String b10796 = _EMPTY_;
    private String b10796x = _EMPTY_;
    private String b10798 = _EMPTY_;
    private String b10799 = _EMPTY_;
    private String b108 = _EMPTY_;
    private String b109 = _EMPTY_;
    private String b110 = _EMPTY_;
    private String b111 = _EMPTY_;
    private String b112 = _EMPTY_;
    private String b11201x = _EMPTY_;
    private String b11202x = _EMPTY_;
    private String b11203x = _EMPTY_;
    private String b11204x = _EMPTY_;
    private String b11296x = _EMPTY_;
    private String b113 = _EMPTY_;
    private String b11301 = _EMPTY_;
    private String b11302 = _EMPTY_;
    private String b11303 = _EMPTY_;
    private String b11304 = _EMPTY_;
    private String b11305 = _EMPTY_;
    private String b11396 = _EMPTY_;
    private String b11396x = _EMPTY_;
    private String b11398 = _EMPTY_;
    private String b114 = _EMPTY_;
    private String b115 = _EMPTY_;
    private String b116 = _EMPTY_;
    private String b117 = _EMPTY_;
    private String b118 = _EMPTY_;
    private String b119 = _EMPTY_;
    private String b11901 = _EMPTY_;
    private String b11902 = _EMPTY_;
    private String b11903 = _EMPTY_;
    private String b11904 = _EMPTY_;
    private String b11905 = _EMPTY_;
    private String b11996 = _EMPTY_;
    private String b11996x = _EMPTY_;
    private String b11998 = _EMPTY_;
    private String b120 = _EMPTY_;
    private String b12096x = _EMPTY_;
    private String b121 = _EMPTY_;
    private String b12101x = _EMPTY_;
    private String b12102x = _EMPTY_;
    private String b12103x = _EMPTY_;
    private String b12104x = _EMPTY_;
    private String b12105x = _EMPTY_;
    private String b12106x = _EMPTY_;
    private String b12107x = _EMPTY_;
    private String b12108x = _EMPTY_;
    private String b12109x = _EMPTY_;
    private String b12110x = _EMPTY_;
    private String b12196x = _EMPTY_;
    private String b122 = _EMPTY_;
    private String b12201 = _EMPTY_;
    private String b12202 = _EMPTY_;
    private String b12203 = _EMPTY_;
    private String b12204 = _EMPTY_;
    private String b12205 = _EMPTY_;
    private String b12296 = _EMPTY_;
    private String b12296x = _EMPTY_;
    private String b12298 = _EMPTY_;
    private String b123 = _EMPTY_;
    private String b12301x = _EMPTY_;
    private String b12302x = _EMPTY_;
    private String b12303x = _EMPTY_;
    private String b12304x = _EMPTY_;
    private String b12305x = _EMPTY_;
    private String b12306x = _EMPTY_;
    private String b12396 = _EMPTY_;
    private String b12396x = _EMPTY_;
    private String b12398 = _EMPTY_;
    private String b12399 = _EMPTY_;
    private String b124 = _EMPTY_;
    private String b125 = _EMPTY_;
    private String b126 = _EMPTY_;
    private String b12601 = _EMPTY_;
    private String b12602 = _EMPTY_;
    private String b12603 = _EMPTY_;
    private String b12604 = _EMPTY_;
    private String b12605 = _EMPTY_;
    private String b12606 = _EMPTY_;
    private String b12607 = _EMPTY_;
    private String b12608 = _EMPTY_;
    private String b12609 = _EMPTY_;
    private String b12610 = _EMPTY_;
    private String b12696 = _EMPTY_;
    private String b12696x = _EMPTY_;
    private String b126198 = _EMPTY_;
    private String b127 = _EMPTY_;
    private String b12701 = _EMPTY_;
    private String b12702 = _EMPTY_;
    private String b12703 = _EMPTY_;
    private String b12704 = _EMPTY_;
    private String b12705 = _EMPTY_;
    private String b12706 = _EMPTY_;
    private String b12707 = _EMPTY_;
    private String b12708 = _EMPTY_;
    private String b12709 = _EMPTY_;
    private String b12796 = _EMPTY_;
    private String b12796x = _EMPTY_;
    private String b12798 = _EMPTY_;
    private String b128 = _EMPTY_;
    private String b129 = _EMPTY_;
    private String b12996x = _EMPTY_;
    private String b130 = _EMPTY_;
    private String b131 = _EMPTY_;
    private String b13101 = _EMPTY_;
    private String b13102 = _EMPTY_;
    private String b13103 = _EMPTY_;
    private String b13196 = _EMPTY_;
    private String b13196x = _EMPTY_;
    private String b132 = _EMPTY_;
    private String b133 = _EMPTY_;
    private String b13301 = _EMPTY_;
    private String b13302 = _EMPTY_;
    private String b13303 = _EMPTY_;
    private String b13304 = _EMPTY_;
    private String b13396 = _EMPTY_;
    private String b13396x = _EMPTY_;
    private String b13398 = _EMPTY_;
    private String c101 = _EMPTY_;
    private String c10101 = _EMPTY_;
    private String c10102 = _EMPTY_;
    private String c10103 = _EMPTY_;
    private String c10104 = _EMPTY_;
    private String c10105 = _EMPTY_;
    private String c10106 = _EMPTY_;
    private String c10107 = _EMPTY_;
    private String c10108 = _EMPTY_;
    private String c10109 = _EMPTY_;
    private String c10110 = _EMPTY_;
    private String c10196 = _EMPTY_;
    private String c10196x = _EMPTY_;
    private String c102 = _EMPTY_;
    private String c10201 = _EMPTY_;
    private String c10202 = _EMPTY_;
    private String c10203 = _EMPTY_;
    private String c10204 = _EMPTY_;
    private String c10205 = _EMPTY_;
    private String c10296 = _EMPTY_;
    private String c10296x = _EMPTY_;
    private String c103 = _EMPTY_;
    private String c10301 = _EMPTY_;
    private String c10302 = _EMPTY_;
    private String c10303 = _EMPTY_;
    private String c10304 = _EMPTY_;
    private String c10305 = _EMPTY_;
    private String c10306 = _EMPTY_;
    private String c10307 = _EMPTY_;
    private String c10308 = _EMPTY_;
    private String c10396 = _EMPTY_;
    private String c10396x = _EMPTY_;
    private String c104 = _EMPTY_;
    private String c105 = _EMPTY_;
    private String c106 = _EMPTY_;
    private String c107 = _EMPTY_;
    private String c10701 = _EMPTY_;
    private String c10702 = _EMPTY_;
    private String c10703 = _EMPTY_;
    private String c10704 = _EMPTY_;
    private String c10705 = _EMPTY_;
    private String c10706 = _EMPTY_;
    private String c10707 = _EMPTY_;
    private String c10708 = _EMPTY_;
    private String c10796 = _EMPTY_;
    private String c10796x = _EMPTY_;
    private String c10798 = _EMPTY_;
    private String c108 = _EMPTY_;
    private String c10801 = _EMPTY_;
    private String c10802 = _EMPTY_;
    private String c10803 = _EMPTY_;
    private String c10804 = _EMPTY_;
    private String c10805 = _EMPTY_;
    private String c10806 = _EMPTY_;
    private String c10807 = _EMPTY_;
    private String c10808 = _EMPTY_;
    private String c10809 = _EMPTY_;
    private String c10810 = _EMPTY_;
    private String c10811 = _EMPTY_;
    private String c10812 = _EMPTY_;
    private String c10896 = _EMPTY_;
    private String c10896x = _EMPTY_;
    private String c10898 = _EMPTY_;
    private String c109 = _EMPTY_;
    private String c110 = _EMPTY_;
    private String c111 = _EMPTY_;
    private String c112 = _EMPTY_;
    private String c11201 = _EMPTY_;
    private String c11202 = _EMPTY_;
    private String c11203 = _EMPTY_;
    private String c11204 = _EMPTY_;
    private String c11205 = _EMPTY_;
    private String c11206 = _EMPTY_;
    private String c11207 = _EMPTY_;
    private String c11208 = _EMPTY_;
    private String c11296 = _EMPTY_;
    private String c11296x = _EMPTY_;
    private String c11298 = _EMPTY_;
    private String c113 = _EMPTY_;
    private String c11301 = _EMPTY_;
    private String c11302 = _EMPTY_;
    private String c11303 = _EMPTY_;
    private String c11304 = _EMPTY_;
    private String c11305 = _EMPTY_;
    private String c11306 = _EMPTY_;
    private String c11307 = _EMPTY_;
    private String c11308 = _EMPTY_;
    private String c11309 = _EMPTY_;
    private String c11310 = _EMPTY_;
    private String c11311 = _EMPTY_;
    private String c11312 = _EMPTY_;
    private String c11396 = _EMPTY_;
    private String c11396x = _EMPTY_;
    private String c11398 = _EMPTY_;
    private String c114 = _EMPTY_;
    private String c115 = _EMPTY_;
    private String c116 = _EMPTY_;
    private String c117 = _EMPTY_;
    private String c118 = _EMPTY_;
    private String c119 = _EMPTY_;
    private String c120 = _EMPTY_;
    private String c121 = _EMPTY_;
    private String c122 = _EMPTY_;
    private String c123 = _EMPTY_;
    private String c124 = _EMPTY_;
    private String c125 = _EMPTY_;
    private String c126 = _EMPTY_;
    private String c127 = _EMPTY_;
    private String c128 = _EMPTY_;
    private String c129 = _EMPTY_;
    private String c130 = _EMPTY_;
    private String c131 = _EMPTY_;
    private String c132 = _EMPTY_;
    private String c133 = _EMPTY_;
    private String c134 = _EMPTY_;
    private String c135 = _EMPTY_;
    private String c136 = _EMPTY_;
    private String c137 = _EMPTY_;
    private String c138 = _EMPTY_;
    private String c139 = _EMPTY_;
    private String c140 = _EMPTY_;
    private String c141 = _EMPTY_;
    private String c142 = _EMPTY_;
    private String c143 = _EMPTY_;
    private String c144 = _EMPTY_;
    private String c145 = _EMPTY_;
    private String c146 = _EMPTY_;
    private String c147 = _EMPTY_;
    private String c148 = _EMPTY_;
    private String c149 = _EMPTY_;
    private String c150 = _EMPTY_;
    private String c151 = _EMPTY_;
    private String c15101 = _EMPTY_;
    private String c15102 = _EMPTY_;
    private String c15103 = _EMPTY_;
    private String c15196 = _EMPTY_;
    private String c15196x = _EMPTY_;
    private String c152 = _EMPTY_;
    private String c153 = _EMPTY_;
    private String c15301 = _EMPTY_;
    private String c15302 = _EMPTY_;
    private String c15303 = _EMPTY_;
    private String c15396 = _EMPTY_;
    private String c15396x = _EMPTY_;
    private String d101 = _EMPTY_;
    private String d102 = _EMPTY_;
    private String d10201 = _EMPTY_;
    private String d10202 = _EMPTY_;
    private String d10203 = _EMPTY_;
    private String d10204 = _EMPTY_;
    private String d10296 = _EMPTY_;
    private String d10296x = _EMPTY_;
    private String d103 = _EMPTY_;
    private String d10301 = _EMPTY_;
    private String d10302 = _EMPTY_;
    private String d10303 = _EMPTY_;
    private String d10304 = _EMPTY_;
    private String d10305 = _EMPTY_;
    private String d10306 = _EMPTY_;
    private String d10307 = _EMPTY_;
    private String d10396 = _EMPTY_;
    private String d10396x = _EMPTY_;
    private String d104 = _EMPTY_;
    private String d105 = _EMPTY_;
    private String d106 = _EMPTY_;
    private String d10601 = _EMPTY_;
    private String d10602 = _EMPTY_;
    private String d10603 = _EMPTY_;
    private String d10604 = _EMPTY_;
    private String d10696 = _EMPTY_;
    private String d10696x = _EMPTY_;
    private String d107 = _EMPTY_;
    private String d10701 = _EMPTY_;
    private String d10702 = _EMPTY_;
    private String d10703 = _EMPTY_;
    private String d10704 = _EMPTY_;
    private String d10705 = _EMPTY_;
    private String d10706 = _EMPTY_;
    private String d10707 = _EMPTY_;
    private String d10796 = _EMPTY_;
    private String d10796x = _EMPTY_;
    private String d108 = _EMPTY_;
    private String d10801 = _EMPTY_;
    private String d10802 = _EMPTY_;
    private String d10803 = _EMPTY_;
    private String d10804 = _EMPTY_;
    private String d10805 = _EMPTY_;
    private String d10806 = _EMPTY_;
    private String d10807 = _EMPTY_;
    private String d10808 = _EMPTY_;
    private String d10896 = _EMPTY_;
    private String d10896x = _EMPTY_;
    private String d10898 = _EMPTY_;
    private String d109 = _EMPTY_;
    private String d110 = _EMPTY_;
    private String d111 = _EMPTY_;
    private String d11101x = _EMPTY_;
    private String d11102x = _EMPTY_;
    private String d11103x = _EMPTY_;
    private String d11104x = _EMPTY_;
    private String d112 = _EMPTY_;
    private String d11201x = _EMPTY_;
    private String d11202x = _EMPTY_;
    private String d11203x = _EMPTY_;
    private String d11204x = _EMPTY_;
    private String d113 = _EMPTY_;
    private String d11401 = _EMPTY_;
    private String d11402 = _EMPTY_;
    private String d11403 = _EMPTY_;
    private String d11404 = _EMPTY_;
    private String d11405 = _EMPTY_;
    private String d11406 = _EMPTY_;
    private String d11407 = _EMPTY_;
    private String d11498 = _EMPTY_;
    private String d115 = _EMPTY_;
    private String d11501x = _EMPTY_;
    private String d11502x = _EMPTY_;
    private String d11503x = _EMPTY_;
    private String d11504x = _EMPTY_;
    private String d11505x = _EMPTY_;
    private String d11596x = _EMPTY_;
    private String d116 = _EMPTY_;
    private String d11601x = _EMPTY_;
    private String d11602x = _EMPTY_;
    private String d11603x = _EMPTY_;
    private String d11604x = _EMPTY_;
    private String d11605x = _EMPTY_;
    private String d11696x = _EMPTY_;
    private String d117 = _EMPTY_;
    private String d11701x = _EMPTY_;
    private String d11702x = _EMPTY_;
    private String d11703x = _EMPTY_;
    private String d11704x = _EMPTY_;
    private String d11705x = _EMPTY_;
    private String d11796x = _EMPTY_;
    private String d118 = _EMPTY_;
    private String d119 = _EMPTY_;
    private String d11901x = _EMPTY_;
    private String d11902x = _EMPTY_;
    private String d11903x = _EMPTY_;
    private String d11904x = _EMPTY_;
    private String d11905x = _EMPTY_;
    private String d11996x = _EMPTY_;
    private String d120 = _EMPTY_;
    private String d121 = _EMPTY_;
    private String d122 = _EMPTY_;
    private String d12301 = _EMPTY_;
    private String d12302 = _EMPTY_;
    private String d12303 = _EMPTY_;
    private String d12304 = _EMPTY_;
    private String d12305 = _EMPTY_;
    private String d12306 = _EMPTY_;
    private String d124 = _EMPTY_;
    private String d12401 = _EMPTY_;
    private String d12402 = _EMPTY_;
    private String d12403 = _EMPTY_;
    private String d12496 = _EMPTY_;
    private String d12496x = _EMPTY_;
    private String d12498 = _EMPTY_;
    private String d125 = _EMPTY_;
    private String d12501 = _EMPTY_;
    private String d12502 = _EMPTY_;
    private String d12503 = _EMPTY_;
    private String d12504 = _EMPTY_;
    private String d12505 = _EMPTY_;
    private String d12506 = _EMPTY_;
    private String d12507 = _EMPTY_;
    private String d12508 = _EMPTY_;
    private String d12509 = _EMPTY_;
    private String d12596 = _EMPTY_;
    private String d12596x = _EMPTY_;
    private String d12598 = _EMPTY_;
    private String d126 = _EMPTY_;
    private String d12601 = _EMPTY_;
    private String d12602 = _EMPTY_;
    private String d12603 = _EMPTY_;
    private String d12604 = _EMPTY_;
    private String d12605 = _EMPTY_;
    private String d12606 = _EMPTY_;
    private String d12607 = _EMPTY_;
    private String d12608 = _EMPTY_;
    private String d12696 = _EMPTY_;
    private String d12696x = _EMPTY_;
    private String d12698 = _EMPTY_;
    private String d127 = _EMPTY_;
    private String d12798 = _EMPTY_;
    private String d128 = _EMPTY_;
    private String d12801 = _EMPTY_;
    private String d12802 = _EMPTY_;
    private String d12803 = _EMPTY_;
    private String d12804 = _EMPTY_;
    private String d12896 = _EMPTY_;
    private String d12896x = _EMPTY_;
    private String d129 = _EMPTY_;
    private String d130 = _EMPTY_;
    private String d13001 = _EMPTY_;
    private String d13002 = _EMPTY_;
    private String d13003 = _EMPTY_;
    private String d13004 = _EMPTY_;
    private String d13005 = _EMPTY_;
    private String d13098 = _EMPTY_;
    private String d13098x = _EMPTY_;
    private String e101 = _EMPTY_;
    private String e10101x = _EMPTY_;
    private String e10102x = _EMPTY_;
    private String e10103x = _EMPTY_;
    private String e10104x = _EMPTY_;
    private String e10501x = _EMPTY_;
    private String e10502x = _EMPTY_;
    private String e10503x = _EMPTY_;
    private String e10504x = _EMPTY_;
    private String e102 = _EMPTY_;
    private String e103 = _EMPTY_;
    private String e10301 = _EMPTY_;
    private String e10302 = _EMPTY_;
    private String e10303 = _EMPTY_;
    private String e10396 = _EMPTY_;
    private String e10396x = _EMPTY_;
    private String e10398 = _EMPTY_;
    private String e104 = _EMPTY_;
    private String e10401 = _EMPTY_;
    private String e10402 = _EMPTY_;
    private String e10403 = _EMPTY_;
    private String e10496 = _EMPTY_;
    private String e10496x = _EMPTY_;
    private String e10498 = _EMPTY_;
    private String e105 = _EMPTY_;
    private String e10601 = _EMPTY_;
    private String e10602 = _EMPTY_;
    private String e10603 = _EMPTY_;
    private String e107 = _EMPTY_;
    private String e10701 = _EMPTY_;
    private String e10702 = _EMPTY_;
    private String e10703 = _EMPTY_;
    private String e10704 = _EMPTY_;
    private String e10705 = _EMPTY_;
    private String e10796 = _EMPTY_;
    private String e10796x = _EMPTY_;
    private String e10798 = _EMPTY_;
    private String e108 = _EMPTY_;
    private String e10801 = _EMPTY_;
    private String e10802 = _EMPTY_;
    private String e10803 = _EMPTY_;
    private String e10804 = _EMPTY_;
    private String e10805 = _EMPTY_;
    private String e10806 = _EMPTY_;
    private String e10807 = _EMPTY_;
    private String e10808 = _EMPTY_;
    private String e10809 = _EMPTY_;
    private String e10810 = _EMPTY_;
    private String e10896 = _EMPTY_;
    private String e10896x = _EMPTY_;
    private String e10898 = _EMPTY_;
    private String e109 = _EMPTY_;
    private String e10901x = _EMPTY_;
    private String e10902x = _EMPTY_;
    private String e10903x = _EMPTY_;
    private String e10904x = _EMPTY_;
    private String e10905x = _EMPTY_;
    private String e10996x = _EMPTY_;
    private String e110 = _EMPTY_;
    private String e11001x = _EMPTY_;
    private String e111 = _EMPTY_;
    private String e11101x = _EMPTY_;
    private String e112 = _EMPTY_;
    private String e11201 = _EMPTY_;
    private String e11202 = _EMPTY_;
    private String e113 = _EMPTY_;
    private String e11301 = _EMPTY_;
    private String e11301x = _EMPTY_;
    private String e11302 = _EMPTY_;
    private String e114 = _EMPTY_;
    private String e115 = _EMPTY_;
    private String e11596x = _EMPTY_;
    private String e116 = _EMPTY_;
    private String e117 = _EMPTY_;
    private String e11701 = _EMPTY_;
    private String e11702 = _EMPTY_;
    private String e11703 = _EMPTY_;
    private String e11704 = _EMPTY_;
    private String e11705 = _EMPTY_;
    private String e11706 = _EMPTY_;
    private String e11707 = _EMPTY_;
    private String e11796 = _EMPTY_;
    private String e11796x = _EMPTY_;
    private String e11798 = _EMPTY_;
    private String e11801x = _EMPTY_;
    private String e11802x = _EMPTY_;
    private String e11898 = _EMPTY_;
    private String e119 = _EMPTY_;
    private String e120 = _EMPTY_;
    private String e12001 = _EMPTY_;
    private String e12002 = _EMPTY_;
    private String e12003 = _EMPTY_;
    private String e12004 = _EMPTY_;
    private String e12005 = _EMPTY_;
    private String e12006 = _EMPTY_;
    private String e12007 = _EMPTY_;
    private String e12008 = _EMPTY_;
    private String e12009 = _EMPTY_;
    private String e12010 = _EMPTY_;
    private String e12011 = _EMPTY_;
    private String e12096 = _EMPTY_;
    private String e12096x = _EMPTY_;
    private String e121 = _EMPTY_;
    private String e122 = _EMPTY_;
    private String e123 = _EMPTY_;
    private String e12301 = _EMPTY_;
    private String e12302 = _EMPTY_;
    private String e12303 = _EMPTY_;
    private String e12304 = _EMPTY_;
    private String e12396 = _EMPTY_;
    private String e12396x = _EMPTY_;
    private String e12398 = _EMPTY_;
    private String e124 = _EMPTY_;
    private String e12401 = _EMPTY_;
    private String e12402 = _EMPTY_;
    private String e12403 = _EMPTY_;
    private String e12404 = _EMPTY_;
    private String e12405 = _EMPTY_;
    private String e12496 = _EMPTY_;
    private String e12496x = _EMPTY_;
    private String e12498 = _EMPTY_;
    private String e125 = _EMPTY_;
    private String e12501x = _EMPTY_;
    private String e12502x = _EMPTY_;
    private String e12503x = _EMPTY_;
    private String e12504x = _EMPTY_;
    private String e12505x = _EMPTY_;
    private String e12596x = _EMPTY_;
    private String e126 = _EMPTY_;
    private String e12601x = _EMPTY_;
    private String e12602x = _EMPTY_;
    private String e12603x = _EMPTY_;
    private String e12604x = _EMPTY_;
    private String e12601 = _EMPTY_;
    private String e127 = _EMPTY_;
    private String e12701x = _EMPTY_;
    private String e128 = _EMPTY_;
    private String e12801x = _EMPTY_;
    private String e129 = _EMPTY_;
    private String e130 = _EMPTY_;
    private String e13001x = _EMPTY_;
    private String e131 = _EMPTY_;
    private String e132 = _EMPTY_;
    private String e133 = _EMPTY_;
    private String e13301 = _EMPTY_;
    private String e13302 = _EMPTY_;
    private String e13303 = _EMPTY_;
    private String e13304 = _EMPTY_;
    private String e13305 = _EMPTY_;
    private String e13306 = _EMPTY_;
    private String e13307 = _EMPTY_;
    private String e13396 = _EMPTY_;
    private String e13396x = _EMPTY_;
    private String e13398 = _EMPTY_;
    private String e13401x = _EMPTY_;
    private String e13402x = _EMPTY_;
    private String e13498 = _EMPTY_;
    private String e135a = _EMPTY_;
    private String e135b = _EMPTY_;
    private String e135c = _EMPTY_;
    private String e135d = _EMPTY_;
    private String e135e = _EMPTY_;
    private String e136 = _EMPTY_;
    private String e13601 = _EMPTY_;
    private String e13602 = _EMPTY_;
    private String e13603 = _EMPTY_;
    private String e13604 = _EMPTY_;
    private String e13605 = _EMPTY_;
    private String e13606 = _EMPTY_;
    private String e13696 = _EMPTY_;
    private String e13696x = _EMPTY_;
    private String e13698 = _EMPTY_;


    public Form() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());

    }

    @Bindable
    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
        notifyPropertyChanged(BR.a101);
    }

    @Bindable
    public String getA101d() {
        return a101d;
    }

    public void setA101d(String a101d) {
        this.a101d = a101d;
        notifyPropertyChanged(BR.a101d);
    }

    @Bindable
    public String getA101m() {
        return a101m;
    }

    public void setA101m(String a101m) {
        this.a101m = a101m;
        notifyPropertyChanged(BR.a101m);
    }

    @Bindable
    public String getA101y() {
        return a101y;
    }

    public void setA101y(String a101y) {
        this.a101y = a101y;
        notifyPropertyChanged(BR.a101y);
    }

    @Bindable
    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
        notifyPropertyChanged(BR.a102);
    }

    @Bindable
    public String getA102h() {
        return a102h;
    }

    public void setA102h(String a102h) {
        this.a102h = a102h;
        notifyPropertyChanged(BR.a102h);
    }

    @Bindable
    public String getA102m() {
        return a102m;
    }

    public void setA102m(String a102m) {
        this.a102m = a102m;
        notifyPropertyChanged(BR.a102m);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA103a() {
        return a103a;
    }

    public void setA103a(String a103a) {
        this.a103a = a103a;
        notifyPropertyChanged(BR.a103a);
    }

    @Bindable
    public String getA104() {
        return a104;
    }

    public void setA104(String a104) {
        this.a104 = a104;
        notifyPropertyChanged(BR.a104);
    }

    @Bindable
    public String getA104a() {
        return a104a;
    }

    public void setA104a(String a104a) {
        this.a104a = a104a;
        notifyPropertyChanged(BR.a104a);
    }

    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        notifyPropertyChanged(BR.a105);
    }

    @Bindable
    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
        notifyPropertyChanged(BR.a106);
    }

    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        notifyPropertyChanged(BR.a107);
    }

    @Bindable
    public String getA108() {
        return a108;
    }

    public void setA108(String a108) {
        this.a108 = a108;
        notifyPropertyChanged(BR.a108);
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }

    @Bindable
    public String getA110() {
        return a110;
    }

    public void setA110(String a110) {
        this.a110 = a110;
        setA115(a110.equals("1") ? this.a115 : "");
        setA116(a110.equals("1") ? this.a116 : "");
        setA117(a110.equals("1") ? this.a117 : "");
        setA11801(a110.equals("1") ? this.a11801 : "");
        setA11802(a110.equals("1") ? this.a11802 : "");
        setA11803(a110.equals("1") ? this.a11803 : "");
        setA119(a110.equals("1") ? this.a119 : "");
        setA120(a110.equals("1") ? this.a120 : "");
        setA121(a110.equals("1") ? this.a121 : "");
        setA122(a110.equals("1") ? this.a122 : "");
        setA123(a110.equals("1") ? this.a123 : "");
        notifyPropertyChanged(BR.a110);
    }

    @Bindable
    public String getA111() {
        return a111;
    }

    public void setA111(String a111) {
        this.a111 = a111;
        notifyPropertyChanged(BR.a111);
    }

    @Bindable
    public String getA112() {
        return a112;
    }

    public void setA112(String a112) {
        this.a112 = a112;
        notifyPropertyChanged(BR.a112);
    }

    @Bindable
    public String getA113() {
        return a113;
    }

    public void setA113(String a113) {
        this.a113 = a113;
        notifyPropertyChanged(BR.a113);
    }

    @Bindable
    public String getA114() {
        return a114;
    }

    public void setA114(String a114) {
        this.a114 = a114;
        notifyPropertyChanged(BR.a114);
    }

    @Bindable
    public String getA114a() {
        return a114a;
    }

    public void setA114a(String a114a) {
        this.a114a = a114a;
        notifyPropertyChanged(BR.a114a);
    }

    @Bindable
    public String getA115() {
        return a115;
    }

    public void setA115(String a115) {
        this.a115 = a115;
        notifyPropertyChanged(BR.a115);
    }

    @Bindable
    public String getA11502() {
        return a11502;
    }

    public void setA11502(String a11502) {
        this.a11502 = a11502;
        notifyPropertyChanged(BR.a11502);
    }

    @Bindable
    public String getA11503() {
        return a11503;
    }

    public void setA11503(String a11503) {
        this.a11503 = a11503;
        notifyPropertyChanged(BR.a11503);
    }

    @Bindable
    public String getA11504() {
        return a11504;
    }

    public void setA11504(String a11504) {
        this.a11504 = a11504;
        notifyPropertyChanged(BR.a11504);
    }

    @Bindable
    public String getA116() {
        return a116;
    }

    public void setA116(String a116) {
        this.a116 = a116;
        notifyPropertyChanged(BR.a116);
    }

    @Bindable
    public String getA117() {
        return a117;
    }

    public void setA117(String a117) {
        this.a117 = a117;
        notifyPropertyChanged(BR.a117);
    }

    @Bindable
    public String getA11801() {
        return a11801;
    }

    public void setA11801(String a11801) {
        this.a11801 = a11801;
        notifyPropertyChanged(BR.a11801);
    }

    @Bindable
    public String getA11802() {
        return a11802;
    }

    public void setA11802(String a11802) {
        this.a11802 = a11802;
        notifyPropertyChanged(BR.a11802);
    }

    @Bindable
    public String getA11803() {
        return a11803;
    }

    public void setA11803(String a11803) {
        this.a11803 = a11803;
        notifyPropertyChanged(BR.a11803);
    }

    @Bindable
    public String getA119() {
        return a119;
    }

    public void setA119(String a119) {
        this.a119 = a119;
        notifyPropertyChanged(BR.a119);
    }

    @Bindable
    public String getA11901x() {
        return a11901x;
    }

    public void setA11901x(String a11901x) {
        this.a11901x = a11901x;
        notifyPropertyChanged(BR.a11901x);
    }

    @Bindable
    public String getA11902x() {
        return a11902x;
    }

    public void setA11902x(String a11902x) {
        this.a11902x = a11902x;
        notifyPropertyChanged(BR.a11902x);
    }

    @Bindable
    public String getA11903x() {
        return a11903x;
    }

    public void setA11903x(String a11903x) {
        this.a11903x = a11903x;
        notifyPropertyChanged(BR.a11903x);
    }

    @Bindable
    public String getA120() {
        return a120;
    }

    public void setA120(String a120) {
        this.a120 = a120;
        setA12096x(a120.equals("96") ? this.a12096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.a120);
    }

    @Bindable
    public String getA12096x() {
        return a12096x;
    }

    public void setA12096x(String a12096x) {
        this.a12096x = a12096x;
        notifyPropertyChanged(BR.a12096x);
    }

    @Bindable
    public String getA121() {
        return a121;
    }

    public void setA121(String a121) {
        this.a121 = a121;
        notifyPropertyChanged(BR.a121);
    }

    @Bindable
    public String getA122() {
        return a122;
    }

    public void setA122(String a122) {
        this.a122 = a122;
        notifyPropertyChanged(BR.a122);
    }

    @Bindable
    public String getA123() {
        return a123;
    }

    public void setA123(String a123) {
        this.a123 = a123;
        setA12396x(a123.equals("96") ? this.a12396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.a123);
    }

    @Bindable
    public String getA12396x() {
        return a12396x;
    }

    public void setA12396x(String a12396x) {
        this.a12396x = a12396x;
        notifyPropertyChanged(BR.a12396x);
    }

    @Bindable
    public String getA124() {
        return a124;
    }

    public void setA124(String a124) {
        this.a124 = a124;
        notifyPropertyChanged(BR.a124);
    }

    @Bindable
    public String getA12496x() {
        return a12496x;
    }

    public void setA12496x(String a12496x) {
        this.a12496x = a12496x;
        notifyPropertyChanged(BR.a12496x);
    }

    @Bindable
    public String getB101() {
        return b101;
    }

    public void setB101(String b101) {
        this.b101 = b101;
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB10101() {
        return b10101;
    }

    public void setB10101(String b10101) {
        if (this.b10101.equals(b10101)) return; // for all checkboxes
        this.b10101 = b10101;
        notifyPropertyChanged(BR.b10101);
    }

    @Bindable
    public String getB10102() {
        return b10102;
    }

    public void setB10102(String b10102) {
        if (this.b10102.equals(b10102)) return; // for all checkboxes
        this.b10102 = b10102;
        notifyPropertyChanged(BR.b10102);
    }

    @Bindable
    public String getB10103() {
        return b10103;
    }

    public void setB10103(String b10103) {
        if (this.b10103.equals(b10103)) return; // for all checkboxes
        this.b10103 = b10103;
        notifyPropertyChanged(BR.b10103);
    }

    @Bindable
    public String getB10104() {
        return b10104;
    }

    public void setB10104(String b10104) {
        if (this.b10104.equals(b10104)) return; // for all checkboxes
        this.b10104 = b10104;
        notifyPropertyChanged(BR.b10104);
    }

    @Bindable
    public String getB10196() {
        return b10196;
    }

    public void setB10196(String b10196) {
        if (this.b10196.equals(b10196)) return; // for all checkboxes
        this.b10196 = b10196;
        setB10196x(b10196.equals("96") ? this.b10196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b10196);
    }

    @Bindable
    public String getB10196x() {
        return b10196x;
    }

    public void setB10196x(String b10196x) {
        this.b10196x = b10196x;
        notifyPropertyChanged(BR.b10196x);
    }

    @Bindable
    public String getB10198() {
        return b10198;
    }

    public void setB10198(String b10198) {
        if (this.b10198.equals(b10198)) return; // for all checkboxes
        this.b10198 = b10198;
        setB10101(b10198.equals("98") ? "" : this.b10101);
        setB10102(b10198.equals("98") ? "" : this.b10102);
        setB10103(b10198.equals("98") ? "" : this.b10103);
        setB10104(b10198.equals("98") ? "" : this.b10104);
        setB10196(b10198.equals("98") ? "" : this.b10196);
        notifyPropertyChanged(BR.b10198);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB10201() {
        return b10201;
    }

    public void setB10201(String b10201) {
        if (this.b10201.equals(b10201)) return; // for all checkboxes
        this.b10201 = b10201;
        notifyPropertyChanged(BR.b10201);
    }

    @Bindable
    public String getB10202() {
        return b10202;
    }

    public void setB10202(String b10202) {
        if (this.b10202.equals(b10202)) return; // for all checkboxes
        this.b10202 = b10202;
        notifyPropertyChanged(BR.b10202);
    }

    @Bindable
    public String getB10203() {
        return b10203;
    }

    public void setB10203(String b10203) {
        if (this.b10203.equals(b10203)) return; // for all checkboxes
        this.b10203 = b10203;
        notifyPropertyChanged(BR.b10203);
    }

    @Bindable
    public String getB10296() {
        return b10296;
    }

    public void setB10296(String b10296) {
        if (this.b10296.equals(b10296)) return; // for all checkboxes
        this.b10296 = b10296;
        notifyPropertyChanged(BR.b10296);
    }

    @Bindable
    public String getB103() {
        return b103;
    }

    public void setB103(String b103) {
        this.b103 = b103;
        setB10396x(b103.equals("96") ? this.b10396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b103);
    }

    @Bindable
    public String getB10396x() {
        return b10396x;
    }

    public void setB10396x(String b10396x) {
        this.b10396x = b10396x;
        notifyPropertyChanged(BR.b10396x);
    }

    @Bindable
    public String getB104() {
        return b104;
    }

    public void setB104(String b104) {
        this.b104 = b104;
        setB10401x(b104.equals("1") ? this.b10401x : ""); // for all skips, mention all skipped questions
        setB10402x(b104.equals("2") ? this.b10402x : ""); // for all skips, mention all skipped questions
        setB10403x(b104.equals("3") ? this.b10403x : ""); // for all skips, mention all skipped questions
        setB10404x(b104.equals("4") ? this.b10404x : ""); // for all skips, mention all skipped questions
        setB10496x(b104.equals("96") ? this.b10496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b104);
    }

    @Bindable
    public String getB10401x() {
        return b10401x;
    }

    public void setB10401x(String b10401x) {
        this.b10401x = b10401x;
        notifyPropertyChanged(BR.b10401x);
    }

    @Bindable
    public String getB10402x() {
        return b10402x;
    }

    public void setB10402x(String b10402x) {
        this.b10402x = b10402x;
        notifyPropertyChanged(BR.b10402x);
    }

    @Bindable
    public String getB10403x() {
        return b10403x;
    }

    public void setB10403x(String b10403x) {
        this.b10403x = b10403x;
        notifyPropertyChanged(BR.b10403x);
    }

    @Bindable
    public String getB10404x() {
        return b10404x;
    }

    public void setB10404x(String b10404x) {
        this.b10404x = b10404x;
        notifyPropertyChanged(BR.b10404x);
    }

    @Bindable
    public String getB10496x() {
        return b10496x;
    }

    public void setB10496x(String b10496x) {
        this.b10496x = b10496x;
        notifyPropertyChanged(BR.b10496x);
    }

    @Bindable
    public String getB105() {
        return b105;
    }

    public void setB105(String b105) {
        this.b105 = b105;
        notifyPropertyChanged(BR.b105);
    }

    @Bindable
    public String getB10501() {
        return b10501;
    }

    public void setB10501(String b10501) {
        if (this.b10501.equals(b10501)) return; // for all checkboxes
        this.b10501 = b10501;
        notifyPropertyChanged(BR.b10501);
    }

    @Bindable
    public String getB10502() {
        return b10502;
    }

    public void setB10502(String b10502) {
        if (this.b10502.equals(b10502)) return; // for all checkboxes
        this.b10502 = b10502;
        notifyPropertyChanged(BR.b10502);
    }

    @Bindable
    public String getB10503() {
        return b10503;
    }

    public void setB10503(String b10503) {
        if (this.b10503.equals(b10503)) return; // for all checkboxes
        this.b10503 = b10503;
        notifyPropertyChanged(BR.b10503);
    }

    @Bindable
    public String getB10504() {
        return b10504;
    }

    public void setB10504(String b10504) {
        if (this.b10504.equals(b10504)) return; // for all checkboxes
        this.b10504 = b10504;
        notifyPropertyChanged(BR.b10504);
    }

    @Bindable
    public String getB10505() {
        return b10505;
    }

    public void setB10505(String b10505) {
        if (this.b10505.equals(b10505)) return; // for all checkboxes
        this.b10505 = b10505;
        notifyPropertyChanged(BR.b10505);
    }

    @Bindable
    public String getB10506() {
        return b10506;
    }

    public void setB10506(String b10506) {
        if (this.b10506.equals(b10506)) return; // for all checkboxes
        this.b10506 = b10506;
        notifyPropertyChanged(BR.b10506);
    }

    @Bindable
    public String getB10596() {
        return b10596;
    }

    public void setB10596(String b10596) {
        if (this.b10596.equals(b10596)) return; // for all checkboxes
        this.b10596 = b10596;
        setB10596x(b10596.equals("96") ? this.b10596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b10596);
    }

    @Bindable
    public String getB10596x() {
        return b10596x;
    }

    public void setB10596x(String b10596x) {
        this.b10596x = b10596x;
        notifyPropertyChanged(BR.b10596x);
    }

    @Bindable
    public String getB10598() {
        return b10598;
    }

    public void setB10598(String b10598) {
        if (this.b10598.equals(b10598)) return; // for all checkboxes
        this.b10598 = b10598;
        setB10501(b10598.equals("98") ? "" : this.b10501);
        setB10502(b10598.equals("98") ? "" : this.b10502);
        setB10503(b10598.equals("98") ? "" : this.b10503);
        setB10504(b10598.equals("98") ? "" : this.b10504);
        setB10505(b10598.equals("98") ? "" : this.b10505);
        setB10506(b10598.equals("98") ? "" : this.b10506);
        setB10596(b10598.equals("98") ? "" : this.b10596);
        notifyPropertyChanged(BR.b10598);
    }

    @Bindable
    public String getB106() {
        return b106;
    }

    public void setB106(String b106) {
        this.b106 = b106;
        setB10601x(b106.equals("1") ? this.b10601x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b106);
    }

    @Bindable
    public String getB10601x() {
        return b10601x;
    }

    public void setB10601x(String b10601x) {
        this.b10601x = b10601x;
        notifyPropertyChanged(BR.b10601x);
    }

    @Bindable
    public String getB107() {
        return b107;
    }

    public void setB107(String b107) {
        this.b107 = b107;
        notifyPropertyChanged(BR.b107);
    }

    @Bindable
    public String getB10701x() {
        return b10701x;
    }

    public void setB10701x(String b10701x) {
        this.b10701x = b10701x;
        notifyPropertyChanged(BR.b10701x);
    }

    @Bindable
    public String getB10702x() {
        return b10702x;
    }

    public void setB10702x(String b10702x) {
        this.b10702x = b10702x;
        notifyPropertyChanged(BR.b10702x);
    }

    @Bindable
    public String getB10703x() {
        return b10703x;
    }

    public void setB10703x(String b10703x) {
        this.b10703x = b10703x;
        notifyPropertyChanged(BR.b10703x);
    }

    @Bindable
    public String getB10704x() {
        return b10704x;
    }

    public void setB10704x(String b10704x) {
        this.b10704x = b10704x;
        notifyPropertyChanged(BR.b10704x);
    }

    @Bindable
    public String getB10705x() {
        return b10705x;
    }

    public void setB10705x(String b10705x) {
        this.b10705x = b10705x;
        notifyPropertyChanged(BR.b10705x);
    }

    @Bindable
    public String getB10706x() {
        return b10706x;
    }

    public void setB10706x(String b10706x) {
        this.b10706x = b10706x;
        notifyPropertyChanged(BR.b10706x);
    }

    @Bindable
    public String getB10796() {
        return b10796;
    }

    public void setB10796(String b10796) {
        if (this.b10796.equals(b10796)) return; // for all checkboxes
        this.b10796 = b10796;
        setB10796x(b10796.equals("96") ? this.b10796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b10796);
    }

    @Bindable
    public String getB10796x() {
        return b10796x;
    }

    public void setB10796x(String b10796x) {
        this.b10796x = b10796x;
        notifyPropertyChanged(BR.b10796x);
    }

    @Bindable
    public String getB10798() {
        return b10798;
    }

    public void setB10798(String b10798) {
        if (this.b10798.equals(b10798)) return; // for all checkboxes
        this.b10798 = b10798;
        setB10701x(b10798.equals("98") ? "" : this.b10701x);
        setB10702x(b10798.equals("98") ? "" : this.b10702x);
        setB10703x(b10798.equals("98") ? "" : this.b10703x);
        setB10704x(b10798.equals("98") ? "" : this.b10704x);
        setB10705x(b10798.equals("98") ? "" : this.b10705x);
        setB10706x(b10798.equals("98") ? "" : this.b10706x);
        setB10796(b10798.equals("98") ? "" : this.b10796);
        notifyPropertyChanged(BR.b10798);
    }

    @Bindable
    public String getB10799() {
        return b10799;
    }

    public void setB10799(String b10799) {
        if (this.b10799.equals(b10799)) return; // for all checkboxes
        this.b10799 = b10799;
        setB10701x(b10799.equals("99") ? "" : this.b10701x);
        setB10702x(b10799.equals("99") ? "" : this.b10702x);
        setB10703x(b10799.equals("99") ? "" : this.b10703x);
        setB10704x(b10799.equals("99") ? "" : this.b10704x);
        setB10705x(b10799.equals("99") ? "" : this.b10705x);
        setB10706x(b10799.equals("99") ? "" : this.b10706x);
        setB10796(b10799.equals("99") ? "" : this.b10796);
        notifyPropertyChanged(BR.b10799);
    }

    @Bindable
    public String getB108() {
        return b108;
    }

    public void setB108(String b108) {
        this.b108 = b108;
        notifyPropertyChanged(BR.b108);
    }

    @Bindable
    public String getB109() {
        return b109;
    }

    public void setB109(String b109) {
        this.b109 = b109;
        setB110(b109.equals("1") ? this.b110 : "");
        setB111(b109.equals("1") ? this.b111 : "");
        setB112(b109.equals("1") ? this.b112 : "");

        setB11301(b109.equals("1") ? this.b11301 : "");
        setB11302(b109.equals("1") ? this.b11302 : "");
        setB11303(b109.equals("1") ? this.b11303 : "");
        setB11304(b109.equals("1") ? this.b11304 : "");
        setB11305(b109.equals("1") ? this.b11305 : "");
        setB11396(b109.equals("1") ? this.b11396 : "");
        setB11398(b109.equals("1") ? this.b11398 : "");
        notifyPropertyChanged(BR.b109);
    }

    @Bindable
    public String getB110() {
        return b110;
    }

    public void setB110(String b110) {
        this.b110 = b110;
        notifyPropertyChanged(BR.b110);
    }

    @Bindable
    public String getB111() {
        return b111;
    }

    public void setB111(String b111) {
        this.b111 = b111;
        notifyPropertyChanged(BR.b111);
    }

    @Bindable
    public String getB112() {
        return b112;
    }

    public void setB112(String b112) {
        this.b112 = b112;
        setB11201x(b112.equals("1") ? this.b11201x : ""); // for all skips, mention all skipped questions
        setB11202x(b112.equals("2") ? this.b11202x : ""); // for all skips, mention all skipped questions
        setB11203x(b112.equals("3") ? this.b11203x : ""); // for all skips, mention all skipped questions
        setB11204x(b112.equals("4") ? this.b11204x : ""); // for all skips, mention all skipped questions
        setB11296x(b112.equals("96") ? this.b11296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b112);
    }

    @Bindable
    public String getB11201x() {
        return b11201x;
    }

    public void setB11201x(String b11201x) {
        this.b11201x = b11201x;
        notifyPropertyChanged(BR.b11201x);
    }

    @Bindable
    public String getB11202x() {
        return b11202x;
    }

    public void setB11202x(String b11202x) {
        this.b11202x = b11202x;
        notifyPropertyChanged(BR.b11202x);
    }

    @Bindable
    public String getB11203x() {
        return b11203x;
    }

    public void setB11203x(String b11203x) {
        this.b11203x = b11203x;
        notifyPropertyChanged(BR.b11203x);
    }

    @Bindable
    public String getB11204x() {
        return b11204x;
    }

    public void setB11204x(String b11204x) {
        this.b11204x = b11204x;
        notifyPropertyChanged(BR.b11204x);
    }

    @Bindable
    public String getB11296x() {
        return b11296x;
    }

    public void setB11296x(String b11296x) {
        this.b11296x = b11296x;
        notifyPropertyChanged(BR.b11296x);
    }

    @Bindable
    public String getB113() {
        return b113;
    }

    public void setB113(String b113) {
        this.b113 = b113;
        notifyPropertyChanged(BR.b113);
    }

    @Bindable
    public String getB11301() {
        return b11301;
    }

    public void setB11301(String b11301) {
        if (this.b11301.equals(b11301)) return; // for all checkboxes
        this.b11301 = b11301;
        notifyPropertyChanged(BR.b11301);
    }

    @Bindable
    public String getB11302() {
        return b11302;
    }

    public void setB11302(String b11302) {
        if (this.b11302.equals(b11302)) return; // for all checkboxes
        this.b11302 = b11302;
        notifyPropertyChanged(BR.b11302);
    }

    @Bindable
    public String getB11303() {
        return b11303;
    }

    public void setB11303(String b11303) {
        if (this.b11303.equals(b11303)) return; // for all checkboxes
        this.b11303 = b11303;
        notifyPropertyChanged(BR.b11303);
    }

    @Bindable
    public String getB11304() {
        return b11304;
    }

    public void setB11304(String b11304) {
        if (this.b11304.equals(b11304)) return; // for all checkboxes
        this.b11304 = b11304;
        notifyPropertyChanged(BR.b11304);
    }

    @Bindable
    public String getB11305() {
        return b11305;
    }

    public void setB11305(String b11305) {
        if (this.b11305.equals(b11305)) return; // for all checkboxes
        this.b11305 = b11305;
        notifyPropertyChanged(BR.b11305);
    }

    @Bindable
    public String getB11396() {
        return b11396;
    }

    public void setB11396(String b11396) {
        if (this.b11396.equals(b11396)) return; // for all checkboxes
        this.b11396 = b11396;
        setB11396x(b11396.equals("96") ? this.b11396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b11396);
    }

    @Bindable
    public String getB11396x() {
        return b11396x;
    }

    public void setB11396x(String b11396x) {
        this.b11396x = b11396x;
        notifyPropertyChanged(BR.b11396x);
    }

    @Bindable
    public String getB11398() {
        return b11398;
    }

    public void setB11398(String b11398) {
        if (this.b11398.equals(b11398)) return; // for all checkboxes
        this.b11398 = b11398;
        setB11301(b11398.equals("98") ? "" : this.b11301);
        setB11302(b11398.equals("98") ? "" : this.b11302);
        setB11303(b11398.equals("98") ? "" : this.b11303);
        setB11304(b11398.equals("98") ? "" : this.b11304);
        setB11305(b11398.equals("98") ? "" : this.b11305);
        setB11396(b11398.equals("98") ? "" : this.b11396);
        notifyPropertyChanged(BR.b11398);
    }

    @Bindable
    public String getB114() {
        return b114;
    }

    public void setB114(String b114) {
        this.b114 = b114;
        setB115(b114.equals("1") ? this.b115 : "");
        setB116(b114.equals("1") ? this.b116 : "");
        setB117(b114.equals("1") ? this.b117 : "");
        setB118(b114.equals("1") ? this.b118 : "");

        setB11901(b114.equals("1") ? this.b11901 : "");
        setB11902(b114.equals("1") ? this.b11902 : "");
        setB11903(b114.equals("1") ? this.b11903 : "");
        setB11904(b114.equals("1") ? this.b11904 : "");
        setB11905(b114.equals("1") ? this.b11905 : "");
        setB11996(b114.equals("1") ? this.b11996 : "");
        setB11998(b114.equals("1") ? this.b11998 : "");

        setB120(b114.equals("1") ? this.b120 : "");
        setB121(b114.equals("1") ? this.b121 : "");

        setB12201(b114.equals("1") ? this.b12201 : "");
        setB12202(b114.equals("1") ? this.b12202 : "");
        setB12203(b114.equals("1") ? this.b12203 : "");
        setB12204(b114.equals("1") ? this.b12204 : "");
        setB12205(b114.equals("1") ? this.b12205 : "");
        setB12296(b114.equals("1") ? this.b12296 : "");
        setB12298(b114.equals("1") ? this.b12298 : "");

        setB12301x(b114.equals("1") ? this.b12301x : "");
        setB12302x(b114.equals("1") ? this.b12302x : "");
        setB12303x(b114.equals("1") ? this.b12303x : "");
        setB12304x(b114.equals("1") ? this.b12304x : "");
        setB12305x(b114.equals("1") ? this.b12305x : "");
        setB12306x(b114.equals("1") ? this.b12306x : "");
        setB12396(b114.equals("1") ? this.b12396 : "");
        setB12398(b114.equals("1") ? this.b12398 : "");
        setB12399(b114.equals("1") ? this.b12399 : "");

        setB124(b114.equals("1") ? this.b124 : "");
        setB125(b114.equals("1") ? this.b125 : "");

        setB12601(b114.equals("1") ? this.b12601 : "");
        setB12602(b114.equals("1") ? this.b12602 : "");
        setB12603(b114.equals("1") ? this.b12603 : "");
        setB12604(b114.equals("1") ? this.b12604 : "");
        setB12605(b114.equals("1") ? this.b12605 : "");
        setB12606(b114.equals("1") ? this.b12606 : "");
        setB12607(b114.equals("1") ? this.b12607 : "");
        setB12608(b114.equals("1") ? this.b12608 : "");
        setB12609(b114.equals("1") ? this.b12609 : "");
        setB12610(b114.equals("1") ? this.b12610 : "");
        setB12696(b114.equals("1") ? this.b12696 : "");
        setB126198(b114.equals("1") ? this.b126198 : "");

        setB12701(b114.equals("1") ? this.b12701 : "");
        setB12702(b114.equals("1") ? this.b12702 : "");
        setB12703(b114.equals("1") ? this.b12703 : "");
        setB12704(b114.equals("1") ? this.b12704 : "");
        setB12705(b114.equals("1") ? this.b12705 : "");
        setB12706(b114.equals("1") ? this.b12706 : "");
        setB12707(b114.equals("1") ? this.b12707 : "");
        setB12708(b114.equals("1") ? this.b12708 : "");
        setB12709(b114.equals("1") ? this.b12709 : "");
        setB12796(b114.equals("1") ? this.b12796 : "");
        setB12796(b114.equals("1") ? this.b12796 : "");
        setB12798(b114.equals("1") ? this.b12798 : "");
        notifyPropertyChanged(BR.b114);
    }

    @Bindable
    public String getB115() {
        return b115;
    }

    public void setB115(String b115) {
        this.b115 = b115;
        notifyPropertyChanged(BR.b115);
    }

    @Bindable
    public String getB116() {
        return b116;
    }

    public void setB116(String b116) {
        this.b116 = b116;
        notifyPropertyChanged(BR.b116);
    }

    @Bindable
    public String getB117() {
        return b117;
    }

    public void setB117(String b117) {
        this.b117 = b117;
        notifyPropertyChanged(BR.b117);
    }

    @Bindable
    public String getB118() {
        return b118;
    }

    public void setB118(String b118) {
        this.b118 = b118;
        notifyPropertyChanged(BR.b118);
    }

    @Bindable
    public String getB119() {
        return b119;
    }

    public void setB119(String b119) {
        this.b119 = b119;
        notifyPropertyChanged(BR.b119);
    }

    @Bindable
    public String getB11901() {
        return b11901;
    }

    public void setB11901(String b11901) {
        if (this.b11901.equals(b11901)) return; // for all checkboxes
        this.b11901 = b11901;
        notifyPropertyChanged(BR.b11901);
    }

    @Bindable
    public String getB11902() {
        return b11902;
    }

    public void setB11902(String b11902) {
        if (this.b11902.equals(b11902)) return; // for all checkboxes
        this.b11902 = b11902;
        notifyPropertyChanged(BR.b11902);
    }

    @Bindable
    public String getB11903() {
        return b11903;
    }

    public void setB11903(String b11903) {
        if (this.b11903.equals(b11903)) return; // for all checkboxes
        this.b11903 = b11903;
        notifyPropertyChanged(BR.b11903);
    }

    @Bindable
    public String getB11904() {
        return b11904;
    }

    public void setB11904(String b11904) {
        if (this.b11904.equals(b11904)) return; // for all checkboxes
        this.b11904 = b11904;
        notifyPropertyChanged(BR.b11904);
    }

    @Bindable
    public String getB11905() {
        return b11905;
    }

    public void setB11905(String b11905) {
        if (this.b11905.equals(b11905)) return; // for all checkboxes
        this.b11905 = b11905;
        notifyPropertyChanged(BR.b11905);
    }

    @Bindable
    public String getB11996() {
        return b11996;
    }

    public void setB11996(String b11996) {
        if (this.b11996.equals(b11996)) return; // for all checkboxes
        this.b11996 = b11996;
        setB11996x(b11996.equals("96") ? this.b11996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b11996);
    }

    @Bindable
    public String getB11996x() {
        return b11996x;
    }

    public void setB11996x(String b11996x) {
        this.b11996x = b11996x;
        notifyPropertyChanged(BR.b11996x);
    }

    @Bindable
    public String getB11998() {
        return b11998;
    }

    public void setB11998(String b11998) {
        if (this.b11998.equals(b11998)) return; // for all checkboxes
        this.b11998 = b11998;
        setB11901(b11998.equals("98") ? "" : this.b11901);
        setB11902(b11998.equals("98") ? "" : this.b11902);
        setB11903(b11998.equals("98") ? "" : this.b11903);
        setB11904(b11998.equals("98") ? "" : this.b11904);
        setB11905(b11998.equals("98") ? "" : this.b11905);
        setB11996(b11998.equals("98") ? "" : this.b11996);
        notifyPropertyChanged(BR.b11998);
    }

    @Bindable
    public String getB120() {
        return b120;
    }

    public void setB120(String b120) {
        this.b120 = b120;
        setB12096x(b120.equals("96") ? this.b12096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b120);
    }

    @Bindable
    public String getB12096x() {
        return b12096x;
    }

    public void setB12096x(String b12096x) {
        this.b12096x = b12096x;
        notifyPropertyChanged(BR.b12096x);
    }

    @Bindable
    public String getB121() {
        return b121;
    }

    public void setB121(String b121) {
        this.b121 = b121;
        setB12101x(b121.equals("1") ? this.b12101x : ""); // for all skips, mention all skipped questions
        setB12102x(b121.equals("2") ? this.b12102x : ""); // for all skips, mention all skipped questions
        setB12103x(b121.equals("3") ? this.b12103x : ""); // for all skips, mention all skipped questions
        setB12104x(b121.equals("4") ? this.b12104x : ""); // for all skips, mention all skipped questions
        setB12105x(b121.equals("5") ? this.b12105x : ""); // for all skips, mention all skipped questions
        setB12106x(b121.equals("6") ? this.b12106x : ""); // for all skips, mention all skipped questions
        setB12107x(b121.equals("7") ? this.b12107x : ""); // for all skips, mention all skipped questions
        setB12108x(b121.equals("8") ? this.b12108x : ""); // for all skips, mention all skipped questions
        setB12109x(b121.equals("9") ? this.b12109x : ""); // for all skips, mention all skipped questions
        setB12110x(b121.equals("10") ? this.b12110x : ""); // for all skips, mention all skipped questions
        setB12196x(b121.equals("96") ? this.b12196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b121);
    }

    @Bindable
    public String getB12101x() {
        return b12101x;
    }

    public void setB12101x(String b12101x) {
        this.b12101x = b12101x;
        notifyPropertyChanged(BR.b12101x);
    }

    @Bindable
    public String getB12102x() {
        return b12102x;
    }

    public void setB12102x(String b12102x) {
        this.b12102x = b12102x;
        notifyPropertyChanged(BR.b12102x);
    }

    @Bindable
    public String getB12103x() {
        return b12103x;
    }

    public void setB12103x(String b12103x) {
        this.b12103x = b12103x;
        notifyPropertyChanged(BR.b12103x);
    }

    @Bindable
    public String getB12104x() {
        return b12104x;
    }

    public void setB12104x(String b12104x) {
        this.b12104x = b12104x;
        notifyPropertyChanged(BR.b12104x);
    }

    @Bindable
    public String getB12105x() {
        return b12105x;
    }

    public void setB12105x(String b12105x) {
        this.b12105x = b12105x;
        notifyPropertyChanged(BR.b12105x);
    }

    @Bindable
    public String getB12106x() {
        return b12106x;
    }

    public void setB12106x(String b12106x) {
        this.b12106x = b12106x;
        notifyPropertyChanged(BR.b12106x);
    }

    @Bindable
    public String getB12107x() {
        return b12107x;
    }

    public void setB12107x(String b12107x) {
        this.b12107x = b12107x;
        notifyPropertyChanged(BR.b12107x);
    }

    @Bindable
    public String getB12108x() {
        return b12108x;
    }

    public void setB12108x(String b12108x) {
        this.b12108x = b12108x;
        notifyPropertyChanged(BR.b12108x);
    }

    @Bindable
    public String getB12109x() {
        return b12109x;
    }

    public void setB12109x(String b12109x) {
        this.b12109x = b12109x;
        notifyPropertyChanged(BR.b12109x);
    }

    @Bindable
    public String getB12110x() {
        return b12110x;
    }

    public void setB12110x(String b12110x) {
        this.b12110x = b12110x;
        notifyPropertyChanged(BR.b12110x);
    }

    @Bindable
    public String getB12196x() {
        return b12196x;
    }

    public void setB12196x(String b12196x) {
        this.b12196x = b12196x;
        notifyPropertyChanged(BR.b12196x);
    }

    @Bindable
    public String getB122() {
        return b122;
    }

    public void setB122(String b122) {
        this.b122 = b122;
        notifyPropertyChanged(BR.b122);
    }

    @Bindable
    public String getB12201() {
        return b12201;
    }

    public void setB12201(String b12201) {
        if (this.b12201.equals(b12201)) return; // for all checkboxes
        this.b12201 = b12201;
        notifyPropertyChanged(BR.b12201);
    }

    @Bindable
    public String getB12202() {
        return b12202;
    }

    public void setB12202(String b12202) {
        if (this.b12202.equals(b12202)) return; // for all checkboxes
        this.b12202 = b12202;
        notifyPropertyChanged(BR.b12202);
    }

    @Bindable
    public String getB12203() {
        return b12203;
    }

    public void setB12203(String b12203) {
        if (this.b12203.equals(b12203)) return; // for all checkboxes
        this.b12203 = b12203;
        notifyPropertyChanged(BR.b12203);
    }

    @Bindable
    public String getB12204() {
        return b12204;
    }

    public void setB12204(String b12204) {
        if (this.b12204.equals(b12204)) return; // for all checkboxes
        this.b12204 = b12204;
        notifyPropertyChanged(BR.b12204);
    }

    @Bindable
    public String getB12205() {
        return b12205;
    }

    public void setB12205(String b12205) {
        if (this.b12205.equals(b12205)) return; // for all checkboxes
        this.b12205 = b12205;
        notifyPropertyChanged(BR.b12205);
    }

    @Bindable
    public String getB12296() {
        return b12296;
    }

    public void setB12296(String b12296) {
        if (this.b12296.equals(b12296)) return; // for all checkboxes
        this.b12296 = b12296;
        setB12296x(b12296.equals("96") ? this.b12296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b12296);
    }

    @Bindable
    public String getB12296x() {
        return b12296x;
    }

    public void setB12296x(String b12296x) {
        this.b12296x = b12296x;
        notifyPropertyChanged(BR.b12296x);
    }

    @Bindable
    public String getB12298() {
        return b12298;
    }

    public void setB12298(String b12298) {
        if (this.b12298.equals(b12298)) return; // for all checkboxes
        this.b12298 = b12298;
        setB12201(b12298.equals("98") ? "" : this.b12201);
        setB12202(b12298.equals("98") ? "" : this.b12202);
        setB12203(b12298.equals("98") ? "" : this.b12203);
        setB12204(b12298.equals("98") ? "" : this.b12204);
        setB12205(b12298.equals("98") ? "" : this.b12205);
        setB12296(b12298.equals("98") ? "" : this.b12296);
        notifyPropertyChanged(BR.b12298);
    }

    @Bindable
    public String getB123() {
        return b123;
    }

    public void setB123(String b123) {
        this.b123 = b123;
        notifyPropertyChanged(BR.b123);
    }

    @Bindable
    public String getB12301x() {
        return b12301x;
    }

    public void setB12301x(String b12301x) {
        this.b12301x = b12301x;
        notifyPropertyChanged(BR.b12301x);
    }

    @Bindable
    public String getB12302x() {
        return b12302x;
    }

    public void setB12302x(String b12302x) {
        this.b12302x = b12302x;
        notifyPropertyChanged(BR.b12302x);
    }

    @Bindable
    public String getB12303x() {
        return b12303x;
    }

    public void setB12303x(String b12303x) {
        this.b12303x = b12303x;
        notifyPropertyChanged(BR.b12303x);
    }

    @Bindable
    public String getB12304x() {
        return b12304x;
    }

    public void setB12304x(String b12304x) {
        this.b12304x = b12304x;
        notifyPropertyChanged(BR.b12304x);
    }

    @Bindable
    public String getB12305x() {
        return b12305x;
    }

    public void setB12305x(String b12305x) {
        this.b12305x = b12305x;
        notifyPropertyChanged(BR.b12305x);
    }

    @Bindable
    public String getB12306x() {
        return b12306x;
    }

    public void setB12306x(String b12306x) {
        this.b12306x = b12306x;
        notifyPropertyChanged(BR.b12306x);
    }

    @Bindable
    public String getB12396() {
        return b12396;
    }

    public void setB12396(String b12396) {
        this.b12396 = b12396;
        notifyPropertyChanged(BR.b12396);
    }

    @Bindable
    public String getB12396x() {
        return b12396x;
    }

    public void setB12396x(String b12396x) {
        this.b12396x = b12396x;
        notifyPropertyChanged(BR.b12396x);
    }

    @Bindable
    public String getB12398() {
        return b12398;
    }

    public void setB12398(String b12398) {
        this.b12398 = b12398;
        notifyPropertyChanged(BR.b12398);
    }

    @Bindable
    public String getB12399() {
        return b12399;
    }

    public void setB12399(String b12399) {
        this.b12399 = b12399;
        notifyPropertyChanged(BR.b12399);
    }

    @Bindable
    public String getB124() {
        return b124;
    }

    public void setB124(String b124) {
        this.b124 = b124;
        setB125(b124.equals("1") ? this.b125 : "");
        notifyPropertyChanged(BR.b124);
    }

    @Bindable
    public String getB125() {
        return b125;
    }

    public void setB125(String b125) {
        this.b125 = b125;
        notifyPropertyChanged(BR.b125);
    }

    @Bindable
    public String getB126() {
        return b126;
    }

    public void setB126(String b126) {
        this.b126 = b126;
        notifyPropertyChanged(BR.b126);
    }

    @Bindable
    public String getB12601() {
        return b12601;
    }

    public void setB12601(String b12601) {
        if (this.b12601.equals(b12601)) return; // for all checkboxes
        this.b12601 = b12601;
        notifyPropertyChanged(BR.b12601);
    }

    @Bindable
    public String getB12602() {
        return b12602;
    }

    public void setB12602(String b12602) {
        if (this.b12602.equals(b12602)) return; // for all checkboxes
        this.b12602 = b12602;
        notifyPropertyChanged(BR.b12602);
    }

    @Bindable
    public String getB12603() {
        return b12603;
    }

    public void setB12603(String b12603) {
        if (this.b12603.equals(b12603)) return; // for all checkboxes
        this.b12603 = b12603;
        notifyPropertyChanged(BR.b12603);
    }

    @Bindable
    public String getB12604() {
        return b12604;
    }

    public void setB12604(String b12604) {
        if (this.b12604.equals(b12604)) return; // for all checkboxes
        this.b12604 = b12604;
        notifyPropertyChanged(BR.b12604);
    }

    @Bindable
    public String getB12605() {
        return b12605;
    }

    public void setB12605(String b12605) {
        if (this.b12605.equals(b12605)) return; // for all checkboxes
        this.b12605 = b12605;
        notifyPropertyChanged(BR.b12605);
    }

    @Bindable
    public String getB12606() {
        return b12606;
    }

    public void setB12606(String b12606) {
        if (this.b12606.equals(b12606)) return; // for all checkboxes
        this.b12606 = b12606;
        notifyPropertyChanged(BR.b12606);
    }

    @Bindable
    public String getB12607() {
        return b12607;
    }

    public void setB12607(String b12607) {
        if (this.b12607.equals(b12607)) return; // for all checkboxes
        this.b12607 = b12607;
        notifyPropertyChanged(BR.b12607);
    }

    @Bindable
    public String getB12608() {
        return b12608;
    }

    public void setB12608(String b12608) {
        if (this.b12608.equals(b12608)) return; // for all checkboxes
        this.b12608 = b12608;
        notifyPropertyChanged(BR.b12608);
    }

    @Bindable
    public String getB12609() {
        return b12609;
    }

    public void setB12609(String b12609) {
        if (this.b12609.equals(b12609)) return; // for all checkboxes
        this.b12609 = b12609;
        notifyPropertyChanged(BR.b12609);
    }

    @Bindable
    public String getB12610() {
        return b12610;
    }

    public void setB12610(String b12610) {
        if (this.b12610.equals(b12610)) return; // for all checkboxes
        this.b12610 = b12610;
        notifyPropertyChanged(BR.b12610);
    }

    @Bindable
    public String getB12696() {
        return b12696;
    }

    public void setB12696(String b12696) {
        if (this.b12696.equals(b12696)) return; // for all checkboxes
        this.b12696 = b12696;
        setB12696x(b12696.equals("96") ? this.b12696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b12696);
    }

    @Bindable
    public String getB12696x() {
        return b12696x;
    }

    public void setB12696x(String b12696x) {
        this.b12696x = b12696x;
        notifyPropertyChanged(BR.b12696x);
    }

    @Bindable
    public String getB126198() {
        return b126198;
    }

    public void setB126198(String b126198) {
        if (this.b126198.equals(b126198)) return; // for all checkboxes
        this.b126198 = b126198;
        setB12601(b126198.equals("98") ? "" : this.b12601);
        setB12602(b126198.equals("98") ? "" : this.b12602);
        setB12603(b126198.equals("98") ? "" : this.b12603);
        setB12604(b126198.equals("98") ? "" : this.b12604);
        setB12605(b126198.equals("98") ? "" : this.b12605);
        setB12606(b126198.equals("98") ? "" : this.b12606);
        setB12607(b126198.equals("98") ? "" : this.b12607);
        setB12608(b126198.equals("98") ? "" : this.b12608);
        setB12609(b126198.equals("98") ? "" : this.b12609);
        setB12610(b126198.equals("98") ? "" : this.b12610);
        setB12696(b126198.equals("98") ? "" : this.b12696);
        notifyPropertyChanged(BR.b126198);
    }

    @Bindable
    public String getB127() {
        return b127;
    }

    public void setB127(String b127) {
        this.b127 = b127;
        notifyPropertyChanged(BR.b127);
    }

    @Bindable
    public String getB12701() {
        return b12701;
    }

    public void setB12701(String b12701) {
        if (this.b12701.equals(b12701)) return; // for all checkboxes
        this.b12701 = b12701;
        notifyPropertyChanged(BR.b12701);
    }

    @Bindable
    public String getB12702() {
        return b12702;
    }

    public void setB12702(String b12702) {
        if (this.b12702.equals(b12702)) return; // for all checkboxes
        this.b12702 = b12702;
        notifyPropertyChanged(BR.b12702);
    }

    @Bindable
    public String getB12703() {
        return b12703;
    }

    public void setB12703(String b12703) {
        if (this.b12703.equals(b12703)) return; // for all checkboxes
        this.b12703 = b12703;
        notifyPropertyChanged(BR.b12703);
    }

    @Bindable
    public String getB12704() {
        return b12704;
    }

    public void setB12704(String b12704) {
        if (this.b12704.equals(b12704)) return; // for all checkboxes
        this.b12704 = b12704;
        notifyPropertyChanged(BR.b12704);
    }

    @Bindable
    public String getB12705() {
        return b12705;
    }

    public void setB12705(String b12705) {
        if (this.b12705.equals(b12705)) return; // for all checkboxes
        this.b12705 = b12705;
        notifyPropertyChanged(BR.b12705);
    }

    @Bindable
    public String getB12706() {
        return b12706;
    }

    public void setB12706(String b12706) {
        if (this.b12706.equals(b12706)) return; // for all checkboxes
        this.b12706 = b12706;
        notifyPropertyChanged(BR.b12706);
    }

    @Bindable
    public String getB12707() {
        return b12707;
    }

    public void setB12707(String b12707) {
        if (this.b12707.equals(b12707)) return; // for all checkboxes
        this.b12707 = b12707;
        notifyPropertyChanged(BR.b12707);
    }

    @Bindable
    public String getB12708() {
        return b12708;
    }

    public void setB12708(String b12708) {
        if (this.b12708.equals(b12708)) return; // for all checkboxes
        this.b12708 = b12708;
        notifyPropertyChanged(BR.b12708);
    }

    @Bindable
    public String getB12709() {
        return b12709;
    }

    public void setB12709(String b12709) {
        if (this.b12709.equals(b12709)) return; // for all checkboxes
        this.b12709 = b12709;
        notifyPropertyChanged(BR.b12709);
    }

    @Bindable
    public String getB12796() {
        return b12796;
    }

    public void setB12796(String b12796) {
        if (this.b12796.equals(b12796)) return; // for all checkboxes
        this.b12796 = b12796;
        setB12796x(b12796.equals("96") ? this.b12796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b12796);
    }

    @Bindable
    public String getB12796x() {
        return b12796x;
    }

    public void setB12796x(String b12796x) {
        this.b12796x = b12796x;
        notifyPropertyChanged(BR.b12796x);
    }

    @Bindable
    public String getB12798() {
        return b12798;
    }

    public void setB12798(String b12798) {
        if (this.b12798.equals(b12798)) return; // for all checkboxes
        this.b12798 = b12798;
        setB12701(b12798.equals("98") ? "" : this.b12701);
        setB12702(b12798.equals("98") ? "" : this.b12702);
        setB12703(b12798.equals("98") ? "" : this.b12703);
        setB12704(b12798.equals("98") ? "" : this.b12704);
        setB12705(b12798.equals("98") ? "" : this.b12705);
        setB12706(b12798.equals("98") ? "" : this.b12706);
        setB12707(b12798.equals("98") ? "" : this.b12707);
        setB12708(b12798.equals("98") ? "" : this.b12708);
        setB12709(b12798.equals("98") ? "" : this.b12709);
        setB12796(b12798.equals("98") ? "" : this.b12796);
        notifyPropertyChanged(BR.b12798);
    }

    @Bindable
    public String getB128() {
        return b128;
    }

    public void setB128(String b128) {
        this.b128 = b128;
        notifyPropertyChanged(BR.b128);
    }

    @Bindable
    public String getB129() {
        return b129;
    }

    public void setB129(String b129) {
        this.b129 = b129;
        setB12996x(b129.equals("96") ? this.b12996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b129);
    }

    @Bindable
    public String getB12996x() {
        return b12996x;
    }

    public void setB12996x(String b12996x) {
        this.b12996x = b12996x;
        notifyPropertyChanged(BR.b12996x);
    }

    @Bindable
    public String getB130() {
        return b130;
    }

    public void setB130(String b130) {
        this.b130 = b130;
        setB131(b130.equals("1") ? this.b131 : "");
        notifyPropertyChanged(BR.b130);
    }

    @Bindable
    public String getB131() {
        return b131;
    }

    public void setB131(String b131) {
        this.b131 = b131;
        notifyPropertyChanged(BR.b131);
    }

    @Bindable
    public String getB13101() {
        return b13101;
    }

    public void setB13101(String b13101) {
        if (this.b13101.equals(b13101)) return; // for all checkboxes
        this.b13101 = b13101;
        notifyPropertyChanged(BR.b13101);
    }

    @Bindable
    public String getB13102() {
        return b13102;
    }

    public void setB13102(String b13102) {
        if (this.b13102.equals(b13102)) return; // for all checkboxes
        this.b13102 = b13102;
        notifyPropertyChanged(BR.b13102);
    }

    @Bindable
    public String getB13103() {
        return b13103;
    }

    public void setB13103(String b13103) {
        if (this.b13103.equals(b13103)) return; // for all checkboxes
        this.b13103 = b13103;
        notifyPropertyChanged(BR.b13103);
    }

    @Bindable
    public String getB13196() {
        return b13196;
    }

    public void setB13196(String b13196) {
        if (this.b13196.equals(b13196)) return; // for all checkboxes
        this.b13196 = b13196;
        setB13196x(b13196.equals("96") ? this.b13196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b13196);
    }

    @Bindable
    public String getB13196x() {
        return b13196x;
    }

    public void setB13196x(String b13196x) {
        this.b13196x = b13196x;
        notifyPropertyChanged(BR.b13196x);
    }

    @Bindable
    public String getB132() {
        return b132;
    }

    public void setB132(String b132) {
        this.b132 = b132;
        notifyPropertyChanged(BR.b132);
    }

    @Bindable
    public String getB133() {
        return b133;
    }

    public void setB133(String b133) {
        this.b133 = b133;
        notifyPropertyChanged(BR.b133);
    }

    @Bindable
    public String getB13301() {
        return b13301;
    }

    public void setB13301(String b13301) {
        if (this.b13301.equals(b13301)) return; // for all checkboxes
        this.b13301 = b13301;
        notifyPropertyChanged(BR.b13301);
    }

    @Bindable
    public String getB13302() {
        return b13302;
    }

    public void setB13302(String b13302) {
        if (this.b13302.equals(b13302)) return; // for all checkboxes
        this.b13302 = b13302;
        notifyPropertyChanged(BR.b13302);
    }

    @Bindable
    public String getB13303() {
        return b13303;
    }

    public void setB13303(String b13303) {
        if (this.b13303.equals(b13303)) return; // for all checkboxes
        this.b13303 = b13303;
        notifyPropertyChanged(BR.b13303);
    }

    @Bindable
    public String getB13304() {
        return b13304;
    }

    public void setB13304(String b13304) {
        if (this.b13304.equals(b13304)) return; // for all checkboxes
        this.b13304 = b13304;
        notifyPropertyChanged(BR.b13304);
    }

    @Bindable
    public String getB13396() {
        return b13396;
    }

    public void setB13396(String b13396) {
        if (this.b13396.equals(b13396)) return; // for all checkboxes
        this.b13396 = b13396;
        setB13396x(b13396.equals("96") ? this.b13396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.b13396);
    }

    @Bindable
    public String getB13396x() {
        return b13396x;
    }

    public void setB13396x(String b13396x) {
        this.b13396x = b13396x;
        notifyPropertyChanged(BR.b13396x);
    }

    @Bindable
    public String getB13398() {
        return b13398;
    }

    public void setB13398(String b13398) {
        if (this.b13398.equals(b13398)) return; // for all checkboxes
        this.b13398 = b13398;
        setB13301(b13398.equals("98") ? "" : this.b13301);
        setB13302(b13398.equals("98") ? "" : this.b13302);
        setB13303(b13398.equals("98") ? "" : this.b13303);
        setB13304(b13398.equals("98") ? "" : this.b13304);
        setB13396(b13398.equals("98") ? "" : this.b13396);
        notifyPropertyChanged(BR.b13398);
    }

    @Bindable
    public String getC101() {
        return c101;
    }

    public void setC101(String c101) {
        this.c101 = c101;
        notifyPropertyChanged(BR.c101);
    }

    @Bindable
    public String getC10101() {
        return c10101;
    }

    public void setC10101(String c10101) {
        if (this.c10101.equals(c10101)) return; // for all checkboxes
        this.c10101 = c10101;
        notifyPropertyChanged(BR.c10101);
    }

    @Bindable
    public String getC10102() {
        return c10102;
    }

    public void setC10102(String c10102) {
        if (this.c10102.equals(c10102)) return; // for all checkboxes
        this.c10102 = c10102;
        notifyPropertyChanged(BR.c10102);
    }

    @Bindable
    public String getC10103() {
        return c10103;
    }

    public void setC10103(String c10103) {
        if (this.c10103.equals(c10103)) return; // for all checkboxes
        this.c10103 = c10103;
        notifyPropertyChanged(BR.c10103);
    }

    @Bindable
    public String getC10104() {
        return c10104;
    }

    public void setC10104(String c10104) {
        if (this.c10104.equals(c10104)) return; // for all checkboxes
        this.c10104 = c10104;
        notifyPropertyChanged(BR.c10104);
    }

    @Bindable
    public String getC10105() {
        return c10105;
    }

    public void setC10105(String c10105) {
        if (this.c10105.equals(c10105)) return; // for all checkboxes
        this.c10105 = c10105;
        notifyPropertyChanged(BR.c10105);
    }

    @Bindable
    public String getC10106() {
        return c10106;
    }

    public void setC10106(String c10106) {
        if (this.c10106.equals(c10106)) return; // for all checkboxes
        this.c10106 = c10106;
        notifyPropertyChanged(BR.c10106);
    }

    @Bindable
    public String getC10107() {
        return c10107;
    }

    public void setC10107(String c10107) {
        if (this.c10107.equals(c10107)) return; // for all checkboxes
        this.c10107 = c10107;
        notifyPropertyChanged(BR.c10107);
    }

    @Bindable
    public String getC10108() {
        return c10108;
    }

    public void setC10108(String c10108) {
        if (this.c10108.equals(c10108)) return; // for all checkboxes
        this.c10108 = c10108;
        notifyPropertyChanged(BR.c10108);
    }

    @Bindable
    public String getC10109() {
        return c10109;
    }

    public void setC10109(String c10109) {
        if (this.c10109.equals(c10109)) return; // for all checkboxes
        this.c10109 = c10109;
        notifyPropertyChanged(BR.c10109);
    }

    @Bindable
    public String getC10110() {
        return c10110;
    }

    public void setC10110(String c10110) {
        if (this.c10110.equals(c10110)) return; // for all checkboxes
        this.c10110 = c10110;
        notifyPropertyChanged(BR.c10110);
    }

    @Bindable
    public String getC10196() {
        return c10196;
    }

    public void setC10196(String c10196) {
        if (this.c10196.equals(c10196)) return; // for all checkboxes
        this.c10196 = c10196;
        setC10196x(c10196.equals("96") ? this.c10196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c10196);
    }

    @Bindable
    public String getC10196x() {
        return c10196x;
    }

    public void setC10196x(String c10196x) {
        this.c10196x = c10196x;
        notifyPropertyChanged(BR.c10196x);
    }

    @Bindable
    public String getC102() {
        return c102;
    }

    public void setC102(String c102) {
        this.c102 = c102;
        notifyPropertyChanged(BR.c102);
    }

    @Bindable
    public String getC10201() {
        return c10201;
    }

    public void setC10201(String c10201) {
        if (this.c10201.equals(c10201)) return; // for all checkboxes
        this.c10201 = c10201;
        notifyPropertyChanged(BR.c10201);
    }

    @Bindable
    public String getC10202() {
        return c10202;
    }

    public void setC10202(String c10202) {
        if (this.c10202.equals(c10202)) return; // for all checkboxes
        this.c10202 = c10202;
        notifyPropertyChanged(BR.c10202);
    }

    @Bindable
    public String getC10203() {
        return c10203;
    }

    public void setC10203(String c10203) {
        if (this.c10203.equals(c10203)) return; // for all checkboxes
        this.c10203 = c10203;
        notifyPropertyChanged(BR.c10203);
    }

    @Bindable
    public String getC10204() {
        return c10204;
    }

    public void setC10204(String c10204) {
        if (this.c10204.equals(c10204)) return; // for all checkboxes
        this.c10204 = c10204;
        notifyPropertyChanged(BR.c10204);
    }

    @Bindable
    public String getC10205() {
        return c10205;
    }

    public void setC10205(String c10205) {
        if (this.c10205.equals(c10205)) return; // for all checkboxes
        this.c10205 = c10205;
        notifyPropertyChanged(BR.c10205);
    }

    @Bindable
    public String getC10296() {
        return c10296;
    }

    public void setC10296(String c10296) {
        if (this.c10296.equals(c10296)) return; // for all checkboxes
        this.c10296 = c10296;
        setC10296x(c10296.equals("96") ? this.c10296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c10296);
    }

    @Bindable
    public String getC10296x() {
        return c10296x;
    }

    public void setC10296x(String c10296x) {
        this.c10296x = c10296x;
        notifyPropertyChanged(BR.c10296x);
    }

    @Bindable
    public String getC103() {
        return c103;
    }

    public void setC103(String c103) {
        this.c103 = c103;
        notifyPropertyChanged(BR.c103);
    }

    @Bindable
    public String getC10301() {
        return c10301;
    }

    public void setC10301(String c10301) {
        if (this.c10301.equals(c10301)) return; // for all checkboxes
        this.c10301 = c10301;
        notifyPropertyChanged(BR.c10301);
    }

    @Bindable
    public String getC10302() {
        return c10302;
    }

    public void setC10302(String c10302) {
        if (this.c10302.equals(c10302)) return; // for all checkboxes
        this.c10302 = c10302;
        notifyPropertyChanged(BR.c10302);
    }

    @Bindable
    public String getC10303() {
        return c10303;
    }

    public void setC10303(String c10303) {
        if (this.c10303.equals(c10303)) return; // for all checkboxes
        this.c10303 = c10303;
        notifyPropertyChanged(BR.c10303);
    }

    @Bindable
    public String getC10304() {
        return c10304;
    }

    public void setC10304(String c10304) {
        if (this.c10304.equals(c10304)) return; // for all checkboxes
        this.c10304 = c10304;
        notifyPropertyChanged(BR.c10304);
    }

    @Bindable
    public String getC10305() {
        return c10305;
    }

    public void setC10305(String c10305) {
        if (this.c10305.equals(c10305)) return; // for all checkboxes
        this.c10305 = c10305;
        notifyPropertyChanged(BR.c10305);
    }

    @Bindable
    public String getC10306() {
        return c10306;
    }

    public void setC10306(String c10306) {
        if (this.c10306.equals(c10306)) return; // for all checkboxes
        this.c10306 = c10306;
        notifyPropertyChanged(BR.c10306);
    }

    @Bindable
    public String getC10307() {
        return c10307;
    }

    public void setC10307(String c10307) {
        if (this.c10307.equals(c10307)) return; // for all checkboxes
        this.c10307 = c10307;
        notifyPropertyChanged(BR.c10307);
    }

    @Bindable
    public String getC10308() {
        return c10308;
    }

    public void setC10308(String c10308) {
        if (this.c10308.equals(c10308)) return; // for all checkboxes
        this.c10308 = c10308;
        setC10301(c10308.equals("8") ? "" : this.c10301);
        setC10302(c10308.equals("8") ? "" : this.c10302);
        setC10303(c10308.equals("8") ? "" : this.c10303);
        setC10304(c10308.equals("8") ? "" : this.c10304);
        setC10305(c10308.equals("8") ? "" : this.c10305);
        setC10306(c10308.equals("8") ? "" : this.c10306);
        setC10307(c10308.equals("8") ? "" : this.c10307);
        setC10396(c10308.equals("8") ? "" : this.c10396);
        notifyPropertyChanged(BR.c10308);
    }

    @Bindable
    public String getC10396() {
        return c10396;
    }

    public void setC10396(String c10396) {
        if (this.c10396.equals(c10396)) return; // for all checkboxes
        this.c10396 = c10396;
        setC10396x(c10396.equals("96") ? this.c10396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c10396);
    }

    @Bindable
    public String getC10396x() {
        return c10396x;
    }

    public void setC10396x(String c10396x) {
        this.c10396x = c10396x;
        notifyPropertyChanged(BR.c10396x);
    }

    @Bindable
    public String getC104() {
        return c104;
    }

    public void setC104(String c104) {
        this.c104 = c104;
        setC105(c104.equals("1") ? this.c105 : "");
        setC106(c104.equals("1") ? this.c106 : "");

        setC10701(c104.equals("1") ? this.c10701 : "");
        setC10702(c104.equals("1") ? this.c10702 : "");
        setC10703(c104.equals("1") ? this.c10703 : "");
        setC10704(c104.equals("1") ? this.c10704 : "");
        setC10705(c104.equals("1") ? this.c10705 : "");
        setC10706(c104.equals("1") ? this.c10706 : "");
        setC10707(c104.equals("1") ? this.c10707 : "");
        setC10708(c104.equals("1") ? this.c10708 : "");
        setC10796(c104.equals("1") ? this.c10796 : "");
        setC10798(c104.equals("1") ? this.c10798 : "");

        setC10801(c104.equals("1") ? this.c10801 : "");
        setC10802(c104.equals("1") ? this.c10802 : "");
        setC10803(c104.equals("1") ? this.c10803 : "");
        setC10804(c104.equals("1") ? this.c10804 : "");
        setC10805(c104.equals("1") ? this.c10805 : "");
        setC10806(c104.equals("1") ? this.c10806 : "");
        setC10807(c104.equals("1") ? this.c10807 : "");
        setC10808(c104.equals("1") ? this.c10808 : "");
        setC10809(c104.equals("1") ? this.c10809 : "");
        setC10810(c104.equals("1") ? this.c10810 : "");
        setC10811(c104.equals("1") ? this.c10811 : "");
        setC10812(c104.equals("1") ? this.c10812 : "");
        setC10896(c104.equals("1") ? this.c10896 : "");
        setC10898(c104.equals("1") ? this.c10898 : "");
        notifyPropertyChanged(BR.c104);
    }

    @Bindable
    public String getC105() {
        return c105;
    }

    public void setC105(String c105) {
        this.c105 = c105;
        notifyPropertyChanged(BR.c105);
    }

    @Bindable
    public String getC106() {
        return c106;
    }

    public void setC106(String c106) {
        this.c106 = c106;
        notifyPropertyChanged(BR.c106);
    }

    @Bindable
    public String getC107() {
        return c107;
    }

    public void setC107(String c107) {
        this.c107 = c107;
        notifyPropertyChanged(BR.c107);
    }

    @Bindable
    public String getC10701() {
        return c10701;
    }

    public void setC10701(String c10701) {
        if (this.c10701.equals(c10701)) return; // for all checkboxes
        this.c10701 = c10701;
        notifyPropertyChanged(BR.c10701);
    }

    @Bindable
    public String getC10702() {
        return c10702;
    }

    public void setC10702(String c10702) {
        if (this.c10702.equals(c10702)) return; // for all checkboxes
        this.c10702 = c10702;
        notifyPropertyChanged(BR.c10702);
    }

    @Bindable
    public String getC10703() {
        return c10703;
    }

    public void setC10703(String c10703) {
        if (this.c10703.equals(c10703)) return; // for all checkboxes
        this.c10703 = c10703;
        notifyPropertyChanged(BR.c10703);
    }

    @Bindable
    public String getC10704() {
        return c10704;
    }

    public void setC10704(String c10704) {
        if (this.c10704.equals(c10704)) return; // for all checkboxes
        this.c10704 = c10704;
        notifyPropertyChanged(BR.c10704);
    }

    @Bindable
    public String getC10705() {
        return c10705;
    }

    public void setC10705(String c10705) {
        if (this.c10705.equals(c10705)) return; // for all checkboxes
        this.c10705 = c10705;
        notifyPropertyChanged(BR.c10705);
    }

    @Bindable
    public String getC10706() {
        return c10706;
    }

    public void setC10706(String c10706) {
        if (this.c10706.equals(c10706)) return; // for all checkboxes
        this.c10706 = c10706;
        notifyPropertyChanged(BR.c10706);
    }

    @Bindable
    public String getC10707() {
        return c10707;
    }

    public void setC10707(String c10707) {
        if (this.c10707.equals(c10707)) return; // for all checkboxes
        this.c10707 = c10707;
        notifyPropertyChanged(BR.c10707);
    }

    @Bindable
    public String getC10708() {
        return c10708;
    }

    public void setC10708(String c10708) {
        if (this.c10708.equals(c10708)) return; // for all checkboxes
        this.c10708 = c10708;
        setC10701(c10708.equals("8") ? "" : this.c10701);
        setC10702(c10708.equals("8") ? "" : this.c10702);
        setC10703(c10708.equals("8") ? "" : this.c10703);
        setC10704(c10708.equals("8") ? "" : this.c10704);
        setC10705(c10708.equals("8") ? "" : this.c10705);
        setC10706(c10708.equals("8") ? "" : this.c10706);
        setC10707(c10708.equals("8") ? "" : this.c10707);
        setC10798(c10708.equals("8") ? "" : this.c10798);
        setC10796(c10708.equals("8") ? "" : this.c10796);
        notifyPropertyChanged(BR.c10708);
    }

    @Bindable
    public String getC10796() {
        return c10796;
    }

    public void setC10796(String c10796) {
        if (this.c10796.equals(c10796)) return; // for all checkboxes
        this.c10796 = c10796;
        setC10796x(c10796.equals("96") ? this.c10796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c10796);
    }

    @Bindable
    public String getC10796x() {
        return c10796x;
    }

    public void setC10796x(String c10796x) {
        this.c10796x = c10796x;
        notifyPropertyChanged(BR.c10796x);
    }

    @Bindable
    public String getC10798() {
        return c10798;
    }

    public void setC10798(String c10798) {
        if (this.c10798.equals(c10798)) return; // for all checkboxes
        this.c10798 = c10798;
        setC10701(c10798.equals("98") ? "" : this.c10701);
        setC10702(c10798.equals("98") ? "" : this.c10702);
        setC10703(c10798.equals("98") ? "" : this.c10703);
        setC10704(c10798.equals("98") ? "" : this.c10704);
        setC10705(c10798.equals("98") ? "" : this.c10705);
        setC10706(c10798.equals("98") ? "" : this.c10706);
        setC10707(c10798.equals("98") ? "" : this.c10707);
        setC10708(c10798.equals("98") ? "" : this.c10708);
        setC10796(c10798.equals("98") ? "" : this.c10796);
        notifyPropertyChanged(BR.c10798);
    }

    @Bindable
    public String getC108() {
        return c108;
    }

    public void setC108(String c108) {
        this.c108 = c108;
        notifyPropertyChanged(BR.c108);
    }

    @Bindable
    public String getC10801() {
        return c10801;
    }

    public void setC10801(String c10801) {
        if (this.c10801.equals(c10801)) return; // for all checkboxes
        this.c10801 = c10801;
        notifyPropertyChanged(BR.c10801);
    }

    @Bindable
    public String getC10802() {
        return c10802;
    }

    public void setC10802(String c10802) {
        if (this.c10802.equals(c10802)) return; // for all checkboxes
        this.c10802 = c10802;
        notifyPropertyChanged(BR.c10802);
    }

    @Bindable
    public String getC10803() {
        return c10803;
    }

    public void setC10803(String c10803) {
        if (this.c10803.equals(c10803)) return; // for all checkboxes
        this.c10803 = c10803;
        notifyPropertyChanged(BR.c10803);
    }

    @Bindable
    public String getC10804() {
        return c10804;
    }

    public void setC10804(String c10804) {
        if (this.c10804.equals(c10804)) return; // for all checkboxes
        this.c10804 = c10804;
        notifyPropertyChanged(BR.c10804);
    }

    @Bindable
    public String getC10805() {
        return c10805;
    }

    public void setC10805(String c10805) {
        if (this.c10805.equals(c10805)) return; // for all checkboxes
        this.c10805 = c10805;
        notifyPropertyChanged(BR.c10805);
    }

    @Bindable
    public String getC10806() {
        return c10806;
    }

    public void setC10806(String c10806) {
        if (this.c10806.equals(c10806)) return; // for all checkboxes
        this.c10806 = c10806;
        notifyPropertyChanged(BR.c10806);
    }

    @Bindable
    public String getC10807() {
        return c10807;
    }

    public void setC10807(String c10807) {
        if (this.c10807.equals(c10807)) return; // for all checkboxes
        this.c10807 = c10807;
        notifyPropertyChanged(BR.c10807);
    }

    @Bindable
    public String getC10808() {
        return c10808;
    }

    public void setC10808(String c10808) {
        if (this.c10808.equals(c10808)) return; // for all checkboxes
        this.c10808 = c10808;
        notifyPropertyChanged(BR.c10808);
    }

    @Bindable
    public String getC10809() {
        return c10809;
    }

    public void setC10809(String c10809) {
        if (this.c10809.equals(c10809)) return; // for all checkboxes
        this.c10809 = c10809;
        notifyPropertyChanged(BR.c10809);
    }

    @Bindable
    public String getC10810() {
        return c10810;
    }

    public void setC10810(String c10810) {
        if (this.c10810.equals(c10810)) return; // for all checkboxes
        this.c10810 = c10810;
        notifyPropertyChanged(BR.c10810);
    }

    @Bindable
    public String getC10811() {
        return c10811;
    }

    public void setC10811(String c10811) {
        if (this.c10811.equals(c10811)) return; // for all checkboxes
        this.c10811 = c10811;
        notifyPropertyChanged(BR.c10811);
    }

    @Bindable
    public String getC10812() {
        return c10812;
    }

    public void setC10812(String c10812) {
        if (this.c10812.equals(c10812)) return; // for all checkboxes
        this.c10812 = c10812;
        notifyPropertyChanged(BR.c10812);
    }

    @Bindable
    public String getC10896() {
        return c10896;
    }

    public void setC10896(String c10896) {
        if (this.c10896.equals(c10896)) return; // for all checkboxes
        this.c10896 = c10896;
        setC10896x(c10896.equals("96") ? this.c10896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c10896);
    }

    @Bindable
    public String getC10896x() {
        return c10896x;
    }

    public void setC10896x(String c10896x) {
        this.c10896x = c10896x;
        notifyPropertyChanged(BR.c10896x);
    }

    @Bindable
    public String getC10898() {
        return c10898;
    }

    public void setC10898(String c10898) {
        if (this.c10898.equals(c10898)) return; // for all checkboxes
        this.c10898 = c10898;
        setC10801(c10898.equals("98") ? "" : this.c10801);
        setC10802(c10898.equals("98") ? "" : this.c10802);
        setC10803(c10898.equals("98") ? "" : this.c10803);
        setC10804(c10898.equals("98") ? "" : this.c10804);
        setC10805(c10898.equals("98") ? "" : this.c10805);
        setC10806(c10898.equals("98") ? "" : this.c10806);
        setC10807(c10898.equals("98") ? "" : this.c10807);
        setC10808(c10898.equals("98") ? "" : this.c10808);
        setC10809(c10898.equals("98") ? "" : this.c10809);
        setC10810(c10898.equals("98") ? "" : this.c10810);
        setC10811(c10898.equals("98") ? "" : this.c10811);
        setC10812(c10898.equals("98") ? "" : this.c10812);
        setC10896(c10898.equals("98") ? "" : this.c10896);
        notifyPropertyChanged(BR.c10898);
    }

    @Bindable
    public String getC109() {
        return c109;
    }

    public void setC109(String c109) {
        this.c109 = c109;
        setC110(c109.equals("1") ? this.c110 : "");
        setC111(c109.equals("1") ? this.c111 : "");

        setC11201(c109.equals("1") ? this.c11201 : "");
        setC11202(c109.equals("1") ? this.c11202 : "");
        setC11203(c109.equals("1") ? this.c11203 : "");
        setC11204(c109.equals("1") ? this.c11204 : "");
        setC11205(c109.equals("1") ? this.c11205 : "");
        setC11206(c109.equals("1") ? this.c11206 : "");
        setC11207(c109.equals("1") ? this.c11207 : "");
        setC11208(c109.equals("1") ? this.c11208 : "");
        setC11296(c109.equals("1") ? this.c11296 : "");
        setC11298(c109.equals("1") ? this.c11298 : "");

        setC11301(c109.equals("1") ? this.c11301 : "");
        setC11302(c109.equals("1") ? this.c11302 : "");
        setC11303(c109.equals("1") ? this.c11303 : "");
        setC11304(c109.equals("1") ? this.c11304 : "");
        setC11305(c109.equals("1") ? this.c11305 : "");
        setC11306(c109.equals("1") ? this.c11306 : "");
        setC11307(c109.equals("1") ? this.c11307 : "");
        setC11308(c109.equals("1") ? this.c11308 : "");
        setC11309(c109.equals("1") ? this.c11309 : "");
        setC11310(c109.equals("1") ? this.c11310 : "");
        setC11311(c109.equals("1") ? this.c11311 : "");
        setC11312(c109.equals("1") ? this.c11312 : "");
        setC11396(c109.equals("1") ? this.c11396 : "");
        setC11398(c109.equals("1") ? this.c11398 : "");
        notifyPropertyChanged(BR.c109);
    }

    @Bindable
    public String getC110() {
        return c110;
    }

    public void setC110(String c110) {
        this.c110 = c110;
        notifyPropertyChanged(BR.c110);
    }

    @Bindable
    public String getC111() {
        return c111;
    }

    public void setC111(String c111) {
        this.c111 = c111;
        notifyPropertyChanged(BR.c111);
    }

    @Bindable
    public String getC112() {
        return c112;
    }

    public void setC112(String c112) {
        this.c112 = c112;
        notifyPropertyChanged(BR.c112);
    }

    @Bindable
    public String getC11201() {
        return c11201;
    }

    public void setC11201(String c11201) {
        if (this.c11201.equals(c11201)) return; // for all checkboxes
        this.c11201 = c11201;
        notifyPropertyChanged(BR.c11201);
    }

    @Bindable
    public String getC11202() {
        return c11202;
    }

    public void setC11202(String c11202) {
        if (this.c11202.equals(c11202)) return; // for all checkboxes
        this.c11202 = c11202;
        notifyPropertyChanged(BR.c11202);
    }

    @Bindable
    public String getC11203() {
        return c11203;
    }

    public void setC11203(String c11203) {
        if (this.c11203.equals(c11203)) return; // for all checkboxes
        this.c11203 = c11203;
        notifyPropertyChanged(BR.c11203);
    }

    @Bindable
    public String getC11204() {
        return c11204;
    }

    public void setC11204(String c11204) {
        if (this.c11204.equals(c11204)) return; // for all checkboxes
        this.c11204 = c11204;
        notifyPropertyChanged(BR.c11204);
    }

    @Bindable
    public String getC11205() {
        return c11205;
    }

    public void setC11205(String c11205) {
        if (this.c11205.equals(c11205)) return; // for all checkboxes
        this.c11205 = c11205;
        notifyPropertyChanged(BR.c11205);
    }

    @Bindable
    public String getC11206() {
        return c11206;
    }

    public void setC11206(String c11206) {
        if (this.c11206.equals(c11206)) return; // for all checkboxes
        this.c11206 = c11206;
        notifyPropertyChanged(BR.c11206);
    }

    @Bindable
    public String getC11207() {
        return c11207;
    }

    public void setC11207(String c11207) {
        if (this.c11207.equals(c11207)) return; // for all checkboxes
        this.c11207 = c11207;
        notifyPropertyChanged(BR.c11207);
    }

    @Bindable
    public String getC11208() {
        return c11208;
    }

    public void setC11208(String c11208) {
        if (this.c11208.equals(c11208)) return; // for all checkboxes
        this.c11208 = c11208;
        setC11201(c11208.equals("8") ? "" : this.c11201);
        setC11202(c11208.equals("8") ? "" : this.c11202);
        setC11203(c11208.equals("8") ? "" : this.c11203);
        setC11204(c11208.equals("8") ? "" : this.c11204);
        setC11205(c11208.equals("8") ? "" : this.c11205);
        setC11206(c11208.equals("8") ? "" : this.c11206);
        setC11207(c11208.equals("8") ? "" : this.c11207);
        setC11298(c11208.equals("8") ? "" : this.c11298);
        setC11296(c11208.equals("8") ? "" : this.c11296);
        notifyPropertyChanged(BR.c11208);
    }

    @Bindable
    public String getC11296() {
        return c11296;
    }

    public void setC11296(String c11296) {
        if (this.c11296.equals(c11296)) return; // for all checkboxes
        this.c11296 = c11296;
        setC11296x(c11296.equals("96") ? this.c11296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c11296);
    }

    @Bindable
    public String getC11296x() {
        return c11296x;
    }

    public void setC11296x(String c11296x) {
        this.c11296x = c11296x;
        notifyPropertyChanged(BR.c11296x);
    }

    @Bindable
    public String getC11298() {
        return c11298;
    }

    public void setC11298(String c11298) {
        if (this.c11298.equals(c11298)) return; // for all checkboxes
        this.c11298 = c11298;
        setC11201(c11298.equals("98") ? "" : this.c11201);
        setC11202(c11298.equals("98") ? "" : this.c11202);
        setC11203(c11298.equals("98") ? "" : this.c11203);
        setC11204(c11298.equals("98") ? "" : this.c11204);
        setC11205(c11298.equals("98") ? "" : this.c11205);
        setC11206(c11298.equals("98") ? "" : this.c11206);
        setC11207(c11298.equals("98") ? "" : this.c11207);
        setC11208(c11298.equals("98") ? "" : this.c11208);
        setC11296(c11298.equals("98") ? "" : this.c11296);
        notifyPropertyChanged(BR.c11298);
    }

    @Bindable
    public String getC113() {
        return c113;
    }

    public void setC113(String c113) {
        this.c113 = c113;
        notifyPropertyChanged(BR.c113);
    }

    @Bindable
    public String getC11301() {
        return c11301;
    }

    public void setC11301(String c11301) {
        if (this.c11301.equals(c11301)) return; // for all checkboxes
        this.c11301 = c11301;
        notifyPropertyChanged(BR.c11301);
    }

    @Bindable
    public String getC11302() {
        return c11302;
    }

    public void setC11302(String c11302) {
        if (this.c11302.equals(c11302)) return; // for all checkboxes
        this.c11302 = c11302;
        notifyPropertyChanged(BR.c11302);
    }

    @Bindable
    public String getC11303() {
        return c11303;
    }

    public void setC11303(String c11303) {
        if (this.c11303.equals(c11303)) return; // for all checkboxes
        this.c11303 = c11303;
        notifyPropertyChanged(BR.c11303);
    }

    @Bindable
    public String getC11304() {
        return c11304;
    }

    public void setC11304(String c11304) {
        if (this.c11304.equals(c11304)) return; // for all checkboxes
        this.c11304 = c11304;
        notifyPropertyChanged(BR.c11304);
    }

    @Bindable
    public String getC11305() {
        return c11305;
    }

    public void setC11305(String c11305) {
        if (this.c11305.equals(c11305)) return; // for all checkboxes
        this.c11305 = c11305;
        notifyPropertyChanged(BR.c11305);
    }

    @Bindable
    public String getC11306() {
        return c11306;
    }

    public void setC11306(String c11306) {
        if (this.c11306.equals(c11306)) return; // for all checkboxes
        this.c11306 = c11306;
        notifyPropertyChanged(BR.c11306);
    }

    @Bindable
    public String getC11307() {
        return c11307;
    }

    public void setC11307(String c11307) {
        if (this.c11307.equals(c11307)) return; // for all checkboxes
        this.c11307 = c11307;
        notifyPropertyChanged(BR.c11307);
    }

    @Bindable
    public String getC11308() {
        return c11308;
    }

    public void setC11308(String c11308) {
        if (this.c11308.equals(c11308)) return; // for all checkboxes
        this.c11308 = c11308;
        notifyPropertyChanged(BR.c11308);
    }

    @Bindable
    public String getC11309() {
        return c11309;
    }

    public void setC11309(String c11309) {
        if (this.c11309.equals(c11309)) return; // for all checkboxes
        this.c11309 = c11309;
        notifyPropertyChanged(BR.c11309);
    }

    @Bindable
    public String getC11310() {
        return c11310;
    }

    public void setC11310(String c11310) {
        if (this.c11310.equals(c11310)) return; // for all checkboxes
        this.c11310 = c11310;
        notifyPropertyChanged(BR.c11310);
    }

    @Bindable
    public String getC11311() {
        return c11311;
    }

    public void setC11311(String c11311) {
        if (this.c11311.equals(c11311)) return; // for all checkboxes
        this.c11311 = c11311;
        notifyPropertyChanged(BR.c11311);
    }

    @Bindable
    public String getC11312() {
        return c11312;
    }

    public void setC11312(String c11312) {
        if (this.c11312.equals(c11312)) return; // for all checkboxes
        this.c11312 = c11312;
        notifyPropertyChanged(BR.c11312);
    }

    @Bindable
    public String getC11396() {
        return c11396;
    }

    public void setC11396(String c11396) {
        if (this.c11396.equals(c11396)) return; // for all checkboxes
        this.c11396 = c11396;
        setC11396x(c11396.equals("96") ? this.c11396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c11396);
    }

    @Bindable
    public String getC11396x() {
        return c11396x;
    }

    public void setC11396x(String c11396x) {
        this.c11396x = c11396x;
        notifyPropertyChanged(BR.c11396x);
    }

    @Bindable
    public String getC11398() {
        return c11398;
    }

    public void setC11398(String c11398) {
        if (this.c11398.equals(c11398)) return; // for all checkboxes
        this.c11398 = c11398;
        setC11301(c11398.equals("98") ? "" : this.c11301);
        setC11302(c11398.equals("98") ? "" : this.c11302);
        setC11303(c11398.equals("98") ? "" : this.c11303);
        setC11304(c11398.equals("98") ? "" : this.c11304);
        setC11305(c11398.equals("98") ? "" : this.c11305);
        setC11306(c11398.equals("98") ? "" : this.c11306);
        setC11307(c11398.equals("98") ? "" : this.c11307);
        setC11308(c11398.equals("98") ? "" : this.c11308);
        setC11309(c11398.equals("98") ? "" : this.c11309);
        setC11310(c11398.equals("98") ? "" : this.c11310);
        setC11311(c11398.equals("98") ? "" : this.c11311);
        setC11312(c11398.equals("98") ? "" : this.c11312);
        setC11396(c11398.equals("98") ? "" : this.c11396);
        notifyPropertyChanged(BR.c11398);
    }

    @Bindable
    public String getC114() {
        return c114;
    }

    public void setC114(String c114) {
        this.c114 = c114;
        setC115(c114.equals("1") ? this.c115 : "");
        setC116(c114.equals("1") ? this.c116 : "");
        notifyPropertyChanged(BR.c114);
    }

    @Bindable
    public String getC115() {
        return c115;
    }

    public void setC115(String c115) {
        this.c115 = c115;
        notifyPropertyChanged(BR.c115);
    }

    @Bindable
    public String getC116() {
        return c116;
    }

    public void setC116(String c116) {
        this.c116 = c116;
        notifyPropertyChanged(BR.c116);
    }

    @Bindable
    public String getC117() {
        return c117;
    }

    public void setC117(String c117) {
        this.c117 = c117;
        setC118(c117.equals("1") ? this.c118 : "");
        setC119(c117.equals("1") ? this.c119 : "");
        notifyPropertyChanged(BR.c117);
    }

    @Bindable
    public String getC118() {
        return c118;
    }

    public void setC118(String c118) {
        this.c118 = c118;
        notifyPropertyChanged(BR.c118);
    }

    @Bindable
    public String getC119() {
        return c119;
    }

    public void setC119(String c119) {
        this.c119 = c119;
        notifyPropertyChanged(BR.c119);
    }

    @Bindable
    public String getC120() {
        return c120;
    }

    public void setC120(String c120) {
        this.c120 = c120;
        setC121(c120.equals("1") ? this.c121 : "");
        setC122(c120.equals("1") ? this.c122 : "");
        notifyPropertyChanged(BR.c120);
    }

    @Bindable
    public String getC121() {
        return c121;
    }

    public void setC121(String c121) {
        this.c121 = c121;
        notifyPropertyChanged(BR.c121);
    }

    @Bindable
    public String getC122() {
        return c122;
    }

    public void setC122(String c122) {
        this.c122 = c122;
        notifyPropertyChanged(BR.c122);
    }

    @Bindable
    public String getC123() {
        return c123;
    }

    public void setC123(String c123) {
        this.c123 = c123;
        setC124(c123.equals("1") ? this.c124 : "");
        setC125(c123.equals("1") ? this.c125 : "");
        notifyPropertyChanged(BR.c123);
    }

    @Bindable
    public String getC124() {
        return c124;
    }

    public void setC124(String c124) {
        this.c124 = c124;
        notifyPropertyChanged(BR.c124);
    }

    @Bindable
    public String getC125() {
        return c125;
    }

    public void setC125(String c125) {
        this.c125 = c125;
        notifyPropertyChanged(BR.c125);
    }

    @Bindable
    public String getC126() {
        return c126;
    }

    public void setC126(String c126) {
        this.c126 = c126;
        setC127(c126.equals("1") ? this.c127 : "");
        setC128(c126.equals("1") ? this.c128 : "");
        notifyPropertyChanged(BR.c126);
    }

    @Bindable
    public String getC127() {
        return c127;
    }

    public void setC127(String c127) {
        this.c127 = c127;
        notifyPropertyChanged(BR.c127);
    }

    @Bindable
    public String getC128() {
        return c128;
    }

    public void setC128(String c128) {
        this.c128 = c128;
        notifyPropertyChanged(BR.c128);
    }

    @Bindable
    public String getC129() {
        return c129;
    }

    public void setC129(String c129) {
        this.c129 = c129;
        setC130(c129.equals("1") ? this.c130 : "");
        setC131(c129.equals("1") ? this.c131 : "");
        notifyPropertyChanged(BR.c129);
    }

    @Bindable
    public String getC130() {
        return c130;
    }

    public void setC130(String c130) {
        this.c130 = c130;
        notifyPropertyChanged(BR.c130);
    }

    @Bindable
    public String getC131() {
        return c131;
    }

    public void setC131(String c131) {
        this.c131 = c131;
        notifyPropertyChanged(BR.c131);
    }

    @Bindable
    public String getC132() {
        return c132;
    }

    public void setC132(String c132) {
        this.c132 = c132;
        setC133(c132.equals("1") ? this.c133 : "");
        setC134(c132.equals("1") ? this.c134 : "");
        notifyPropertyChanged(BR.c132);
    }

    @Bindable
    public String getC133() {
        return c133;
    }

    public void setC133(String c133) {
        this.c133 = c133;
        notifyPropertyChanged(BR.c133);
    }

    @Bindable
    public String getC134() {
        return c134;
    }

    public void setC134(String c134) {
        this.c134 = c134;
        notifyPropertyChanged(BR.c134);
    }

    @Bindable
    public String getC135() {
        return c135;
    }

    public void setC135(String c135) {
        this.c135 = c135;
        setC136(c135.equals("1") ? this.c136 : "");
        setC137(c135.equals("1") ? this.c137 : "");
        notifyPropertyChanged(BR.c135);
    }

    @Bindable
    public String getC136() {
        return c136;
    }

    public void setC136(String c136) {
        this.c136 = c136;
        notifyPropertyChanged(BR.c136);
    }

    @Bindable
    public String getC137() {
        return c137;
    }

    public void setC137(String c137) {
        this.c137 = c137;
        notifyPropertyChanged(BR.c137);
    }

    @Bindable
    public String getC138() {
        return c138;
    }

    public void setC138(String c138) {
        this.c138 = c138;
        setC139(c138.equals("1") ? this.c139 : "");
        setC140(c138.equals("1") ? this.c140 : "");
        notifyPropertyChanged(BR.c138);
    }

    @Bindable
    public String getC139() {
        return c139;
    }

    public void setC139(String c139) {
        this.c139 = c139;
        notifyPropertyChanged(BR.c139);
    }

    @Bindable
    public String getC140() {
        return c140;
    }

    public void setC140(String c140) {
        this.c140 = c140;
        notifyPropertyChanged(BR.c140);
    }

    @Bindable
    public String getC141() {
        return c141;
    }

    public void setC141(String c141) {
        this.c141 = c141;
        setC142(c141.equals("1") ? this.c142 : "");
        setC143(c141.equals("1") ? this.c143 : "");
        notifyPropertyChanged(BR.c141);
    }

    @Bindable
    public String getC142() {
        return c142;
    }

    public void setC142(String c142) {
        this.c142 = c142;
        notifyPropertyChanged(BR.c142);
    }

    @Bindable
    public String getC143() {
        return c143;
    }

    public void setC143(String c143) {
        this.c143 = c143;
        notifyPropertyChanged(BR.c143);
    }

    @Bindable
    public String getC144() {
        return c144;
    }

    public void setC144(String c144) {
        this.c144 = c144;
        setC145(c144.equals("1") ? this.c145 : "");
        setC146(c144.equals("1") ? this.c146 : "");
        notifyPropertyChanged(BR.c144);
    }

    @Bindable
    public String getC145() {
        return c145;
    }

    public void setC145(String c145) {
        this.c145 = c145;
        notifyPropertyChanged(BR.c145);
    }

    @Bindable
    public String getC146() {
        return c146;
    }

    public void setC146(String c146) {
        this.c146 = c146;
        notifyPropertyChanged(BR.c146);
    }

    @Bindable
    public String getC147() {
        return c147;
    }

    public void setC147(String c147) {
        this.c147 = c147;
        setC148(c147.equals("1") ? this.c148 : "");
        setC149(c147.equals("1") ? this.c149 : "");
        notifyPropertyChanged(BR.c147);
    }

    @Bindable
    public String getC148() {
        return c148;
    }

    public void setC148(String c148) {
        this.c148 = c148;
        notifyPropertyChanged(BR.c148);
    }

    @Bindable
    public String getC149() {
        return c149;
    }

    public void setC149(String c149) {
        this.c149 = c149;
        notifyPropertyChanged(BR.c149);
    }

    @Bindable
    public String getC150() {
        return c150;
    }

    public void setC150(String c150) {
        this.c150 = c150;
        setC15101(c150.equals("1") ? this.c15101 : "");
        setC15102(c150.equals("1") ? this.c15102 : "");
        setC15103(c150.equals("1") ? this.c15103 : "");
        setC15196(c150.equals("1") ? this.c15196 : "");
        notifyPropertyChanged(BR.c150);
    }

    @Bindable
    public String getC151() {
        return c151;
    }

    public void setC151(String c151) {
        this.c151 = c151;
        notifyPropertyChanged(BR.c151);
    }

    @Bindable
    public String getC15101() {
        return c15101;
    }

    public void setC15101(String c15101) {
        if (this.c15101.equals(c15101)) return; // for all checkboxes
        this.c15101 = c15101;
        notifyPropertyChanged(BR.c15101);
    }

    @Bindable
    public String getC15102() {
        return c15102;
    }

    public void setC15102(String c15102) {
        if (this.c15102.equals(c15102)) return; // for all checkboxes
        this.c15102 = c15102;
        notifyPropertyChanged(BR.c15102);
    }

    @Bindable
    public String getC15103() {
        return c15103;
    }

    public void setC15103(String c15103) {
        if (this.c15103.equals(c15103)) return; // for all checkboxes
        this.c15103 = c15103;
        notifyPropertyChanged(BR.c15103);
    }

    @Bindable
    public String getC15196() {
        return c15196;
    }

    public void setC15196(String c15196) {
        if (this.c15196.equals(c15196)) return; // for all checkboxes
        this.c15196 = c15196;
        setC15196x(c15196.equals("96") ? this.c15196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c15196);
    }

    @Bindable
    public String getC15196x() {
        return c15196x;
    }

    public void setC15196x(String c15196x) {
        this.c15196x = c15196x;
        notifyPropertyChanged(BR.c15196x);
    }

    @Bindable
    public String getC152() {
        return c152;
    }

    public void setC152(String c152) {
        this.c152 = c152;
        setC15301(c152.equals("1") ? this.c15301 : "");
        setC15302(c152.equals("1") ? this.c15302 : "");
        setC15303(c152.equals("1") ? this.c15303 : "");
        setC15396(c152.equals("1") ? this.c15396 : "");
        notifyPropertyChanged(BR.c152);
    }

    @Bindable
    public String getC153() {
        return c153;
    }

    public void setC153(String c153) {
        this.c153 = c153;
        notifyPropertyChanged(BR.c153);
    }

    @Bindable
    public String getC15301() {
        return c15301;
    }

    public void setC15301(String c15301) {
        if (this.c15301.equals(c15301)) return; // for all checkboxes
        this.c15301 = c15301;
        notifyPropertyChanged(BR.c15301);
    }

    @Bindable
    public String getC15302() {
        return c15302;
    }

    public void setC15302(String c15302) {
        if (this.c15302.equals(c15302)) return; // for all checkboxes
        this.c15302 = c15302;
        notifyPropertyChanged(BR.c15302);
    }

    @Bindable
    public String getC15303() {
        return c15303;
    }

    public void setC15303(String c15303) {
        if (this.c15303.equals(c15303)) return; // for all checkboxes
        this.c15303 = c15303;
        notifyPropertyChanged(BR.c15303);
    }

    @Bindable
    public String getC15396() {
        return c15396;
    }

    public void setC15396(String c15396) {
        if (this.c15396.equals(c15396)) return; // for all checkboxes
        this.c15396 = c15396;
        setC15396x(c15396.equals("96") ? this.c15396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c15396);
    }

    @Bindable
    public String getC15396x() {
        return c15396x;
    }

    public void setC15396x(String c15396x) {
        this.c15396x = c15396x;
        notifyPropertyChanged(BR.c15396x);
    }

    @Bindable
    public String getD101() {
        return d101;
    }

    public void setD101(String d101) {
        this.d101 = d101;
        setD10201(d101.equals("2") ? "" : this.d10201);
        setD10202(d101.equals("2") ? "" : this.d10202);
        setD10203(d101.equals("2") ? "" : this.d10203);
        setD10204(d101.equals("2") ? "" : this.d10204);
        setD10296(d101.equals("2") ? "" : this.d10296);

        setD10301(d101.equals("2") ? "" : this.d10301);
        setD10302(d101.equals("2") ? "" : this.d10302);
        setD10303(d101.equals("2") ? "" : this.d10303);
        setD10304(d101.equals("2") ? "" : this.d10304);
        setD10305(d101.equals("2") ? "" : this.d10305);
        setD10306(d101.equals("2") ? "" : this.d10306);
        setD10307(d101.equals("2") ? "" : this.d10307);
        setD10396(d101.equals("2") ? "" : this.d10396);

        setD104(d101.equals("2") ? "" : this.d104);
        setD105(d101.equals("2") ? "" : this.d105);

        setD10601(d101.equals("2") ? "" : this.d10601);
        setD10602(d101.equals("2") ? "" : this.d10602);
        setD10603(d101.equals("2") ? "" : this.d10603);
        setD10604(d101.equals("2") ? "" : this.d10604);
        setD10696(d101.equals("2") ? "" : this.d10696);

        setD10701(d101.equals("2") ? "" : this.d10701);
        setD10702(d101.equals("2") ? "" : this.d10702);
        setD10703(d101.equals("2") ? "" : this.d10703);
        setD10704(d101.equals("2") ? "" : this.d10704);
        setD10705(d101.equals("2") ? "" : this.d10705);
        setD10706(d101.equals("2") ? "" : this.d10706);
        setD10707(d101.equals("2") ? "" : this.d10707);
        setD10796(d101.equals("2") ? "" : this.d10796);

        setD10801(d101.equals("2") ? "" : this.d10801);
        setD10802(d101.equals("2") ? "" : this.d10802);
        setD10803(d101.equals("2") ? "" : this.d10803);
        setD10804(d101.equals("2") ? "" : this.d10804);
        setD10805(d101.equals("2") ? "" : this.d10805);
        setD10806(d101.equals("2") ? "" : this.d10806);
        setD10807(d101.equals("2") ? "" : this.d10807);
        setD10808(d101.equals("2") ? "" : this.d10808);
        setD10896(d101.equals("2") ? "" : this.d10896);
        setD10898(d101.equals("2") ? "" : this.d10898);
        notifyPropertyChanged(BR.d101);
    }

    @Bindable
    public String getD102() {
        return d102;
    }

    public void setD102(String d102) {
        this.d102 = d102;
        notifyPropertyChanged(BR.d102);
    }

    @Bindable
    public String getD10201() {
        return d10201;
    }

    public void setD10201(String d10201) {
        if (this.d10201.equals(d10201)) return; // for all checkboxes
        this.d10201 = d10201;
        notifyPropertyChanged(BR.d10201);
    }

    @Bindable
    public String getD10202() {
        return d10202;
    }

    public void setD10202(String d10202) {
        if (this.d10202.equals(d10202)) return; // for all checkboxes
        this.d10202 = d10202;
        notifyPropertyChanged(BR.d10202);
    }

    @Bindable
    public String getD10203() {
        return d10203;
    }

    public void setD10203(String d10203) {
        if (this.d10203.equals(d10203)) return; // for all checkboxes
        this.d10203 = d10203;
        notifyPropertyChanged(BR.d10203);
    }

    @Bindable
    public String getD10204() {
        return d10204;
    }

    public void setD10204(String d10204) {
        if (this.d10204.equals(d10204)) return; // for all checkboxes
        this.d10204 = d10204;
        notifyPropertyChanged(BR.d10204);
    }

    @Bindable
    public String getD10296() {
        return d10296;
    }

    public void setD10296(String d10296) {
        if (this.d10296.equals(d10296)) return; // for all checkboxes
        this.d10296 = d10296;
        setD10296x(d10296.equals("96") ? this.d10296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d10296);
    }

    @Bindable
    public String getD10296x() {
        return d10296x;
    }

    public void setD10296x(String d10296x) {
        this.d10296x = d10296x;
        notifyPropertyChanged(BR.d10296x);
    }

    @Bindable
    public String getD103() {
        return d103;
    }

    public void setD103(String d103) {
        this.d103 = d103;
        notifyPropertyChanged(BR.d103);
    }

    @Bindable
    public String getD10301() {
        return d10301;
    }

    public void setD10301(String d10301) {
        if (this.d10301.equals(d10301)) return; // for all checkboxes
        this.d10301 = d10301;
        notifyPropertyChanged(BR.d10301);
    }

    @Bindable
    public String getD10302() {
        return d10302;
    }

    public void setD10302(String d10302) {
        if (this.d10302.equals(d10302)) return; // for all checkboxes
        this.d10302 = d10302;
        notifyPropertyChanged(BR.d10302);
    }

    @Bindable
    public String getD10303() {
        return d10303;
    }

    public void setD10303(String d10303) {
        if (this.d10303.equals(d10303)) return; // for all checkboxes
        this.d10303 = d10303;
        notifyPropertyChanged(BR.d10303);
    }

    @Bindable
    public String getD10304() {
        return d10304;
    }

    public void setD10304(String d10304) {
        if (this.d10304.equals(d10304)) return; // for all checkboxes
        this.d10304 = d10304;
        notifyPropertyChanged(BR.d10304);
    }

    @Bindable
    public String getD10305() {
        return d10305;
    }

    public void setD10305(String d10305) {
        if (this.d10305.equals(d10305)) return; // for all checkboxes
        this.d10305 = d10305;
        notifyPropertyChanged(BR.d10305);
    }

    @Bindable
    public String getD10306() {
        return d10306;
    }

    public void setD10306(String d10306) {
        if (this.d10306.equals(d10306)) return; // for all checkboxes
        this.d10306 = d10306;
        notifyPropertyChanged(BR.d10306);
    }

    @Bindable
    public String getD10307() {
        return d10307;
    }

    public void setD10307(String d10307) {
        if (this.d10307.equals(d10307)) return; // for all checkboxes
        this.d10307 = d10307;
        notifyPropertyChanged(BR.d10307);
    }

    @Bindable
    public String getD10396() {
        return d10396;
    }

    public void setD10396(String d10396) {
        if (this.d10396.equals(d10396)) return; // for all checkboxes
        this.d10396 = d10396;
        setD10396x(d10396.equals("96") ? this.d10396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d10396);
    }

    @Bindable
    public String getD10396x() {
        return d10396x;
    }

    public void setD10396x(String d10396x) {
        this.d10396x = d10396x;
        notifyPropertyChanged(BR.d10396x);
    }

    @Bindable
    public String getD104() {
        return d104;
    }

    public void setD104(String d104) {
        this.d104 = d104;
        setD105(d104.equals("1") ? this.d105 : "");

        setD10601(d104.equals("1") ? this.d10601 : "");
        setD10602(d104.equals("1") ? this.d10602 : "");
        setD10603(d104.equals("1") ? this.d10603 : "");
        setD10604(d104.equals("1") ? this.d10604 : "");
        setD10696(d104.equals("1") ? this.d10696 : "");

        setD10701(d104.equals("1") ? this.d10701 : "");
        setD10702(d104.equals("1") ? this.d10702 : "");
        setD10703(d104.equals("1") ? this.d10703 : "");
        setD10704(d104.equals("1") ? this.d10704 : "");
        setD10705(d104.equals("1") ? this.d10705 : "");
        setD10706(d104.equals("1") ? this.d10706 : "");
        setD10707(d104.equals("1") ? this.d10707 : "");
        setD10796(d104.equals("1") ? this.d10796 : "");
        notifyPropertyChanged(BR.d104);
    }

    @Bindable
    public String getD105() {
        return d105;
    }

    public void setD105(String d105) {
        this.d105 = d105;
        notifyPropertyChanged(BR.d105);
    }

    @Bindable
    public String getD106() {
        return d106;
    }

    public void setD106(String d106) {
        this.d106 = d106;
        notifyPropertyChanged(BR.d106);
    }

    @Bindable
    public String getD10601() {
        return d10601;
    }

    public void setD10601(String d10601) {
        if (this.d10601.equals(d10601)) return; // for all checkboxes
        this.d10601 = d10601;
        notifyPropertyChanged(BR.d10601);
    }

    @Bindable
    public String getD10602() {
        return d10602;
    }

    public void setD10602(String d10602) {
        if (this.d10602.equals(d10602)) return; // for all checkboxes
        this.d10602 = d10602;
        notifyPropertyChanged(BR.d10602);
    }

    @Bindable
    public String getD10603() {
        return d10603;
    }

    public void setD10603(String d10603) {
        if (this.d10603.equals(d10603)) return; // for all checkboxes
        this.d10603 = d10603;
        notifyPropertyChanged(BR.d10603);
    }

    @Bindable
    public String getD10604() {
        return d10604;
    }

    public void setD10604(String d10604) {
        if (this.d10604.equals(d10604)) return; // for all checkboxes
        this.d10604 = d10604;
        notifyPropertyChanged(BR.d10604);
    }

    @Bindable
    public String getD10696() {
        return d10696;
    }

    public void setD10696(String d10696) {
        if (this.d10696.equals(d10696)) return; // for all checkboxes
        this.d10696 = d10696;
        setD10696x(d10696.equals("96") ? this.d10696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d10696);
    }

    @Bindable
    public String getD10696x() {
        return d10696x;
    }

    public void setD10696x(String d10696x) {
        this.d10696x = d10696x;
        notifyPropertyChanged(BR.d10696x);
    }

    @Bindable
    public String getD107() {
        return d107;
    }

    public void setD107(String d107) {
        this.d107 = d107;
        notifyPropertyChanged(BR.d107);
    }

    @Bindable
    public String getD10701() {
        return d10701;
    }

    public void setD10701(String d10701) {
        if (this.d10701.equals(d10701)) return; // for all checkboxes
        this.d10701 = d10701;
        notifyPropertyChanged(BR.d10701);
    }

    @Bindable
    public String getD10702() {
        return d10702;
    }

    public void setD10702(String d10702) {
        if (this.d10702.equals(d10702)) return; // for all checkboxes
        this.d10702 = d10702;
        notifyPropertyChanged(BR.d10702);
    }

    @Bindable
    public String getD10703() {
        return d10703;
    }

    public void setD10703(String d10703) {
        if (this.d10703.equals(d10703)) return; // for all checkboxes
        this.d10703 = d10703;
        notifyPropertyChanged(BR.d10703);
    }

    @Bindable
    public String getD10704() {
        return d10704;
    }

    public void setD10704(String d10704) {
        if (this.d10704.equals(d10704)) return; // for all checkboxes
        this.d10704 = d10704;
        notifyPropertyChanged(BR.d10704);
    }

    @Bindable
    public String getD10705() {
        return d10705;
    }

    public void setD10705(String d10705) {
        if (this.d10705.equals(d10705)) return; // for all checkboxes
        this.d10705 = d10705;
        notifyPropertyChanged(BR.d10705);
    }

    @Bindable
    public String getD10706() {
        return d10706;
    }

    public void setD10706(String d10706) {
        if (this.d10706.equals(d10706)) return; // for all checkboxes
        this.d10706 = d10706;
        notifyPropertyChanged(BR.d10706);
    }

    @Bindable
    public String getD10707() {
        return d10707;
    }

    public void setD10707(String d10707) {
        if (this.d10707.equals(d10707)) return; // for all checkboxes
        this.d10707 = d10707;
        notifyPropertyChanged(BR.d10707);
    }

    @Bindable
    public String getD10796() {
        return d10796;
    }

    public void setD10796(String d10796) {
        if (this.d10796.equals(d10796)) return; // for all checkboxes
        this.d10796 = d10796;
        setD10796x(d10796.equals("96") ? this.d10796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d10796);
    }

    @Bindable
    public String getD10796x() {
        return d10796x;
    }

    public void setD10796x(String d10796x) {
        this.d10796x = d10796x;
        notifyPropertyChanged(BR.d10796x);
    }

    @Bindable
    public String getD108() {
        return d108;
    }

    public void setD108(String d108) {
        this.d108 = d108;
        notifyPropertyChanged(BR.d108);
    }

    @Bindable
    public String getD10801() {
        return d10801;
    }

    public void setD10801(String d10801) {
        if (this.d10801.equals(d10801)) return; // for all checkboxes
        this.d10801 = d10801;
        notifyPropertyChanged(BR.d10801);
    }

    @Bindable
    public String getD10802() {
        return d10802;
    }

    public void setD10802(String d10802) {
        if (this.d10802.equals(d10802)) return; // for all checkboxes
        this.d10802 = d10802;
        notifyPropertyChanged(BR.d10802);
    }

    @Bindable
    public String getD10803() {
        return d10803;
    }

    public void setD10803(String d10803) {
        if (this.d10803.equals(d10803)) return; // for all checkboxes
        this.d10803 = d10803;
        notifyPropertyChanged(BR.d10803);
    }

    @Bindable
    public String getD10804() {
        return d10804;
    }

    public void setD10804(String d10804) {
        if (this.d10804.equals(d10804)) return; // for all checkboxes
        this.d10804 = d10804;
        notifyPropertyChanged(BR.d10804);
    }

    @Bindable
    public String getD10805() {
        return d10805;
    }

    public void setD10805(String d10805) {
        if (this.d10805.equals(d10805)) return; // for all checkboxes
        this.d10805 = d10805;
        notifyPropertyChanged(BR.d10805);
    }

    @Bindable
    public String getD10806() {
        return d10806;
    }

    public void setD10806(String d10806) {
        if (this.d10806.equals(d10806)) return; // for all checkboxes
        this.d10806 = d10806;
        notifyPropertyChanged(BR.d10806);
    }

    @Bindable
    public String getD10807() {
        return d10807;
    }

    public void setD10807(String d10807) {
        if (this.d10807.equals(d10807)) return; // for all checkboxes
        this.d10807 = d10807;
        notifyPropertyChanged(BR.d10807);
    }

    @Bindable
    public String getD10808() {
        return d10808;
    }

    public void setD10808(String d10808) {
        if (this.d10808.equals(d10808)) return; // for all checkboxes
        this.d10808 = d10808;
        notifyPropertyChanged(BR.d10808);
    }

    @Bindable
    public String getD10896() {
        return d10896;
    }

    public void setD10896(String d10896) {
        if (this.d10896.equals(d10896)) return; // for all checkboxes
        this.d10896 = d10896;
        setD10896x(d10896.equals("96") ? this.d10896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d10896);
    }

    @Bindable
    public String getD10896x() {
        return d10896x;
    }

    public void setD10896x(String d10896x) {
        this.d10896x = d10896x;
        notifyPropertyChanged(BR.d10896x);
    }

    @Bindable
    public String getD10898() {
        return d10898;
    }

    public void setD10898(String d10898) {
        if (this.d10898.equals(d10898)) return; // for all checkboxes
        this.d10898 = d10898;
        setD10801(d10898.equals("98") ? "" : this.d10801);
        setD10802(d10898.equals("98") ? "" : this.d10802);
        setD10803(d10898.equals("98") ? "" : this.d10803);
        setD10804(d10898.equals("98") ? "" : this.d10804);
        setD10805(d10898.equals("98") ? "" : this.d10805);
        setD10806(d10898.equals("98") ? "" : this.d10806);
        setD10807(d10898.equals("98") ? "" : this.d10807);
        setD10808(d10898.equals("98") ? "" : this.d10808);
        setD10896(d10898.equals("98") ? "" : this.d10896);
        notifyPropertyChanged(BR.d10898);
    }

    @Bindable
    public String getD109() {
        return d109;
    }

    public void setD109(String d109) {
        this.d109 = d109;
        setD110(d109.equals("1") ? this.d110 : "");
        setD111(d109.equals("1") ? this.d111 : "");
        setD112(d109.equals("1") ? this.d112 : "");
        notifyPropertyChanged(BR.d109);
    }

    @Bindable
    public String getD110() {
        return d110;
    }

    public void setD110(String d110) {
        this.d110 = d110;
        setD111(d110.equals("1") ? this.d111 : "");
        setD112(d110.equals("1") ? this.d112 : "");
        notifyPropertyChanged(BR.d110);
    }

    @Bindable
    public String getD111() {
        return d111;
    }

    public void setD111(String d111) {
        this.d111 = d111;
        setD11101x(d111.equals("1") ? this.d11101x : "");
        setD11102x(d111.equals("2") ? this.d11102x : "");
        setD11103x(d111.equals("3") ? this.d11103x : "");
        setD11104x(d111.equals("4") ? this.d11104x : "");
        notifyPropertyChanged(BR.d111);
    }

    @Bindable
    public String getD11101x() {
        return d11101x;
    }

    public void setD11101x(String d11101x) {
        this.d11101x = d11101x;
        notifyPropertyChanged(BR.d11101x);
    }

    @Bindable
    public String getD11102x() {
        return d11102x;
    }

    public void setD11102x(String d11102x) {
        this.d11102x = d11102x;
        notifyPropertyChanged(BR.d11102x);
    }

    @Bindable
    public String getD11103x() {
        return d11103x;
    }

    public void setD11103x(String d11103x) {
        this.d11103x = d11103x;
        notifyPropertyChanged(BR.d11103x);
    }

    @Bindable
    public String getD11104x() {
        return d11104x;
    }

    public void setD11104x(String d11104x) {
        this.d11104x = d11104x;
        notifyPropertyChanged(BR.d11104x);
    }

    @Bindable
    public String getD112() {
        return d112;
    }

    public void setD112(String d112) {
        this.d112 = d112;
        setD11201x(d112.equals("1") ? this.d11201x : "");
        setD11202x(d112.equals("2") ? this.d11202x : "");
        setD11203x(d112.equals("3") ? this.d11203x : "");
        setD11204x(d112.equals("4") ? this.d11204x : "");
        notifyPropertyChanged(BR.d112);
    }

    @Bindable
    public String getD11201x() {
        return d11201x;
    }

    public void setD11201x(String d11201x) {
        this.d11201x = d11201x;
        notifyPropertyChanged(BR.d11201x);
    }

    @Bindable
    public String getD11202x() {
        return d11202x;
    }

    public void setD11202x(String d11202x) {
        this.d11202x = d11202x;
        notifyPropertyChanged(BR.d11202x);
    }

    @Bindable
    public String getD11203x() {
        return d11203x;
    }

    public void setD11203x(String d11203x) {
        this.d11203x = d11203x;
        notifyPropertyChanged(BR.d11203x);
    }

    @Bindable
    public String getD11204x() {
        return d11204x;
    }

    public void setD11204x(String d11204x) {
        this.d11204x = d11204x;
        notifyPropertyChanged(BR.d11204x);
    }

    @Bindable
    public String getD113() {
        return d113;
    }

    public void setD113(String d113) {
        this.d113 = d113;
        notifyPropertyChanged(BR.d113);
    }

    @Bindable
    public String getD11401() {
        return d11401;
    }

    public void setD11401(String d11401) {
        this.d11401 = d11401;
        notifyPropertyChanged(BR.d11401);
    }

    @Bindable
    public String getD11402() {
        return d11402;
    }

    public void setD11402(String d11402) {
        this.d11402 = d11402;
        notifyPropertyChanged(BR.d11402);
    }

    @Bindable
    public String getD11403() {
        return d11403;
    }

    public void setD11403(String d11403) {
        this.d11403 = d11403;
        notifyPropertyChanged(BR.d11403);
    }

    @Bindable
    public String getD11404() {
        return d11404;
    }

    public void setD11404(String d11404) {
        this.d11404 = d11404;
        notifyPropertyChanged(BR.d11404);
    }

    @Bindable
    public String getD11405() {
        return d11405;
    }

    public void setD11405(String d11405) {
        this.d11405 = d11405;
        notifyPropertyChanged(BR.d11405);
    }

    @Bindable
    public String getD11406() {
        return d11406;
    }

    public void setD11406(String d11406) {
        this.d11406 = d11406;
        notifyPropertyChanged(BR.d11406);
    }

    @Bindable
    public String getD11407() {
        return d11407;
    }

    public void setD11407(String d11407) {
        this.d11407 = d11407;
        notifyPropertyChanged(BR.d11407);
    }

    @Bindable
    public String getD11498() {
        return d11498;
    }

    public void setD11498(String d11498) {
        this.d11498 = d11498;
        notifyPropertyChanged(BR.d11498);
    }

    @Bindable
    public String getD115() {
        return d115;
    }

    public void setD115(String d115) {
        this.d115 = d115;
        setD11501x(d115.equals("1") ? this.d11501x : "");
        setD11502x(d115.equals("2") ? this.d11502x : "");
        setD11503x(d115.equals("3") ? this.d11503x : "");
        setD11504x(d115.equals("4") ? this.d11504x : "");
        setD11505x(d115.equals("5") ? this.d11505x : "");
        setD11596x(d115.equals("96") ? this.d11596x : "");
        notifyPropertyChanged(BR.d115);
    }

    @Bindable
    public String getD11501x() {
        return d11501x;
    }

    public void setD11501x(String d11501x) {
        this.d11501x = d11501x;
        notifyPropertyChanged(BR.d11501x);
    }

    @Bindable
    public String getD11502x() {
        return d11502x;
    }

    public void setD11502x(String d11502x) {
        this.d11502x = d11502x;
        notifyPropertyChanged(BR.d11502x);
    }

    @Bindable
    public String getD11503x() {
        return d11503x;
    }

    public void setD11503x(String d11503x) {
        this.d11503x = d11503x;
        notifyPropertyChanged(BR.d11503x);
    }

    @Bindable
    public String getD11504x() {
        return d11504x;
    }

    public void setD11504x(String d11504x) {
        this.d11504x = d11504x;
        notifyPropertyChanged(BR.d11504x);
    }

    @Bindable
    public String getD11505x() {
        return d11505x;
    }

    public void setD11505x(String d11505x) {
        this.d11505x = d11505x;
        notifyPropertyChanged(BR.d11505x);
    }

    @Bindable
    public String getD11596x() {
        return d11596x;
    }

    public void setD11596x(String d11596x) {
        this.d11596x = d11596x;
        notifyPropertyChanged(BR.d11596x);
    }

    @Bindable
    public String getD116() {
        return d116;
    }

    public void setD116(String d116) {
        this.d116 = d116;
        setD11601x(d116.equals("1") ? this.d11601x : "");
        setD11602x(d116.equals("2") ? this.d11602x : "");
        setD11603x(d116.equals("3") ? this.d11603x : "");
        setD11604x(d116.equals("4") ? this.d11604x : "");
        setD11605x(d116.equals("5") ? this.d11605x : "");
        setD11696x(d116.equals("96") ? this.d11696x : "");
        notifyPropertyChanged(BR.d116);
    }

    @Bindable
    public String getD11601x() {
        return d11601x;
    }

    public void setD11601x(String d11601x) {
        this.d11601x = d11601x;
        notifyPropertyChanged(BR.d11601x);
    }

    @Bindable
    public String getD11602x() {
        return d11602x;
    }

    public void setD11602x(String d11602x) {
        this.d11602x = d11602x;
        notifyPropertyChanged(BR.d11602x);
    }

    @Bindable
    public String getD11603x() {
        return d11603x;
    }

    public void setD11603x(String d11603x) {
        this.d11603x = d11603x;
        notifyPropertyChanged(BR.d11603x);
    }

    @Bindable
    public String getD11604x() {
        return d11604x;
    }

    public void setD11604x(String d11604x) {
        this.d11604x = d11604x;
        notifyPropertyChanged(BR.d11604x);
    }

    @Bindable
    public String getD11605x() {
        return d11605x;
    }

    public void setD11605x(String d11605x) {
        this.d11605x = d11605x;
        notifyPropertyChanged(BR.d11605x);
    }

    @Bindable
    public String getD11696x() {
        return d11696x;
    }

    public void setD11696x(String d11696x) {
        this.d11696x = d11696x;
        notifyPropertyChanged(BR.d11696x);
    }

    @Bindable
    public String getD117() {
        return d117;
    }

    public void setD117(String d117) {
        this.d117 = d117;
        setD11701x(d117.equals("1") ? this.d11701x : "");
        setD11702x(d117.equals("2") ? this.d11702x : "");
        setD11703x(d117.equals("3") ? this.d11703x : "");
        setD11704x(d117.equals("4") ? this.d11704x : "");
        setD11705x(d117.equals("5") ? this.d11705x : "");
        setD11796x(d117.equals("96") ? this.d11796x : "");
        notifyPropertyChanged(BR.d117);
    }

    @Bindable
    public String getD11701x() {
        return d11701x;
    }

    public void setD11701x(String d11701x) {
        this.d11701x = d11701x;
        notifyPropertyChanged(BR.d11701x);
    }

    @Bindable
    public String getD11702x() {
        return d11702x;
    }

    public void setD11702x(String d11702x) {
        this.d11702x = d11702x;
        notifyPropertyChanged(BR.d11702x);
    }

    @Bindable
    public String getD11703x() {
        return d11703x;
    }

    public void setD11703x(String d11703x) {
        this.d11703x = d11703x;
        notifyPropertyChanged(BR.d11703x);
    }

    @Bindable
    public String getD11704x() {
        return d11704x;
    }

    public void setD11704x(String d11704x) {
        this.d11704x = d11704x;
        notifyPropertyChanged(BR.d11704x);
    }

    @Bindable
    public String getD11705x() {
        return d11705x;
    }

    public void setD11705x(String d11705x) {
        this.d11705x = d11705x;
        notifyPropertyChanged(BR.d11705x);
    }

    @Bindable
    public String getD11796x() {
        return d11796x;
    }

    public void setD11796x(String d11796x) {
        this.d11796x = d11796x;
        notifyPropertyChanged(BR.d11796x);
    }

    @Bindable
    public String getD118() {
        return d118;
    }

    public void setD118(String d118) {
        this.d118 = d118;
        notifyPropertyChanged(BR.d118);
    }

    @Bindable
    public String getD119() {
        return d119;
    }

    public void setD119(String d119) {
        this.d119 = d119;
        setD11901x(d119.equals("1") ? this.d11901x : "");
        setD11902x(d119.equals("2") ? this.d11902x : "");
        setD11903x(d119.equals("3") ? this.d11903x : "");
        setD11904x(d119.equals("4") ? this.d11904x : "");
        setD11905x(d119.equals("5") ? this.d11905x : "");
        setD11996x(d119.equals("96") ? this.d11996x : "");
        notifyPropertyChanged(BR.d119);
    }

    @Bindable
    public String getD11901x() {
        return d11901x;
    }

    public void setD11901x(String d11901x) {
        this.d11901x = d11901x;
        notifyPropertyChanged(BR.d11901x);
    }

    @Bindable
    public String getD11902x() {
        return d11902x;
    }

    public void setD11902x(String d11902x) {
        this.d11902x = d11902x;
        notifyPropertyChanged(BR.d11902x);
    }

    @Bindable
    public String getD11903x() {
        return d11903x;
    }

    public void setD11903x(String d11903x) {
        this.d11903x = d11903x;
        notifyPropertyChanged(BR.d11903x);
    }

    @Bindable
    public String getD11904x() {
        return d11904x;
    }

    public void setD11904x(String d11904x) {
        this.d11904x = d11904x;
        notifyPropertyChanged(BR.d11904x);
    }

    @Bindable
    public String getD11905x() {
        return d11905x;
    }

    public void setD11905x(String d11905x) {
        this.d11905x = d11905x;
        notifyPropertyChanged(BR.d11905x);
    }

    @Bindable
    public String getD11996x() {
        return d11996x;
    }

    public void setD11996x(String d11996x) {
        this.d11996x = d11996x;
        notifyPropertyChanged(BR.d11996x);
    }

    @Bindable
    public String getD120() {
        return d120;
    }

    public void setD120(String d120) {
        this.d120 = d120;
        setD121(d120.equals("1") ? this.d121 : "");
        setD122(d120.equals("1") ? this.d122 : "");

        setD12301(d120.equals("1") ? this.d12301 : "");
        setD12302(d120.equals("1") ? this.d12302 : "");
        setD12303(d120.equals("1") ? this.d12303 : "");
        setD12304(d120.equals("1") ? this.d12304 : "");
        setD12305(d120.equals("1") ? this.d12305 : "");
        setD12306(d120.equals("1") ? this.d12306 : "");

        setD12401(d120.equals("1") ? this.d12401 : "");
        setD12402(d120.equals("1") ? this.d12402 : "");
        setD12403(d120.equals("1") ? this.d12403 : "");
        setD12496(d120.equals("1") ? this.d12496 : "");

        setD12501(d120.equals("1") ? this.d12501 : "");
        setD12502(d120.equals("1") ? this.d12502 : "");
        setD12503(d120.equals("1") ? this.d12503 : "");
        setD12504(d120.equals("1") ? this.d12504 : "");
        setD12505(d120.equals("1") ? this.d12505 : "");
        setD12506(d120.equals("1") ? this.d12506 : "");
        setD12507(d120.equals("1") ? this.d12507 : "");
        setD12508(d120.equals("1") ? this.d12508 : "");
        setD12509(d120.equals("1") ? this.d12509 : "");
        setD12596(d120.equals("1") ? this.d12596 : "");
        setD12598(d120.equals("1") ? this.d12598 : "");

        setD12601(d120.equals("1") ? this.d12601 : "");
        setD12602(d120.equals("1") ? this.d12602 : "");
        setD12603(d120.equals("1") ? this.d12603 : "");
        setD12604(d120.equals("1") ? this.d12604 : "");
        setD12605(d120.equals("1") ? this.d12605 : "");
        setD12606(d120.equals("1") ? this.d12606 : "");
        setD12607(d120.equals("1") ? this.d12607 : "");
        setD12608(d120.equals("1") ? this.d12608 : "");
        setD12696(d120.equals("1") ? this.d12696 : "");
        setD12698(d120.equals("1") ? this.d12698 : "");
        notifyPropertyChanged(BR.d120);
    }

    @Bindable
    public String getD121() {
        return d121;
    }

    public void setD121(String d121) {
        this.d121 = d121;
        notifyPropertyChanged(BR.d121);
    }

    @Bindable
    public String getD122() {
        return d122;
    }

    public void setD122(String d122) {
        this.d122 = d122;
        notifyPropertyChanged(BR.d122);
    }

    @Bindable
    public String getD12301() {
        return d12301;
    }

    public void setD12301(String d12301) {
        this.d12301 = d12301;
        notifyPropertyChanged(BR.d12301);
    }

    @Bindable
    public String getD12302() {
        return d12302;
    }

    public void setD12302(String d12302) {
        this.d12302 = d12302;
        notifyPropertyChanged(BR.d12302);
    }

    @Bindable
    public String getD12303() {
        return d12303;
    }

    public void setD12303(String d12303) {
        this.d12303 = d12303;
        notifyPropertyChanged(BR.d12303);
    }

    @Bindable
    public String getD12304() {
        return d12304;
    }

    public void setD12304(String d12304) {
        this.d12304 = d12304;
        notifyPropertyChanged(BR.d12304);
    }

    @Bindable
    public String getD12305() {
        return d12305;
    }

    public void setD12305(String d12305) {
        this.d12305 = d12305;
        notifyPropertyChanged(BR.d12305);
    }

    @Bindable
    public String getD12306() {
        return d12306;
    }

    public void setD12306(String d12306) {
        this.d12306 = d12306;
        notifyPropertyChanged(BR.d12306);
    }

    @Bindable
    public String getD124() {
        return d124;
    }

    public void setD124(String d124) {
        this.d124 = d124;
        notifyPropertyChanged(BR.d124);
    }

    @Bindable
    public String getD12401() {
        return d12401;
    }

    public void setD12401(String d12401) {
        if (this.d12401.equals(d12401)) return; // for all checkboxes
        this.d12401 = d12401;
        notifyPropertyChanged(BR.d12401);
    }

    @Bindable
    public String getD12402() {
        return d12402;
    }

    public void setD12402(String d12402) {
        if (this.d12402.equals(d12402)) return; // for all checkboxes
        this.d12402 = d12402;
        notifyPropertyChanged(BR.d12402);
    }

    @Bindable
    public String getD12403() {
        return d12403;
    }

    public void setD12403(String d12403) {
        if (this.d12403.equals(d12403)) return; // for all checkboxes
        this.d12403 = d12403;
        notifyPropertyChanged(BR.d12403);
    }

    @Bindable
    public String getD12496() {
        return d12496;
    }

    public void setD12496(String d12496) {
        if (this.d12496.equals(d12496)) return; // for all checkboxes
        this.d12496 = d12496;
        setD12496x(d12496.equals("96") ? this.d12496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d12496);
    }

    @Bindable
    public String getD12496x() {
        return d12496x;
    }

    public void setD12496x(String d12496x) {
        this.d12496x = d12496x;
        notifyPropertyChanged(BR.d12496x);
    }

    @Bindable
    public String getD12498() {
        return d12498;
    }

    public void setD12498(String d12498) {
        if (this.d12498.equals(d12498)) return; // for all checkboxes
        this.d12498 = d12498;
        setD12401(d12498.equals("98") ? "" : this.d12401);
        setD12402(d12498.equals("98") ? "" : this.d12402);
        setD12403(d12498.equals("98") ? "" : this.d12403);
        setD12496(d12498.equals("98") ? "" : this.d12496);
        notifyPropertyChanged(BR.d12498);
    }

    @Bindable
    public String getD125() {
        return d125;
    }

    public void setD125(String d125) {
        this.d125 = d125;
        notifyPropertyChanged(BR.d125);
    }

    @Bindable
    public String getD12501() {
        return d12501;
    }

    public void setD12501(String d12501) {
        if (this.d12501.equals(d12501)) return; // for all checkboxes
        this.d12501 = d12501;
        notifyPropertyChanged(BR.d12501);
    }

    @Bindable
    public String getD12502() {
        return d12502;
    }

    public void setD12502(String d12502) {
        if (this.d12502.equals(d12502)) return; // for all checkboxes
        this.d12502 = d12502;
        notifyPropertyChanged(BR.d12502);
    }

    @Bindable
    public String getD12503() {
        return d12503;
    }

    public void setD12503(String d12503) {
        if (this.d12503.equals(d12503)) return; // for all checkboxes
        this.d12503 = d12503;
        notifyPropertyChanged(BR.d12503);
    }

    @Bindable
    public String getD12504() {
        return d12504;
    }

    public void setD12504(String d12504) {
        if (this.d12504.equals(d12504)) return; // for all checkboxes
        this.d12504 = d12504;
        notifyPropertyChanged(BR.d12504);
    }

    @Bindable
    public String getD12505() {
        return d12505;
    }

    public void setD12505(String d12505) {
        if (this.d12505.equals(d12505)) return; // for all checkboxes
        this.d12505 = d12505;
        notifyPropertyChanged(BR.d12505);
    }

    @Bindable
    public String getD12506() {
        return d12506;
    }

    public void setD12506(String d12506) {
        if (this.d12506.equals(d12506)) return; // for all checkboxes
        this.d12506 = d12506;
        notifyPropertyChanged(BR.d12506);
    }

    @Bindable
    public String getD12507() {
        return d12507;
    }

    public void setD12507(String d12507) {
        if (this.d12507.equals(d12507)) return; // for all checkboxes
        this.d12507 = d12507;
        notifyPropertyChanged(BR.d12507);
    }

    @Bindable
    public String getD12508() {
        return d12508;
    }

    public void setD12508(String d12508) {
        if (this.d12508.equals(d12508)) return; // for all checkboxes
        this.d12508 = d12508;
        notifyPropertyChanged(BR.d12508);
    }

    @Bindable
    public String getD12509() {
        return d12509;
    }

    public void setD12509(String d12509) {
        if (this.d12509.equals(d12509)) return; // for all checkboxes
        this.d12509 = d12509;
        notifyPropertyChanged(BR.d12509);
    }

    @Bindable
    public String getD12596() {
        return d12596;
    }

    public void setD12596(String d12596) {
        if (this.d12596.equals(d12596)) return; // for all checkboxes
        this.d12596 = d12596;
        setD12596x(d12596.equals("96") ? this.d12596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d12596);
    }

    @Bindable
    public String getD12596x() {
        return d12596x;
    }

    public void setD12596x(String d12596x) {
        this.d12596x = d12596x;
        notifyPropertyChanged(BR.d12596x);
    }

    @Bindable
    public String getD12598() {
        return d12598;
    }

    public void setD12598(String d12598) {
        if (this.d12598.equals(d12598)) return; // for all checkboxes
        this.d12598 = d12598;
        setD12501(d12598.equals("98") ? "" : this.d12501);
        setD12502(d12598.equals("98") ? "" : this.d12502);
        setD12503(d12598.equals("98") ? "" : this.d12503);
        setD12504(d12598.equals("98") ? "" : this.d12504);
        setD12505(d12598.equals("98") ? "" : this.d12505);
        setD12506(d12598.equals("98") ? "" : this.d12506);
        setD12507(d12598.equals("98") ? "" : this.d12507);
        setD12508(d12598.equals("98") ? "" : this.d12508);
        setD12509(d12598.equals("98") ? "" : this.d12509);
        setD12596(d12598.equals("98") ? "" : this.d12596);
        notifyPropertyChanged(BR.d12598);
    }

    @Bindable
    public String getD126() {
        return d126;
    }

    public void setD126(String d126) {
        this.d126 = d126;
        notifyPropertyChanged(BR.d126);
    }

    @Bindable
    public String getD12601() {
        return d12601;
    }

    public void setD12601(String d12601) {
        if (this.d12601.equals(d12601)) return; // for all checkboxes
        this.d12601 = d12601;
        notifyPropertyChanged(BR.d12601);
    }

    @Bindable
    public String getD12602() {
        return d12602;
    }

    public void setD12602(String d12602) {
        if (this.d12602.equals(d12602)) return; // for all checkboxes
        this.d12602 = d12602;
        notifyPropertyChanged(BR.d12602);
    }

    @Bindable
    public String getD12603() {
        return d12603;
    }

    public void setD12603(String d12603) {
        if (this.d12603.equals(d12603)) return; // for all checkboxes
        this.d12603 = d12603;
        notifyPropertyChanged(BR.d12603);
    }

    @Bindable
    public String getD12604() {
        return d12604;
    }

    public void setD12604(String d12604) {
        if (this.d12604.equals(d12604)) return; // for all checkboxes
        this.d12604 = d12604;
        notifyPropertyChanged(BR.d12604);
    }

    @Bindable
    public String getD12605() {
        return d12605;
    }

    public void setD12605(String d12605) {
        if (this.d12605.equals(d12605)) return; // for all checkboxes
        this.d12605 = d12605;
        notifyPropertyChanged(BR.d12605);
    }

    @Bindable
    public String getD12606() {
        return d12606;
    }

    public void setD12606(String d12606) {
        if (this.d12606.equals(d12606)) return; // for all checkboxes
        this.d12606 = d12606;
        notifyPropertyChanged(BR.d12606);
    }

    @Bindable
    public String getD12607() {
        return d12607;
    }

    public void setD12607(String d12607) {
        if (this.d12607.equals(d12607)) return; // for all checkboxes
        this.d12607 = d12607;
        notifyPropertyChanged(BR.d12607);
    }

    @Bindable
    public String getD12608() {
        return d12608;
    }

    public void setD12608(String d12608) {
        if (this.d12608.equals(d12608)) return; // for all checkboxes
        this.d12608 = d12608;
        notifyPropertyChanged(BR.d12608);
    }

    @Bindable
    public String getD12696() {
        return d12696;
    }

    public void setD12696(String d12696) {
        if (this.d12696.equals(d12696)) return; // for all checkboxes
        this.d12696 = d12696;
        setD12696x(d12696.equals("96") ? this.d12696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d12696);
    }

    @Bindable
    public String getD12696x() {
        return d12696x;
    }

    public void setD12696x(String d12696x) {
        this.d12696x = d12696x;
        notifyPropertyChanged(BR.d12696x);
    }

    @Bindable
    public String getD12698() {
        return d12698;
    }

    public void setD12698(String d12698) {
        this.d12698 = d12698;
        setD12601(d12698.equals("98") ? "" : this.d12601);
        setD12602(d12698.equals("98") ? "" : this.d12602);
        setD12603(d12698.equals("98") ? "" : this.d12603);
        setD12604(d12698.equals("98") ? "" : this.d12604);
        setD12605(d12698.equals("98") ? "" : this.d12605);
        setD12606(d12698.equals("98") ? "" : this.d12606);
        setD12607(d12698.equals("98") ? "" : this.d12607);
        setD12608(d12698.equals("98") ? "" : this.d12608);
        setD12696(d12698.equals("98") ? "" : this.d12696);
        notifyPropertyChanged(BR.d12698);
    }

    @Bindable
    public String getD127() {
        return d127;
    }

    public void setD127(String d127) {
        this.d127 = d127;
        setD12801(d127.equals("1") ? this.d12801 : "");
        setD12802(d127.equals("1") ? this.d12802 : "");
        setD12803(d127.equals("1") ? this.d12803 : "");
        setD12804(d127.equals("1") ? this.d12804 : "");
        setD12896(d127.equals("1") ? this.d12896 : "");
        notifyPropertyChanged(BR.d127);
    }

    @Bindable
    public String getD12798() {
        return d12798;
    }

    public void setD12798(String d12798) {
        this.d12798 = d12798;
        notifyPropertyChanged(BR.d12798);
    }

    @Bindable
    public String getD128() {
        return d128;
    }

    public void setD128(String d128) {
        this.d128 = d128;
        notifyPropertyChanged(BR.d128);
    }

    @Bindable
    public String getD12801() {
        return d12801;
    }

    public void setD12801(String d12801) {
        if (this.d12801.equals(d12801)) return; // for all checkboxes
        this.d12801 = d12801;
        notifyPropertyChanged(BR.d12801);
    }

    @Bindable
    public String getD12802() {
        return d12802;
    }

    public void setD12802(String d12802) {
        if (this.d12802.equals(d12802)) return; // for all checkboxes
        this.d12802 = d12802;
        notifyPropertyChanged(BR.d12802);
    }

    @Bindable
    public String getD12803() {
        return d12803;
    }

    public void setD12803(String d12803) {
        if (this.d12803.equals(d12803)) return; // for all checkboxes
        this.d12803 = d12803;
        notifyPropertyChanged(BR.d12803);
    }

    @Bindable
    public String getD12804() {
        return d12804;
    }

    public void setD12804(String d12804) {
        if (this.d12804.equals(d12804)) return; // for all checkboxes
        this.d12804 = d12804;
        notifyPropertyChanged(BR.d12804);
    }

    @Bindable
    public String getD12896() {
        return d12896;
    }

    public void setD12896(String d12896) {
        if (this.d12896.equals(d12896)) return; // for all checkboxes
        this.d12896 = d12896;
        setD12896x(d12896.equals("96") ? this.d12896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d12896);
    }

    @Bindable
    public String getD12896x() {
        return d12896x;
    }

    public void setD12896x(String d12896x) {
        this.d12896x = d12896x;
        notifyPropertyChanged(BR.d12896x);
    }

    @Bindable
    public String getD129() {
        return d129;
    }

    public void setD129(String d129) {
        this.d129 = d129;
        setD13001(d129.equals("1") ? this.d13001 : "");
        setD13002(d129.equals("1") ? this.d13002 : "");
        setD13003(d129.equals("1") ? this.d13003 : "");
        setD13004(d129.equals("1") ? this.d13004 : "");
        setD13005(d129.equals("1") ? this.d13005 : "");
        setD13098(d129.equals("1") ? this.d13098 : "");
        notifyPropertyChanged(BR.d129);
    }

    @Bindable
    public String getD130() {
        return d130;
    }

    public void setD130(String d130) {
        this.d130 = d130;
        notifyPropertyChanged(BR.d130);
    }

    @Bindable
    public String getD13001() {
        return d13001;
    }

    public void setD13001(String d13001) {
        if (this.d13001.equals(d13001)) return; // for all checkboxes
        this.d13001 = d13001;
        notifyPropertyChanged(BR.d13001);
    }

    @Bindable
    public String getD13002() {
        return d13002;
    }

    public void setD13002(String d13002) {
        if (this.d13002.equals(d13002)) return; // for all checkboxes
        this.d13002 = d13002;
        notifyPropertyChanged(BR.d13002);
    }

    @Bindable
    public String getD13003() {
        return d13003;
    }

    public void setD13003(String d13003) {
        if (this.d13003.equals(d13003)) return; // for all checkboxes
        this.d13003 = d13003;
        notifyPropertyChanged(BR.d13003);
    }

    @Bindable
    public String getD13004() {
        return d13004;
    }

    public void setD13004(String d13004) {
        if (this.d13004.equals(d13004)) return; // for all checkboxes
        this.d13004 = d13004;
        notifyPropertyChanged(BR.d13004);
    }

    @Bindable
    public String getD13005() {
        return d13005;
    }

    public void setD13005(String d13005) {
        if (this.d13005.equals(d13005)) return; // for all checkboxes
        this.d13005 = d13005;
        notifyPropertyChanged(BR.d13005);
    }

    @Bindable
    public String getD13098() {
        return d13098;
    }

    public void setD13098(String d13098) {
        if (this.d13098.equals(d13098)) return; // for all checkboxes
        this.d13098 = d13098;
        setD13098x(d13098.equals("96") ? this.d13098x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.d13098);
    }

    @Bindable
    public String getD13098x() {
        return d13098x;
    }

    public void setD13098x(String d13098x) {
        this.d13098x = d13098x;
        notifyPropertyChanged(BR.d13098x);
    }

    @Bindable
    public String getE101() {
        return e101;
    }

    public void setE101(String e101) {
        this.e101 = e101;
        setE10101x(e101.equals("1") ? this.e10101x : "");
        setE10102x(e101.equals("2") ? this.e10102x : "");
        setE10103x(e101.equals("3") ? this.e10103x : "");
        setE10104x(e101.equals("4") ? this.e10104x : "");
        notifyPropertyChanged(BR.e101);
    }

    @Bindable
    public String getE10101x() {
        return e10101x;
    }

    public void setE10101x(String e10101x) {
        this.e10101x = e10101x;
        notifyPropertyChanged(BR.e10101x);
    }

    @Bindable
    public String getE10102x() {
        return e10102x;
    }

    public void setE10102x(String e10102x) {
        this.e10102x = e10102x;
        notifyPropertyChanged(BR.e10102x);
    }

    @Bindable
    public String getE10103x() {
        return e10103x;
    }

    public void setE10103x(String e10103x) {
        this.e10103x = e10103x;
        notifyPropertyChanged(BR.e10103x);
    }

    @Bindable
    public String getE10104x() {
        return e10104x;
    }

    public void setE10104x(String e10104x) {
        this.e10104x = e10104x;
        notifyPropertyChanged(BR.e10104x);
    }

    @Bindable
    public String getE102() {
        return e102;
    }

    public void setE102(String e102) {
        this.e102 = e102;
        setE10301(e102.equals("1") ? this.e10301 : "");
        setE10302(e102.equals("1") ? this.e10302 : "");
        setE10303(e102.equals("1") ? this.e10303 : "");
        setE10396(e102.equals("1") ? this.e10396 : "");
        setE10398(e102.equals("1") ? this.e10398 : "");

        setE10401(e102.equals("1") ? this.e10401 : "");
        setE10402(e102.equals("1") ? this.e10402 : "");
        setE10403(e102.equals("1") ? this.e10403 : "");
        setE10496(e102.equals("1") ? this.e10496 : "");
        setE10498(e102.equals("1") ? this.e10498 : "");

        setE105(e102.equals("1") ? this.e105 : "");

        setE10601(e102.equals("1") ? this.e10601 : "");
        setE10602(e102.equals("1") ? this.e10602 : "");
        setE10603(e102.equals("1") ? this.e10603 : "");

        setE10701(e102.equals("1") ? this.e10701 : "");
        setE10702(e102.equals("1") ? this.e10702 : "");
        setE10703(e102.equals("1") ? this.e10703 : "");
        setE10704(e102.equals("1") ? this.e10704 : "");
        setE10705(e102.equals("1") ? this.e10705 : "");
        setE10796(e102.equals("1") ? this.e10796 : "");
        setE10798(e102.equals("1") ? this.e10798 : "");

        setE10801(e102.equals("1") ? this.e10801 : "");
        setE10802(e102.equals("1") ? this.e10802 : "");
        setE10803(e102.equals("1") ? this.e10803 : "");
        setE10804(e102.equals("1") ? this.e10804 : "");
        setE10805(e102.equals("1") ? this.e10805 : "");
        setE10806(e102.equals("1") ? this.e10806 : "");
        setE10807(e102.equals("1") ? this.e10807 : "");
        setE10808(e102.equals("1") ? this.e10808 : "");
        setE10809(e102.equals("1") ? this.e10809 : "");
        setE10810(e102.equals("1") ? this.e10810 : "");
        setE10896(e102.equals("1") ? this.e10896 : "");
        setE10898(e102.equals("1") ? this.e10898 : "");

        setE109(e102.equals("1") ? this.e109 : "");
        setE110(e102.equals("1") ? this.e110 : "");
        setE111(e102.equals("1") ? this.e111 : "");
        setE112(e102.equals("1") ? this.e112 : "");
        setE113(e102.equals("1") ? this.e113 : "");
        setE114(e102.equals("1") ? this.e114 : "");
        setE115(e102.equals("1") ? this.e115 : "");
        setE116(e102.equals("1") ? this.e116 : "");

        setE11701(e102.equals("1") ? this.e11701 : "");
        setE11702(e102.equals("1") ? this.e11702 : "");
        setE11703(e102.equals("1") ? this.e11703 : "");
        setE11704(e102.equals("1") ? this.e11704 : "");
        setE11705(e102.equals("1") ? this.e11705 : "");
        setE11706(e102.equals("1") ? this.e11706 : "");
        setE11707(e102.equals("1") ? this.e11707 : "");
        setE11796(e102.equals("1") ? this.e11796 : "");
        setE11798(e102.equals("1") ? this.e11798 : "");

        setE11801x(e102.equals("1") ? this.e11801x : "");
        setE11802x(e102.equals("1") ? this.e11802x : "");
        setE11898(e102.equals("1") ? this.e11898 : "");

        notifyPropertyChanged(BR.e102);
    }

    @Bindable
    public String getE103() {
        return e103;
    }

    public void setE103(String e103) {
        this.e103 = e103;
        notifyPropertyChanged(BR.e103);
    }

    @Bindable
    public String getE10301() {
        return e10301;
    }

    public void setE10301(String e10301) {
        if (this.e10301.equals(e10301)) return; // for all checkboxes
        this.e10301 = e10301;
        notifyPropertyChanged(BR.e10301);
    }

    @Bindable
    public String getE10302() {
        return e10302;
    }

    public void setE10302(String e10302) {
        if (this.e10302.equals(e10302)) return; // for all checkboxes
        this.e10302 = e10302;
        notifyPropertyChanged(BR.e10302);
    }

    @Bindable
    public String getE10303() {
        return e10303;
    }

    public void setE10303(String e10303) {
        if (this.e10303.equals(e10303)) return; // for all checkboxes
        this.e10303 = e10303;
        notifyPropertyChanged(BR.e10303);
    }

    @Bindable
    public String getE10396() {
        return e10396;
    }

    public void setE10396(String e10396) {
        if (this.e10396.equals(e10396)) return; // for all checkboxes
        this.e10396 = e10396;
        setE10396x(e10396.equals("96") ? this.e10396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e10396);
    }

    @Bindable
    public String getE10396x() {
        return e10396x;
    }

    public void setE10396x(String e10396x) {
        this.e10396x = e10396x;
        notifyPropertyChanged(BR.e10396x);
    }

    @Bindable
    public String getE10398() {
        return e10398;
    }

    public void setE10398(String e10398) {
        if (this.e10398.equals(e10398)) return; // for all checkboxes
        this.e10398 = e10398;
        setE10301(e10398.equals("98") ? "" : this.e10301);
        setE10302(e10398.equals("98") ? "" : this.e10302);
        setE10303(e10398.equals("98") ? "" : this.e10303);
        setE10396(e10398.equals("98") ? "" : this.e10396);
        notifyPropertyChanged(BR.e10398);
    }

    @Bindable
    public String getE104() {
        return e104;
    }

    public void setE104(String e104) {
        this.e104 = e104;
        notifyPropertyChanged(BR.e104);
    }

    @Bindable
    public String getE10401() {
        return e10401;
    }

    public void setE10401(String e10401) {
        if (this.e10401.equals(e10401)) return; // for all checkboxes
        this.e10401 = e10401;
        notifyPropertyChanged(BR.e10401);
    }

    @Bindable
    public String getE10402() {
        return e10402;
    }

    public void setE10402(String e10402) {
        if (this.e10402.equals(e10402)) return; // for all checkboxes
        this.e10402 = e10402;
        notifyPropertyChanged(BR.e10402);
    }

    @Bindable
    public String getE10403() {
        return e10403;
    }

    public void setE10403(String e10403) {
        if (this.e10403.equals(e10403)) return; // for all checkboxes
        this.e10403 = e10403;
        notifyPropertyChanged(BR.e10403);
    }

    @Bindable
    public String getE10496() {
        return e10496;
    }

    public void setE10496(String e10496) {
        if (this.e10496.equals(e10496)) return; // for all checkboxes
        this.e10496 = e10496;
        setE10496x(e10496.equals("96") ? this.e10496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e10496);
    }

    @Bindable
    public String getE10496x() {
        return e10496x;
    }

    public void setE10496x(String e10496x) {
        this.e10496x = e10496x;
        notifyPropertyChanged(BR.e10496x);
    }

    @Bindable
    public String getE10498() {
        return e10498;
    }

    public void setE10498(String e10498) {
        if (this.e10498.equals(e10498)) return; // for all checkboxes
        this.e10498 = e10498;
        setE10401(e10398.equals("98") ? "" : this.e10401);
        setE10402(e10398.equals("98") ? "" : this.e10402);
        setE10403(e10398.equals("98") ? "" : this.e10403);
        setE10496(e10398.equals("98") ? "" : this.e10496);
        notifyPropertyChanged(BR.e10498);
    }

    @Bindable
    public String getE105() {
        return e105;
    }

    public void setE105(String e105) {
        this.e105 = e105;
        setE10501x(e105.equals("1") ? this.e10501x : ""); // for all skips, mention all skipped questions
        setE10502x(e105.equals("2") ? this.e10502x : ""); // for all skips, mention all skipped questions
        setE10503x(e105.equals("3") ? this.e10503x : ""); // for all skips, mention all skipped questions
        setE10504x(e105.equals("4") ? this.e10504x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e105);
    }

    @Bindable
    public String getE10501x() {
        return e10501x;
    }

    public void setE10501x(String e10501x) {
        this.e10501x = e10501x;
        notifyPropertyChanged(BR.e10501x);
    }

    @Bindable
    public String getE10502x() {
        return e10502x;
    }

    public void setE10502x(String e10502x) {
        this.e10502x = e10502x;
        notifyPropertyChanged(BR.e10502x);
    }

    @Bindable
    public String getE10503x() {
        return e10503x;
    }

    public void setE10503x(String e10503x) {
        this.e10503x = e10503x;
        notifyPropertyChanged(BR.e10503x);
    }

    @Bindable
    public String getE10504x() {
        return e10504x;
    }

    public void setE10504x(String e10504x) {
        this.e10504x = e10504x;
        notifyPropertyChanged(BR.e10504x);
    }

    @Bindable
    public String getE10601() {
        return e10601;
    }

    public void setE10601(String e10601) {
        this.e10601 = e10601;
        notifyPropertyChanged(BR.e10601);
    }

    @Bindable
    public String getE10602() {
        return e10602;
    }

    public void setE10602(String e10602) {
        this.e10602 = e10602;
        notifyPropertyChanged(BR.e10602);
    }

    @Bindable
    public String getE10603() {
        return e10603;
    }

    public void setE10603(String e10603) {
        this.e10603 = e10603;
        notifyPropertyChanged(BR.e10603);
    }

    @Bindable
    public String getE107() {
        return e107;
    }

    public void setE107(String e107) {
        this.e107 = e107;
        notifyPropertyChanged(BR.e107);
    }

    @Bindable
    public String getE10701() {
        return e10701;
    }

    public void setE10701(String e10701) {
        if (this.e10701.equals(e10701)) return; // for all checkboxes
        this.e10701 = e10701;
        notifyPropertyChanged(BR.e10701);
    }

    @Bindable
    public String getE10702() {
        return e10702;
    }

    public void setE10702(String e10702) {
        if (this.e10702.equals(e10702)) return; // for all checkboxes
        this.e10702 = e10702;
        notifyPropertyChanged(BR.e10702);
    }

    @Bindable
    public String getE10703() {
        return e10703;
    }

    public void setE10703(String e10703) {
        if (this.e10703.equals(e10703)) return; // for all checkboxes
        this.e10703 = e10703;
        notifyPropertyChanged(BR.e10703);
    }

    @Bindable
    public String getE10704() {
        return e10704;
    }

    public void setE10704(String e10704) {
        if (this.e10704.equals(e10704)) return; // for all checkboxes
        this.e10704 = e10704;
        notifyPropertyChanged(BR.e10704);
    }

    @Bindable
    public String getE10705() {
        return e10705;
    }

    public void setE10705(String e10705) {
        if (this.e10705.equals(e10705)) return; // for all checkboxes
        this.e10705 = e10705;
        notifyPropertyChanged(BR.e10705);
    }

    @Bindable
    public String getE10796() {
        return e10796;
    }

    public void setE10796(String e10796) {
        if (this.e10796.equals(e10796)) return; // for all checkboxes
        this.e10796 = e10796;
        setE10796x(e10796.equals("96") ? this.e10796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e10796);
    }

    @Bindable
    public String getE10796x() {
        return e10796x;
    }

    public void setE10796x(String e10796x) {
        this.e10796x = e10796x;
        notifyPropertyChanged(BR.e10796x);
    }

    @Bindable
    public String getE10798() {
        return e10798;
    }

    public void setE10798(String e10798) {
        if (this.e10798.equals(e10798)) return; // for all checkboxes
        this.e10798 = e10798;
        setE10701(e10798.equals("98") ? "" : this.e10701);
        setE10702(e10798.equals("98") ? "" : this.e10702);
        setE10703(e10798.equals("98") ? "" : this.e10703);
        setE10704(e10798.equals("98") ? "" : this.e10704);
        setE10705(e10798.equals("98") ? "" : this.e10705);
        setE10796(e10798.equals("98") ? "" : this.e10796);
        notifyPropertyChanged(BR.e10798);
    }

    @Bindable
    public String getE108() {
        return e108;
    }

    public void setE108(String e108) {
        this.e108 = e108;
        notifyPropertyChanged(BR.e108);
    }

    @Bindable
    public String getE10801() {
        return e10801;
    }

    public void setE10801(String e10801) {
        if (this.e10801.equals(e10801)) return; // for all checkboxes
        this.e10801 = e10801;
        notifyPropertyChanged(BR.e10801);
    }

    @Bindable
    public String getE10802() {
        return e10802;
    }

    public void setE10802(String e10802) {
        if (this.e10802.equals(e10802)) return; // for all checkboxes
        this.e10802 = e10802;
        notifyPropertyChanged(BR.e10802);
    }

    @Bindable
    public String getE10803() {
        return e10803;
    }

    public void setE10803(String e10803) {
        if (this.e10803.equals(e10803)) return; // for all checkboxes
        this.e10803 = e10803;
        notifyPropertyChanged(BR.e10803);
    }

    @Bindable
    public String getE10804() {
        return e10804;
    }

    public void setE10804(String e10804) {
        if (this.e10804.equals(e10804)) return; // for all checkboxes
        this.e10804 = e10804;
        notifyPropertyChanged(BR.e10804);
    }

    @Bindable
    public String getE10805() {
        return e10805;
    }

    public void setE10805(String e10805) {
        if (this.e10805.equals(e10805)) return; // for all checkboxes
        this.e10805 = e10805;
        notifyPropertyChanged(BR.e10805);
    }

    @Bindable
    public String getE10806() {
        return e10806;
    }

    public void setE10806(String e10806) {
        if (this.e10806.equals(e10806)) return; // for all checkboxes
        this.e10806 = e10806;
        notifyPropertyChanged(BR.e10806);
    }

    @Bindable
    public String getE10807() {
        return e10807;
    }

    public void setE10807(String e10807) {
        if (this.e10807.equals(e10807)) return; // for all checkboxes
        this.e10807 = e10807;
        notifyPropertyChanged(BR.e10807);
    }

    @Bindable
    public String getE10808() {
        return e10808;
    }

    public void setE10808(String e10808) {
        if (this.e10808.equals(e10808)) return; // for all checkboxes
        this.e10808 = e10808;
        notifyPropertyChanged(BR.e10808);
    }

    @Bindable
    public String getE10809() {
        return e10809;
    }

    public void setE10809(String e10809) {
        if (this.e10809.equals(e10809)) return; // for all checkboxes
        this.e10809 = e10809;
        notifyPropertyChanged(BR.e10809);
    }

    @Bindable
    public String getE10810() {
        return e10810;
    }

    public void setE10810(String e10810) {
        if (this.e10810.equals(e10810)) return; // for all checkboxes
        this.e10810 = e10810;
        notifyPropertyChanged(BR.e10810);
    }

    @Bindable
    public String getE10896() {
        return e10896;
    }

    public void setE10896(String e10896) {
        if (this.e10896.equals(e10896)) return; // for all checkboxes
        this.e10896 = e10896;
        setE10896x(e10896.equals("96") ? this.e10896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e10896);
    }

    @Bindable
    public String getE10896x() {
        return e10896x;
    }

    public void setE10896x(String e10896x) {
        this.e10896x = e10896x;
        notifyPropertyChanged(BR.e10896x);
    }

    @Bindable
    public String getE10898() {
        return e10898;
    }

    public void setE10898(String e10898) {
        if (this.e10898.equals(e10898)) return; // for all checkboxes
        this.e10898 = e10898;
        setE10801(e10898.equals("98") ? "" : this.e10801);
        setE10802(e10898.equals("98") ? "" : this.e10802);
        setE10803(e10898.equals("98") ? "" : this.e10803);
        setE10804(e10898.equals("98") ? "" : this.e10804);
        setE10805(e10898.equals("98") ? "" : this.e10805);
        setE10806(e10898.equals("98") ? "" : this.e10806);
        setE10807(e10898.equals("98") ? "" : this.e10807);
        setE10808(e10898.equals("98") ? "" : this.e10808);
        setE10809(e10898.equals("98") ? "" : this.e10809);
        setE10810(e10898.equals("98") ? "" : this.e10810);
        setE10896(e10898.equals("98") ? "" : this.e10896);
        notifyPropertyChanged(BR.e10898);
    }

    @Bindable
    public String getE109() {
        return e109;
    }

    public void setE109(String e109) {
        this.e109 = e109;
        setE10901x(e109.equals("1") ? this.e10901x : ""); // for all skips, mention all skipped questions
        setE10902x(e109.equals("2") ? this.e10902x : ""); // for all skips, mention all skipped questions
        setE10903x(e109.equals("3") ? this.e10903x : ""); // for all skips, mention all skipped questions
        setE10904x(e109.equals("4") ? this.e10904x : ""); // for all skips, mention all skipped questions
        setE10905x(e109.equals("5") ? this.e10905x : ""); // for all skips, mention all skipped questions
        setE10996x(e109.equals("6") ? this.e10996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e109);
    }

    @Bindable
    public String getE10901x() {
        return e10901x;
    }

    public void setE10901x(String e10901x) {
        this.e10901x = e10901x;
        notifyPropertyChanged(BR.e10901x);
    }

    @Bindable
    public String getE10902x() {
        return e10902x;
    }

    public void setE10902x(String e10902x) {
        this.e10902x = e10902x;
        notifyPropertyChanged(BR.e10902x);
    }

    @Bindable
    public String getE10903x() {
        return e10903x;
    }

    public void setE10903x(String e10903x) {
        this.e10903x = e10903x;
        notifyPropertyChanged(BR.e10903x);
    }

    @Bindable
    public String getE10904x() {
        return e10904x;
    }

    public void setE10904x(String e10904x) {
        this.e10904x = e10904x;
        notifyPropertyChanged(BR.e10904x);
    }

    @Bindable
    public String getE10905x() {
        return e10905x;
    }

    public void setE10905x(String e10905x) {
        this.e10905x = e10905x;
        notifyPropertyChanged(BR.e10905x);
    }

    @Bindable
    public String getE10996x() {
        return e10996x;
    }

    public void setE10996x(String e10996x) {
        this.e10996x = e10996x;
        notifyPropertyChanged(BR.e10996x);
    }

    @Bindable
    public String getE110() {
        return e110;
    }

    public void setE110(String e110) {
        this.e110 = e110;
        setE11001x(e110.equals("1") ? this.e11001x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e110);
    }

    @Bindable
    public String getE11001x() {
        return e11001x;
    }

    public void setE11001x(String e11001x) {
        this.e11001x = e11001x;
        notifyPropertyChanged(BR.e11001x);
    }

    @Bindable
    public String getE111() {
        return e111;
    }

    public void setE111(String e111) {
        this.e111 = e111;
        setE11101x(e111.equals("1") ? this.e11101x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e111);
    }

    @Bindable
    public String getE11101x() {
        return e11101x;
    }

    public void setE11101x(String e11101x) {
        this.e11101x = e11101x;
        notifyPropertyChanged(BR.e11101x);
    }

    @Bindable
    public String getE112() {
        return e112;
    }

    public void setE112(String e112) {
        this.e112 = e112;
        setE113(e112.equals("1") ? this.e113 : "");
        setE114(e112.equals("1") ? this.e114 : "");
        notifyPropertyChanged(BR.e112);
    }

    @Bindable
    public String getE11201() {
        return e11201;
    }

    public void setE11201(String e11201) {
        this.e11201 = e11201;
        notifyPropertyChanged(BR.e11201);
    }

    @Bindable
    public String getE11202() {
        return e11202;
    }

    public void setE11202(String e11202) {
        this.e11202 = e11202;
        notifyPropertyChanged(BR.e11202);
    }

    @Bindable
    public String getE113() {
        return e113;
    }

    public void setE113(String e113) {
        this.e113 = e113;
        setE11301x(e113.equals("1") ? this.e11301x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e113);
    }

    @Bindable
    public String getE11301() {
        return e11301;
    }

    public void setE11301(String e11301) {
        this.e11301 = e11301;
        notifyPropertyChanged(BR.e11301);
    }

    @Bindable
    public String getE11301x() {
        return e11301x;
    }

    public void setE11301x(String e11301x) {
        this.e11301x = e11301x;
        notifyPropertyChanged(BR.e11301x);
    }

    @Bindable
    public String getE11302() {
        return e11302;
    }

    public void setE11302(String e11302) {
        this.e11302 = e11302;
        notifyPropertyChanged(BR.e11302);
    }

    @Bindable
    public String getE114() {
        return e114;
    }

    public void setE114(String e114) {
        this.e114 = e114;
        setE115(e114.equals("5") ? "" : this.e115);
        setE115(e114.equals("98") ? "" : this.e115);
        notifyPropertyChanged(BR.e114);
    }

    @Bindable
    public String getE115() {
        return e115;
    }

    public void setE115(String e115) {
        this.e115 = e115;
        setE11596x(e115.equals("96") ? this.e11596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e115);
    }

    @Bindable
    public String getE11596x() {
        return e11596x;
    }

    public void setE11596x(String e11596x) {
        this.e11596x = e11596x;
        notifyPropertyChanged(BR.e11596x);
    }

    @Bindable
    public String getE116() {
        return e116;
    }

    public void setE116(String e116) {
        this.e116 = e116;
        setE11701(e116.equals("1") ? this.e11701 : "");
        setE11702(e116.equals("1") ? this.e11702 : "");
        setE11703(e116.equals("1") ? this.e11703 : "");
        setE11704(e116.equals("1") ? this.e11704 : "");
        setE11705(e116.equals("1") ? this.e11705 : "");
        setE11706(e116.equals("1") ? this.e11706 : "");
        setE11707(e116.equals("1") ? this.e11707 : "");
        setE11796(e116.equals("1") ? this.e11796 : "");
        setE11798(e116.equals("1") ? this.e11798 : "");

        setE11801x(e116.equals("1") ? this.e11801x : "");
        setE11802x(e116.equals("1") ? this.e11802x : "");
        setE11898(e116.equals("1") ? this.e11898 : "");
        notifyPropertyChanged(BR.e116);
    }

    @Bindable
    public String getE117() {
        return e117;
    }

    public void setE117(String e117) {
        this.e117 = e117;
        notifyPropertyChanged(BR.e117);
    }

    @Bindable
    public String getE11701() {
        return e11701;
    }

    public void setE11701(String e11701) {
        if (this.e11701.equals(e11701)) return; // for all checkboxes
        this.e11701 = e11701;
        notifyPropertyChanged(BR.e11701);
    }

    @Bindable
    public String getE11702() {
        return e11702;
    }

    public void setE11702(String e11702) {
        if (this.e11702.equals(e11702)) return; // for all checkboxes
        this.e11702 = e11702;
        notifyPropertyChanged(BR.e11702);
    }

    @Bindable
    public String getE11703() {
        return e11703;
    }

    public void setE11703(String e11703) {
        if (this.e11703.equals(e11703)) return; // for all checkboxes
        this.e11703 = e11703;
        notifyPropertyChanged(BR.e11703);
    }

    @Bindable
    public String getE11704() {
        return e11704;
    }

    public void setE11704(String e11704) {
        if (this.e11704.equals(e11704)) return; // for all checkboxes
        this.e11704 = e11704;
        notifyPropertyChanged(BR.e11704);
    }

    @Bindable
    public String getE11705() {
        return e11705;
    }

    public void setE11705(String e11705) {
        if (this.e11705.equals(e11705)) return; // for all checkboxes
        this.e11705 = e11705;
        notifyPropertyChanged(BR.e11705);
    }

    @Bindable
    public String getE11706() {
        return e11706;
    }

    public void setE11706(String e11706) {
        if (this.e11706.equals(e11706)) return; // for all checkboxes
        this.e11706 = e11706;
        notifyPropertyChanged(BR.e11706);
    }

    @Bindable
    public String getE11707() {
        return e11707;
    }

    public void setE11707(String e11707) {
        if (this.e11707.equals(e11707)) return; // for all checkboxes
        this.e11707 = e11707;
        notifyPropertyChanged(BR.e11707);
    }

    @Bindable
    public String getE11796() {
        return e11796;
    }

    public void setE11796(String e11796) {
        if (this.e11796.equals(e11796)) return; // for all checkboxes
        this.e11796 = e11796;
        setE11796x(e11796.equals("96") ? this.e11796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e11796);
    }

    @Bindable
    public String getE11796x() {
        return e11796x;
    }

    public void setE11796x(String e11796x) {
        this.e11796x = e11796x;
        notifyPropertyChanged(BR.e11796x);
    }

    @Bindable
    public String getE11798() {
        return e11798;
    }

    public void setE11798(String e11798) {
        if (this.e11798.equals(e11798)) return; // for all checkboxes
        this.e11798 = e11798;
        setE11701(e11798.equals("98") ? "" : this.e11701);
        setE11702(e11798.equals("98") ? "" : this.e11702);
        setE11703(e11798.equals("98") ? "" : this.e11703);
        setE11704(e11798.equals("98") ? "" : this.e11704);
        setE11705(e11798.equals("98") ? "" : this.e11705);
        setE11706(e11798.equals("98") ? "" : this.e11706);
        setE11707(e11798.equals("98") ? "" : this.e11707);
        setE11796(e11798.equals("98") ? "" : this.e11796);
        notifyPropertyChanged(BR.e11798);
    }

    @Bindable
    public String getE11898() {
        return e11898;
    }

    public void setE11898(String e11898) {
        if (this.e11898.equals(e11898)) return; // for all checkboxes
        this.e11898 = e11898;
        setE11801x(e11898.equals("98") ? "" : this.e11801x);
        setE11802x(e11898.equals("98") ? "" : this.e11802x);
        notifyPropertyChanged(BR.e11898);
    }

    @Bindable
    public String getE11801x() {
        return e11801x;
    }

    public void setE11801x(String e11801x) {
        this.e11801x = e11801x;
        notifyPropertyChanged(BR.e11801x);
    }

    @Bindable
    public String getE11802x() {
        return e11802x;
    }

    public void setE11802x(String e11802x) {
        this.e11802x = e11802x;
        notifyPropertyChanged(BR.e11802x);
    }

    @Bindable
    public String getE119() {
        return e119;
    }

    public void setE119(String e119) {
        this.e119 = e119;
        setE12001(e119.equals("1") ? this.e12001 : "");
        setE12002(e119.equals("1") ? this.e12002 : "");
        setE12003(e119.equals("1") ? this.e12003 : "");
        setE12004(e119.equals("1") ? this.e12004 : "");
        setE12005(e119.equals("1") ? this.e12005 : "");
        setE12006(e119.equals("1") ? this.e12006 : "");
        setE12007(e119.equals("1") ? this.e12007 : "");
        setE12008(e119.equals("1") ? this.e12008 : "");
        setE12009(e119.equals("1") ? this.e12009 : "");
        setE12010(e119.equals("1") ? this.e12010 : "");
        setE12096(e119.equals("1") ? this.e12096 : "");

        setE121(e119.equals("1") ? this.e121 : "");
        setE122(e119.equals("1") ? this.e122 : "");

        setE12301(e119.equals("1") ? this.e12301 : "");
        setE12302(e119.equals("1") ? this.e12302 : "");
        setE12303(e119.equals("1") ? this.e12303 : "");
        setE12304(e119.equals("1") ? this.e12304 : "");
        setE12396(e119.equals("1") ? this.e12396 : "");
        setE12398(e119.equals("1") ? this.e12398 : "");

        setE12401(e119.equals("1") ? this.e12401 : "");
        setE12402(e119.equals("1") ? this.e12402 : "");
        setE12403(e119.equals("1") ? this.e12403 : "");
        setE12404(e119.equals("1") ? this.e12404 : "");
        setE12405(e119.equals("1") ? this.e12405 : "");
        setE12496(e119.equals("1") ? this.e12496 : "");
        setE12498(e119.equals("1") ? this.e12498 : "");

        setE125(e119.equals("1") ? this.e125 : "");
        setE126(e119.equals("1") ? this.e126 : "");
        setE127(e119.equals("1") ? this.e127 : "");
        setE128(e119.equals("1") ? this.e128 : "");
        setE129(e119.equals("1") ? this.e129 : "");
        setE130(e119.equals("1") ? this.e130 : "");
        setE131(e119.equals("1") ? this.e131 : "");
        setE132(e119.equals("1") ? this.e132 : "");

        setE13301(e119.equals("1") ? this.e13301 : "");
        setE13302(e119.equals("1") ? this.e13302 : "");
        setE13303(e119.equals("1") ? this.e13303 : "");
        setE13304(e119.equals("1") ? this.e13304 : "");
        setE13305(e119.equals("1") ? this.e13305 : "");
        setE13306(e119.equals("1") ? this.e13306 : "");
        setE13307(e119.equals("1") ? this.e13307 : "");
        setE13396(e119.equals("1") ? this.e13396 : "");
        setE13398(e119.equals("1") ? this.e13398 : "");

        setE13401x(e119.equals("1") ? this.e13401x : "");
        setE13402x(e119.equals("1") ? this.e13402x : "");
        setE13498(e119.equals("1") ? this.e13498 : "");

        setE135a(e119.equals("1") ? this.e135a : "");
        setE135b(e119.equals("1") ? this.e135b : "");
        setE135c(e119.equals("1") ? this.e135c : "");
        setE135d(e119.equals("1") ? this.e135d : "");
        setE135e(e119.equals("1") ? this.e135e : "");

        setE13601(e119.equals("1") ? this.e13601 : "");
        setE13602(e119.equals("1") ? this.e13602 : "");
        setE13603(e119.equals("1") ? this.e13603 : "");
        setE13604(e119.equals("1") ? this.e13604 : "");
        setE13605(e119.equals("1") ? this.e13605 : "");
        setE13606(e119.equals("1") ? this.e13606 : "");
        setE13696(e119.equals("1") ? this.e13696 : "");
        setE13698(e119.equals("1") ? this.e13698 : "");
        notifyPropertyChanged(BR.e119);
    }

    @Bindable
    public String getE120() {
        return e120;
    }

    public void setE120(String e120) {
        this.e120 = e120;
        notifyPropertyChanged(BR.e120);
    }

    @Bindable
    public String getE12001() {
        return e12001;
    }

    public void setE12001(String e12001) {
        if (this.e12001.equals(e12001)) return; // for all checkboxes
        this.e12001 = e12001;
        notifyPropertyChanged(BR.e12001);
    }

    @Bindable
    public String getE12002() {
        return e12002;
    }

    public void setE12002(String e12002) {
        if (this.e12002.equals(e12002)) return; // for all checkboxes
        this.e12002 = e12002;
        notifyPropertyChanged(BR.e12002);
    }

    @Bindable
    public String getE12003() {
        return e12003;
    }

    public void setE12003(String e12003) {
        if (this.e12003.equals(e12003)) return; // for all checkboxes
        this.e12003 = e12003;
        notifyPropertyChanged(BR.e12003);
    }

    @Bindable
    public String getE12004() {
        return e12004;
    }

    public void setE12004(String e12004) {
        if (this.e12004.equals(e12004)) return; // for all checkboxes
        this.e12004 = e12004;
        notifyPropertyChanged(BR.e12004);
    }

    @Bindable
    public String getE12005() {
        return e12005;
    }

    public void setE12005(String e12005) {
        if (this.e12005.equals(e12005)) return; // for all checkboxes
        this.e12005 = e12005;
        notifyPropertyChanged(BR.e12005);
    }

    @Bindable
    public String getE12006() {
        return e12006;
    }

    public void setE12006(String e12006) {
        if (this.e12006.equals(e12006)) return; // for all checkboxes
        this.e12006 = e12006;
        notifyPropertyChanged(BR.e12006);
    }

    @Bindable
    public String getE12007() {
        return e12007;
    }

    public void setE12007(String e12007) {
        if (this.e12007.equals(e12007)) return; // for all checkboxes
        this.e12007 = e12007;
        notifyPropertyChanged(BR.e12007);
    }

    @Bindable
    public String getE12008() {
        return e12008;
    }

    public void setE12008(String e12008) {
        if (this.e12008.equals(e12008)) return; // for all checkboxes
        this.e12008 = e12008;
        notifyPropertyChanged(BR.e12008);
    }

    @Bindable
    public String getE12009() {
        return e12009;
    }

    public void setE12009(String e12009) {
        if (this.e12009.equals(e12009)) return; // for all checkboxes
        this.e12009 = e12009;
        notifyPropertyChanged(BR.e12009);
    }

    @Bindable
    public String getE12010() {
        return e12010;
    }

    public void setE12010(String e12010) {
        if (this.e12010.equals(e12010)) return; // for all checkboxes
        this.e12010 = e12010;
        notifyPropertyChanged(BR.e12010);
    }

    @Bindable
    public String getE12011() {
        return e12011;
    }

    public void setE12011(String e12011) {
        if (this.e12011.equals(e12011)) return; // for all checkboxes
        this.e12011 = e12011;
        notifyPropertyChanged(BR.e12011);
    }

    @Bindable
    public String getE12096() {
        return e12096;
    }

    public void setE12096(String e12096) {
        if (this.e12096.equals(e12096)) return; // for all checkboxes
        this.e12096 = e12096;
        setE12096x(e12096.equals("96") ? this.e12096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e12096);
    }

    @Bindable
    public String getE12096x() {
        return e12096x;
    }

    public void setE12096x(String e12096x) {
        this.e12096x = e12096x;
        notifyPropertyChanged(BR.e12096x);
    }

    @Bindable
    public String getE121() {
        return e121;
    }

    public void setE121(String e121) {
        this.e121 = e121;
        setE122(e121.equals("1") ? this.e122 : "");

        setE12301(e121.equals("1") ? this.e12301 : "");
        setE12302(e121.equals("1") ? this.e12302 : "");
        setE12303(e121.equals("1") ? this.e12303 : "");
        setE12304(e121.equals("1") ? this.e12304 : "");
        setE12396(e121.equals("1") ? this.e12396 : "");
        setE12398(e121.equals("1") ? this.e12398 : "");

        setE12401(e121.equals("1") ? this.e12401 : "");
        setE12402(e121.equals("1") ? this.e12402 : "");
        setE12403(e121.equals("1") ? this.e12403 : "");
        setE12404(e121.equals("1") ? this.e12404 : "");
        setE12405(e121.equals("1") ? this.e12405 : "");
        setE12496(e121.equals("1") ? this.e12496 : "");
        setE12498(e121.equals("1") ? this.e12498 : "");

        setE125(e121.equals("1") ? this.e125 : "");
        setE126(e121.equals("1") ? this.e126 : "");
        setE127(e121.equals("1") ? this.e127 : "");
        setE128(e121.equals("1") ? this.e128 : "");
        setE129(e121.equals("1") ? this.e129 : "");
        setE130(e121.equals("1") ? this.e130 : "");
        setE131(e121.equals("1") ? this.e131 : "");
        setE132(e121.equals("1") ? this.e132 : "");

        setE13301(e121.equals("1") ? this.e13301 : "");
        setE13302(e121.equals("1") ? this.e13302 : "");
        setE13303(e121.equals("1") ? this.e13303 : "");
        setE13304(e121.equals("1") ? this.e13304 : "");
        setE13305(e121.equals("1") ? this.e13305 : "");
        setE13306(e121.equals("1") ? this.e13306 : "");
        setE13307(e121.equals("1") ? this.e13307 : "");
        setE13396(e121.equals("1") ? this.e13396 : "");
        setE13398(e121.equals("1") ? this.e13398 : "");

        setE13401x(e121.equals("1") ? this.e13401x : "");
        setE13402x(e121.equals("1") ? this.e13402x : "");
        setE13498(e121.equals("1") ? this.e13498 : "");
        notifyPropertyChanged(BR.e121);
    }

    @Bindable
    public String getE122() {
        return e122;
    }

    public void setE122(String e122) {
        this.e122 = e122;
        setE12301(e122.equals("1") ? this.e12301 : "");
        setE12302(e122.equals("1") ? this.e12302 : "");
        setE12303(e122.equals("1") ? this.e12303 : "");
        setE12304(e122.equals("1") ? this.e12304 : "");
        setE12396(e122.equals("1") ? this.e12396 : "");
        setE12398(e122.equals("1") ? this.e12398 : "");

        setE12401(e122.equals("1") ? this.e12401 : "");
        setE12402(e122.equals("1") ? this.e12402 : "");
        setE12403(e122.equals("1") ? this.e12403 : "");
        setE12404(e122.equals("1") ? this.e12404 : "");
        setE12405(e122.equals("1") ? this.e12405 : "");
        setE12496(e122.equals("1") ? this.e12496 : "");
        setE12498(e122.equals("1") ? this.e12498 : "");

        setE125(e122.equals("1") ? this.e125 : "");
        setE126(e122.equals("1") ? this.e126 : "");
        setE127(e122.equals("1") ? this.e127 : "");
        setE128(e122.equals("1") ? this.e128 : "");
        setE129(e122.equals("1") ? this.e129 : "");
        setE130(e122.equals("1") ? this.e130 : "");
        setE131(e122.equals("1") ? this.e131 : "");
        setE132(e122.equals("1") ? this.e132 : "");

        setE13301(e122.equals("1") ? this.e13301 : "");
        setE13302(e122.equals("1") ? this.e13302 : "");
        setE13303(e122.equals("1") ? this.e13303 : "");
        setE13304(e122.equals("1") ? this.e13304 : "");
        setE13305(e122.equals("1") ? this.e13305 : "");
        setE13306(e122.equals("1") ? this.e13306 : "");
        setE13307(e122.equals("1") ? this.e13307 : "");
        setE13396(e122.equals("1") ? this.e13396 : "");
        setE13398(e122.equals("1") ? this.e13398 : "");

        setE13401x(e122.equals("1") ? this.e13401x : "");
        setE13402x(e122.equals("1") ? this.e13402x : "");
        setE13498(e122.equals("1") ? this.e13498 : "");
        notifyPropertyChanged(BR.e122);
    }

    @Bindable
    public String getE123() {
        return e123;
    }

    public void setE123(String e123) {
        this.e123 = e123;
        notifyPropertyChanged(BR.e123);
    }

    @Bindable
    public String getE12301() {
        return e12301;
    }

    public void setE12301(String e12301) {
        if (this.e12301.equals(e12301)) return; // for all checkboxes
        this.e12301 = e12301;
        setE12302(e12301.equals("1") ? "" : this.e12302);
        setE12303(e12301.equals("1") ? "" : this.e12303);
        setE12304(e12301.equals("1") ? "" : this.e12304);
        setE12396(e12301.equals("1") ? "" : this.e12396);
        setE12398(e12301.equals("1") ? "" : this.e12398);

        setE12401(e12301.equals("1") ? this.e12401 : "");
        setE12402(e12301.equals("1") ? this.e12402 : "");
        setE12403(e12301.equals("1") ? this.e12403 : "");
        setE12404(e12301.equals("1") ? this.e12404 : "");
        setE12405(e12301.equals("1") ? this.e12405 : "");
        setE12496(e12301.equals("1") ? this.e12496 : "");
        setE12498(e12301.equals("1") ? this.e12498 : "");
        notifyPropertyChanged(BR.e12301);
    }

    @Bindable
    public String getE12302() {
        return e12302;
    }

    public void setE12302(String e12302) {
        if (this.e12302.equals(e12302)) return; // for all checkboxes
        this.e12302 = e12302;
        notifyPropertyChanged(BR.e12302);
    }

    @Bindable
    public String getE12303() {
        return e12303;
    }

    public void setE12303(String e12303) {
        if (this.e12303.equals(e12303)) return; // for all checkboxes
        this.e12303 = e12303;
        notifyPropertyChanged(BR.e12303);
    }

    @Bindable
    public String getE12304() {
        return e12304;
    }

    public void setE12304(String e12304) {
        if (this.e12304.equals(e12304)) return; // for all checkboxes
        this.e12304 = e12304;
        notifyPropertyChanged(BR.e12304);
    }

    @Bindable
    public String getE12396() {
        return e12396;
    }

    public void setE12396(String e12396) {
        if (this.e12396.equals(e12396)) return; // for all checkboxes
        this.e12396 = e12396;
        setE12396x(e12396.equals("96") ? this.e12396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e12396);
    }

    @Bindable
    public String getE12396x() {
        return e12396x;
    }

    public void setE12396x(String e12396x) {
        this.e12396x = e12396x;
        notifyPropertyChanged(BR.e12396x);
    }

    @Bindable
    public String getE12398() {
        return e12398;
    }

    public void setE12398(String e12398) {
        if (this.e12398.equals(e12398)) return; // for all checkboxes
        this.e12398 = e12398;
        setE12301(e12398.equals("98") ? "" : this.e12301);
        setE12302(e12398.equals("98") ? "" : this.e12302);
        setE12303(e12398.equals("98") ? "" : this.e12303);
        setE12304(e12398.equals("98") ? "" : this.e12304);
        setE12396(e12398.equals("98") ? "" : this.e12396);
        notifyPropertyChanged(BR.e12398);
    }

    @Bindable
    public String getE124() {
        return e124;
    }

    public void setE124(String e124) {
        this.e124 = e124;
        notifyPropertyChanged(BR.e124);
    }

    @Bindable
    public String getE12401() {
        return e12401;
    }

    public void setE12401(String e12401) {
        if (this.e12401.equals(e12401)) return; // for all checkboxes
        this.e12401 = e12401;
        notifyPropertyChanged(BR.e12401);
    }

    @Bindable
    public String getE12402() {
        return e12402;
    }

    public void setE12402(String e12402) {
        if (this.e12402.equals(e12402)) return; // for all checkboxes
        this.e12402 = e12402;
        notifyPropertyChanged(BR.e12402);
    }

    @Bindable
    public String getE12403() {
        return e12403;
    }

    public void setE12403(String e12403) {
        if (this.e12403.equals(e12403)) return; // for all checkboxes
        this.e12403 = e12403;
        notifyPropertyChanged(BR.e12403);
    }

    @Bindable
    public String getE12404() {
        return e12404;
    }

    public void setE12404(String e12404) {
        if (this.e12404.equals(e12404)) return; // for all checkboxes
        this.e12404 = e12404;
        notifyPropertyChanged(BR.e12404);
    }

    @Bindable
    public String getE12405() {
        return e12405;
    }

    public void setE12405(String e12405) {
        if (this.e12405.equals(e12405)) return; // for all checkboxes
        this.e12405 = e12405;
        notifyPropertyChanged(BR.e12405);
    }

    @Bindable
    public String getE12496() {
        return e12496;
    }

    public void setE12496(String e12496) {
        if (this.e12496.equals(e12496)) return; // for all checkboxes
        this.e12496 = e12496;
        setE12496x(e12496.equals("96") ? this.e12496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e12496);
    }

    @Bindable
    public String getE12496x() {
        return e12496x;
    }

    public void setE12496x(String e12496x) {
        this.e12496x = e12496x;
        notifyPropertyChanged(BR.e12496x);
    }

    @Bindable
    public String getE12498() {
        return e12498;
    }

    public void setE12498(String e12498) {
        if (this.e12498.equals(e12498)) return; // for all checkboxes
        this.e12498 = e12498;
        setE12401(e12498.equals("98") ? "" : this.e12401);
        setE12402(e12498.equals("98") ? "" : this.e12402);
        setE12403(e12498.equals("98") ? "" : this.e12403);
        setE12404(e12498.equals("98") ? "" : this.e12404);
        setE12405(e12498.equals("98") ? "" : this.e12405);
        setE12496(e12498.equals("98") ? "" : this.e12496);
        notifyPropertyChanged(BR.e12498);
    }

    @Bindable
    public String getE125() {
        return e125;
    }

    public void setE125(String e125) {
        this.e125 = e125;
        setE12501x(e125.equals("1") ? this.e12501x : ""); // for all skips, mention all skipped questions
        setE12502x(e125.equals("2") ? this.e12502x : ""); // for all skips, mention all skipped questions
        setE12503x(e125.equals("3") ? this.e12503x : ""); // for all skips, mention all skipped questions
        setE12504x(e125.equals("4") ? this.e12504x : ""); // for all skips, mention all skipped questions
        setE12505x(e125.equals("5") ? this.e12505x : ""); // for all skips, mention all skipped questions
        setE12596x(e125.equals("96") ? this.e12596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e125);
    }

    @Bindable
    public String getE12501x() {
        return e12501x;
    }

    public void setE12501x(String e12501x) {
        this.e12501x = e12501x;
        notifyPropertyChanged(BR.e12501x);
    }

    @Bindable
    public String getE12502x() {
        return e12502x;
    }

    public void setE12502x(String e12502x) {
        this.e12502x = e12502x;
        notifyPropertyChanged(BR.e12502x);
    }

    @Bindable
    public String getE12503x() {
        return e12503x;
    }

    public void setE12503x(String e12503x) {
        this.e12503x = e12503x;
        notifyPropertyChanged(BR.e12503x);
    }

    @Bindable
    public String getE12504x() {
        return e12504x;
    }

    public void setE12504x(String e12504x) {
        this.e12504x = e12504x;
        notifyPropertyChanged(BR.e12504x);
    }

    @Bindable
    public String getE12505x() {
        return e12505x;
    }

    public void setE12505x(String e12505x) {
        this.e12505x = e12505x;
        notifyPropertyChanged(BR.e12505x);
    }

    @Bindable
    public String getE12596x() {
        return e12596x;
    }

    public void setE12596x(String e12596x) {
        this.e12596x = e12596x;
        notifyPropertyChanged(BR.e12596x);
    }

    @Bindable
    public String getE126() {
        return e126;
    }

    public void setE126(String e126) {
        this.e126 = e126;
        setE12601x(e126.equals("1") ? this.e12601x : ""); // for all skips, mention all skipped questions
        setE12602x(e126.equals("2") ? this.e12602x : ""); // for all skips, mention all skipped questions
        setE12603x(e126.equals("3") ? this.e12603x : ""); // for all skips, mention all skipped questions
        setE12604x(e126.equals("4") ? this.e12604x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e126);
    }

    @Bindable
    public String getE12601x() {
        return e12601x;
    }

    public void setE12601x(String e12601x) {
        this.e12601x = e12601x;
        notifyPropertyChanged(BR.e12601x);
    }

    @Bindable
    public String getE12602x() {
        return e12602x;
    }

    public void setE12602x(String e12602x) {
        this.e12602x = e12602x;
        notifyPropertyChanged(BR.e12602x);
    }

    @Bindable
    public String getE12603x() {
        return e12603x;
    }

    public void setE12603x(String e12603x) {
        this.e12603x = e12603x;
        notifyPropertyChanged(BR.e12603x);
    }

    @Bindable
    public String getE12604x() {
        return e12604x;
    }

    public void setE12604x(String e12604x) {
        this.e12604x = e12604x;
        notifyPropertyChanged(BR.e12604x);
    }

    @Bindable
    public String getE12601() {
        return e12601;
    }

    public void setE12601(String e12601) {
        this.e12601 = e12601;
        notifyPropertyChanged(BR.e12601);
    }

    @Bindable
    public String getE127() {
        return e127;
    }

    public void setE127(String e127) {
        this.e127 = e127;
        setE12701x(e127.equals("1") ? this.e12701x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e127);
    }

    @Bindable
    public String getE12701x() {
        return e12701x;
    }

    public void setE12701x(String e12701x) {
        this.e12701x = e12701x;
        notifyPropertyChanged(BR.e12701x);
    }

    @Bindable
    public String getE128() {
        return e128;
    }

    public void setE128(String e128) {
        this.e128 = e128;
        setE12801x(e128.equals("1") ? this.e12801x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e128);
    }

    @Bindable
    public String getE12801x() {
        return e12801x;
    }

    public void setE12801x(String e12801x) {
        this.e12801x = e12801x;
        notifyPropertyChanged(BR.e12801x);
    }

    @Bindable
    public String getE129() {
        return e129;
    }

    public void setE129(String e129) {
        this.e129 = e129;
        setE130(e129.equals("1") ? this.e130 : "");
        setE131(e129.equals("1") ? this.e131 : "");
        notifyPropertyChanged(BR.e129);
    }

    @Bindable
    public String getE130() {
        return e130;
    }

    public void setE130(String e130) {
        this.e130 = e130;
        setE13001x(e130.equals("1") ? this.e13001x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e130);
    }

    @Bindable
    public String getE13001x() {
        return e13001x;
    }

    public void setE13001x(String e13001x) {
        this.e13001x = e13001x;
        notifyPropertyChanged(BR.e13001x);
    }

    @Bindable
    public String getE131() {
        return e131;
    }

    public void setE131(String e131) {
        this.e131 = e131;
        notifyPropertyChanged(BR.e131);
    }

    @Bindable
    public String getE132() {
        return e132;
    }

    public void setE132(String e132) {
        this.e132 = e132;
        setE13301(e132.equals("1") ? this.e13301 : "");
        setE13302(e132.equals("1") ? this.e13302 : "");
        setE13303(e132.equals("1") ? this.e13303 : "");
        setE13304(e132.equals("1") ? this.e13304 : "");
        setE13305(e132.equals("1") ? this.e13305 : "");
        setE13306(e132.equals("1") ? this.e13306 : "");
        setE13307(e132.equals("1") ? this.e13307 : "");
        setE13396(e132.equals("1") ? this.e13396 : "");
        setE13398(e132.equals("1") ? this.e13398 : "");

        setE13401x(e132.equals("1") ? this.e13401x : "");
        setE13402x(e132.equals("1") ? this.e13402x : "");
        setE13498(e132.equals("1") ? this.e13498 : "");
        notifyPropertyChanged(BR.e132);
    }

    @Bindable
    public String getE133() {
        return e133;
    }

    public void setE133(String e133) {
        this.e133 = e133;
        notifyPropertyChanged(BR.e133);
    }

    @Bindable
    public String getE13301() {
        return e13301;
    }

    public void setE13301(String e13301) {
        if (this.e13301.equals(e13301)) return; // for all checkboxes
        this.e13301 = e13301;
        notifyPropertyChanged(BR.e13301);
    }

    @Bindable
    public String getE13302() {
        return e13302;
    }

    public void setE13302(String e13302) {
        if (this.e13302.equals(e13302)) return; // for all checkboxes
        this.e13302 = e13302;
        notifyPropertyChanged(BR.e13302);
    }

    @Bindable
    public String getE13303() {
        return e13303;
    }

    public void setE13303(String e13303) {
        if (this.e13303.equals(e13303)) return; // for all checkboxes
        this.e13303 = e13303;
        notifyPropertyChanged(BR.e13303);
    }

    @Bindable
    public String getE13304() {
        return e13304;
    }

    public void setE13304(String e13304) {
        if (this.e13304.equals(e13304)) return; // for all checkboxes
        this.e13304 = e13304;
        notifyPropertyChanged(BR.e13304);
    }

    @Bindable
    public String getE13305() {
        return e13305;
    }

    public void setE13305(String e13305) {
        if (this.e13305.equals(e13305)) return; // for all checkboxes
        this.e13305 = e13305;
        notifyPropertyChanged(BR.e13305);
    }

    @Bindable
    public String getE13306() {
        return e13306;
    }

    public void setE13306(String e13306) {
        if (this.e13306.equals(e13306)) return; // for all checkboxes
        this.e13306 = e13306;
        notifyPropertyChanged(BR.e13306);
    }

    @Bindable
    public String getE13307() {
        return e13307;
    }

    public void setE13307(String e13307) {
        if (this.e13307.equals(e13307)) return; // for all checkboxes
        this.e13307 = e13307;
        notifyPropertyChanged(BR.e13307);
    }

    @Bindable
    public String getE13396() {
        return e13396;
    }

    public void setE13396(String e13396) {
        if (this.e13396.equals(e13396)) return; // for all checkboxes
        this.e13396 = e13396;
        setE13396x(e13396.equals("96") ? this.e13396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e13396);
    }

    @Bindable
    public String getE13396x() {
        return e13396x;
    }

    public void setE13396x(String e13396x) {
        this.e13396x = e13396x;
        notifyPropertyChanged(BR.e13396x);
    }

    @Bindable
    public String getE13398() {
        return e13398;
    }

    public void setE13398(String e13398) {
        if (this.e13398.equals(e13398)) return; // for all checkboxes
        this.e13398 = e13398;
        setE13301(e13398.equals("98") ? "" : this.e13301);
        setE13302(e13398.equals("98") ? "" : this.e13302);
        setE13303(e13398.equals("98") ? "" : this.e13303);
        setE13304(e13398.equals("98") ? "" : this.e13304);
        setE13305(e13398.equals("98") ? "" : this.e13305);
        setE13306(e13398.equals("98") ? "" : this.e13306);
        setE13307(e13398.equals("98") ? "" : this.e13307);
        setE13396(e13398.equals("98") ? "" : this.e13396);
        notifyPropertyChanged(BR.e13398);
    }

    @Bindable
    public String getE13498() {
        return e13498;
    }

    public void setE13498(String e13498) {
        this.e13498 = e13498;
        notifyPropertyChanged(BR.e13498);
    }

    @Bindable
    public String getE13401x() {
        return e13401x;
    }

    public void setE13401x(String e13401x) {
        this.e13401x = e13401x;
        notifyPropertyChanged(BR.e13401x);
    }

    @Bindable
    public String getE13402x() {
        return e13402x;
    }

    public void setE13402x(String e13402x) {
        this.e13402x = e13402x;
        notifyPropertyChanged(BR.e13402x);
    }

    @Bindable
    public String getE135a() {
        return e135a;
    }

    public void setE135a(String e135a) {
        this.e135a = e135a;
        notifyPropertyChanged(BR.e135a);
    }

    @Bindable
    public String getE135b() {
        return e135b;
    }

    public void setE135b(String e135b) {
        this.e135b = e135b;
        notifyPropertyChanged(BR.e135b);
    }

    @Bindable
    public String getE135c() {
        return e135c;
    }

    public void setE135c(String e135c) {
        this.e135c = e135c;
        notifyPropertyChanged(BR.e135c);
    }

    @Bindable
    public String getE135d() {
        return e135d;
    }

    public void setE135d(String e135d) {
        this.e135d = e135d;
        notifyPropertyChanged(BR.e135d);
    }

    @Bindable
    public String getE135e() {
        return e135e;
    }

    public void setE135e(String e135e) {
        this.e135e = e135e;
        notifyPropertyChanged(BR.e135e);
    }

    @Bindable
    public String getE136() {
        return e136;
    }

    public void setE136(String e136) {
        this.e136 = e136;
        notifyPropertyChanged(BR.e136);
    }

    @Bindable
    public String getE13601() {
        return e13601;
    }

    public void setE13601(String e13601) {
        if (this.e13601.equals(e13601)) return; // for all checkboxes
        this.e13601 = e13601;
        notifyPropertyChanged(BR.e13601);
    }

    @Bindable
    public String getE13602() {
        return e13602;
    }

    public void setE13602(String e13602) {
        if (this.e13602.equals(e13602)) return; // for all checkboxes
        this.e13602 = e13602;
        notifyPropertyChanged(BR.e13602);
    }

    @Bindable
    public String getE13603() {
        return e13603;
    }

    public void setE13603(String e13603) {
        if (this.e13603.equals(e13603)) return; // for all checkboxes
        this.e13603 = e13603;
        notifyPropertyChanged(BR.e13603);
    }

    @Bindable
    public String getE13604() {
        return e13604;
    }

    public void setE13604(String e13604) {
        if (this.e13604.equals(e13604)) return; // for all checkboxes
        this.e13604 = e13604;
        notifyPropertyChanged(BR.e13604);
    }

    @Bindable
    public String getE13605() {
        return e13605;
    }

    public void setE13605(String e13605) {
        if (this.e13605.equals(e13605)) return; // for all checkboxes
        this.e13605 = e13605;
        notifyPropertyChanged(BR.e13605);
    }

    @Bindable
    public String getE13606() {
        return e13606;
    }

    public void setE13606(String e13606) {
        if (this.e13606.equals(e13606)) return; // for all checkboxes
        this.e13606 = e13606;
        notifyPropertyChanged(BR.e13606);
    }

    @Bindable
    public String getE13696() {
        return e13696;
    }

    public void setE13696(String e13696) {
        if (this.e13696.equals(e13696)) return; // for all checkboxes
        this.e13696 = e13696;
        setE13696x(e13696.equals("96") ? this.e13696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e13696);
    }

    @Bindable
    public String getE13696x() {
        return e13696x;
    }

    public void setE13696x(String e13696x) {
        this.e13696x = e13696x;
        notifyPropertyChanged(BR.e13696x);
    }

    @Bindable
    public String getE13698() {
        return e13698;
    }

    public void setE13698(String e13698) {
        if (this.e13698.equals(e13698)) return; // for all checkboxes
        this.e13698 = e13698;
        setE13601(e13698.equals("98") ? "" : this.e13601);
        setE13602(e13698.equals("98") ? "" : this.e13602);
        setE13603(e13698.equals("98") ? "" : this.e13603);
        setE13604(e13698.equals("98") ? "" : this.e13604);
        setE13605(e13698.equals("98") ? "" : this.e13605);
        setE13606(e13698.equals("98") ? "" : this.e13606);
        setE13696(e13698.equals("98") ? "" : this.e13696);
        notifyPropertyChanged(BR.e13698);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Bindable
    public String getDistCode() {
        return distCode;
    }

    public void setDistCode(String distCode) {
        this.distCode = distCode;
        notifyPropertyChanged(BR.ebCode);
    }

    @Bindable
    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
        notifyPropertyChanged(BR.shopNo);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

   /* public String getsH2a() {
        return sH2a;
    }

    public void setsH2a(String sH2a) {
        this.sH2a = sH2a;
    }*/

    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }


    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }


    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }


    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }


    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.distCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_TEHSIL_CODE));
        this.shopNo = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SHOP_NUMBER));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA)));
        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB)));
        sCHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC)));
        sDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD)));
        sEHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE)));
        return this;
    }

    public void sAHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a101 = json.getString("a101");
            this.a101d = json.getString("a101d");
            this.a101m = json.getString("a101m");
            this.a101y = json.getString("a101y");
            this.a102 = json.getString("a102");
            this.a102h = json.getString("a102h");
            this.a102m = json.getString("a102m");
            this.a103 = json.getString("a103");
            this.a103a = json.getString("a103a");
            this.a104 = json.getString("a104");
            this.a104a = json.getString("a104a");
            this.a105 = json.getString("a105");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a108 = json.getString("a108");
            this.a109 = json.getString("a109");
            this.a110 = json.getString("a110");
            this.a111 = json.getString("a111");
            this.a112 = json.getString("a112");
            this.a113 = json.getString("a113");
            this.a114 = json.getString("a114");
            this.a114a = json.getString("a114a");
            this.a115 = json.getString("a115");
            this.a11502 = json.getString("a11502");
            this.a11503 = json.getString("a11503");
            this.a11504 = json.getString("a11504");
            this.a116 = json.getString("a116");
            this.a117 = json.getString("a117");
            this.a11801 = json.getString("a11801");
            this.a11802 = json.getString("a11802");
            this.a11803 = json.getString("a11803");
            this.a119 = json.getString("a119");
            this.a11901x = json.getString("a11901x");
            this.a11902x = json.getString("a11902x");
            this.a11903x = json.getString("a11903x");
            this.a120 = json.getString("a120");
            this.a12096x = json.getString("a12096x");
            this.a121 = json.getString("a121");
            this.a122 = json.getString("a122");
            this.a123 = json.getString("a123");
            this.a12396x = json.getString("a12396x");
            this.a124 = json.getString("a124");
            this.a12496x = json.getString("a12496x");
        }
    }

    public void sBHydrate(String string) throws JSONException {
        Log.d(TAG, "sBHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b10101 = json.getString("b10101");
            this.b10102 = json.getString("b10102");
            this.b10103 = json.getString("b10103");
            this.b10104 = json.getString("b10104");
            this.b10196 = json.getString("b10196");
            this.b10196x = json.getString("b10196x");
            this.b10198 = json.getString("b10198");
            this.b10201 = json.getString("b10201");
            this.b10202 = json.getString("b10202");
            this.b10203 = json.getString("b10203");
            this.b10296 = json.getString("b10296");
            this.b103 = json.getString("b103");
            this.b10396x = json.getString("b10396x");
            this.b104 = json.getString("b104");
            this.b10401x = json.getString("b10401x");
            this.b10402x = json.getString("b10402x");
            this.b10403x = json.getString("b10403x");
            this.b10404x = json.getString("b10404x");
            this.b10496x = json.getString("b10496x");
            this.b10501 = json.getString("b10501");
            this.b10502 = json.getString("b10502");
            this.b10503 = json.getString("b10503");
            this.b10504 = json.getString("b10504");
            this.b10505 = json.getString("b10505");
            this.b10506 = json.getString("b10506");
            this.b10596 = json.getString("b10596");
            this.b10596x = json.getString("b10596x");
            this.b10598 = json.getString("b10598");
            this.b106 = json.getString("b106");
            this.b10601x = json.getString("b10601x");
            this.b107 = json.getString("b107");
            this.b10701x = json.getString("b10701x");
            this.b10702x = json.getString("b10702x");
            this.b10703x = json.getString("b10703x");
            this.b10704x = json.getString("b10704x");
            this.b10705x = json.getString("b10705x");
            this.b10706x = json.getString("b10706x");
            this.b10796 = json.getString("b10796");
            this.b10796x = json.getString("b10796x");
            this.b10798 = json.getString("b10798");
            this.b10799 = json.getString("b10799");
            this.b108 = json.getString("b108");
            this.b109 = json.getString("b109");
            this.b110 = json.getString("b110");
            this.b111 = json.getString("b111");
            this.b112 = json.getString("b112");
            this.b11201x = json.getString("b11201x");
            this.b11202x = json.getString("b11202x");
            this.b11203x = json.getString("b11203x");
            this.b11204x = json.getString("b11204x");
            this.b11296x = json.getString("b11296x");
            this.b11301 = json.getString("b11301");
            this.b11302 = json.getString("b11302");
            this.b11303 = json.getString("b11303");
            this.b11304 = json.getString("b11304");
            this.b11305 = json.getString("b11305");
            this.b11396 = json.getString("b11396");
            this.b11396x = json.getString("b11396x");
            this.b11398 = json.getString("b11398");
            this.b114 = json.getString("b114");
            this.b115 = json.getString("b115");
            this.b116 = json.getString("b116");
            this.b117 = json.getString("b117");
            this.b118 = json.getString("b118");
            this.b11901 = json.getString("b11901");
            this.b11902 = json.getString("b11902");
            this.b11903 = json.getString("b11903");
            this.b11904 = json.getString("b11904");
            this.b11905 = json.getString("b11905");
            this.b11996 = json.getString("b11996");
            this.b11996x = json.getString("b11996x");
            this.b11998 = json.getString("b11998");
            this.b120 = json.getString("b120");
            this.b12096x = json.getString("b12096x");
            this.b121 = json.getString("b121");
            this.b12101x = json.getString("b12101x");
            this.b12102x = json.getString("b12102x");
            this.b12103x = json.getString("b12103x");
            this.b12104x = json.getString("b12104x");
            this.b12105x = json.getString("b12105x");
            this.b12106x = json.getString("b12106x");
            this.b12107x = json.getString("b12107x");
            this.b12108x = json.getString("b12108x");
            this.b12109x = json.getString("b12109x");
            this.b12110x = json.getString("b12110x");
            this.b12196x = json.getString("b12196x");
            this.b12201 = json.getString("b12201");
            this.b12202 = json.getString("b12202");
            this.b12203 = json.getString("b12203");
            this.b12204 = json.getString("b12204");
            this.b12205 = json.getString("b12205");
            this.b12296 = json.getString("b12296");
            this.b12296x = json.getString("b12296x");
            this.b12298 = json.getString("b12298");
            this.b123 = json.getString("b123");
            this.b12301x = json.getString("b12301x");
            this.b12302x = json.getString("b12302x");
            this.b12303x = json.getString("b12303x");
            this.b12304x = json.getString("b12304x");
            this.b12305x = json.getString("b12305x");
            this.b12306x = json.getString("b12306x");
            this.b12396 = json.getString("b12396");
            this.b12396x = json.getString("b12396x");
            this.b12398 = json.getString("b12398");
            this.b12399 = json.getString("b12399");
            this.b124 = json.getString("b124");
            this.b125 = json.getString("b125");
            this.b12601 = json.getString("b12601");
            this.b12602 = json.getString("b12602");
            this.b12603 = json.getString("b12603");
            this.b12604 = json.getString("b12604");
            this.b12605 = json.getString("b12605");
            this.b12606 = json.getString("b12606");
            this.b12607 = json.getString("b12607");
            this.b12608 = json.getString("b12608");
            this.b12609 = json.getString("b12609");
            this.b12610 = json.getString("b12610");
            this.b12696 = json.getString("b12696");
            this.b12696x = json.getString("b12696x");
            this.b126198 = json.getString("b126198");
            this.b12701 = json.getString("b12701");
            this.b12702 = json.getString("b12702");
            this.b12703 = json.getString("b12703");
            this.b12704 = json.getString("b12704");
            this.b12705 = json.getString("b12705");
            this.b12706 = json.getString("b12706");
            this.b12707 = json.getString("b12707");
            this.b12708 = json.getString("b12708");
            this.b12709 = json.getString("b12709");
            this.b12796 = json.getString("b12796");
            this.b12796x = json.getString("b12796x");
            this.b12798 = json.getString("b12798");
            this.b128 = json.getString("b128");
            this.b129 = json.getString("b129");
            this.b12996x = json.getString("b12996x");
            this.b130 = json.getString("b130");
            this.b13101 = json.getString("b13101");
            this.b13102 = json.getString("b13102");
            this.b13103 = json.getString("b13103");
            this.b13196 = json.getString("b13196");
            this.b13196x = json.getString("b13196x");
            this.b132 = json.getString("b132");
            this.b13301 = json.getString("b13301");
            this.b13302 = json.getString("b13302");
            this.b13303 = json.getString("b13303");
            this.b13304 = json.getString("b13304");
            this.b13396 = json.getString("b13396");
            this.b13396x = json.getString("b13396x");
            this.b13398 = json.getString("b13398");
        }
    }

    public void sCHydrate(String string) throws JSONException {
        Log.d(TAG, "sCHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c10101 = json.getString("c10101");
            this.c10102 = json.getString("c10102");
            this.c10103 = json.getString("c10103");
            this.c10104 = json.getString("c10104");
            this.c10105 = json.getString("c10105");
            this.c10106 = json.getString("c10106");
            this.c10107 = json.getString("c10107");
            this.c10108 = json.getString("c10108");
            this.c10109 = json.getString("c10109");
            this.c10110 = json.getString("c10110");
            this.c10196 = json.getString("c10196");
            this.c10196x = json.getString("c10196x");
            this.c10201 = json.getString("c10201");
            this.c10202 = json.getString("c10202");
            this.c10203 = json.getString("c10203");
            this.c10204 = json.getString("c10204");
            this.c10205 = json.getString("c10205");
            this.c10296 = json.getString("c10296");
            this.c10296x = json.getString("c10296x");
            this.c10301 = json.getString("c10301");
            this.c10302 = json.getString("c10302");
            this.c10303 = json.getString("c10303");
            this.c10304 = json.getString("c10304");
            this.c10305 = json.getString("c10305");
            this.c10306 = json.getString("c10306");
            this.c10307 = json.getString("c10307");
            this.c10308 = json.getString("c10308");
            this.c10396 = json.getString("c10396");
            this.c10396x = json.getString("c10396x");
            this.c104 = json.getString("c104");
            this.c106 = json.getString("c106");
            this.c10701 = json.getString("c10701");
            this.c10702 = json.getString("c10702");
            this.c10703 = json.getString("c10703");
            this.c10704 = json.getString("c10704");
            this.c10705 = json.getString("c10705");
            this.c10706 = json.getString("c10706");
            this.c10707 = json.getString("c10707");
            this.c10708 = json.getString("c10708");
            this.c10796 = json.getString("c10796");
            this.c10796x = json.getString("c10796x");
            this.c10798 = json.getString("c10798");
            this.c10801 = json.getString("c10801");
            this.c10802 = json.getString("c10802");
            this.c10803 = json.getString("c10803");
            this.c10804 = json.getString("c10804");
            this.c10805 = json.getString("c10805");
            this.c10806 = json.getString("c10806");
            this.c10807 = json.getString("c10807");
            this.c10808 = json.getString("c10808");
            this.c10809 = json.getString("c10809");
            this.c10810 = json.getString("c10810");
            this.c10811 = json.getString("c10811");
            this.c10812 = json.getString("c10812");
            this.c10896 = json.getString("c10896");
            this.c10896x = json.getString("c10896x");
            this.c10898 = json.getString("c10898");
            this.c109 = json.getString("c109");
            this.c110 = json.getString("c110");
            this.c11201 = json.getString("c11201");
            this.c11202 = json.getString("c11202");
            this.c11203 = json.getString("c11203");
            this.c11204 = json.getString("c11204");
            this.c11205 = json.getString("c11205");
            this.c11206 = json.getString("c11206");
            this.c11207 = json.getString("c11207");
            this.c11208 = json.getString("c11208");
            this.c11296 = json.getString("c11296");
            this.c11296x = json.getString("c11296x");
            this.c11298 = json.getString("c11298");
            this.c11301 = json.getString("c11301");
            this.c11302 = json.getString("c11302");
            this.c11303 = json.getString("c11303");
            this.c11304 = json.getString("c11304");
            this.c11305 = json.getString("c11305");
            this.c11306 = json.getString("c11306");
            this.c11307 = json.getString("c11307");
            this.c11308 = json.getString("c11308");
            this.c11309 = json.getString("c11309");
            this.c11310 = json.getString("c11310");
            this.c11311 = json.getString("c11311");
            this.c11312 = json.getString("c11312");
            this.c11396 = json.getString("c11396");
            this.c11396x = json.getString("c11396x");
            this.c11398 = json.getString("c11398");
            this.c114 = json.getString("c114");
            this.c115 = json.getString("c115");
            this.c116 = json.getString("c116");
            this.c117 = json.getString("c117");
            this.c118 = json.getString("c118");
            this.c119 = json.getString("c119");
            this.c120 = json.getString("c120");
            this.c121 = json.getString("c121");
            this.c122 = json.getString("c122");
            this.c123 = json.getString("c123");
            this.c124 = json.getString("c124");
            this.c125 = json.getString("c125");
            this.c126 = json.getString("c126");
            this.c127 = json.getString("c127");
            this.c128 = json.getString("c128");
            this.c129 = json.getString("c129");
            this.c130 = json.getString("c130");
            this.c131 = json.getString("c131");
            this.c132 = json.getString("c132");
            this.c133 = json.getString("c133");
            this.c134 = json.getString("c134");
            this.c135 = json.getString("c135");
            this.c136 = json.getString("c136");
            this.c137 = json.getString("c137");
            this.c138 = json.getString("c138");
            this.c139 = json.getString("c139");
            this.c140 = json.getString("c140");
            this.c141 = json.getString("c141");
            this.c142 = json.getString("c142");
            this.c143 = json.getString("c143");
            this.c144 = json.getString("c144");
            this.c145 = json.getString("c145");
            this.c146 = json.getString("c146");
            this.c147 = json.getString("c147");
            this.c148 = json.getString("c148");
            this.c149 = json.getString("c149");
            this.c150 = json.getString("c150");
            this.c15101 = json.getString("c15101");
            this.c15102 = json.getString("c15102");
            this.c15103 = json.getString("c15103");
            this.c15196 = json.getString("c15196");
            this.c15196x = json.getString("c15196x");
            this.c152 = json.getString("c152");
            this.c15301 = json.getString("c15301");
            this.c15302 = json.getString("c15302");
            this.c15303 = json.getString("c15303");
            this.c15396 = json.getString("c15396");
            this.c15396x = json.getString("c15396x");
        }
    }

    public void sDHydrate(String string) throws JSONException {
        Log.d(TAG, "sDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d101 = json.getString("d101");
            this.d10201 = json.getString("d10201");
            this.d10202 = json.getString("d10202");
            this.d10203 = json.getString("d10203");
            this.d10204 = json.getString("d10204");
            this.d10296 = json.getString("d10296");
            this.d10296x = json.getString("d10296x");
            this.d10301 = json.getString("d10301");
            this.d10302 = json.getString("d10302");
            this.d10303 = json.getString("d10303");
            this.d10304 = json.getString("d10304");
            this.d10305 = json.getString("d10305");
            this.d10306 = json.getString("d10306");
            this.d10307 = json.getString("d10307");
            this.d10396 = json.getString("d10396");
            this.d10396x = json.getString("d10396x");
            this.d104 = json.getString("d104");
            this.d105 = json.getString("d105");
            this.d10601 = json.getString("d10601");
            this.d10602 = json.getString("d10602");
            this.d10603 = json.getString("d10603");
            this.d10604 = json.getString("d10604");
            this.d10696 = json.getString("d10696");
            this.d10696x = json.getString("d10696x");
            this.d10701 = json.getString("d10701");
            this.d10702 = json.getString("d10702");
            this.d10703 = json.getString("d10703");
            this.d10704 = json.getString("d10704");
            this.d10705 = json.getString("d10705");
            this.d10706 = json.getString("d10706");
            this.d10707 = json.getString("d10707");
            this.d10796 = json.getString("d10796");
            this.d10796x = json.getString("d10796x");
            this.d10801 = json.getString("d10801");
            this.d10802 = json.getString("d10802");
            this.d10803 = json.getString("d10803");
            this.d10804 = json.getString("d10804");
            this.d10805 = json.getString("d10805");
            this.d10806 = json.getString("d10806");
            this.d10807 = json.getString("d10807");
            this.d10808 = json.getString("d10808");
            this.d10896 = json.getString("d10896");
            this.d10896x = json.getString("d10896x");
            this.d10898 = json.getString("d10898");
            this.d109 = json.getString("d109");
            this.d110 = json.getString("d110");
            this.d111 = json.getString("d111");
            this.d11101x = json.getString("d11101x");
            this.d11102x = json.getString("d11102x");
            this.d11103x = json.getString("d11103x");
            this.d11104x = json.getString("d11104x");
            this.d112 = json.getString("d112");
            this.d11201x = json.getString("d11201x");
            this.d11202x = json.getString("d11202x");
            this.d11203x = json.getString("d11203x");
            this.d11204x = json.getString("d11204x");
            this.d113 = json.getString("d113");
            this.d11401 = json.getString("d11401");
            this.d11402 = json.getString("d11402");
            this.d11403 = json.getString("d11403");
            this.d11404 = json.getString("d11404");
            this.d11405 = json.getString("d11405");
            this.d11406 = json.getString("d11406");
            this.d11407 = json.getString("d11407");
            this.d11498 = json.getString("d11498");
            this.d115 = json.getString("d115");
            this.d11501x = json.getString("d11501x");
            this.d11502x = json.getString("d11502x");
            this.d11503x = json.getString("d11503x");
            this.d11504x = json.getString("d11504x");
            this.d11505x = json.getString("d11505x");
            this.d11596x = json.getString("d11596x");
            this.d116 = json.getString("d116");
            this.d11601x = json.getString("d11601x");
            this.d11602x = json.getString("d11602x");
            this.d11603x = json.getString("d11603x");
            this.d11604x = json.getString("d11604x");
            this.d11605x = json.getString("d11605x");
            this.d11696x = json.getString("d11696x");
            this.d117 = json.getString("d117");
            this.d11701x = json.getString("d11701x");
            this.d11702x = json.getString("d11702x");
            this.d11703x = json.getString("d11703x");
            this.d11704x = json.getString("d11704x");
            this.d11705x = json.getString("d11705x");
            this.d11796x = json.getString("d11796x");
            this.d118 = json.getString("d118");
            this.d119 = json.getString("d119");
            this.d11901x = json.getString("d11901x");
            this.d11902x = json.getString("d11902x");
            this.d11903x = json.getString("d11903x");
            this.d11904x = json.getString("d11904x");
            this.d11905x = json.getString("d11905x");
            this.d11996x = json.getString("d11996x");
            this.d120 = json.getString("d120");
            this.d121 = json.getString("d121");
            this.d122 = json.getString("d122");
            this.d12301 = json.getString("d12301");
            this.d12302 = json.getString("d12302");
            this.d12303 = json.getString("d12303");
            this.d12304 = json.getString("d12304");
            this.d12305 = json.getString("d12305");
            this.d12306 = json.getString("d12306");
            this.d12401 = json.getString("d12401");
            this.d12402 = json.getString("d12402");
            this.d12403 = json.getString("d12403");
            this.d12496 = json.getString("d12496");
            this.d12496x = json.getString("d12496x");
            this.d12498 = json.getString("d12498");
            this.d12501 = json.getString("d12501");
            this.d12502 = json.getString("d12502");
            this.d12503 = json.getString("d12503");
            this.d12504 = json.getString("d12504");
            this.d12505 = json.getString("d12505");
            this.d12506 = json.getString("d12506");
            this.d12507 = json.getString("d12507");
            this.d12508 = json.getString("d12508");
            this.d12509 = json.getString("d12509");
            this.d12596 = json.getString("d12596");
            this.d12596x = json.getString("d12596x");
            this.d12598 = json.getString("d12598");
            this.d12601 = json.getString("d12601");
            this.d12602 = json.getString("d12602");
            this.d12603 = json.getString("d12603");
            this.d12604 = json.getString("d12604");
            this.d12605 = json.getString("d12605");
            this.d12606 = json.getString("d12606");
            this.d12607 = json.getString("d12607");
            this.d12608 = json.getString("d12608");
            this.d12696 = json.getString("d12696");
            this.d12696x = json.getString("d12696x");
            this.d12698 = json.getString("d12698");
            this.d127 = json.getString("d127");
            this.d12798 = json.getString("d12798");
            this.d12801 = json.getString("d12801");
            this.d12802 = json.getString("d12802");
            this.d12803 = json.getString("d12803");
            this.d12804 = json.getString("d12804");
            this.d12896 = json.getString("d12896");
            this.d12896x = json.getString("d12896x");
            this.d129 = json.getString("d129");
            this.d13001 = json.getString("d13001");
            this.d13002 = json.getString("d13002");
            this.d13003 = json.getString("d13003");
            this.d13004 = json.getString("d13004");
            this.d13005 = json.getString("d13005");
            this.d13098 = json.getString("d13098");
            this.d13098x = json.getString("d13098x");
        }
    }

    public void sEHydrate(String string) throws JSONException {
        Log.d(TAG, "sEHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e101 = json.getString("e101");
            this.e10101x = json.getString("e10101x");
            this.e10102x = json.getString("e10102x");
            this.e10103x = json.getString("e10103x");
            this.e10104x = json.getString("e10104x");
            this.e10501x = json.getString("e10501x");
            this.e10502x = json.getString("e10502x");
            this.e10503x = json.getString("e10503x");
            this.e10504x = json.getString("e10504x");
            this.e102 = json.getString("e102");
            this.e10301 = json.getString("e10301");
            this.e10302 = json.getString("e10302");
            this.e10303 = json.getString("e10303");
            this.e10396 = json.getString("e10396");
            this.e10396x = json.getString("e10396x");
            this.e10398 = json.getString("e10398");
            this.e10401 = json.getString("e10401");
            this.e10402 = json.getString("e10402");
            this.e10403 = json.getString("e10403");
            this.e10496 = json.getString("e10496");
            this.e10496x = json.getString("e10496x");
            this.e10498 = json.getString("e10498");
            this.e105 = json.getString("e105");
            this.e10601 = json.getString("e10601");
            this.e10602 = json.getString("e10602");
            this.e10603 = json.getString("e10603");
            this.e10796 = json.getString("e10796");
            this.e10796x = json.getString("e10796x");
            this.e10801 = json.getString("e10801");
            this.e10802 = json.getString("e10802");
            this.e10803 = json.getString("e10803");
            this.e10804 = json.getString("e10804");
            this.e10805 = json.getString("e10805");
            this.e10806 = json.getString("e10806");
            this.e10807 = json.getString("e10807");
            this.e10808 = json.getString("e10808");
            this.e10809 = json.getString("e10809");
            this.e10810 = json.getString("e10810");
            this.e10896 = json.getString("e10896");
            this.e10896x = json.getString("e10896x");
            this.e10898 = json.getString("e10898");
            this.e109 = json.getString("e109");
            this.e10901x = json.getString("e10901x");
            this.e10902x = json.getString("e10902x");
            this.e10903x = json.getString("e10903x");
            this.e10904x = json.getString("e10904x");
            this.e10905x = json.getString("e10905x");
            this.e10996x = json.getString("e10996x");
            this.e110 = json.getString("e110");
            this.e11001x = json.getString("e11001x");
            this.e111 = json.getString("e111");
            this.e11101x = json.getString("e11101x");
            this.e112 = json.getString("e112");
            this.e11201 = json.getString("e11201");
            this.e11202 = json.getString("e11202");
            this.e113 = json.getString("e113");
            this.e11301 = json.getString("e11301");
            this.e11301x = json.getString("e11301x");
            this.e11302 = json.getString("e11302");
            this.e114 = json.getString("e114");
            this.e115 = json.getString("e115");
            this.e11596x = json.getString("e11596x");
            this.e116 = json.getString("e116");
            this.e11701 = json.getString("e11701");
            this.e11702 = json.getString("e11702");
            this.e11703 = json.getString("e11703");
            this.e11704 = json.getString("e11704");
            this.e11705 = json.getString("e11705");
            this.e11706 = json.getString("e11706");
            this.e11707 = json.getString("e11707");
            this.e11796 = json.getString("e11796");
            this.e11796x = json.getString("e11796x");
            this.e11798 = json.getString("e11798");
            this.e11801x = json.getString("e11801x");
            this.e11802x = json.getString("e11802x");
            this.e11898 = json.getString("e11898");
            this.e119 = json.getString("e119");
            this.e12001 = json.getString("e12001");
            this.e12002 = json.getString("e12002");
            this.e12003 = json.getString("e12003");
            this.e12004 = json.getString("e12004");
            this.e12005 = json.getString("e12005");
            this.e12006 = json.getString("e12006");
            this.e12007 = json.getString("e12007");
            this.e12008 = json.getString("e12008");
            this.e12009 = json.getString("e12009");
            this.e12010 = json.getString("e12010");
            this.e12011 = json.getString("e12011");
            this.e12096 = json.getString("e12096");
            this.e12096x = json.getString("e12096x");
            this.e121 = json.getString("e121");
            this.e122 = json.getString("e122");
            this.e12301 = json.getString("e12301");
            this.e12302 = json.getString("e12302");
            this.e12303 = json.getString("e12303");
            this.e12304 = json.getString("e12304");
            this.e12396 = json.getString("e12396");
            this.e12396x = json.getString("e12396x");
            this.e12398 = json.getString("e12398");
            this.e12401 = json.getString("e12401");
            this.e12402 = json.getString("e12402");
            this.e12403 = json.getString("e12403");
            this.e12404 = json.getString("e12404");
            this.e12405 = json.getString("e12405");
            this.e12496 = json.getString("e12496");
            this.e12496x = json.getString("e12496x");
            this.e12498 = json.getString("e12498");
            this.e125 = json.getString("e125");
            this.e12501x = json.getString("e12501x");
            this.e12502x = json.getString("e12502x");
            this.e12503x = json.getString("e12503x");
            this.e12504x = json.getString("e12504x");
            this.e12505x = json.getString("e12505x");
            this.e12596x = json.getString("e12596x");
            this.e126 = json.getString("e126");
            this.e12601x = json.getString("e12601x");
            this.e12602x = json.getString("e12602x");
            this.e12603x = json.getString("e12603x");
            this.e12604x = json.getString("e12604x");
            this.e12601 = json.getString("e12601");
            this.e127 = json.getString("e127");
            this.e12701x = json.getString("e12701x");
            this.e128 = json.getString("e128");
            this.e12801x = json.getString("e12801x");
            this.e129 = json.getString("e129");
            this.e130 = json.getString("e130");
            this.e13001x = json.getString("e13001x");
            this.e131 = json.getString("e131");
            this.e132 = json.getString("e132");
            this.e13301 = json.getString("e13301");
            this.e13302 = json.getString("e13302");
            this.e13303 = json.getString("e13303");
            this.e13304 = json.getString("e13304");
            this.e13305 = json.getString("e13305");
            this.e13306 = json.getString("e13306");
            this.e13307 = json.getString("e13307");
            this.e13396 = json.getString("e13396");
            this.e13396x = json.getString("e13396x");
            this.e13398 = json.getString("e13398");
            this.e13401x = json.getString("e13401x");
            this.e13402x = json.getString("e13402x");
            this.e13498 = json.getString("e13498");
            this.e135a = json.getString("e135a");
            this.e135b = json.getString("e135b");
            this.e135c = json.getString("e135c");
            this.e135d = json.getString("e135d");
            this.e135e = json.getString("e135e");
            this.e13601 = json.getString("e13601");
            this.e13602 = json.getString("e13602");
            this.e13603 = json.getString("e13603");
            this.e13604 = json.getString("e13604");
            this.e13605 = json.getString("e13605");
            this.e13606 = json.getString("e13606");
            this.e13696 = json.getString("e13696");
            this.e13696x = json.getString("e13696x");
            this.e13698 = json.getString("e13698");
        }
    }


    public String sAtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("a101", a101)
                .put("a101d", a101d)
                .put("a101m", a101m)
                .put("a101y", a101y)
                .put("a102", a102)
                .put("a102h", a102h)
                .put("a102m", a102m)
                .put("a103", a103)
                .put("a103a", a103a)
                .put("a104", a104)
                .put("a104a", a104a)
                .put("a105", a105)
                .put("a106", a106)
                .put("a107", a107)
                .put("a108", a108)
                .put("a109", a109)
                .put("a110", a110)
                .put("a111", a111)
                .put("a112", a112)
                .put("a113", a113)
                .put("a114", a114)
                .put("a114a", a114a)
                .put("a115", a115)
                .put("a11502", a11502)
                .put("a11503", a11503)
                .put("a11504", a11504)
                .put("a116", a116)
                .put("a117", a117)
                .put("a11801", a11801)
                .put("a11802", a11802)
                .put("a11803", a11803)
                .put("a119", a119)
                .put("a11901x", a11901x)
                .put("a11902x", a11902x)
                .put("a11903x", a11903x)
                .put("a120", a120)
                .put("a12096x", a12096x)
                .put("a121", a121)
                .put("a122", a122)
                .put("a123", a123)
                .put("a12396x", a12396x)
                .put("a124", a124)
                .put("a12496x", a12496x);
        return json.toString();
    }

    public String sBtoString() throws JSONException {
        Log.d(TAG, "sBtoString: ");
        JSONObject json = new JSONObject();
        json.put("b10101", b10101)
                .put("b10102", b10102)
                .put("b10103", b10103)
                .put("b10104", b10104)
                .put("b10196", b10196)
                .put("b10196x", b10196x)
                .put("b10198", b10198)
                .put("b10201", b10201)
                .put("b10202", b10202)
                .put("b10203", b10203)
                .put("b10296", b10296)
                .put("b103", b103)
                .put("b10396x", b10396x)
                .put("b104", b104)
                .put("b10401x", b10401x)
                .put("b10402x", b10402x)
                .put("b10403x", b10403x)
                .put("b10404x", b10404x)
                .put("b10496x", b10496x)
                .put("b10501", b10501)
                .put("b10502", b10502)
                .put("b10503", b10503)
                .put("b10504", b10504)
                .put("b10505", b10505)
                .put("b10506", b10506)
                .put("b10596", b10596)
                .put("b10596x", b10596x)
                .put("b10598", b10598)
                .put("b106", b106)
                .put("b10601x", b10601x)
                .put("b107", b107)
                .put("b10701x", b10701x)
                .put("b10702x", b10702x)
                .put("b10703x", b10703x)
                .put("b10704x", b10704x)
                .put("b10705x", b10705x)
                .put("b10706x", b10706x)
                .put("b10796", b10796)
                .put("b10796x", b10796x)
                .put("b10798", b10798)
                .put("b10799", b10799)
                .put("b108", b108)
                .put("b109", b109)
                .put("b110", b110)
                .put("b111", b111)
                .put("b112", b112)
                .put("b11201x", b11201x)
                .put("b11202x", b11202x)
                .put("b11203x", b11203x)
                .put("b11204x", b11204x)
                .put("b11296x", b11296x)
                .put("b11301", b11301)
                .put("b11302", b11302)
                .put("b11303", b11303)
                .put("b11304", b11304)
                .put("b11305", b11305)
                .put("b11396", b11396)
                .put("b11396x", b11396x)
                .put("b11398", b11398)
                .put("b114", b114)
                .put("b115", b115)
                .put("b116", b116)
                .put("b117", b117)
                .put("b118", b118)
                .put("b11901", b11901)
                .put("b11902", b11902)
                .put("b11903", b11903)
                .put("b11904", b11904)
                .put("b11905", b11905)
                .put("b11996", b11996)
                .put("b11996x", b11996x)
                .put("b11998", b11998)
                .put("b120", b120)
                .put("b12096x", b12096x)
                .put("b121", b121)
                .put("b12101x", b12101x)
                .put("b12102x", b12102x)
                .put("b12103x", b12103x)
                .put("b12104x", b12104x)
                .put("b12105x", b12105x)
                .put("b12106x", b12106x)
                .put("b12107x", b12107x)
                .put("b12108x", b12108x)
                .put("b12109x", b12109x)
                .put("b12110x", b12110x)
                .put("b12196x", b12196x)
                .put("b12201", b12201)
                .put("b12202", b12202)
                .put("b12203", b12203)
                .put("b12204", b12204)
                .put("b12205", b12205)
                .put("b12296", b12296)
                .put("b12296x", b12296x)
                .put("b12298", b12298)
                .put("b123", b123)
                .put("b12301x", b12301x)
                .put("b12302x", b12302x)
                .put("b12303x", b12303x)
                .put("b12304x", b12304x)
                .put("b12305x", b12305x)
                .put("b12306x", b12306x)
                .put("b12396", b12396)
                .put("b12396x", b12396x)
                .put("b12398", b12398)
                .put("b12399", b12399)
                .put("b124", b124)
                .put("b125", b125)
                .put("b12601", b12601)
                .put("b12602", b12602)
                .put("b12603", b12603)
                .put("b12604", b12604)
                .put("b12605", b12605)
                .put("b12606", b12606)
                .put("b12607", b12607)
                .put("b12608", b12608)
                .put("b12609", b12609)
                .put("b12610", b12610)
                .put("b12696", b12696)
                .put("b12696x", b12696x)
                .put("b126198", b126198)
                .put("b12701", b12701)
                .put("b12702", b12702)
                .put("b12703", b12703)
                .put("b12704", b12704)
                .put("b12705", b12705)
                .put("b12706", b12706)
                .put("b12707", b12707)
                .put("b12708", b12708)
                .put("b12709", b12709)
                .put("b12796", b12796)
                .put("b12796x", b12796x)
                .put("b12798", b12798)
                .put("b128", b128)
                .put("b129", b129)
                .put("b12996x", b12996x)
                .put("b130", b130)
                .put("b13101", b13101)
                .put("b13102", b13102)
                .put("b13103", b13103)
                .put("b13196", b13196)
                .put("b13196x", b13196x)
                .put("b132", b132)
                .put("b13301", b13301)
                .put("b13302", b13302)
                .put("b13303", b13303)
                .put("b13304", b13304)
                .put("b13396", b13396)
                .put("b13396x", b13396x)
                .put("b13398", b13398);
        return json.toString();
    }

    public String sCtoString() throws JSONException {
        Log.d(TAG, "sCtoString: ");
        JSONObject json = new JSONObject();
        json.put("c10101", c10101)
                .put("c10102", c10102)
                .put("c10103", c10103)
                .put("c10104", c10104)
                .put("c10105", c10105)
                .put("c10106", c10106)
                .put("c10107", c10107)
                .put("c10108", c10108)
                .put("c10109", c10109)
                .put("c10110", c10110)
                .put("c10196", c10196)
                .put("c10196x", c10196x)
                .put("c10201", c10201)
                .put("c10202", c10202)
                .put("c10203", c10203)
                .put("c10204", c10204)
                .put("c10205", c10205)
                .put("c10296", c10296)
                .put("c10296x", c10296x)
                .put("c10301", c10301)
                .put("c10302", c10302)
                .put("c10303", c10303)
                .put("c10304", c10304)
                .put("c10305", c10305)
                .put("c10306", c10306)
                .put("c10307", c10307)
                .put("c10308", c10308)
                .put("c10396", c10396)
                .put("c10396x", c10396x)
                .put("c104", c104)
                .put("c106", c106)
                .put("c10701", c10701)
                .put("c10702", c10702)
                .put("c10703", c10703)
                .put("c10704", c10704)
                .put("c10705", c10705)
                .put("c10706", c10706)
                .put("c10707", c10707)
                .put("c10708", c10708)
                .put("c10796", c10796)
                .put("c10796x", c10796x)
                .put("c10798", c10798)
                .put("c10801", c10801)
                .put("c10802", c10802)
                .put("c10803", c10803)
                .put("c10804", c10804)
                .put("c10805", c10805)
                .put("c10806", c10806)
                .put("c10807", c10807)
                .put("c10808", c10808)
                .put("c10809", c10809)
                .put("c10810", c10810)
                .put("c10811", c10811)
                .put("c10812", c10812)
                .put("c10896", c10896)
                .put("c10896x", c10896x)
                .put("c10898", c10898)
                .put("c109", c109)
                .put("c110", c110)
                .put("c11201", c11201)
                .put("c11202", c11202)
                .put("c11203", c11203)
                .put("c11204", c11204)
                .put("c11205", c11205)
                .put("c11206", c11206)
                .put("c11207", c11207)
                .put("c11208", c11208)
                .put("c11296", c11296)
                .put("c11296x", c11296x)
                .put("c11298", c11298)
                .put("c11301", c11301)
                .put("c11302", c11302)
                .put("c11303", c11303)
                .put("c11304", c11304)
                .put("c11305", c11305)
                .put("c11306", c11306)
                .put("c11307", c11307)
                .put("c11308", c11308)
                .put("c11309", c11309)
                .put("c11310", c11310)
                .put("c11311", c11311)
                .put("c11312", c11312)
                .put("c11396", c11396)
                .put("c11396x", c11396x)
                .put("c11398", c11398)
                .put("c114", c114)
                .put("c115", c115)
                .put("c116", c116)
                .put("c117", c117)
                .put("c118", c118)
                .put("c119", c119)
                .put("c120", c120)
                .put("c121", c121)
                .put("c122", c122)
                .put("c123", c123)
                .put("c124", c124)
                .put("c125", c125)
                .put("c126", c126)
                .put("c127", c127)
                .put("c128", c128)
                .put("c129", c129)
                .put("c130", c130)
                .put("c131", c131)
                .put("c132", c132)
                .put("c133", c133)
                .put("c134", c134)
                .put("c135", c135)
                .put("c136", c136)
                .put("c137", c137)
                .put("c138", c138)
                .put("c139", c139)
                .put("c140", c140)
                .put("c141", c141)
                .put("c142", c142)
                .put("c143", c143)
                .put("c144", c144)
                .put("c145", c145)
                .put("c146", c146)
                .put("c147", c147)
                .put("c148", c148)
                .put("c149", c149)
                .put("c150", c150)
                .put("c15101", c15101)
                .put("c15102", c15102)
                .put("c15103", c15103)
                .put("c15196", c15196)
                .put("c15196x", c15196x)
                .put("c152", c152)
                .put("c15301", c15301)
                .put("c15302", c15302)
                .put("c15303", c15303)
                .put("c15396", c15396)
                .put("c15396x", c15396x);
        return json.toString();
    }

    public String sDtoString() throws JSONException {
        Log.d(TAG, "sDtoString: ");
        JSONObject json = new JSONObject();
        json.put("d101", d101)
                .put("d10201", d10201)
                .put("d10202", d10202)
                .put("d10203", d10203)
                .put("d10204", d10204)
                .put("d10296", d10296)
                .put("d10296x", d10296x)
                .put("d10301", d10301)
                .put("d10302", d10302)
                .put("d10303", d10303)
                .put("d10304", d10304)
                .put("d10305", d10305)
                .put("d10306", d10306)
                .put("d10307", d10307)
                .put("d10396", d10396)
                .put("d10396x", d10396x)
                .put("d104", d104)
                .put("d105", d105)
                .put("d10601", d10601)
                .put("d10602", d10602)
                .put("d10603", d10603)
                .put("d10604", d10604)
                .put("d10696", d10696)
                .put("d10696x", d10696x)
                .put("d10701", d10701)
                .put("d10702", d10702)
                .put("d10703", d10703)
                .put("d10704", d10704)
                .put("d10705", d10705)
                .put("d10706", d10706)
                .put("d10707", d10707)
                .put("d10796", d10796)
                .put("d10796x", d10796x)
                .put("d10801", d10801)
                .put("d10802", d10802)
                .put("d10803", d10803)
                .put("d10804", d10804)
                .put("d10805", d10805)
                .put("d10806", d10806)
                .put("d10807", d10807)
                .put("d10808", d10808)
                .put("d10896", d10896)
                .put("d10896x", d10896x)
                .put("d10898", d10898)
                .put("d109", d109)
                .put("d110", d110)
                .put("d111", d111)
                .put("d11101x", d11101x)
                .put("d11102x", d11102x)
                .put("d11103x", d11103x)
                .put("d11104x", d11104x)
                .put("d112", d112)
                .put("d11201x", d11201x)
                .put("d11202x", d11202x)
                .put("d11203x", d11203x)
                .put("d11204x", d11204x)
                .put("d113", d113)
                .put("d11401", d11401)
                .put("d11402", d11402)
                .put("d11403", d11403)
                .put("d11404", d11404)
                .put("d11405", d11405)
                .put("d11406", d11406)
                .put("d11407", d11407)
                .put("d11498", d11498)
                .put("d115", d115)
                .put("d11501x", d11501x)
                .put("d11502x", d11502x)
                .put("d11503x", d11503x)
                .put("d11504x", d11504x)
                .put("d11505x", d11505x)
                .put("d11596x", d11596x)
                .put("d116", d116)
                .put("d11601x", d11601x)
                .put("d11602x", d11602x)
                .put("d11603x", d11603x)
                .put("d11604x", d11604x)
                .put("d11605x", d11605x)
                .put("d11696x", d11696x)
                .put("d117", d117)
                .put("d11701x", d11701x)
                .put("d11702x", d11702x)
                .put("d11703x", d11703x)
                .put("d11704x", d11704x)
                .put("d11705x", d11705x)
                .put("d11796x", d11796x)
                .put("d118", d118)
                .put("d119", d119)
                .put("d11901x", d11901x)
                .put("d11902x", d11902x)
                .put("d11903x", d11903x)
                .put("d11904x", d11904x)
                .put("d11905x", d11905x)
                .put("d11996x", d11996x)
                .put("d120", d120)
                .put("d121", d121)
                .put("d122", d122)
                .put("d12301", d12301)
                .put("d12302", d12302)
                .put("d12303", d12303)
                .put("d12304", d12304)
                .put("d12305", d12305)
                .put("d12306", d12306)
                .put("d12401", d12401)
                .put("d12402", d12402)
                .put("d12403", d12403)
                .put("d12496", d12496)
                .put("d12496x", d12496x)
                .put("d12498", d12498)
                .put("d12501", d12501)
                .put("d12502", d12502)
                .put("d12503", d12503)
                .put("d12504", d12504)
                .put("d12505", d12505)
                .put("d12506", d12506)
                .put("d12507", d12507)
                .put("d12508", d12508)
                .put("d12509", d12509)
                .put("d12596", d12596)
                .put("d12596x", d12596x)
                .put("d12598", d12598)
                .put("d12601", d12601)
                .put("d12602", d12602)
                .put("d12603", d12603)
                .put("d12604", d12604)
                .put("d12605", d12605)
                .put("d12606", d12606)
                .put("d12607", d12607)
                .put("d12608", d12608)
                .put("d12696", d12696)
                .put("d12696x", d12696x)
                .put("d12698", d12698)
                .put("d127", d127)
                .put("d12798", d12798)
                .put("d12801", d12801)
                .put("d12802", d12802)
                .put("d12803", d12803)
                .put("d12804", d12804)
                .put("d12896", d12896)
                .put("d12896x", d12896x)
                .put("d129", d129)
                .put("d13001", d13001)
                .put("d13002", d13002)
                .put("d13003", d13003)
                .put("d13004", d13004)
                .put("d13005", d13005)
                .put("d13098", d13098)
                .put("d13098x", d13098x);
        return json.toString();
    }

    public String sEtoString() throws JSONException {
        Log.d(TAG, "sEtoString: ");
        JSONObject json = new JSONObject();
        json.put("e101", e101)
                .put("e10101x", e10101x)
                .put("e10102x", e10102x)
                .put("e10103x", e10103x)
                .put("e10104x", e10104x)
                .put("e10501x", e10501x)
                .put("e10502x", e10502x)
                .put("e10503x", e10503x)
                .put("e10504x", e10504x)
                .put("e102", e102)
                .put("e10301", e10301)
                .put("e10302", e10302)
                .put("e10303", e10303)
                .put("e10396", e10396)
                .put("e10396x", e10396x)
                .put("e10398", e10398)
                .put("e10401", e10401)
                .put("e10402", e10402)
                .put("e10403", e10403)
                .put("e10496", e10496)
                .put("e10496x", e10496x)
                .put("e10498", e10498)
                .put("e105", e105)
                .put("e10601", e10601)
                .put("e10602", e10602)
                .put("e10603", e10603)
                .put("e10796", e10796)
                .put("e10796x", e10796x)
                .put("e10801", e10801)
                .put("e10802", e10802)
                .put("e10803", e10803)
                .put("e10804", e10804)
                .put("e10805", e10805)
                .put("e10806", e10806)
                .put("e10807", e10807)
                .put("e10808", e10808)
                .put("e10809", e10809)
                .put("e10810", e10810)
                .put("e10896", e10896)
                .put("e10896x", e10896x)
                .put("e10898", e10898)
                .put("e109", e109)
                .put("e10901x", e10901x)
                .put("e10902x", e10902x)
                .put("e10903x", e10903x)
                .put("e10904x", e10904x)
                .put("e10905x", e10905x)
                .put("e10996x", e10996x)
                .put("e110", e110)
                .put("e11001x", e11001x)
                .put("e111", e111)
                .put("e11101x", e11101x)
                .put("e112", e112)
                .put("e11201", e11201)
                .put("e11202", e11202)
                .put("e113", e113)
                .put("e11301", e11301)
                .put("e11301x", e11301x)
                .put("e11302", e11302)
                .put("e114", e114)
                .put("e115", e115)
                .put("e11596x", e11596x)
                .put("e116", e116)
                .put("e11701", e11701)
                .put("e11702", e11702)
                .put("e11703", e11703)
                .put("e11704", e11704)
                .put("e11705", e11705)
                .put("e11706", e11706)
                .put("e11707", e11707)
                .put("e11796", e11796)
                .put("e11796x", e11796x)
                .put("e11798", e11798)
                .put("e11801x", e11801x)
                .put("e11802x", e11802x)
                .put("e11898", e11898)
                .put("e119", e119)
                .put("e12001", e12001)
                .put("e12002", e12002)
                .put("e12003", e12003)
                .put("e12004", e12004)
                .put("e12005", e12005)
                .put("e12006", e12006)
                .put("e12007", e12007)
                .put("e12008", e12008)
                .put("e12009", e12009)
                .put("e12010", e12010)
                .put("e12011", e12011)
                .put("e12096", e12096)
                .put("e12096x", e12096x)
                .put("e121", e121)
                .put("e122", e122)
                .put("e12301", e12301)
                .put("e12302", e12302)
                .put("e12303", e12303)
                .put("e12304", e12304)
                .put("e12396", e12396)
                .put("e12396x", e12396x)
                .put("e12398", e12398)
                .put("e12401", e12401)
                .put("e12402", e12402)
                .put("e12403", e12403)
                .put("e12404", e12404)
                .put("e12405", e12405)
                .put("e12496", e12496)
                .put("e12496x", e12496x)
                .put("e12498", e12498)
                .put("e125", e125)
                .put("e12501x", e12501x)
                .put("e12502x", e12502x)
                .put("e12503x", e12503x)
                .put("e12504x", e12504x)
                .put("e12505x", e12505x)
                .put("e12596x", e12596x)
                .put("e126", e126)
                .put("e12601x", e12601x)
                .put("e12602x", e12602x)
                .put("e12603x", e12603x)
                .put("e12604x", e12604x)
                .put("e12601", e12601)
                .put("e127", e127)
                .put("e12701x", e12701x)
                .put("e128", e128)
                .put("e12801x", e12801x)
                .put("e129", e129)
                .put("e130", e130)
                .put("e13001x", e13001x)
                .put("e131", e131)
                .put("e132", e132)
                .put("e13301", e13301)
                .put("e13302", e13302)
                .put("e13303", e13303)
                .put("e13304", e13304)
                .put("e13305", e13305)
                .put("e13306", e13306)
                .put("e13307", e13307)
                .put("e13396", e13396)
                .put("e13396x", e13396x)
                .put("e13398", e13398)
                .put("e13401x", e13401x)
                .put("e13402x", e13402x)
                .put("e13498", e13498)
                .put("e135a", e135a)
                .put("e135b", e135b)
                .put("e135c", e135c)
                .put("e135d", e135d)
                .put("e135e", e135e)
                .put("e13601", e13601)
                .put("e13602", e13602)
                .put("e13603", e13603)
                .put("e13604", e13604)
                .put("e13605", e13605)
                .put("e13606", e13606)
                .put("e13696", e13696)
                .put("e13696x", e13696x)
                .put("e13698", e13698);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_DISTRICT_CODE, this.distCode);
        json.put(FormsTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(FormsTable.COLUMN_SHOP_NUMBER, this.shopNo);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
        json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));
        json.put(FormsTable.COLUMN_SC, new JSONObject(sCtoString()));
        json.put(FormsTable.COLUMN_SD, new JSONObject(sDtoString()));
        json.put(FormsTable.COLUMN_SE, new JSONObject(sEtoString()));
        return json;
    }
}
