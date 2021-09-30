import java.util.Scanner;

public class jlab7_1 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int arraySize;
        int amountEven = 0;
        int amountOdd = 0;


        System.out.println("Please enter the amount of numbers you want to input");
        arraySize = scan.nextInt();

        int[] numbers = new int[arraySize];

        for(int i= 0; i < arraySize; i++ )
        {
            System.out.println("Enter number " + (i+1));
            numbers[i] = scan.nextInt();

            if(jlab6_1.isEven(numbers[i])==true)
                {
                    amountEven++;
                }
            else
                {
                    amountOdd++;
                }
        }
        System.out.println("The amount of even numbers you input was " +amountEven);
        System.out.println("The amount of odd numbers you input was " + amountOdd);
        scan.close();
    }
}
