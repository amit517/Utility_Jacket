package com.simulation.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView about,bitcoin,currency,lbtokg,temp,weather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = (CardView) findViewById(R.id.about);
        bitcoin = findViewById(R.id.bitcoin);
        currency = findViewById(R.id.currency);
        lbtokg = findViewById(R.id.lbtokg);
        temp = findViewById(R.id.temp);
        weather= findViewById(R.id.weather);

        about.setOnClickListener(this);
        bitcoin.setOnClickListener(this);
        currency.setOnClickListener(this);
        lbtokg.setOnClickListener(this);
        temp.setOnClickListener(this);
        weather.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId())
        {
            case R.id.weather : i = new Intent(this,WeatherController.class);startActivity(i);break;
            case R.id.bitcoin : i = new Intent(this,bitcoin.class);startActivity(i);break;
            case R.id.about : i = new Intent(this,about.class);startActivity(i);break;
            case R.id.currency : i = new Intent(this,currency.class);startActivity(i);break;
            case R.id.lbtokg : i = new Intent(this,WeightConverter.class);startActivity(i);break;
            case R.id.temp : i = new Intent(this,Temperature.class);startActivity(i);break;
            default:break;


        }

    }
}
