public class Grades 
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				09/10/20
// Purpose :            A program to calculate a students average grade out of 3 subjects
{
    public static void main(String args[])
        {
        //Declare variables
        double progMark;
        double hardwareMark;
        double mathsMark;
        double averageMark;
        
        //Ask user for grades
        System.out.print("Enter grade for Programming: ");
            progMark = EasyIn.getDouble();
        System.out.print("Enter grade for Hardware: ");
            hardwareMark = EasyIn.getDouble();
        System.out.print("Enter grade for Maths: ");
            mathsMark = EasyIn.getDouble();

        //Calculation
        averageMark = (progMark + hardwareMark + mathsMark) / 3;

        //Print the average
        System.out.println("The average grade of the three subjects is: " + averageMark);
        }
    
}
