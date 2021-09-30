// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				10/10/20
// Purpose :            check if two numbers divide into each other evenly


import java.util.Scanner;

public class jlab2_4
{
    public static void main(String args[])
    {
        //variables 
        double numberOne;
        double numberTwo;

        //name scanner 
        Scanner numbers = new Scanner(System.in);

        //ask for numbers
        System.out.print("Please enter first number > ");
        numberOne = numbers.nextDouble();
        System.out.print("Please enter second number > ");
        numberTwo = numbers.nextDouble();

        if (numberOne % numberTwo == 0)
            {
                System.out.print("Numbers divide evenly");
            }
        else if (numberOne % numberTwo != 0)
            {
                System.out.print("Numbers don't divide evenly");
            }
        numbers.close();
    }
}