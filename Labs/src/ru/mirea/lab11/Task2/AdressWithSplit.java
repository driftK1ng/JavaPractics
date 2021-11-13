package ru.mirea.lab11.Task2;

import java.util.HashMap;

public class AdressWithSplit {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String part;
    private String number;
    public AdressWithSplit(String data)
    {
        String[] array = data.split(",");
        country=array[0];
        region=array[1];
        city=array[2];
        street=array[3];
        house=array[4];
        part=array[5];
        number=array[6];
    }
    public String toString()
    {
        return country+"\n"+region+"\n"+city+"\n"+street+"\n"+house+"\n"+part+"\n"+number;
    }
}
