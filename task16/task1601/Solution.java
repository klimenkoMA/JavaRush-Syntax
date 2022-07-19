package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник:)
*/

public class Solution {

    static Date birthDate = new Date(82,0,20);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        String dayOfWeek;
        switch(date.getDay()) {
            case 0 -> dayOfWeek = "Воскресенье";
            case 1 -> dayOfWeek ="Понедельник";
            case 2 -> dayOfWeek ="Вторник";
            case 3 -> dayOfWeek ="Среда";
            case 4 -> dayOfWeek ="Четверг";
            case 5 -> dayOfWeek ="Пятница";
            case 6 -> dayOfWeek ="Суббота";
            default -> throw new IllegalStateException("Unexpected value: " + date.getDay());
        }

        return dayOfWeek;
    }
}
