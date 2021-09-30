// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				30/10/20
// Purpose :            a program that will find the sum of a collection of data values and terminate when
//                      a value of zero is detected
import java.util.Scanner;

public class jlab3_2
{
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);

        int sum = 0;
        boolean startProg = true;
        int input = 0;

        System.out.println("______Continuous Sum Calculator______");
        System.out.println("Press 0 to exit the program and view the sum of all our inputs");

        while(startProg) //since startProg is set to true, this will run the loop
        {
            
            System.out.print("Please enter your number ->");
            input = number.nextInt();

            if (input == 0 )                                       //this section checks to see if the user input is 0.
            {                                                      //if this is true, the program will exit
                startProg = false;
            
            }

            else
            {                                                      //this part adds the users input to the previous
                sum = sum + input;                                 //value saved in sum
            }
        }
    System.out.println("The final sum of all your inputs is " + sum);

    number.close();
      
    }
}