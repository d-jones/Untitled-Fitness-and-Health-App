package com.daniel.untitledfitnesshealthapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
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
    private long stoppedTime;

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.startStopButton){
            if(running){
                stopTimer();
            }
            else{
                startTimer();
            }
        }
    }


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_workout);
    }


    /**
     * Starts the stopwatch and changes button to
     * the stop button.
     */
    private void startTimer(){
        running = true;
        stopwatch.setBase(SystemClock.elapsedRealtime() + stoppedTime);
        stopwatch.start();

        startStopButton.setBackgroundColor(Color.parseColor("#990000"));
        startStopButton.setText(R.string.stop_button_text);
    }


    /**
     * Stops the stop watch and changes the button to
     * the start button.
     */
    private void stopTimer(){
        running = false;
        stoppedTime = (SystemClock.elapsedRealtime() - stopwatch.getBase())/1000;
        stopwatch.stop();

        startStopButton.setBackgroundColor(Color.parseColor("#009900"));
        startStopButton.setTag(R.string.start_button_text);
    }
}
