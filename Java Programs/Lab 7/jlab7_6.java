import java.util.Scanner;
public class jlab7_6 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int arraySize;
        String userInput;
        String currentString;

        System.out.print("Please specify the amount of strings you want to input: ");
        arraySize = scan.nextInt();
        scan.nextLine();

        String[] wordArray = new String[arraySize];

        for(int i=0; i<arraySize;i++)
            {
                System.out.print("Please input string " + (i+1) + ": ");
                userInput = scan.nextLine();
                wordArray[i]= userInput.toLowerCase();
            }
        for(int j=0;j<wordArray.length;j++)
            {
                currentString=wordArray[j];

                if(revText(currentString).equals(currentString))
                {
                    printResult(currentString, "yes");
                }
                else 
                {
                    printResult(currentString, "no");
                }
            }
        scan.close();
    }
    public static void printResult(String theString, String confirm)
    {
        if(confirm.toLowerCase()== "yes")
        {
            System.out.println("• " + theString.substring(0,1).toUpperCase() + theString.substring(1) + " IS a palindrome.");
        }
        else if(confirm.toLowerCase()=="no")
        {
            System.out.println("• " + theString.substring(0,1).toUpperCase() + theString.substring(1) + " is NOT a palindrome.");
        }
    }
    public static String revText(String theString)
    {
        char currentChar = ' ';
        String revText="";

        for(int i=theString.length()-1;i>=0;i--)
            {
                currentChar = theString.charAt(i);
                revText = revText+currentChar;
            }
        return revText;
    }

}
