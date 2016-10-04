package com.example.jinhyoung.gplannerforgear;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by JinHyoung on 2016-10-03.
 */
public class CreateItem extends Activity {
    private GPlannerDBHelper mDBHelper;
    private SQLiteDatabase mDB;
    public Button insert;
    public EditText insert_Year;
    public EditText insert_Month;
    public EditText insert_Day;
    public EditText insert_Time;
    public EditText insert_Title;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_db_item);
        GPlannerInit();

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String year = insert_Year.getText().toString().trim();
                String month = insert_Month.getText().toString().trim();
                String day = insert_Day.getText().toString().trim();
                String time = insert_Time.getText().toString().trim();
                String title = insert_Title.getText().toString();

                if( mDBHelper == null ) {
                    mDBHelper = new GPlannerDBHelper(getApplicationContext(),"GPlannerDB1", null , 1);
                }
                mDB = mDBHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("YEAR", year);
                values.put("DAY", day);
                values.put("TIME", time);
                values.put("TITLE", title);
                mDB.insert("SaveTable"+month, null, values);
                Toast.makeText(getApplicationContext(), "Insert 완료", Toast.LENGTH_SHORT).show();
                mDB.close();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void GPlannerInit(){
        // Intent로 값을 받아온다.
        Intent intent = getIntent();
        String year_get = intent.getStringExtra("year");
        String month_get = intent.getStringExtra("month");
        String day_get = intent.getStringExtra("day");

        insert_Year = (EditText) findViewById(R.id.db_year);
        insert_Year.setText(year_get);
        insert_Month = (EditText) findViewById(R.id.db_month);
        insert_Month.setText(month_get);
        insert_Day = (EditText) findViewById(R.id.db_day);
        insert_Day.setText(day_get);
        insert_Time = (EditText) findViewById(R.id.db_time);
        insert_Title = (EditText) findViewById(R.id.db_title);
        insert = (Button) findViewById(R.id.insert);
    }


}