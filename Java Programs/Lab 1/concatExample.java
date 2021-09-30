

public class concatExample 
{
    public static void main (String[] args)
        {
            char theChar;
            int lowerCount;
            String outputString;

            outputString = "";
            lowerCount = 0;
            System.out.print("Enter a charcter");
            theChar = EasyIn.getChar();
            
            while(theChar >= 'a' && theChar <= 'z')
                {
                    outputString = outputString + theChar + " ";
                    lowerCount ++;
                    System.out.print("Please enter another character");
                    theChar = EasyIn.getChar();
                }
            System.out.println("There were " + lowerCount + "number of lowercase entered before an uppercase");
        }    
}
