package ru.mirea.lab3.AbstractClass;

public class Square extends Rectangle {
    protected double side;
    Square()
    {
        this.side=1;
        this.color="Gray";
        this.filled = false;
    }
    Square(double inputSide)
    {
        this.side=inputSide;
        this.color="Gray";
        this.filled = false;
    }
    Square(double inputSide, String inputColor, boolean inputFilled)
    {
        this.side=inputSide;
        this.color=inputColor;
        this.filled = inputFilled;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double inputSide)
    {
        this.side=inputSide;
    }
    public void sync()
    {
        this.length=this.side;
        this.width=this.side;
    }
    @Override
    public void setWidth(double inputSide)
    {
        this.width=inputSide;
    }
    @Override
    public void setLength(double inputSide)
    {
        this.length=inputSide;
    }
    @Override
    public String  toString()
    {
        return "Shape: Square | Side: "+this.side+ " | Color: "+ this.color;
    }

}
