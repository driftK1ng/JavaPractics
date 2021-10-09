package ru.mirea.lab3.Interface;

public class MovableTest
{
    public static void main(String[] args)
    {
        MovablePoint point1=new MovablePoint(2,2,2,2);
        System.out.println(point1);
        MovableCircle circle1=new MovableCircle(2,2,2,4,4);
        System.out.println("==================================\n"+circle1);
        MovableRectangle rect1= new MovableRectangle(2,2,4,4,1,1);
        rect1.moveDown();
        System.out.println("==================================\n"+rect1);

    }
}
