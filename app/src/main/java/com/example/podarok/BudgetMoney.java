package com.example.podarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class BudgetMoney extends AppCompatActivity {
    TextView textViewBudget;
    Button button0Rub,button1000Rub,button5000Rub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_money);
        textViewBudget = findViewById(R.id.textViewMain);
        button0Rub = findViewById(R.id.button0Rub);
        button1000Rub = findViewById(R.id.button1000Rub);
        button5000Rub =findViewById(R.id.button5000Rub);
        Intent in = getIntent();


        button0Rub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BudgetMoney.this, Hobby.class);
                startActivity(i);
            }
        });
        button1000Rub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BudgetMoney.this, Hobby.class);
                startActivity(i);
            }
        });
        button5000Rub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BudgetMoney.this, Hobby.class);
                startActivity(i);
            }
        });

    }
}