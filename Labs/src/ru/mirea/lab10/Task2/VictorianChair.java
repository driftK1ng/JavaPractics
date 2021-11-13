package ru.mirea.lab10.Task2;

public class VictorianChair implements Chair {
    private int age;
    public int getAge(){return this.age;}
    public VictorianChair(int age)
    {
        this.age=age;
    }
    public void sit()
    {
        System.out.println("Victorian Chair");
    }
}
