package ru.mirea.lab11.Task2;

public class AdressTest {
    public static void main (String[] args)
    {
        String adress="Страна,Регион,Город,Улица,Дом,Корпус,Квартира";
        System.out.println("///With split");
        AdressWithSplit myAdress=new AdressWithSplit(adress);
        System.out.println(myAdress);
        System.out.println("///");
        System.out.println("///With Tokenizer");
        AdressWithTokenizer myAdress1=new AdressWithTokenizer(adress);
        System.out.println(myAdress1);
        System.out.println("///");
    }
}
