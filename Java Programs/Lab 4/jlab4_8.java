// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				11/11/20
// Purpose :            Prints the users first and surname when their middle name is entered as well 

import java.util.Scanner;

public class jlab4_8 
{
    public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);

            String name;
            String firstName;
            String surname;

            System.out.print("Please enter your first, middle an surname ");
            name = input.nextLine();

            String[] fullName = name.split(" ");
            firstName = fullName[0];
            surname = fullName[2];

            System.out.println(firstName + " " + surname);

            input.close();
        }
}
