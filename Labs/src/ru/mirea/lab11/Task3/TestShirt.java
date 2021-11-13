package ru.mirea.lab11.Task3;

public class TestShirt {
    public static void main(String[] args)
    {
        String[] array = new String[11];
        array[0] = "S001,Black Polo Shirt,Black,XL"; 
        array[1] = "S002,Black PoloShirt,Black,L";
        array[2] = "S003,Blue Polo Shirt,Blue,XL"; 
        array[3] = "S004,Blue Polo Shirt,Blue,M"; 
        array[4] = "S005,Tan Polo Shirt,Tan,XL"; 
        array[5] = "S006,Black T-Shirt,Black,XL";
        array[6] = "S007,White T- Shirt,White,XL"; 
        array[7] = "S008,White T-Shirt,White,L";
        array[8] = "S009,Green T-Shirt,Green,S"; 
        array[9] = "S010,Orange T-Shirt,Orange,S"; 
        array[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirtData = new Shirt[11];
        int i = 0;
        for (String list : array)
        {
            shirtData[i]=new Shirt(list);
            i++;
        }
        for (Shirt obj : shirtData)
        {
            System.out.println(obj.toString());
            System.out.println("///");
        }
    }
}
