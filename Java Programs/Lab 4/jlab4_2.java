// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				14/11/20
// Purpose :            Prints the users first name when their full name is entered 
import java.util.Scanner;

public class jlab4_2 
{
    public static void main(String args[])
    {
        Scanner username = new Scanner(System.in);

        String name;
        String firstName;
        //String surname;
        int spacePosition;

        System.out.println("Please enter you full name here");
        System.out.print("-->");
        
        name = username.nextLine();
        spacePosition = name.indexOf(" ");
        firstName = name.substring(0, spacePosition);
        System.out.println("Your surname is " + firstName + "!");      
        
        username.close();
        
    }    
}

