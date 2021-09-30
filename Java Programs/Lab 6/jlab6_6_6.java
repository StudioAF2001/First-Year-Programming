import java.util.Scanner;

public class jlab6_6_6 
{
    public static void lastFirst(String theName)
    {
        String firstName; 
        String lastName;       
        int spacePosition;

        spacePosition = theName.indexOf(" "); 

        firstName = theName.substring(0, spacePosition);                          
        lastName = theName.substring(spacePosition + 1);
        System.out.print(lastName + " " + firstName);

    }
    public static void main(String args[])
        {
        Scanner username = new Scanner(System.in);

        String name;
        
        System.out.println("Please enter your first and surname name here");
        System.out.print("-->");
        
        name = username.nextLine();
        lastFirst(name);
            
        username.close();
        }
}
