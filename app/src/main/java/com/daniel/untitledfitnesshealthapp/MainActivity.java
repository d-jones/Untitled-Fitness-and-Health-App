package com.daniel.untitledfitnesshealthapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Daniel on 8/29/2016.
 */
public class MainActivity extends Activity implements View.OnClickListener{

    private Button cardioButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardioButton = (Button)findViewById(R.id.cardio_workout_button);
        cardioButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.cardio_workout_button){
            Intent myIntent = new Intent(MainActivity.this, CardioWorkoutActivity.class);
            startActivity(myIntent);
        }
    }
}
