package ru.mirea.lab1;

public class Test {
    public static void main (String[] args)
    {
        //Тесты для класса мяч
        Ball b1 = new Ball("Yellow",15,"Volleyball");
        Ball b2 = new Ball("Red",20);
        b2.setGame("Football");
        System.out.println(b1);
        System.out.println(b1.output());
        System.out.println(b2.output());
        System.out.println("=========================================================");

        //Тесты для класса книга
        Book c1 = new Book("Какой-то автор", "Какое-то название", 150);
        Book c2 = new Book(160);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("=========================================================");


        //Тесты для класса собака
        Dog d1 = new Dog ("Valera",3);
        Dog d2 = new Dog (4);
        Dog d3 = new Dog ("Mike");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d2.setName("Jasper");
        d3.setAge(5);
        System.out.print(d1+" ");
        d1.intoHumanAge();
        System.out.print(d2+" ");
        d2.intoHumanAge();
        System.out.print(d3+" ");
        d3.intoHumanAge();
    }

}
