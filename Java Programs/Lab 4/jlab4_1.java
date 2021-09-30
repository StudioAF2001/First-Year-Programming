// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				12/11/20
// Purpose :            Prints the users surname when their full name is entered 
import java.util.Scanner;

public class jlab4_1 
{
    public static void main(String args[])
    {
        Scanner username = new Scanner(System.in);

        String name;
        //String firstName;
        String surname;
        int spacePosition;

        System.out.println("Please enter you full name here");
        System.out.print("-->");
        
        name = username.nextLine();
        spacePosition = name.indexOf(" ");
        surname = name.substring(spacePosition + 1);
        System.out.println("Your surname is " + surname + "!");      
        
        username.close();
        
    }    
}
