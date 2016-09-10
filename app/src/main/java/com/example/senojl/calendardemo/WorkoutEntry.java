package com.example.senojl.calendardemo;


/**
 * Created by lorajones on 6/28/16.
 */
public class WorkoutEntry {

    public String Weight = "WeightUsed";
    public String Squats ="Squats";
    public String SquatPresses = "SquatPresses";
    public String Rows = "Rows";
    public String Swings = "Swings";

    public WorkoutEntry(String weight, String squats, String squatPresses, String rows, String swings) {
        Weight = weight;
        Squats = squats;
        SquatPresses = squatPresses;
        Rows = rows;
        Swings = swings;
    }
}
