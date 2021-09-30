import java.util.Scanner;

public class jlab6_6_3
{
    public static void nameLength(String theName)
    {
        int nameLength;
        nameLength = theName.length();
        nameLength = nameLength - 1;
        System.out.println("There are " + nameLength + " Characters in your name!");
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String name;
        

        System.out.println("Please enter you full name here");
        System.out.print("-->");
        name = scan.nextLine();
        nameLength(name);
             
        scan.close();
        
    }    
}
