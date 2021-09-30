import java.util.Scanner;
public class jlab8_1 
{
    public static void main(String[] args)
    {
        int arrSize;
        int userInput;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the size of the array ");
        arrSize=scan.nextInt();

        int[] numArray = new int[arrSize];

        for(int i=0;i<arrSize;i++)
            {
                System.out.print("Please input number " +(i+1) + ": ");
                userInput = scan.nextInt();
                numArray[i]= userInput;
            }

        System.out.println("The last index position of the largest number was " + findHighest(numArray));
        scan.close();
        
    }
    
    public static int findHighest(int[] theNumArray)
    {
        int currentNum;
        int highestNum;
        int index =0;

        highestNum=theNumArray[0];

        for(int j=0;j<theNumArray.length;j++)
            {
                currentNum=theNumArray[j];
                if(currentNum>highestNum||currentNum==highestNum)
                    {
                        highestNum=currentNum;
                        index= j;
                    }
            }
        return(index);

    }
}
