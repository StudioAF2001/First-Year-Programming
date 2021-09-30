import java.util.Scanner;

public class jlab6_6_5 
  
{
    public static void revName(String theName)
    {
        int index;
        for (index = theName.length() -1 ; index >= 0; index--)
            {
                System.out.print(theName.charAt(index));
            }
    }
    public static void main(String args[])
    {
            
        Scanner scan = new Scanner(System.in);

        String inputName;

        System.out.print("Enter your name ");
        inputName = scan.nextLine();
        revName(inputName);        

        scan.close();
    }
}
