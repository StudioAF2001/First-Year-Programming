// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				11/11/20
// Purpose :            Prints the users surname then first name when their name is entered normally

import java.util.Scanner;

public class jlab4_6 
{
    public static void main(String args[])
        {
        Scanner username = new Scanner(System.in);

        String name;
        String firstName; 
        String lastName;       
        int spacePosition;
        
        System.out.println("Please enter your first and surname name here");
        System.out.print("-->");
        
        name = username.nextLine();
        spacePosition = name.indexOf(" "); 

        firstName = name.substring(0, spacePosition);                          
        lastName = name.substring(spacePosition + 1);

        System.out.print(lastName + " " + firstName);
            
        username.close();
        }
}