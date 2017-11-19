package com.proprog.habittracking.model;

/**
 * Created by mohamedAHMED on 2017-11-19.
 */

public class Habit {
    private String name;
    private String dayOfWeek;
    // 0 for skipped habit, 1 habit is done
    private int habitIsDone;

    public Habit(String name, String dayOfWeek, int habitIsDone) {
        this.name = name;
        this.dayOfWeek = dayOfWeek;
        this.habitIsDone = habitIsDone;
    }

    public String getName() {
        return name;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getHabitIsDone() {
        return habitIsDone;
    }
}
