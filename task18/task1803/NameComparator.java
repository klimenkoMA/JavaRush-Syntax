package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
	@Override
	public int compare(JavaRushMentor o1, JavaRushMentor o2) {
		return Integer.compare(0, o2.getName().length() - o1.getName().length());
	}
	//напишите тут ваш код
}
