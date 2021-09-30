import java.util.Scanner;
public class jlab8_2 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int arrSize;
        int userInput;

        System.out.print("Please input the size of the array ");
        arrSize=scan.nextInt();

        int[] numArray = new int [arrSize];

        for(int i=0;i<numArray.length;i++)
            {
                System.out.print("Input number " +(i+1) + ": ");
                userInput=scan.nextInt();
                numArray[i]=userInput;            
            }
        
        int highest = findHighest(numArray);
        int numHighest =timesHighest(highest, numArray);
        System.out.println("The largest number was entered " +numHighest+ " times");
        scan.close();
    }

    public static int findHighest(int[] theNumArray)
    {
        int currentNum;
        int highestNum;

        highestNum=theNumArray[0];

        for(int j=0;j<theNumArray.length;j++)
            {
                currentNum=theNumArray[j];
                if(currentNum>highestNum||currentNum==highestNum)
                    {
                        highestNum=currentNum;
                    }
            }
        return(highestNum);

    }

    public static int timesHighest(int theHighest, int[] theNumArray)
    {
        int currentNum;
        int counter =0;
        
        for(int i=0;i<theNumArray.length;i++)
            {
                currentNum=theNumArray[i];
                if(currentNum==theHighest)
                    {
                        counter++;
                    }
            }
        return counter;
    }
}
