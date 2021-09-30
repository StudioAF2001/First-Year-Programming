// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				20/10/20
// Purpose :            Calculate the new insurance premium after last years being entered


import java.util.Scanner;

public class jlab2b1
{
    public static void main(String args[])
    
    {
        //variables
        double lastPremium;
        int numberClaims;
        double newPremium;
        double extraCharge;

        //naming scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your premium amount from the previous year ");
        lastPremium = scan.nextDouble();
        System.out.println("How many claims did you make last year, if any? ");
        numberClaims = scan.nextInt();

        newPremium = (lastPremium * 1.05);

        if (numberClaims == 0) 
                    {
                        newPremium = (newPremium/100) * 60;
                        System.out.println("Your new premium for the year is " + newPremium);
                    }
        else if (numberClaims != 0)
                    {
                        extraCharge = (numberClaims * 0.2);
                        newPremium = ((extraCharge * newPremium) + newPremium);
                        System.out.println("Your new premium for the year is " + newPremium);
                    }
       scan.close();            
    }    

}