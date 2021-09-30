// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				11/11/20
// Purpose :            A program to count the amount of occurences of the letter A

import java.util.Scanner;

public class jlab4_7 
{
    public static void main(String args[])
        {
        Scanner username = new Scanner(System.in);

        String name;
        int index;
        int aCounter;
        
        System.out.print("Please enter your name => ");
        name = username.nextLine();

        aCounter = 0;
        for (index = 0; index <= name.length() -1; index++ )
            {
                if(name.charAt(index) == 'a' || name.charAt(index) == 'A')
                    {
                        aCounter ++;
                    }
            
            username.close();
            }
        
        System.out.print("The number of occurences of the letter 'A' in your name was " + aCounter);
        
        username.close();
        }    
}