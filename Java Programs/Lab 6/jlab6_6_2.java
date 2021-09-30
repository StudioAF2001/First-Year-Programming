import java.util.Scanner;

public class jlab6_6_2 
{
    public static void firstName(String theName)
    {
        String firstName;
        int spacePosition;
        spacePosition = theName.indexOf(" ");
        firstName = theName.substring(0, spacePosition);
        System.out.println("Your surname is " + firstName + "!");
    }
    public static void main(String args[])
    {
        Scanner username = new Scanner(System.in);

        String name;
        System.out.println("Please enter you full name here");
        System.out.print("-->");
        name = username.nextLine();
        firstName(name);    
        
        username.close();
        
    }    
}
