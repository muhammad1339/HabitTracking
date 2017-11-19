package com.proprog.habittracking.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.proprog.habittracking.data.HabitContract;
import com.proprog.habittracking.data.HabitHelper;
import com.proprog.habittracking.data.HabitContract.HabitEntry;

/**
 * Created by mohamedAHMED on 2017-11-19.
 */

public class HabitModel {
    private Context context;
    private HabitHelper habitHelper;
    private SQLiteDatabase database;

    public HabitModel(Context context) {
        this.context = context;
        habitHelper = new HabitHelper(context);
        database = habitHelper.getWritableDatabase();
    }

    public void insertHabit(Habit habit) {
        String name = habit.getName();
        String day = habit.getDayOfWeek();
        int isDone = habit.getHabitIsDone();

        ContentValues contentValues = new ContentValues();
        contentValues.put(HabitEntry.COLUMN_NAME, name);
        contentValues.put(HabitEntry.COLUMN_DAY_OF_WEAK, day);
        contentValues.put(HabitEntry.COLUMN_HABIT_IS_DONE, isDone);

        database.insert(HabitEntry.TABLE_NAME, null, contentValues);
    }

    public Habit readSingleHabit(int habitID) {
        Habit habit = null;
        Cursor cursor = database.query(HabitEntry.TABLE_NAME
                , new String[]{HabitEntry.COLUMN_NAME, HabitEntry.COLUMN_DAY_OF_WEAK, HabitEntry.COLUMN_HABIT_IS_DONE}
                , HabitEntry._ID + "=?"
                , new String[]{String.valueOf(habitID)}
                , null, null, null);
        if (cursor.moveToFirst()) {
            String name = cursor.getString(0);
            String day = cursor.getString(1);
            int isDone = cursor.getInt(2);
            habit = new Habit(name, day, isDone);
        }
        return habit;
    }
}
