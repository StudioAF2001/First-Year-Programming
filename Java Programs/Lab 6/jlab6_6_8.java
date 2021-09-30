import java.util.Scanner;

public class jlab6_6_8 
{
    public static void minusMiddle(String theName)
    {
        String firstName;
        String surname;

        String[] fullName = theName.split(" ");
        firstName = fullName[0];
        surname = fullName[2];

        System.out.println(firstName + " " + surname);


    }
    public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            String name;
            
            System.out.print("Please enter your first, middle an surname ");
            name = input.nextLine();
            minusMiddle(name);
            
            input.close();
        }
}
