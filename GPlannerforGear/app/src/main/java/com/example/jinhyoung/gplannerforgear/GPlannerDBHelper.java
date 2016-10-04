package com.example.jinhyoung.gplannerforgear;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


/**
 * Created by JinHyoung on 2016-10-03.
 */
public class GPlannerDBHelper extends SQLiteOpenHelper {
    private SQLiteDatabase mDB;
    private Context context;
    // 테이블 생성을 위한 쿼리
    public static String sqlTable_Create01 = "CREATE TABLE SaveTable01 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create02 = "CREATE TABLE SaveTable02 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create03 = "CREATE TABLE SaveTable03 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create04 = "CREATE TABLE SaveTable04 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create05 = "CREATE TABLE SaveTable05 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create06 = "CREATE TABLE SaveTable06 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create07 = "CREATE TABLE SaveTable07 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create08 = "CREATE TABLE SaveTable08 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create09 = "CREATE TABLE SaveTable09 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create10 = "CREATE TABLE SaveTable10 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create11 = "CREATE TABLE SaveTable11 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";
    public static String sqlTable_Create12 = "CREATE TABLE SaveTable12 (" +
            "_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "YEAR text not null, " +
            "DAY text not null, " +
            "TIME text not null, " +
            "TITLE text not null ); ";

    public GPlannerDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlTable_Create01);
        db.execSQL(sqlTable_Create02);
        db.execSQL(sqlTable_Create03);
        db.execSQL(sqlTable_Create04);
        db.execSQL(sqlTable_Create05);
        db.execSQL(sqlTable_Create06);
        db.execSQL(sqlTable_Create07);
        db.execSQL(sqlTable_Create08);
        db.execSQL(sqlTable_Create09);
        db.execSQL(sqlTable_Create10);
        db.execSQL(sqlTable_Create11);
        db.execSQL(sqlTable_Create12);

        Toast.makeText(context, "Table 생성완료", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS SaveTable01 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable02 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable03 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable04 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable05 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable06 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable07 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable08 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable09 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable10 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable11 " );
        db.execSQL("DROP TABLE IF EXISTS SaveTable12 " );



        onCreate(db);
    }

    public void close(){
        mDB.close();
    }


}
