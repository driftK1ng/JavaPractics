package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author a1= new Author("Andrew","Andrew@email.com",'M');
        System.out.println("=========TEST=========");
        System.out.println("TestName: "+a1.getName());
        System.out.println("TestEmail: "+a1.getEmail());
        System.out.println("TestGender: "+a1.getGender());
        System.out.println("=========OUTPUT=========");
        a1.setEmail("NotAndrew@email.com");
        System.out.println(a1);
    }
}
