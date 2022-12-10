package com.example.trafficlight;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void red(View view){
        ImageView trafficlight = (ImageView) findViewById(R.id.trafficlight);
        trafficlight.setImageResource(R.drawable.light_red);
    }
    public void yellow(View view){
        ImageView trafficlight = (ImageView) findViewById(R.id.trafficlight);
        trafficlight.setImageResource(R.drawable.light_yellow);
    }
    public void green(View view){
        ImageView trafficlight = (ImageView) findViewById(R.id.trafficlight);
        trafficlight.setImageResource(R.drawable.light_green);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}