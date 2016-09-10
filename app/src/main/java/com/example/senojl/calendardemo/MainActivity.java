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
    TextView enteredWeight;
    TextView enteredSquats;
    TextView enteredSquatPresses;
    TextView enteredRows;
    TextView enteredSwings;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView) findViewById(R.id.CalendarView);
        enteredWeight = (TextView) findViewById(R.id.EnteredWeight);
        enteredSquats = (TextView) findViewById(R.id.EnteredSquats);
        enteredSquatPresses = (TextView) findViewById(R.id.EnteredSquatPresses);
        enteredRows = (TextView) findViewById(R.id.EnteredRows);
        enteredSwings = (TextView) findViewById(R.id.EnteredSwings);

        getSharedPreferences("default", MODE_PRIVATE);

        sharedPreferences = getSharedPreferences("default", MODE_PRIVATE);

    }

    @Override
    protected void onResume() {
        super.onResume();

        String weight = sharedPreferences.getString(WorkoutActivity.Weight, "");
        String squats = sharedPreferences.getString(WorkoutActivity.Squats, "");
        String squatPresses = sharedPreferences.getString(WorkoutActivity.SquatPresses, "");
        String rows = sharedPreferences.getString(WorkoutActivity.Rows, "");
        String swings = sharedPreferences.getString(WorkoutActivity.Swings, "");

        enteredWeight.setText(weight);
        enteredSquats.setText(squats);
        enteredSquatPresses.setText(squatPresses);
        enteredRows.setText(rows);
        enteredSwings.setText(swings);
    }

    public void workoutEntry(View view) {
        Intent intent = new Intent(this, WorkoutActivity.class);
        intent.putExtra("date", calendarView.getDate());
        startActivity(intent);
    }

}

