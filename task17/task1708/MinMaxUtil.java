package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код

	public static int min(int number, int num2){
		return Math.min(number, num2);
	}
	public static int min(int number, int num2, int num3, int num4){
		return Math.min(Math.min(number, num2),Math.min( num3, num4));
	}
	public static int min(int number, int num2, int num3){
		return Math.min(Math.min(number, num2),num3);
	}
	public static int min(int number, int num5, int num2, int num3, int num4){
		return Math.min(Math.min(Math.min(number, num2),Math.min( num3, num4)), num5);
	}

	public static int max(int number, int num2){
		return Math.max(number, num2);
	}
	public static int max(int number, int num2, int num3, int num4){
		return Math.max(Math.max(number, num2),Math.max( num3, num4));
	}
	public static int max(int number, int num2, int num3){
		return Math.max(Math.max(number, num2),num3);
	}
	public static int max(int number, int num5, int num2, int num3, int num4){
		return Math.max(Math.max(Math.max(number, num2),Math.max( num3, num4)), num5);
	}

}
