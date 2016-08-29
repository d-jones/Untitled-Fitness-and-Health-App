package com.daniel.untitledfitnesshealthapp;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}
