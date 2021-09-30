// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				18/11/20
// Purpose :            A program to print the amount of uppercase characters in the users name
import java.util.Scanner;

public class jlab4_4
{
    public static void main(String args[])
    {
        Scanner username = new Scanner(System.in);

        String name;
        String firstName; 
        String lastName;       
        int spacePosition;
        int numberUppercase;
        char firstChar;
        char secondChar;

        System.out.println("Please enter your first and surname name here");
        System.out.print("-->");
        
        name = username.nextLine();
        spacePosition = name.indexOf(" ");                  


        firstName = name.substring(0, spacePosition);                          
        lastName = name.substring(spacePosition + 1);
        firstChar = firstName.charAt(0);     
        secondChar = lastName.charAt(0);    

        numberUppercase = 0;      
        
        if(Character.isUpperCase(firstChar));
            {
                numberUppercase ++;
            }

        if(Character.isUpperCase(secondChar))
            {
                numberUppercase ++;
            }

        System.out.println("The amount of uppercase characters in your name is " + numberUppercase);      
        
        username.close();
        
    }    
}
