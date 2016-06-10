package com.example.senojl.calendardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;


public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

    }

    Intent intent = getIntent();
}