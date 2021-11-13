package ru.mirea.lab10.Task2;

public class ChairFactory implements AbctractChairFactory {
    public VictorianChair createVictorianChair()
    {
        return new VictorianChair(0);
    }
    public MagicianChair createMagicianChair()
    {
        return new MagicianChair();
    }
    public FunctionalChair createFunctionalChair()
    {
        return new FunctionalChair();
    }
}
