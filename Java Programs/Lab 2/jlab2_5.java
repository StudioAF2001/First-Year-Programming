// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				12/10/20
// Purpose :


import java.util.Scanner;

public class jlab2_5
{
    public static void main(String args[])
    {
        //variables 
        double numberOne;
        double numberTwo;
        double numberThree;

        //name scanner 
        Scanner numbers = new Scanner(System.in);

        //ask for numbers
        System.out.print("Please enter first number > ");
        numberOne = numbers.nextDouble();
        System.out.print("Please enter second number > ");
        numberTwo = numbers.nextDouble();
        System.out.print("Please enter third number > ");
        numberThree = numbers.nextDouble();

        if ((numberOne % numberTwo == 0) && (numberOne % numberThree == 0))
            {
                System.out.print("First number is divisible by number two and three");
            }
        else if ((numberOne % numberTwo == 0) || (numberOne % numberThree == 0))
            {
                System.out.println("Both numbers don't divide evenly");
            }
            
        if ((numberOne % numberTwo == 0) && (numberOne % numberThree != 0))
            {
                System.out.println("First number is only divisible by the second number");
            }
        else if ((numberOne % numberThree == 0) && (numberOne % numberTwo != 0))
            {
                System.out.println("First number is only divisible by the third number");
            }

        else if ((numberOne % numberTwo != 0) && (numberOne % numberThree != 0))
            {
                System.out.println("The first number is not divisible by either number two or three");
            }
        numbers.close();
    }
}