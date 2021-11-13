package ru.mirea.lab12.Task2;

public class AnyTypeData<E> {
    private E[] array;
    public  AnyTypeData(E[] array)
    {
        this.array=array;
    }
    public void showArray()
    {
        for (E buff : array)
        {
            System.out.println(buff);
        }
    }
    public E getElement(int index)
    {
        return array[index];
    }
}
