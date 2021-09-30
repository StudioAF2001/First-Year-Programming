// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				22/10/20
// Purpose :            find the total interest need to be paid when the user inputs loan size 


import java.util.Scanner; //importing the java scanner utility

public class jlab2b2
{
   public static void main(String args[])
   {
    //variables
    double totalAmount;
    double totalInterest;
    double firstInterest;
    double secondInterest;

    Scanner amount = new Scanner(System.in); //naming the new scanner 

    System.out.print("Please enter amount used > "); //asking user to input total amount used on card
    totalAmount = amount.nextDouble();

    if (totalAmount < 500)
        {
            totalInterest = totalAmount * .12;     
            
            System.out.print("The total amount charged including interest is " + totalInterest);
        }
    else if (totalAmount >= 500)
        {
            firstInterest = 500 * .12;  //calculating 15% interest on first €500

            secondInterest = totalAmount - 500;
            secondInterest = secondInterest * .18; 

            totalInterest = firstInterest + secondInterest;

            System.out.print("The total amount charged including interest is " + totalInterest);
        } 
    amount.close();   
   } 
}