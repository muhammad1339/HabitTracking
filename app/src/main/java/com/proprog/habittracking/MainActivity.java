package com.proprog.habittracking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.proprog.habittracking.data.HabitContract;
import com.proprog.habittracking.model.Habit;
import com.proprog.habittracking.model.HabitModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
