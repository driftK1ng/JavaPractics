package ru.mirea.lab3.AbstractClass;

public class Circle extends Shape {
    protected double radius;
    public Circle()
    {
        this.radius=1;
        this.color="Red";
        this.filled=false;
    }
    public Circle(double inputRadius)
    {
        this.radius=inputRadius;
        this.color="Red";
        this.filled=false;
    }
    public Circle(double inputRadius,String inputColor, boolean inputFilled)
    {
        this.radius=inputRadius;
        this.color=inputColor;
        this.filled=inputFilled;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double inputRadius)
    {
        this.radius=inputRadius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString()
    {
        return  "Shape: Circle | Radius: "+this.radius+", | Color: "+this.color;
    }
}
