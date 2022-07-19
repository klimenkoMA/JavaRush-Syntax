package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1982, Calendar.JANUARY,20);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        String dayOfWeek;
        switch(calendar.get(Calendar.DAY_OF_WEEK)){
            case 1 -> dayOfWeek = "Воскресенье";
            case 2 -> dayOfWeek = "Понедельник";
            case 3 -> dayOfWeek = "Вторник";
            case 4 -> dayOfWeek = "Среда";
            case 5 -> dayOfWeek = "Четверг";
            case 6 -> dayOfWeek = "Пятница";
            case 7 -> dayOfWeek = "Суббота";
                default -> dayOfWeek = "Непонятная хрень";
        }

        return dayOfWeek;
    }
}
