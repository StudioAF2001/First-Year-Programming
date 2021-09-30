// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				09/10/20
// Purpose :
import java.util.Scanner;

class jlab2_3
{
    public static void main(String args[])
    {
        //variables
        int numberOne;

        //naming scanner
        Scanner newNumb = new Scanner(System.in);

        System.out.print("Please enter number here > ");
        numberOne = newNumb.nextInt();

        //Calculation
        
        if (numberOne %2 == 0)
            {
                System.out.println("Number is even");
            }
        else if (numberOne %2 != 0)
            {
                System.out.print("Number is odd");
            } 
        newNumb.close();   
    }
}