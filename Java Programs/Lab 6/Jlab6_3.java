import java.util.Scanner;
public class Jlab6_3 
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);

        String userString;

        System.out.println("This program counts the amount of characters in a string");
        System.out.println();
        System.out.print("Please enter you string here:");
        userString = scan.nextLine();
        System.out.println();
        System.out.println("The amount of characters in your string was " + alphaCount(userString));

        scan.close();
    }
    public static int alphaCount(String theString)
    {
        int count = 0;
        char currentChar;
        for(int i = 0; i <= theString.length()-1; i++)
            {
                currentChar = theString.charAt(i);
                if((currentChar >= 'a' && currentChar <= 'z')||(currentChar >= 'A' && currentChar <= 'Z'))
                    {
                        count ++;
                    }
            }
        return count;
    }
}
