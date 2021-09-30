import java.util.Scanner;

public class jlab7_5 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int arraySize;
        char userInput;
        String revText = "";
        String fullString = "";

        System.out.print("Please ether the ammount of characters you would like to enter: ");
        arraySize = scan.nextInt();

        char characters[] = new char [arraySize];

        for(int i=0;i<arraySize;i++)
            {
                System.out.print("Enter letter " + (i+1) + ": ");
                userInput = scan.next().charAt(0);
                if((userInput >= 'A'&& userInput <= 'Z')||(userInput >= 'a'&& userInput<='z'))
                    {
                        characters[i]=userInput;
                        fullString = fullString + characters[i];
                    }
                else
                    {
                        System.out.print("ERROR: Please input a valid character!");
                        i--;
                    }
            }
        for(int i=fullString.length()-1;i>=0;i--)
            {
                revText = revText + fullString.charAt(i);
                scan.close();
            }

        if(fullString.equals(revText))
            {
                System.out.println("The array is a palindrome");
            }
        else 
            {
                System.out.println("The array is not a palindrome");
            }
            

    }    
}
