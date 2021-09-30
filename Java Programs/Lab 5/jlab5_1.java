// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				15/12/20
// Purpose :            Read the number of words in a string 
import java.util.Scanner;

public class jlab5_1 
{

    public static void main(String[] args)
        {
            String sentence = "";
            String currentWord;
            int spacePos;
            int wordCounter = 0;
            int amountLetters;
            int wordLength;           

            Scanner scan = new Scanner(System.in);
            
            System.out.print("Please enter your text here :  ");
            sentence = scan.nextLine();
            spacePos = sentence.indexOf(" ");

            while(sentence.length() != 0)
            {
                if (spacePos != -1)
                {
                    currentWord = sentence.substring(0,spacePos);
                    sentence = sentence.substring(spacePos + 1);
                }

                else
                {
                    currentWord = sentence;
                    sentence = "";
                }

                wordLength = currentWord.length();
                amountLetters = 0;
                for (int i = 0; i < currentWord.length(); i++)
                {
                    if((currentWord.charAt(i) >= 'a' && currentWord.charAt(i) <= 'z')||(currentWord.charAt(i) >= 'A' && currentWord.charAt(i) <= 'Z'))
                    {
                        amountLetters++;
                    }

                }
                
                if(wordLength == amountLetters)
                {
                    wordCounter++;
                }

                spacePos = sentence.indexOf(" "); 
            }      
        
            System.out.println("The amount of valid words in your sentence was " + wordCounter);
            
            scan.close();
        }

}

