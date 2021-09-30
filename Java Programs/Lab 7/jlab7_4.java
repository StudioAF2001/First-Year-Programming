import java.util.Scanner;

public class jlab7_4 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int arraySize;
        int vowelCount;
        int consonantCount;
        char userInput;
        final String VOWELS = "aeiou";
        
        vowelCount=0;
        consonantCount=0;

        System.out.println("Please input how many characters you would like to enter: ");
        arraySize = scan.nextInt();

        char characters[] = new char[arraySize];
        for(int i=0;i<arraySize;i++)
            {
                System.out.print("Enter letter " + (i+1) + ": ");
                userInput = scan.next().charAt(0);
                if((userInput >= 'A'&& userInput <= 'Z')||(userInput >= 'a'&& userInput<='z'))
                    {
                        characters[i]=userInput;
                    }
                else
                    {
                        System.out.print("ERROR: Please input a valid character!");
                        i--;
                    }
                scan.close();
            }
        
        for (int z=0;z<VOWELS.length();z++)
            {
                for (int j=0;j<arraySize;j++)
                    {
                        if (characters[j]==VOWELS.charAt(z))
                            {
                                vowelCount++;
                                j++;
                            }
                    }
            }   
        consonantCount = characters.length - vowelCount;
        System.out.println("You entered " +vowelCount+ " vowels");
        System.out.println("You entered " +consonantCount+ " consonants");
        
    }  
}
