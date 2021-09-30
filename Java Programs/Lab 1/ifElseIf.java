import java.util.Scanner;

class ifElseIf
{
    public static void main(String args[])
    {
        int personAge;

        Scanner getAge = new Scanner(System.in);

        System.out.println("Please input age");
        personAge = getAge.nextInt();

        if ( (personAge >= 0) && (personAge <= 3 ))
            {
                System.out.println("Baby");
            }
        else if ((personAge >=4) && (personAge <=12))
            {
                System.out.println("Child");
            }
        else if ((personAge >=13) && (personAge <= 19))
            {
                System.out.println("Teenager");
            }
        else 
            {
                System.out.println("Adult");
            }
        getAge.close();    
    }
}