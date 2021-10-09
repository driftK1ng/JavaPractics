package ru.mirea.lab2;

public class TestBall {
    public static void main(String args[])
    {
        Ball b1 = new Ball(1.2,1.4);
        Ball b2 = new Ball();
        System.out.println("=========TEST=========");
        System.out.println("1 мяч - ("+b1.getX()+" , "+b1.getY()+")");
        System.out.println("2 мяч - ("+b2.getX()+" , "+b2.getY()+")");
        b2.setX(2.5);
        b2.setY(4.1);
        b1.setXY(7.5,8.9);
        System.out.println("=========OUTPUT=========");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
