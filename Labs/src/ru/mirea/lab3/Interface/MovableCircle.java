package ru.mirea.lab3.Interface;

public class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    private MovablePoint center=new MovablePoint();
    public MovableCircle(int inputX, int inputY,int inputXSpeed, int inputYSpeed,int radius)
    {
        center.x=inputX;
        center.y=inputY;
        center.xSpeed=inputXSpeed;
        center.ySpeed=inputYSpeed;
        this.radius=radius;
    }
    public String toString()
    {
        return "Центр окружности "+center+"\nРадиус окружности: "+radius;
    }
}
