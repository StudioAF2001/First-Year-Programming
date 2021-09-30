
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose : 			A program to add two numbers
class Addition

{
    public static void main(String args[])
    {   
        int number1;
        int number2;
        int answer;

        System.out.print("Enter the first number > ");
            number1 = EasyIn.getInt();
        System.out.print("Enter the second number > ");
            number2 = EasyIn.getInt();
            answer = number1 + number2;
        System.out.println("The Sum of the two numbers is " + answer);
    }
}