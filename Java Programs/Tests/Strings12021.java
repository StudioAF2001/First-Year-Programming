import java.util.Scanner;

public class Strings12021 
{
    public static void main (String[] args)
    {
        Scanner hello = new Scanner(System.in);
        String subject;
        int index;

        System.out.println("Enter a subject");
        subject = hello.nextLine();

        for(index = 0; index <= subject.length()-1; index ++)
        {
            System.out.println(subject.charAt(index));
            hello.close();
        }
        System.out.println();
    }  
}
