package ru.mirea.lab8;

import java.io.*;
//Внимание! В классах first и second следует указать путь к файлам
public class inputFromKeyboard {
    public static void main (String[] args) throws IOException {
        first one = new first(1, false);
        second two = new second();
        first three = new first(3, false);
        first four = new first(4, true);
    }
}
