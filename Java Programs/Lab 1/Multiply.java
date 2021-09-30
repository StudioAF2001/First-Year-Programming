class Multiply
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose : 			A program to multiply 3 numbers together
{
    public static void main(String args[])
        {
            int number1;
            int number2;
            int number3;
            int answer;

            System.out.print("Enter the first number >");
                number1 = EasyIn.getInt();
            System.out.print("Enter the second number >");
                number2 = EasyIn.getInt();
            System.out.print("Enter the third number >");
                number3 = EasyIn.getInt();
                answer = number1*number2*number3;
            System.out.println("The sum of the two numbers is " + answer);
        }
}