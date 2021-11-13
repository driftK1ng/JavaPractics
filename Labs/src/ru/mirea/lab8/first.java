package ru.mirea.lab8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class first {
    public first(int number,boolean append) {
        System.out.println("Задание "+number);
        //Вместо скобок в строке ниже вводим нужный вам путь. Переменная number
        // генерирует уникальное имя файла, переменная append Отвечает за дозапись в файл
        /* try (FileWriter writer = new FileWriter("C:\\Java\\zadanie №"+number+".txt", append)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите информацию которую хотите записать в файл");
            String input = reader.readLine();
            writer.write(input);
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
         */
        System.out.println("Выполнено");
    }
}