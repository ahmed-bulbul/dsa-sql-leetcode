package com.bulbul.hackerrank.javas;

import java.io.*;
import java.util.Calendar;

public class GetDayOfWeek {

    public static void main(String[] args) throws IOException {

        int month=5,day=8,year=2015;
        String s = findDay(month,day,year);
        System.out.println(s);
    }

    private static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String[] dayofweak={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return dayofweak[calendar.get(Calendar.DAY_OF_WEEK)-1];
    }
}
