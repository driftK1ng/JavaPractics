package ru.mirea.lab1;

public class Book {
    private int sheets;
    private String author;
    private String name;

    public Book(String inputAuthor,String inputName,int inputSheets)
    {
        author=inputAuthor;
        name=inputName;
        sheets=inputSheets;
    }
    public Book(int inputSheets)
    {
        this.author="Неизвестно";
        this.name="Неизвестно";
        this.sheets=inputSheets;
    }
    public void setName(String inputName)
    {
        this.name=inputName;
    }
    public void setAuthor(String inputAuthor)
    {
        this.author=inputAuthor;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getName()
    {
        return name;
    }
    public int getSheets()
    {
        return sheets;
    }

    public String toString()
    {
        return "Книга:\nНазвание книги: "+name+"\nАвтор книги: "+author+"\nКоличество страниц: "+sheets;
    }
}
