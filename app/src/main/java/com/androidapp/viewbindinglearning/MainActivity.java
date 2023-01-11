package com.androidapp.viewbindinglearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.viewbinding.ViewBindings;

import com.androidapp.viewbindinglearning.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Attach Binding class to this java file
    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        //Calling textview directly without creating any reference like find view by id
        mainBinding.t1.setText("Hello this is First Screen");
        mainBinding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondScreen.class);
                startActivity(intent);
            }
        });
    }
}