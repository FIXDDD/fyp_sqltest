package com.abc.sqltest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Data.db";
    public static final String TABLE_NAME1 = "Beacon_data";
    public static final String T1_col1 = "ID";
    public static final String T1_col2 = "ROOMS";
    public static final String TABLE_NAME2 = "Beacon_distance";
    public static final String T2_col1 = "STARTBEACON";
    public static final String T2_col2 = "ENDBEACON";
    public static final String T2_col3 = "DISTANCE";
    public static final String createTable1 = "CREATE TABLE " + TABLE_NAME1 + "(ID TEXT,ROOMS TEXT,primary key ( ID, ROOMS));";
    public static final String createTable2 = "CREATE TABLE " + TABLE_NAME2 + "(STARTBEACON TEXT,ENDBEACON TEXT,DISTANCE INT,primary key ( STARTBEACON, ENDBEACON));";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable1);
        db.execSQL(createTable2);
        adddata(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP  TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP  TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
    }

    public void adddata(SQLiteDatabase db){

        //Data of T1
        ContentValues T1_r1 = new ContentValues();
        T1_r1.put(T1_col1,"OufQT4");
        T1_r1.put(T1_col2,"r1");
        db.insert(TABLE_NAME1,null,T1_r1);

        ContentValues T1_c1 = new ContentValues();
        T1_c1.put(T1_col1,"OugKl0");
        T1_c1.put(T1_col2,"c1");
        db.insert(TABLE_NAME1,null,T1_c1);

        ContentValues T1_r2 = new ContentValues();
        T1_r2.put(T1_col1,"OuJ2kF");
        T1_r2.put(T1_col2,"r2");
        db.insert(TABLE_NAME1,null,T1_r2);

        ContentValues T1_r3 = new ContentValues();
        T1_r3.put(T1_col1,"OuQ0Lp");
        T1_r3.put(T1_col2,"r3");
        db.insert(TABLE_NAME1,null,T1_r3);

        //Data of T2

        //r1 to other
        ContentValues T2_r1_c1 = new ContentValues();
        T2_r1_c1.put(T2_col1,"r1");
        T2_r1_c1.put(T2_col2,"c1");
        T2_r1_c1.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r1_c1);

        ContentValues T2_r1_r2 = new ContentValues();
        T2_r1_r2.put(T2_col1,"r1");
        T2_r1_r2.put(T2_col2,"r2");
        T2_r1_r2.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r1_r2);

        ContentValues T2_r1_r3 = new ContentValues();
        T2_r1_r3.put(T2_col1,"r1");
        T2_r1_r3.put(T2_col2,"r3");
        T2_r1_r3.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r1_r3);

        //c1 to other
        ContentValues T2_c1_r1 = new ContentValues();
        T2_c1_r1.put(T2_col1,"c1");
        T2_c1_r1.put(T2_col2,"r1");
        T2_c1_r1.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_c1_r1);

        ContentValues T2_c1_r2 = new ContentValues();
        T2_c1_r2.put(T2_col1,"c1");
        T2_c1_r2.put(T2_col2,"r2");
        T2_c1_r2.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_c1_r2);

        ContentValues T2_c1_r3 = new ContentValues();
        T2_c1_r3.put(T2_col1,"c1");
        T2_c1_r3.put(T2_col2,"r3");
        T2_c1_r3.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_c1_r3);

        //r2 to other
        ContentValues T2_r2_c1 = new ContentValues();
        T2_r2_c1.put(T2_col1,"r2");
        T2_r2_c1.put(T2_col2,"c1");
        T2_r2_c1.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r2_c1);

        ContentValues T2_r2_r1 = new ContentValues();
        T2_r2_r1.put(T2_col1,"r2");
        T2_r2_r1.put(T2_col2,"r1");
        T2_r2_r1.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r2_r1);

        ContentValues T2_r2_r3 = new ContentValues();
        T2_r2_r3.put(T2_col1,"r2");
        T2_r2_r3.put(T2_col2,"r3");
        T2_r2_r3.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r2_r3);

        //r3 to other
        ContentValues T2_r3_c1 = new ContentValues();
        T2_r3_c1.put(T2_col1,"r3");
        T2_r3_c1.put(T2_col2,"c1");
        T2_r3_c1.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r3_c1);

        ContentValues T2_r3_r2 = new ContentValues();
        T2_r3_r2.put(T2_col1,"r3");
        T2_r3_r2.put(T2_col2,"r2");
        T2_r3_r2.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r3_r2);

        ContentValues T2_r3_r1 = new ContentValues();
        T2_r3_r1.put(T2_col1,"r3");
        T2_r3_r1.put(T2_col2,"r1");
        T2_r3_r1.put(T2_col3,3);
        db.insert(TABLE_NAME2,null,T2_r3_r1);
    }
}
