// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose :            A program to calculate the amount of money repaid at the end of a loan
import java.util.Scanner;

public class LoanPay

{
    public static void main(String args[])
    {
        //variables 
        double loanAmount;
        double interestRate;
        double repayment;
        double repaid;
        int amountYears;

        //Scanner access
        Scanner scan1 = new Scanner(System.in);

        //Ask user to input values
        System.out.print("Please enter loan amount here ->");
            loanAmount = scan1.nextDouble();
        System.out.print("Please enter annual interest rate  ->");
            interestRate = scan1.nextDouble();
        System.out.print("Please enter loan length in years here ->");
            amountYears = scan1.nextInt();

        //calculation
        repayment = (interestRate/100) * (loanAmount);
        repaid = (repayment + loanAmount) * (amountYears);

        //Print amount repaid by end of loan 
        System.out.println("The amount repaid by the end of the loan is:" + repaid);

        scan1.close();
    }
}
