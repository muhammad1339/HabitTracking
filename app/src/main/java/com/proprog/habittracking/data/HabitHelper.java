package com.proprog.habittracking.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.proprog.habittracking.data.HabitContract.HabitEntry;

/**
 * Created by mohamedAHMED on 2017-11-19.
 */

public class HabitHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "habitTracer.db";


    public HabitHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_HABIT_TABLE = "CREATE TABLE " + HabitEntry.TABLE_NAME + " ("
                + HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_DAY_OF_WEAK + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_HABIT_IS_DONE + " INTEGER NOT NULL);";

        sqLiteDatabase.execSQL(SQL_CREATE_HABIT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
