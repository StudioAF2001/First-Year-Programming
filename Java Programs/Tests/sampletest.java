
import java.util.Scanner;

public class sampletest 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String userInput;
        String currentWord;
        String theWord ="";
        int index=0;

        String[] wordArray = new String [4];

        for(int i=0; i<wordArray.length;i++)
            {
                System.out.print("Please input string " + (i+1) + ": ");
                userInput=scan.nextLine();
                wordArray[i]=userInput.toLowerCase();
            }

        for(int j=0;j<wordArray.length;j++)
            {
                currentWord=wordArray[j];
                if(currentWord.length()<2)
                    {
                        j++;
                    }
                else if(currentWord.charAt(0)==currentWord.charAt(1))
                    {
                        theWord=currentWord;
                        index=j;
                    }
            } 
        System.out.println("The word is '" + theWord + "' and it is located at postion " + index + " in the array");
        scan.close(); 
    }    
}
