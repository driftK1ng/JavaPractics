package ru.mirea.lab3.Interface;


public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint ()
    {
        this.x=1;
        this.y=1;
        this.xSpeed=1;
        this.ySpeed=1;
    }
    MovablePoint (int inputX, int inputY,int inputXSpeed, int inputYSpeed)
    {
        this.x=inputX;
        this.y=inputY;
        this.ySpeed=inputYSpeed;
        this.xSpeed=inputXSpeed;
    }
    public String toString()
    {
        return "Точка \nКоордината по Х: "+this.x+"\nКоордината по Y: "+this.y+"\nСкорость по X: "+this.xSpeed+"\nСкорость по Y: "+this.ySpeed;
    }
    public void moveRight()
    {
        this.x+=this.xSpeed;
    }
    public void moveLeft()
    {
        this.x-=this.xSpeed;
    }
    public void moveUp()
    {
        this.y+=this.ySpeed;
    }
    public void moveDown()
    {
        this.y-=this.ySpeed;
    }

}
