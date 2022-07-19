package com.javarush.task.pro.task15.task1521;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
        URL url = new URL(line);
        try(InputStream inputStream = url.openStream()) {
            byte[] buffer = inputStream.readAllBytes();
            Path temp = Files.createTempFile(null, null);
            Files.write(temp, buffer);
        }catch(Exception e){/**/}

//        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//            BufferedWriter bufferedWriter = new BufferedWriter(new)){}
//        catch(Exception e){/**/}
    }
}