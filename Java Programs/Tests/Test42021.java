// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				16/04/2021
// Purpose : 			Test on Array of strings
import java.util.Scanner;

public class Test42021
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //variable declaration
        String userInput;
        String currentWord;
        int numberEvenLengthStrings = 0;

        //declaring the array and defining its size
        String[] wordArray = new String [4];

        //first for() loop to capture user input 
        for(int i=0; i<wordArray.length;i++)
            {
                System.out.print("Please input string " + (i+1) + ": ");
                userInput=scan.nextLine();
                wordArray[i]=userInput.toLowerCase();
            }

        //second for loop to check each string in the array 
        for(int j=0;j<wordArray.length;j++)
            {
                currentWord = wordArray[j];

                //if statement to check if string is even length
                if(currentWord.length()>0)
                    {
                        if(currentWord.length() % 2 ==0)
                        {
                            numberEvenLengthStrings++;
                        }
                    }
            }
        
        scan.close();

        System.out.println("The number of strings with an even number of characters is " + numberEvenLengthStrings);
    }    

}
