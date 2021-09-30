
import java.util.Scanner;

public class jlab5_2other 
{
    public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);

            String sentence = "";
            String reversedText = "";
            
            //asking user for string
            System.out.print("Please enter your text here => ");
            sentence = scan.nextLine();

            //Reversing words in the sentence
            String text[] = sentence.split(" ");
            for (int i = text.length-1; i >= 0; i--)
                {
                    reversedText += text[i] + " ";
                }
            
            System.out.println("The reversed text is :" + reversedText.substring(0,reversedText.length()-1));
            scan.close();
        }
}