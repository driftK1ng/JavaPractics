package ru.mirea.lab3.Interface;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint upperLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();
    public MovableRectangle(int inputX1, int inputY1,int inputX2, int inputY2, int inputXSpeed, int inputYSpeed)
    {
        upperLeft.x=inputX1;
        upperLeft.y=inputY1;
        upperLeft.xSpeed=inputXSpeed;
        upperLeft.ySpeed=inputYSpeed;
        bottomRight.x=inputX2;
        bottomRight.y=inputY2;
        bottomRight.xSpeed=inputXSpeed;
        bottomRight.ySpeed=inputYSpeed;
    }
    public String toString()
    {
        return "Прямоугольник \n ----Первая "+upperLeft+"\n ----Вторая "+bottomRight;
    }
    public void moveUp()
    {
        upperLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown()
    {
        upperLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft()
    {
        upperLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight()
    {
        upperLeft.moveRight();
        bottomRight.moveRight();
    }
}
