import java.util.Scanner;



public class jlab6_6_4
{
    public static int numChars(String theName)
    {
        String currentWord;     
        int spacePos;
        int numberUppercase = 0;

        spacePos = theName.indexOf(" ");
        while(theName.length()!= 0)
        {
            if(spacePos!=-1)
                {
                currentWord = theName.substring(0, spacePos);
                theName = theName.substring(spacePos + 1);
                }
            else
                {
                    currentWord = theName;
                    theName = "";
                }

            for (int i =0; i < currentWord.length();i++)
                {
                    if (currentWord.charAt(i)>='A' && currentWord.charAt(i)<='Z')
                        {
                            numberUppercase++;
                        }
                }
            
            spacePos=theName.indexOf(" ");
        }
        return numberUppercase;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String name; 
        System.out.println("Please enter your first and surname name here");
        System.out.print("-->");
        name = scan.nextLine();
        System.out.println("The amount of uppercase characters in your name is " + numChars(name));      
        
        scan.close();
        
    }    
}
