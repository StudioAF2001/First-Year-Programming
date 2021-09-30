// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				11/11/20
// Purpose :            A program to print the entered name in reverse order

import java.util.Scanner;

public class jlab4_5 
{
    public static void main(String args[])
        {
            
            Scanner input = new Scanner(System.in);

            String inputName;
            int index;

            System.out.print("Enter your name ");
            inputName = input.nextLine();
            
            for (index = inputName.length() -1 ; index >= 0; index--)
                {
                    System.out.print(inputName.charAt(index));
                    input.close();
                }

            input.close();
        }
}
