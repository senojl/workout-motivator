package com.example.senojl.calendardemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.os.Bundle;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class WorkoutActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4, ed5;
    Button b1;
    public static final String MyWORKOUTS = "MyWorkouts";
    public static final String Weight = "WeightUsed";
    public static final String Squats ="Squats";
    public static final String SquatPresses = "SquatPresses";
    public static final String Rows = "Rows";
    public static final String Swings = "Swings";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        sharedPreferences = getApplicationContext().getSharedPreferences(MyWORKOUTS, MODE_PRIVATE);

        ed1=(EditText)findViewById(R.id.weight_amount);
        ed2=(EditText)findViewById(R.id.squats);
        ed3=(EditText)findViewById(R.id.squat_presses);
        ed4=(EditText)findViewById(R.id.rows);
        ed5=(EditText)findViewById(R.id.swings);

        b1=(Button)findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String w = ed1.getText().toString();
                Log.d("Saved Weight","Weight: "+w);
                String sq = ed2.getText().toString();
                Log.d("Saved Squats","Squats: "+sq);
                String sqp = ed3.getText().toString();
                String r = ed4.getText().toString();
                String sw = ed5.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString(Weight, w);
                Log.d("This happened!","WRITTEN");
                editor.putString(Squats, sq);
                editor.putString(SquatPresses, sqp);
                editor.putString(Rows, r);
                editor.putString(Swings, sw);

                editor.commit();
                Log.d("This also happened!","APPLIED");

                Toast.makeText(WorkoutActivity.this, "Good job on your workout", Toast.LENGTH_SHORT).show();

            }
        });

    }
}