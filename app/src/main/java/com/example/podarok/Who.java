package com.example.podarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Who extends AppCompatActivity {

    Button buttonMum, buttonBrother, buttonGrandMother, buttonDad, buttonSister, buttonGrandFather, buttonDada, buttonZhena, buttonTeta, buttonMuzh, buttonPrimarySchool, buttonOtherPeople, buttonPensioner, buttonSchool, buttonStudent, buttonWorker;
    TextView textViewWho;

    public static SharedPreferences sharedWho;
    public String who = "who";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);
        buttonMum = findViewById(R.id.buttonMum);
        buttonBrother = findViewById(R.id.buttonBrother);
        buttonGrandMother = findViewById(R.id.buttonGrandMother);
        buttonDad = findViewById(R.id.buttonDad);
        buttonSister = findViewById(R.id.buttonSister);
        buttonGrandFather = findViewById(R.id.buttonGrandFather);
        buttonDada = findViewById(R.id.buttonDada);
        buttonZhena = findViewById(R.id.buttonZhena);
        buttonTeta = findViewById(R.id.buttonTeta);
        buttonMuzh = findViewById(R.id.buttonMuzh);
        buttonPrimarySchool = findViewById(R.id.buttonPrimarySchool);
        buttonOtherPeople = findViewById(R.id.buttonOtherPeople);
        buttonPensioner = findViewById(R.id.buttonPensioner);
        buttonSchool = findViewById(R.id.buttonSchool);
        buttonStudent = findViewById(R.id.buttonStudent);
        buttonWorker = findViewById(R.id.buttonWorker);
        textViewWho = findViewById(R.id.textViewWho);
        class TreeAndHashMapExample {
        private void testMap(Map<String, Integer> who) {
            who.put("Mum", 0);
            who.put("Brother", 1);
            who.put("GrandMother", 2);
            for (Map.Entry<String, Integer> entry : who.entrySet()) {
                entry.getKey();
                entry.getValue();
            }}}

        buttonMum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);

            }
        });

        buttonBrother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });

        buttonGrandMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonDad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonSister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonGrandFather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonDada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonZhena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonTeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonMuzh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonPrimarySchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonOtherPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });

        buttonPensioner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });
        buttonWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Who.this, BudgetMoney.class);
                startActivity(i);
            }
        });

    }
}
