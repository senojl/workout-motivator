package com.example.senojl.calendardemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;

    SharedPreferences sharedPreferences = getPreferences(WorkoutActivity.MODE_PRIVATE);

    String weight = sharedPreferences.getString("Weight","");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView) findViewById(R.id.CalendarView);


    }

    public void workoutEntry(View view) {
        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);
    }

}

