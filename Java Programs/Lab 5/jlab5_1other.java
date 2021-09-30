import java.util.Scanner;
public class jlab5_1other 
{
    public static void main(String[] args)
    {
        //variables
        Scanner scan = new Scanner(System.in);
        String sentence;
        int counter = 1;

        System.out.println("Please enter your text here:  " );
        sentence = scan.nextLine();

        for(char one : sentence.toCharArray())
        {
            if(one == ' ')
            {
                counter ++;
            }
            scan.close();
        }
        System.out.println("The amount of words in the input was :  " + counter);
    }

}
