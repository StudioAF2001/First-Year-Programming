import java.util.Scanner;
public class jlab6_2 
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);

        char userChar;
        boolean result;
        System.out.print("Please enter a single character here: ");
        userChar = scan.next().charAt(0);

        result = isAlpha(userChar);
        scan.close();

        if(result == true)
            {
                System.out.println("The character you entered is valid!");
            }
        else if(result == false)
            {
                System.out.println("The character you entered in invalid!");
            }
    }  
    public static boolean isAlpha(char theChar) 
    {
        return (theChar >= 'a' && theChar <= 'z')||(theChar >= 'A' && theChar <= 'Z');
    } 
}
