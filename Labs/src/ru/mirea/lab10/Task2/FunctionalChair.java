package ru.mirea.lab10.Task2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public void sit()
    {
        System.out.println("Functional Chair");
    }
}
