// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				27/10/20
// Purpose :            tells the user which is the highest, middle and lowest number out of a set of 
//                      input values


import java.util.Scanner;

public class jlab2b4
{
    public static void main(String args[])
    {
        double numberOne;
        double numberTwo;
        double numberThree;
        double highest;
        double middle;
        double lowest;

        Scanner numbers = new Scanner(System.in);

        System.out.print("Please enter first number > ");
        numberOne = numbers.nextDouble();
        System.out.print("Please enter second number > ");
        numberTwo = numbers.nextDouble();
        System.out.print("Please enter third number > ");
        numberThree = numbers.nextDouble();

        //highest number
        if (numberOne > numberTwo && numberOne > numberThree)
            {
                highest = numberOne;
            }
        else if (numberTwo > numberOne && numberTwo > numberThree)
            {
                highest = numberTwo;
            }
        else
            {
                highest = numberThree;
            }

        //lowest number
        if (numberOne < numberTwo && numberOne < numberThree)
            {
                lowest = numberThree;
            }
        else if (numberTwo < numberOne && numberTwo < numberThree)
            {
                lowest = numberTwo;
            }
        else 
            {
                lowest = numberThree;
            }
        
        //middle number
        if ((highest == numberOne && lowest == numberTwo) || (highest == numberTwo && lowest == numberOne) )
            {
                middle = numberThree;
            }
        else if((highest == numberTwo && lowest == numberThree) || (highest == numberThree && lowest == numberTwo))
            {
                middle = numberOne;
            }
        else 
            {
                middle = numberTwo;
            }

        System.out.print("The highest number is " + highest + ", the middle number is " + middle + " and the lowest number is " + lowest );
        numbers.close();
    }
}