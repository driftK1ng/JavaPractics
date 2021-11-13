package ru.mirea.lab11.Task4;

import java.util.ArrayList;

public class NumberScan {
    private String regionCode;
    private String firstCase;
    private String secondCase;
    private String thirdCase;
    NumberScan(String data) {
        int buff;
        int start;
        if (data.startsWith("+")) {
            start = 1;
        } else {
            start = 0;
        }
        String buffer = "";
        buff = data.length() - 10;
        System.out.println(buff);
        char[] array = data.toCharArray();
        for (int i = start; i < buff; i++) {
            buffer += array[i];
        }
        this.regionCode = buffer;
        buffer = "";
        for (int i = buff; i < buff + 3; i++) {
            buffer += array[i];
        }
        this.firstCase = buffer;
        buffer = "";
        for (int i = buff + 3; i < buff + 6; i++) {
            buffer += array[i];
        }
        this.secondCase = buffer;
        buffer = "";
        System.out.println(firstCase);
        System.out.println(secondCase);
        for (int i = buff + 6; i < buff + 10; i++) {
            buffer += array[i];
        }
        this.thirdCase = buffer;
    }
    public String toString()
    {
        return "+"+regionCode+"-"+firstCase+"-"+secondCase+"-"+thirdCase;
    }
}
