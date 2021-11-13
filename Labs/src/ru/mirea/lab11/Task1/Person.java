package ru.mirea.lab11.Task1;

public class Person {
    String name;
    String surname;
    String buffer;

    public Person (String surname,String name,String buff)
    {
        this.name=name;
        this.surname=surname;
        this.buffer=buff;
    }
    public Person (String name)
    {
        this.surname=null;
        this.name=name;
        this.buffer=null;
    }
    public Person (String surname,String name)
    {
        this.surname=surname;
        this.name=name;
        this.buffer=null;
    }
    public String toString()
    {
        if (surname==null)
        {
            if (buffer == null)
            {
                return name;
            }
            else
            {
                return null;
            }
        }
        else if (buffer==null)
        {
            return surname+" "+name;
        }
        else
        {
            return surname+" "+name+" "+buffer;
        }
    }
}
