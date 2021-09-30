// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				15/11/20
// Purpose :            Prints the number of characters in a users name when it is entered 
import java.util.Scanner;

public class jlab4_3
{
    public static void main(String args[])
    {
        Scanner username = new Scanner(System.in);

        String name;
        int nameLength;

        System.out.println("Please enter you full name here");
        System.out.print("-->");
        
        
        name = username.nextLine();
        nameLength = name.length();
        nameLength = nameLength - 1;
        System.out.println("There are " + nameLength + " Characters in your name!");
             
        username.close();
        
    }    
}

