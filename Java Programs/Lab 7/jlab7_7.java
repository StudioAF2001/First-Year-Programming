import java.util.Scanner;
public class jlab7_7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int arraySize;
        int counter;
        String userInput;
        String currentString;

        counter = 0;

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
                    counter++;
                }
                scan.close();
            }
        printResult(counter);
    }
    
    public static void printResult(int theCounter)
    {
        System.out.println("There were "+ theCounter +" palindromes contained in the array");
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
