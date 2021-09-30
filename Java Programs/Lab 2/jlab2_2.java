// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose :            take three marks, find the average of them and display a grade for the result
import java.util.Scanner;

public class jlab2_2
{
    public static void main(String args[])
    {
        //Naming scanner
        Scanner marks = new Scanner(System.in);
        
        //Variable assignment
        double progMark;
        double mathsMark;
        double hardMark;
        double avgMark;

        //variable declaration 
        System.out.println("Please enter you Programming mark");
        progMark = marks.nextDouble();

        System.out.println("Please enter you Maths mark");
        mathsMark= marks.nextDouble();

        System.out.println("Please enter you Hardware mark");
        hardMark= marks.nextDouble();

        //Calculation
        avgMark = ((progMark + mathsMark + hardMark) / 3);

        //Checking and printing grade
        if (avgMark >= 70)
                    {
                        System.out.println("YOU GOT A DISTINCTION!! AMAZING JOB!!");
                    }
        else if ((avgMark >=63) && (avgMark <=69))
                     {
                         System.out.println("You got a Merit1! Great job! ");
                     }
        else if ((avgMark >=55) && (avgMark <=62))
                     {
                         System.out.println("You got a Merit2! Good job! ");
                     } 
        else if ((avgMark >=40) && (avgMark <=54))
                     {
                         System.out.println("You passed! Well done! ");
                     }
        else if (avgMark < 40)
                    {
                        System.out.println("You failed. Keep trying!");
                    } 
        marks.close();                               
    }
}