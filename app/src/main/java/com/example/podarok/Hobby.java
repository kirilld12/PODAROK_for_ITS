package com.example.podarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hobby extends AppCompatActivity {
    Button buttonActiveHobby, buttonPassive,buttonFishingHunt,buttonTravelling,buttonCooking,buttonReading,buttonCreative, buttonSportGames;
    TextView textViewHobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);
        buttonActiveHobby = findViewById(R.id.buttonActiveHobby);
        buttonPassive = findViewById(R.id.buttonPassive);
        buttonFishingHunt = findViewById(R.id.buttonFishingHunt);
        buttonTravelling = findViewById(R.id.buttonTravelling);
        buttonCooking = findViewById(R.id.buttonCooking);
        buttonReading = findViewById(R.id.buttonReading);
        buttonCreative = findViewById(R.id.buttonCreative);
        buttonSportGames = findViewById(R.id.buttonSportGames);
        textViewHobby = findViewById(R.id.textViewHobby);

        buttonActiveHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonPassive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonFishingHunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonTravelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonCreative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });
        buttonSportGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hobby.this, FinalActivity.class);
                startActivity(i);
            }
        });


    }
}
