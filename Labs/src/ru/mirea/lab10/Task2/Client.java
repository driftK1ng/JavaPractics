package ru.mirea.lab10.Task2;

public class Client{
    private Chair chair;
    public void sit() {
        chair.sit();
    }
    public void setChair(Chair chair)
    {
        this.chair=chair;
    }
}
