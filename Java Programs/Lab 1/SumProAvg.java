class SumProAvg
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose : 			A program to find the sum, average and product of three numbers
{
    public static void main(String args[])
    {
        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int average;

        System.out.print("Enter first number >");
            number1 = EasyIn.getInt();
        System.out.print("Enter second number >");
            number2 = EasyIn.getInt();
        System.out.print("Enter third number >");
            number3 = EasyIn.getInt();
            sum = number1 + number2 + number3;
        System.out.println("The sum of the numbers is " + sum);
            product = number1*number2*number3;
        System.out.println("The product of the numbers is " + product);
            average = sum/3;
        System.out.println("The average of the numbers is " + average);
    }

}