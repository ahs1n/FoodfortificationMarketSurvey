package edu.aku.hassannaqvi.foodfortification_marketsurvey.models

import android.database.Cursor
import edu.aku.hassannaqvi.foodfortification_marketsurvey.contracts.TableContracts.EnumBlocksTable
import edu.aku.hassannaqvi.foodfortification_marketsurvey.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class EnumBlocks {
    var ID: Long = 0
    var districtName: String = _EMPTY_
    var districtCode: String = _EMPTY_
    var tehsilName: String = _EMPTY_
    var tehsilCode: String = _EMPTY_
    var enumBlock: String = _EMPTY_

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): EnumBlocks {
        districtName = jsonObject.getString(EnumBlocksTable.COLUMN_DISTRICT_NAME)
        districtCode = jsonObject.getString(EnumBlocksTable.COLUMN_DISTRICT_CODE)
        tehsilName = jsonObject.getString(EnumBlocksTable.COLUMN_TEHSIL_NAME)
        tehsilCode = jsonObject.getString(EnumBlocksTable.COLUMN_TEHSIL_CODE)
        enumBlock = jsonObject.getString(EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): EnumBlocks {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_ID))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_DISTRICT_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_DISTRICT_CODE))
        tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_TEHSIL_NAME))
        tehsilCode =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_TEHSIL_CODE))
        enumBlock =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE))
        return this
    }


}