package ru.mirea.lab11.Task2;

import java.util.StringTokenizer;

public class AdressWithTokenizer {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String part;
    private String number;

    public AdressWithTokenizer(String data)
    {
        StringTokenizer tokenizer = new StringTokenizer(data,",.;-");
        int counter=0;
        String token = tokenizer.nextToken();
        country=token;
        token = tokenizer.nextToken();
        region=token;
        token = tokenizer.nextToken();
        city=token;
        token = tokenizer.nextToken();
        street=token;
        token = tokenizer.nextToken();
        house=token;
        token = tokenizer.nextToken();
        part=token;
        token = tokenizer.nextToken();
        number=token;

    }
    public String toString()
    {
        return country+"\n"+region+"\n"+city+"\n"+street+"\n"+house+"\n"+part+"\n"+number;
    }
}
