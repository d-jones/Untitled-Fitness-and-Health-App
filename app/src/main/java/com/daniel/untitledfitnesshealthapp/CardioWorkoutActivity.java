package com.daniel.untitledfitnesshealthapp;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

/**
 * Created by Daniel on 8/29/2016.
 */
public class CardioWorkoutActivity extends Activity implements View.OnClickListener{
    private boolean running = false;
    private Button startStopButton;
    private Button resetButton;
    private Chronometer stopwatch;

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.startStopButton){

        }
    }
}
