import java.util.Scanner; 

public class Jlab6_4 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int mark ;

        System.out.print("Please enter your mark here: ");
        mark = scan.nextInt();
        award(mark);

        scan.close();
    }
    public static void award(int theMark)
    {
        if(theMark >= 70 && theMark <= 100)
            {
                System.out.println();
                System.out.println("You got a Distinction!");
            }
        if(theMark >= 63 && theMark <= 69)
            {
                System.out.println();
                System.out.println("You got a Merit1!");
            }
        if(theMark >= 55 && theMark <= 62)
            {
                System.out.println();
                System.out.println("You got a Merit2!");
            }
        if(theMark >= 40 && theMark <= 54)
            {
                System.out.println();
                System.out.println("You passed!");
            }
        if(theMark < 40)
            {
                System.out.println();
                System.out.println("You failed :(");
            }
        
    }
}
