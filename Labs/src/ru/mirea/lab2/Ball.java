package ru.mirea.lab2;

public class Ball {
    private double x;
    private double y;
    public Ball(double inputX, double inputY)
    {
        this.x=inputX;
        this.y=inputY;
    }
    public Ball()
    {
        this.x=0.0;
        this.y=0.0;
    }
    public double getX()
    {
        return this.x;
    }
    public void setX(double inputX)
    {
        this.x=inputX;
    }
    public double getY()
    {
        return this.y;
    }
    public void setY(double inputY)
    {
        this.y=inputY;
    }
    public void setXY(double inputX,double inputY)
    {
        this.x=inputX;
        this.y=inputY;
    }
    public void move(double xDist,double yDist)
    {
        this.x+=xDist;
        this.y+=yDist;
    }
    public String toString()
    {
        return "Ball"+ "( "+this.x+" , "+this.y+" )";
    }
}
