package com.kotdroid.populationcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // declaring variables

    private static final int SECOND_IN_YEAR = 365*24*60*60;
    EditText etCurrentP,et1BabyInSec,et1DeathInSec,et1MigrantInSec,etPeriod;
    TextView tvResult;
    Button btnCalculate;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing variables
         etCurrentP = findViewById(R.id.etCurrentP);
         et1BabyInSec = findViewById(R.id.et1BabyInSec);
         et1DeathInSec = findViewById(R.id.et1DeathInSec);
         et1MigrantInSec = findViewById(R.id.et1MigrantInSec);
         etPeriod = findViewById(R.id.etPeriod);
         tvResult = findViewById(R.id.tvResult);
         btnCalculate = findViewById(R.id.btnCalculate);

         /// set on click listener
         btnCalculate.setOnClickListener(this);



    }

    void calculatePopulation(){

        String currentP = etCurrentP.getText().toString();
        String oneBabyInSec=et1BabyInSec.getText().toString();
        String oneDeathInSec=et1DeathInSec.getText().toString();
        String oneMigrantInSec=et1MigrantInSec.getText().toString();
        String period =etPeriod.getText().toString();

        long currentPopulation = Long.parseLong(currentP);
        int birthRate = Integer.parseInt(oneBabyInSec);
        int deathRate = Integer.parseInt(oneDeathInSec);
        int migrantRate = Integer.parseInt(oneMigrantInSec);
        int periodInYear = Integer.parseInt(period);

        long totalSecIn5Year = SECOND_IN_YEAR*periodInYear;

        long totalNew = totalSecIn5Year/birthRate + totalSecIn5Year/migrantRate;
        long death = totalSecIn5Year/deathRate;


        long futurePopulation = currentPopulation+totalNew-death;

        tvResult.setText("Total Population after 5 Years :" +futurePopulation);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        //calculatePopulation();
    }
}
