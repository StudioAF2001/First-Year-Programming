import java.util.Scanner;

public class jlab6_1 
{   
    public static void main(String[] args)
    {
        int userNumber;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you number here: ");
        userNumber = scan.nextInt();
        System.out.println("The number is even: " + isEven(userNumber));

        scan.close();
    }   
    
    public static boolean isEven(int theNum)
    {
        boolean trueFalse = true;

        if (theNum % 2 == 0)
            {
                trueFalse = true;
            }
        else if(theNum % 2 != 0)
            {
                trueFalse = false;
            }
        else
            {
                trueFalse = false;
            }
        return trueFalse;
    }

    
}
