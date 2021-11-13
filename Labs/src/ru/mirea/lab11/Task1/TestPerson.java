package ru.mirea.lab11.Task1;

public class TestPerson {
    public static void main(String[]args)
    {
        Person me = new Person("Мельников","Дмитрий","Юрьевич");
        System.out.println(me);
        Person notMe = new Person("Мельников","Дмитрий");
        System.out.println(notMe);
        Person itsMe = new Person("Дмитрий");
        System.out.println(itsMe);
    }
}
