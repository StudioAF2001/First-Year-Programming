// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				09/11/20
// Purpose :            A program to output the lowest, medium and highest numbers out of a set of numbers input by the user
import java.util.Scanner;

public class jlab3_4 
{
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);

        int index;
        int numberRuns;
        double inputValue;
        double largestNumber;
        double smallestNumber;
        double averageNumber;
        double sum;
        int amountNumbersEntered;

        System.out.println("The program will output the lowest, medium and highest numbers out of a set of numbers input by the user");
        System.out.println("");

        System.out.print("How many numbers to you intend to input into this program?");
        numberRuns = number.nextInt();

        largestNumber = 0;
        averageNumber = 0;
        smallestNumber = 0;
        sum = 0;
        amountNumbersEntered = 0;

        for (index = 0; index < numberRuns; index ++)
        {
            System.out.print("Please enter next number >");
            inputValue = number.nextDouble();
            amountNumbersEntered += 1;

            if (index == 0)
            {
                largestNumber = inputValue;
                averageNumber = inputValue;
                smallestNumber = inputValue;
            }

            if(inputValue < smallestNumber)
            {
                smallestNumber = inputValue;
            }
            else if (inputValue > largestNumber)
            {
                largestNumber = inputValue;
            }

            sum += inputValue;
            averageNumber = sum / amountNumbersEntered;

            number.close();
        }
        System.out.println("The smallest number is " + smallestNumber);
        System.out.println("The largest number is " + largestNumber);
        System.out.println("The average number is " + averageNumber);

        number.close();
    }
}
