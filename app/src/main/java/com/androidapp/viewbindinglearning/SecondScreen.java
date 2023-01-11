package com.androidapp.viewbindinglearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidapp.viewbindinglearning.databinding.ActivitySecondScreenBinding;

public class SecondScreen extends AppCompatActivity {

    ActivitySecondScreenBinding activitySecondScreenBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 activitySecondScreenBinding = ActivitySecondScreenBinding.inflate(getLayoutInflater());

 setContentView(activitySecondScreenBinding.getRoot());

 activitySecondScreenBinding.tv1.setText("Hello I am changed by view Binding");
    }
}