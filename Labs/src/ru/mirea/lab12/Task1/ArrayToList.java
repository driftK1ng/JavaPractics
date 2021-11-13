package ru.mirea.lab12.Task1;

import java.util.ArrayList;

public class ArrayToList {
    public static <E> void toList(E[] a, ArrayList<E> lst)
    {
        for (E e : a)
        {
            lst.add(e);
        }
    }
}
