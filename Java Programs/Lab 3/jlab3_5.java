// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				11/11/20
// Purpose :            The program will output the lowest, medium and highest 
//                      numbers out of a set of numbers input by the user
import java.util.Scanner;
            
public class jlab3_5 
{
    public static void main(String args[])
    {
        Scanner numbers = new Scanner(System.in);

        int index;
        int numberRuns;
        int inputValue;
        int largestNumber;
        int smallestNumber;
        double averageNumber;
        int sum;
        int amountNumbersEntered;
        int smallestCounter;
        int largestCounter;


        System.out.println("The program will output the lowest, medium and highest numbers out of a set of numbers input by the user");
        System.out.println("");


        System.out.print("How many numbers to you intend to input into this program?");
        numberRuns = numbers.nextInt();


        largestNumber = 0;
        averageNumber = 0;
        smallestNumber = 0;
        sum = 0;
        amountNumbersEntered = 0;
        smallestCounter = 0;
        largestCounter = 0;

        
        for (index = 0; index < numberRuns; index ++)
        {

            System.out.print("Please enter next number >");
            inputValue = numbers.nextInt();
            amountNumbersEntered += 1;


            //if index is set to zero, which will only happen on the first run, all variables will be set to 0
            if (index == 0)
                {
                    largestNumber = inputValue;
                    averageNumber = inputValue;
                    smallestNumber = inputValue;
                }

            //if the input value is larger than the current largest stored number, largestNumber is overwritten to input value 
            if (inputValue > largestNumber)
                {
                    largestNumber = inputValue;
                    largestNumber = 1;
                }
            
            else if(inputValue == largestNumber)
                {
                    largestCounter++;
                } 
                
            //if the input value is smaller than the current smallest stored number, smallestNumber is overwritten to input value     
            if(inputValue < smallestNumber && inputValue > largestNumber)
                {
                    smallestNumber = inputValue;
                    smallestCounter++;
                }
            else if (inputValue == smallestNumber)
                {
                    smallestCounter++;
                }
            

            sum += inputValue;
            averageNumber = sum / amountNumbersEntered;

            numbers.close();
        }
        
        System.out.println("The current smallest number is " + smallestNumber);
        System.out.println("The current largest number is " + largestNumber);
        System.out.println("The current average number is " + averageNumber);
        System.out.println("The smallest number was entered " + smallestCounter + " times");
        System.out.println("The largest number was entered " + largestCounter + " times");
        
        numbers.close();
    }
    
}