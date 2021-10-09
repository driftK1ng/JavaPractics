package ru.mirea.lab3.AbstractClass;

public class TestShape {
    public static void main(String[] args)
    {
        Shape n1 = new Circle(10, "Yellow",false);
        System.out.println(n1);
        Shape n2 = new Rectangle(5 , 2, "Red", true);
        System.out.println(n2);
        Shape n3 = new Square(20,"Green",true);
        System.out.println(n3);
    }

}
