// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				25/1/21
// Purpose :            Outputs the amount of words, max, min and average length
import java.util.Scanner;

public class jlab5_3
{

    public static void main(String[] args)
        {
            String sentence = "";
            String currentWord;
            String firstWord;
            int spacePos;
            int wordCounter = 0;
            int amountLetters;
            int wordLength;  
            int maxLength; 
            int minLength;
            double avgLength = 0;        

            Scanner scan = new Scanner(System.in);
            
            System.out.print("Please enter your text here :  ");
            sentence = scan.nextLine();
            sentence = sentence + " ";
            spacePos = sentence.indexOf(" ");
            firstWord = sentence.substring(0, spacePos);
            maxLength = firstWord.length();
            minLength = firstWord.length();

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
                        
                        if (currentWord.length() > maxLength)
                            {
                                maxLength = currentWord.length();
                            }
                        if (currentWord.length()< minLength)
                            {
                                minLength = currentWord.length();
                            }
                        avgLength = avgLength + currentWord.length();
                    }

                spacePos = sentence.indexOf(" "); 
            }      

            System.out.println("The amount of words in your sentence was " + wordCounter);
            System.out.println("The length of the longest word was " + maxLength);
            System.out.println("The length of the shortest word was " + minLength);
            avgLength = avgLength / wordCounter;
            System.out.println("The average length of words is " + avgLength);

            scan.close();
        }

}
