package ru.mirea.lab3.AbstractClass;

public class Rectangle extends Shape {
    protected double width, length;
    public Rectangle()
    {
        this.width=1;
        this.length=2;
        this.color="Gray";
        this.filled=false;
    }
    public Rectangle(double inputWidth, double inputLength)
    {
        this.width=inputWidth;
        this.length=inputLength;
        this.color="Gray";
        this.filled=false;
    }
    public Rectangle(double inputWidth, double inputLength, String inputColor, boolean inputFilled)
    {
        this.width=inputWidth;
        this.length=inputLength;
        this.color=inputColor;
        this.filled=inputFilled;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setWidth(double inputWidth)
    {
        this.width=inputWidth;
    }
    public void setLength(double inputLength)
    {
        this.length=inputLength;
    }
    @Override
    public double getArea()
    {
        return this.length*this.length;
    }
    @Override
    public double getPerimeter()
    {
        return this.length*2+this.width*2;
    }
    @Override
    public String toString()
    {
        return "Shape: Rectangle | Width = "+ this.width+ "| Length = "+this.length+ "| Color = "+ this.color;
    }
}
