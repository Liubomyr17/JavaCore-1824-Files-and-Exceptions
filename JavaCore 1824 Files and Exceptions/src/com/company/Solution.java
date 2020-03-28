package com.company;

/*
1824 Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();

Требования:
1. Программа должна считывать имена файлов с консоли.
2. Для каждого файла нужно создавать поток для чтения.
3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
5. Потоки для чтения из файла должны быть закрыты.
6. Команду "System.exit();" использовать нельзя.

 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
public static void main(String[] args) throws IOException {
    BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
    FileInputStream file = null;
    while(true) {
        String fileName = conReader.readLine();
        try {
            file = new FileInputStream(fileName);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
            conReader.close();
            return;
        }
    }
}
}




