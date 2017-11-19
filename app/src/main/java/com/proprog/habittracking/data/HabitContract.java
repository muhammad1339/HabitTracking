package com.proprog.habittracking.data;

import android.provider.BaseColumns;

/**
 * Created by mohamedAHMED on 2017-11-19.
 */

public class HabitContract {
    public HabitContract() {
    }

    public static final class HabitEntry implements BaseColumns {
        public final static String TABLE_NAME = "habit";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_DAY_OF_WEAK = "day_of_weak";
        public final static String COLUMN_HABIT_IS_DONE = "habit_is_done";

        //constants to check that habit is done or not
        public static final int DONE = 1;
        public static final int SKIPPED = 0;

    }
}
