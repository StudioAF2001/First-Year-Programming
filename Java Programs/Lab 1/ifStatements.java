// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose :
import java.util.Scanner;

public class ifStatements
{

    public static void main(String args[])
    {
        double result;

        Scanner readResults = new Scanner(System.in);

        System.out.println("Please enter your mark here");
        result = readResults.nextDouble();

        if (result < 40)
            {
             System.out.println("You failed :(");
            }
    
        else
            if (result >= 40)
                {
                    System.out.println("You passed!!");
                }
        readResults.close();
    }
}
    

   
