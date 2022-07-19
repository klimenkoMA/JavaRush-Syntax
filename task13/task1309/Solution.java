package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("dfdf", 15.0);
        grades.put("dferer", 15.0);
        grades.put("dfrtyty", 15.0);
        grades.put("dfytuujj", 15.0);
        grades.put("dfdfdgdfhhjjj", 15.0);
    }
}
