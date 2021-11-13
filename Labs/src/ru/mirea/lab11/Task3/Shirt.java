package ru.mirea.lab11.Task3;

public class Shirt {
    private String shirtId;
    private String shirtName;
    private String shirtColor;
    private String shirtSize;
    public Shirt(String data)
    {
        String[] buff;
        buff = data.split(",");
        shirtId = buff[0];
        shirtName = buff[1];
        shirtColor = buff[2];
        shirtSize = buff[3];

    }
    public String toString()
    {
        return shirtId+"\n"+shirtName+"\n"+shirtColor+"\n"+shirtSize;
    }
}
