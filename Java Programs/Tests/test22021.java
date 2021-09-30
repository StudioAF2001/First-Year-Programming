//Student name: Andrew Skelly
//Student number: C00261511

import java.util.Scanner;       //importing Scanner function

public class test22021 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);          //initalising scanner

        String doctorOne;
        String doctorTwo;
        int vaccineFeeA;
        int vaccineFeeB;
        int docOneVacA;
        int docOneVacB;
        int docTwoVacA;
        int docTwoVacB;
        int docOneTotal;
        int docTwoTotal;
        int diffenence;

        vaccineFeeA = 30;
        vaccineFeeB = 40;

        //taking in user inputs for doctors names and vaccines administered
        System.out.println("Enter the name of doctor 1  ");
        doctorOne = scan.nextLine();

        System.out.println("Enter the name of doctor 2  ");
        doctorTwo = scan.nextLine();

        System.out.println("Enter the number of units of Vaccine A administered by " + doctorOne);
        docOneVacA = scan.nextInt();

        System.out.println("Enter the number of units of Vaccine B administered by " + doctorOne);
        docOneVacB = scan.nextInt();

        System.out.println("Enter the number of units of Vaccine A administered by " + doctorTwo);
        docTwoVacA = scan.nextInt();

        System.out.println("Enter the number of units of Vaccine B administered by " + doctorTwo);
        docTwoVacB = scan.nextInt();

        //calculating the total income made by each individual doctor
        docOneTotal = (docOneVacA*vaccineFeeA) + (docOneVacB*vaccineFeeB);
        docTwoTotal = (docTwoVacA*vaccineFeeA) + (docTwoVacB*vaccineFeeB);

        System.out.println("The total income for each is: " + doctorOne + " " + docOneTotal + ", " + doctorTwo + " " + docTwoTotal);

        //if statements to determine which doctor earned more or if their income was equal 
        if (docOneTotal > docTwoTotal)
            {   
                diffenence = docOneTotal - docTwoTotal;
                System.out.println("The highest income was achieved by " + doctorOne + " Who earned " + diffenence + " Euros more.");
            }
        
        else if(docTwoTotal> docOneTotal)
            {
                diffenence = docTwoTotal - docOneTotal;
                System.out.println("The highest income was achieved by " + doctorTwo + " Who earned " + diffenence + " Euros more.");
            }    
        
        else 
            {
                System.out.println(doctorOne + " and " + doctorTwo + " have the same amount of income earned which is " + docOneTotal);
            }


        scan.close();
    }
}
