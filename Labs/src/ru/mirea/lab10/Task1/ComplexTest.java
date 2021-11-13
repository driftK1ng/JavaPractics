package ru.mirea.lab10.Task1;

public class ComplexTest
{
    public static void main(String[] args)
    {
        ConcreteFactory Number=new ConcreteFactory();
        Number.CreateComplex(2,5);
        System.out.println(Number.toString());
        Number.CreateComplex(5,1);
        System.out.println(Number.toString());
    }

}
