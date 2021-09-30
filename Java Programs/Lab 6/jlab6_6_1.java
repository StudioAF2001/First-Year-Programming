import java.util.Scanner;

public class jlab6_6_1 
{
    public static void surname(String theName)
    {
        String surname;
        int spacePosition;
        spacePosition = theName.indexOf(" ");
        surname = theName.substring(spacePosition + 1);
        System.out.println("Your surname is " + surname + "!");
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String name;
        
        System.out.println("Please enter you full name here");
        System.out.print("-->");
        
        name = scan.nextLine();
        surname(name);   
        
        scan.close();
        
    }    
}
