import java.util.Scanner;

public class jlab6_7
{
        public static int myLastSpace(String theString)
        {
            int lastSpace;
            lastSpace = theString.lastIndexOf(" ");
            return lastSpace;
        }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String userString;
            userString = scan.nextLine();
            System.out.println("The last space in your string was located at index " + myLastSpace(userString));
            scan.close();
        } 
       
}
