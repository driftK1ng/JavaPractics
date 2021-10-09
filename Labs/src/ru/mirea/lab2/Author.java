package ru.mirea.lab2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String inputName, String inputEmail, char inputGender)
    {
        name=inputName;
        email=inputEmail;
        gender=inputGender;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String inputEmail)
    {
        email=inputEmail;
    }
    public String getGender()
    {
        if (this.gender == 'M')
        {
            return "Male";
        }
        else
        {
            return "Female";
        }
    }
    public String toString()
    {
        if (this.gender == 'F')
        {
            return "Author: " + this.name + "\nAuthor Email: " + this.email + "\nGender: Female";
        }
        else
        {
            return "Author: " + this.name + "\nAuthor Email: " + this.email + "\nGender: Male";
        }
    }
}
