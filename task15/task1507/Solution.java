package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        try(Scanner scanner = new Scanner(System.in)){
            String fileName = scanner.nextLine();

           List<String> inputStreamList = Files.readAllLines(Path.of(fileName));
            for(int i = 0; i < inputStreamList.size(); i++) {
               if(i%2 == 0){
                    System.out.println(inputStreamList.get(i));
                }
            }
        }
        catch(Exception e){/**/}
    }
}

