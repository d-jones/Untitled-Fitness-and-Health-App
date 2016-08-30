package com.daniel.untitledfitnesshealthapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class FirstTimeActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time);

        createButton = (Button)findViewById(R.id.create_profile_button);
        createButton.setOnClickListener(this);
        Switch unitSwitch = (Switch)findViewById(R.id.unit_switch);
        unitSwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton button, boolean isClicked){
        EditText height1Text = (EditText)findViewById(R.id.user_height1);
        TextInputLayout heightLabel1 = (TextInputLayout)height1Text.getParent();

        EditText height2Text = (EditText)findViewById(R.id.user_height2);
        TextInputLayout heightLabel2 = (TextInputLayout)height2Text.getParent();

        EditText weightText = (EditText)findViewById(R.id.user_weight);
        TextInputLayout weightLabel = (TextInputLayout)weightText.getParent();

        if(isClicked){
            heightLabel1.setHint("Height (m.)");
            heightLabel2.setHint("Height (cm.)");
            weightLabel.setHint("Weight (kg.)");
        }
        else{
            heightLabel1.setHint("Height (ft.)");
            heightLabel2.setHint("Height (in.)");
            weightLabel.setHint("Weight (lbs.)");
        }
    }


    @Override
    public void onClick(View v){
        if(v.getId() == R.id.create_profile_button){
            Intent myIntent = new Intent(FirstTimeActivity.this, MainActivity.class);
            startActivity(myIntent);
        }
    }
}
