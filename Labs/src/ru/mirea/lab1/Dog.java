package ru.mirea.lab1;

public class Dog
{
    private String name;
    private int age;
    public Dog (String inputName, int inputAge )
    {
        name=inputName;
        age=inputAge;
    }
    public Dog(String inputName)
    {
        name=inputName;
        age=0;
    }
    public Dog(int inputAge)
    {
        age=inputAge;
        name="Unknown";
    }
    public Dog()
    {
        age=0;
        name="Unknown";
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String toString()
    {
        return this.name+",  age "+this.age;
    }
    public void intoHumanAge()
    {
        System.out.println(name+"'s in human years is "+age*7+" years");
    }
}
