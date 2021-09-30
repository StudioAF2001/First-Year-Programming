// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				11/11/20
// Purpose :            A program to output the amount of words in the users name

import java.util.Scanner;

public class jlab5_1_arrayVersion 
{
    public static void main(String args[])
        {
            Scanner keyboardInput = new Scanner(System.in);

            String input;
            int counter;

            System.out.print("Please enter your text here => ");
            input = keyboardInput.nextLine();

            counter = 0;
        
            for(char one : input.toCharArray())
                {
                    if(one == ' ')
                        {
                            counter ++;
                        }
                    keyboardInput.close();
                }

            System.out.println("The amount of words in your text is " + counter);
        }    
}
