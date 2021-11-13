package ru.mirea.lab12.Task1;

import java.util.ArrayList;

public class ArrayToListTest {
    public static void main(String[] args)
    {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Integer[] numbers={123,412,111,2,0,3,5};
        ArrayToList.toList(numbers,lst);
        for (Integer i : lst)
        {
            System.out.println(i);
        }
    }

}
