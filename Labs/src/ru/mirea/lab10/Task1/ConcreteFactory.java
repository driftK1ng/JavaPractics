package ru.mirea.lab10.Task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private int real;
    private int image;
    public ConcreteFactory(){}
    public void CreateComplex()
    {
        this.image=1;
        this.real=1;
    }
    public void CreateComplex(int real,int image)
    {
        this.image=image;
        this.real=real;
    }
    public String toString()
    {
        if(this.image<0)
        {
            return this.real+this.image+"i";
        }
        else
        {
            return this.real+"+"+this.image+"i";
        }
    }
}
