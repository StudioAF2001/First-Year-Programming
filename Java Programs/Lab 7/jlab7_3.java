import java.util.Scanner;

public class jlab7_3
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int highest;
        int lowest;
        int highestCount;
        int lowestCount;
        int runCount;

        highest=0;
        lowest=0;
        highestCount=0;
        lowestCount=0;

        System.out.println("Please input the amount of numbers you want to enter ");
        runCount = scan.nextInt();

        int numbers[] = new int [runCount];
        for (int i = 0; i<runCount;i++)
            {
                System.out.print("Please input number " + (i+1) + ": ");
                numbers[i] = scan.nextInt();

                if (i==0)
                    {
                        highest=numbers[0];
                        lowest=numbers[0];
                    }
        
                if(numbers[i]>highest)
                    {
                        highest = numbers[i];
                    }
                else if(numbers[i]<lowest)
                    {
                        lowest = numbers[i];
                    } 
                    
                if(numbers[i]==highest)
                    {
                        highestCount++;
                    }
                else if(numbers[i]==lowest)  
                    {
                        lowestCount++;
                    }
            }
        System.out.println("");
        System.out.println("The highest number you input was " + highest);
        System.out.println("The lowest number you input was " + lowest);
        System.out.println("");
        System.out.println("You input the highest number " + highestCount + " times");
        System.out.println("You input the lowest number " + lowestCount + " times");
        System.out.println("");
        scan.close();
    }
}
