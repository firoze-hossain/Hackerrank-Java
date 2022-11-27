package com.hack.introduction.javaDateAndTime;

import java.io.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        String result = Result.findDay(month, day, year);
        System.out.println(result);
        sc.close();
    }
}

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;
    }
}
