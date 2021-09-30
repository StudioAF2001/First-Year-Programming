import java.util.Scanner;

public class Test62021
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //variable declaration
        int i=0;
        String studentName;
        String studentId;
        String concatIds;
        int studentAverage;
        int length;
        int numberOfElements;

        numberOfElements=0;
        //declaring and setting size of Array
        Student[] stuArray = new Student[3];

        //for loop for inputing data
        for (i = 0; i < 3; i++)
            {
                System.out.print("Enter name " + (i+1) + ": ");
                studentName=scan.nextLine();
                System.out.print("Enter ID " + (i+1) + ": ");
                studentId=scan.nextLine();
                System.out.print("Enter average: " + (i+1) + ": ");
                studentAverage=scan.nextInt();
                System.out.println();

                stuArray[i]= new Student(studentName,studentId,studentAverage);
                scan.nextLine();
                numberOfElements++;
            }  
            
        System.out.print("Please input the search length:");
        length = scan.nextInt();

        concatIds=IdList(stuArray, length, numberOfElements);

        System.out.print(concatIds);
    }

    public static String IdList(Student[] theArray, int theLength, int theNumberOfElements)
    {
        int i = 0;
        String concatString;

        concatString = "";

        for(i = 0; i<theNumberOfElements; i++)
        {
            if(theArray[i].getName().length()<theLength)
                {
                    concatString += theArray[i].getId();
                    concatString += " ";
                }
        }

        return concatString;
    }
}