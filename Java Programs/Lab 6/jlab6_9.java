import java.util.Scanner;

public class jlab6_9 
{
    public static int myLastSpace(String theString, int thePosition)
    {
        int  entry = 0;
        int lastSpace = 0;
        
        for(int i = thePosition; i>=0; i--)
            { 
                if (theString.charAt(i) == ' ')
                {
                    lastSpace = i;
                    entry++;
                    if(entry == 2)
                        {
                            i = 0;
                        }
                }
            }
        return lastSpace;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String userString;
        int userPosition;
        
        System.out.println("Please enter your string ");
        userString = scan.nextLine();
        System.out.println("Please enter a value to search backwards from ");
        userPosition = scan.nextInt();

        System.out.println("The second last space in your string was located at index " + myLastSpace(userString,userPosition));
        scan.close();
    }
}
