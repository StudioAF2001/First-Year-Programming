// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				06/11/20
// Purpose : 			A program that takes in a set amount of numbers and outputs the first and 
//                      last occurence of the number 12 

import java.util.Scanner;

public class jlab3_3 
{
    public static void main(String args[])
    {
        Scanner nextNumber = new Scanner(System.in);

        int numberOfInputs;
        int currentNumber;
        int firstOccurence;
        int lastOccurence;
        int index;
        
        System.out.print("Please enter the amount of numbers you want to enter ");
        numberOfInputs = nextNumber.nextInt();


        firstOccurence = 0;
        lastOccurence = 0;

        for (index = 1; index <= numberOfInputs; index++)
            {
                System.out.print("Please enter number " + index + " ");
                currentNumber = nextNumber.nextInt();

                if(currentNumber == 12 && firstOccurence == 0)
                    {
                        firstOccurence = index;
                        lastOccurence = index;
                    }
                
                if (currentNumber == 12)
                    {
                        lastOccurence = index;
                    }
            
                nextNumber.close();
            }

        if(firstOccurence == 0 && lastOccurence == 0)
            {
                System.out.print("The number 12 was not entered");
            }
        
        else 
            {
                System.out.println("The first occurence of 12 was " + firstOccurence);
                System.out.println("The last occurence of 12 was " + lastOccurence);
            }
       
    }
}