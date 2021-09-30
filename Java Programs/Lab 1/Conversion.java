class Conversion 
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose : 			A program to convert inches to centimeteres
{
    public static void main(String args[])

        {
            double inches;
            double answer;
            double conversion = 2.54;

            System.out.print("Enter value in inches >");
            inches = EasyIn.getDouble();
            answer = inches*conversion; 
            System.out.println("The value entered in centimeters is " + answer );
        }
}