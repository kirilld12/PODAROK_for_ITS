package com.example.podarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import static com.example.podarok.DataBase.COLUMN_ID;
import static com.example.podarok.DataBase.TABLE_NAME;

public class FinalActivity extends AppCompatActivity {
    TextView textViewFinalFirst, textViewFinalMiddle, textViewFinalEnd;
    Button select;


    private DataBase dataBase;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        dataBase = new DataBase(this);
        db = dataBase.getWritableDatabase();

        select = findViewById(R.id.select);
        textViewFinalFirst = findViewById(R.id.textViewFinalFirst);
        textViewFinalMiddle = findViewById(R.id.textViewFinalMiddle);
        textViewFinalEnd = findViewById(R.id.textViewFinalEnd);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FinalActivity.this, Hobby.class);
                startActivity(i);
            }
        });


        int min = 0;
        int max = 20;
        int diff = max - min;
        Random random = new Random();
        int num = random.nextInt(diff + 1);    //Random num

        String product = "";
        Cursor cursor = db.query(TABLE_NAME,null,null,null,null,null,null);  //пролема
        cursor.moveToFirst();

        for (int i = 0; i < num; i++ ) {
            product = cursor.getString(1);
            cursor.moveToNext();
        }
        cursor.close();

        textViewFinalEnd.setText(product);


        //код

    }
}