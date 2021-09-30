// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				26/10/20
// Purpose :            


import java.util.Scanner;

public class jlab2b3
{
    public static void main(String args[])
    {
        double numberOne;
        double numberTwo;
        double numberThree;
        double lowest;

        Scanner numbers = new Scanner(System.in);

        System.out.print("Please enter first number > ");
        numberOne = numbers.nextDouble();
        System.out.print("Please enter second number > ");
        numberTwo = numbers.nextDouble();
        System.out.print("Please enter third number > ");
        numberThree = numbers.nextDouble();

        if (numberThree < numberTwo && numberThree < numberOne)
                {
                    lowest = numberThree;
                    System.out.print("The lowest number is " + lowest);
                }
        
        else if (numberTwo < numberOne && numberTwo < numberThree)
                {
                    lowest = numberTwo;
                    System.out.print("The lowest number is " + lowest);
                }
                
        else 
                {
                    lowest = numberOne;
                    System.out.print("The lowest number is " + lowest);
                }
        numbers.close();
    }
}