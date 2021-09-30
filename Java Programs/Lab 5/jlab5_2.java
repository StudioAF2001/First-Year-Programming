// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				20/1/21
// Purpose :            Reverses the order of the words input by the user 
import java.util.Scanner;

public class jlab5_2 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //variables
        String sentence;
        String reversedText = "";
        String currentWord;
        int lastSpacePos;

        System.out.print("Please enter the text you want to be reversed here :  ");
        sentence = scan.nextLine();
        lastSpacePos = sentence.lastIndexOf(" ");

        
        while(sentence.lastIndexOf(" ") != -1)
            {   
                currentWord = sentence.substring(lastSpacePos + 1 );
                reversedText = reversedText + currentWord + " ";

                sentence = sentence.substring(0, lastSpacePos);
                lastSpacePos = sentence.lastIndexOf(" ");
                //sentence = sentence + " ";
                if (lastSpacePos == -1)
                    {
                        currentWord = sentence;
                        reversedText = reversedText + currentWord;
                    }
            }
        
        System.out.println("The reversed text is as follows: " + reversedText);
        scan.close();
    }
}