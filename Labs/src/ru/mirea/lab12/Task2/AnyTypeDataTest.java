package ru.mirea.lab12.Task2;

public class AnyTypeDataTest {
    public static void main(String[]args)
    {
        String[] data = {"One","Two","Three","Four"};
        AnyTypeData<String> buffer = new AnyTypeData<String>(data);
        buffer.showArray();
        System.out.println(buffer.getElement(3));
    }
}
