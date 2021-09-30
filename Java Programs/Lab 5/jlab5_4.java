//this crashed and burned quickly 
//note to self, learn things before messing around with them
//at least I tried 

import java.util.Scanner;

public class jlab5_4 
{   
    public static int numWords(String sentence) 
    {      
        
        String currentWord;
        int spacePos;
        int wordCounter = 0;
        int amountLetters;
        int wordLength;

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
                    if(currentWord.charAt(i) >= 'a' && currentWord.charAt(i) <= 'z')
                    {
                        amountLetters++;
                    }

                    if(currentWord.charAt(i) >= 'A' && currentWord.charAt(i) <= 'Z')
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
            return wordCounter;   
    }

    
    
    public static void main(String[] args) 
    {
        String sentence;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your sentence here: ");
        sentence = scan.nextLine();
        System.out.println("The amount of words in your sentence is " + numWords(sentence));
    

        scan.close();
    }   
}
