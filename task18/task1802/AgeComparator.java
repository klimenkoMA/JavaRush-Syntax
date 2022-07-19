package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(0, o1.getAge() - o2.getAge());
	}

	//напишите тут ваш код
}
