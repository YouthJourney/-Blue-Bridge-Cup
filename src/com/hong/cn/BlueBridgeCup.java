package com.hong.cn;

import java.util.Calendar;

public class BlueBridgeCup {
    public static void main(String[] args) {
        // 12月31日
        Calendar calendar = Calendar.getInstance();
        for (int year = 1999; year < 10000; year += 100) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, 11); // 表示12月
            calendar.set(Calendar.DAY_OF_MONTH, 31);

            System.out.println(year + " " + calendar.get(Calendar.DAY_OF_WEEK));

            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(year);
                break;
            }
        }
    }

}
