package com.mphone.majiashanxia.Utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by syd on 2016/4/24.
 */
public class DBHelper extends SQLiteOpenHelper {

    /**
     * 数据库名字
     * */
    public static final String DATABASE_NAME="MAGA_DATABASE";
    /**
     * 数据库版本
     * */
    public static final int DATABASE_VERSION=1;
    /**
     * 命令
     * */
    public static final String CREATE_TABLE_DICTIONARY = "CREATE TABLE IF NOT EXISTS tb_dictionary (dic_code VARCHAR(255) PRIMARY KEY,dic_name VARCHAR(255),dic_parent_code VARCHAR(255))";
    public static final String CAEATE_TABLE_PLACE = "CREATE TABLE IF NOT EXISTS tb_place (plc_id VARCHAR(255) PRIMARY KEY , plc_code VARCHAR(255) , plc_name VARCHAR(255) , plc_parentid VARCHAR(255))";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_DICTIONARY);
        db.execSQL(CAEATE_TABLE_PLACE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO: 2016/4/24
    }
}
