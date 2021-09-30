// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose :            Check if a number is greater than, equal to or less than zero
import java.util.Scanner;

public class jlab2_1
{
    public static void main(String args[])
    {

        //variables
        int newNumber;

        //Naming Scanner
        Scanner numberScan = new Scanner(System.in);
    
        //Main body and if statements
        System.out.println("Please enter and interger here");
        newNumber = numberScan.nextInt();

        if (newNumber > 0)
                {
                    System.out.println("The number is greater than zero");
                }
               
        else if (newNumber == 0 ) 
                {
                    System.out.println("The number is equal to zero");
                }
        
        else if (newNumber < 0)
                {
                    System.out.println("The number is less to zero");
                }
        numberScan.close();
    }
}