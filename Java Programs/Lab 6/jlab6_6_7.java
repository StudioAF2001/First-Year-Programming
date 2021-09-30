import java.util.Scanner;

public class jlab6_6_7
{
    public static void occurA(String theName)
    {
        int index;
        int aCounter;

        aCounter = 0;
        for (index = 0; index <= theName.length() -1; index++ )
            {
                if(theName.charAt(index) == 'a' || theName.charAt(index) == 'A')
                    {
                        aCounter ++;
                    }
            
            }
        
        System.out.print("The number of occurences of the letter 'A' in your name was " + aCounter);
    }
    public static void main(String args[])
        {
        Scanner username = new Scanner(System.in);

        String name;
        
        System.out.print("Please enter your name => ");
        name = username.nextLine();
        occurA(name);
        
        username.close();
        }    
}
