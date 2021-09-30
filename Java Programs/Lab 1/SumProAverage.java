// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose :			A program to calculate the product, sum and average of three numbers as they are entered
public class SumProAverage

{
	public static void main(String args[])
	
	{
		double number1;
		double number2;
		double number3;
		
		double sum;
		double product;
		double average;
		
		
		System.out.println("-------------SumProAverage-------------");
		
		
		System.out.print("Please enter first number here: ");
		number1 = EasyIn.getDouble();
		
		sum = number1;
		product = number1;
		average = number1;
		
		
		System.out.println("The sum of the numbers so far is " + sum);
		System.out.println("The product of the numbers so far is " + product);
		System.out.println("The average of the numbers so far is " + average);
		
		
		System.out.println("--------------------------------------- ");
		
		
		System.out.print("Please enter second number here: ");
		number2 = EasyIn.getDouble();	
	
		sum = number1 + number2;
		product = number1 * number2;
		average = (number1 + number2) / 2;
		
		System.out.println("The sum of the numbers so far is " + sum);
		System.out.println("The product of the numbers so far is " + product);
		System.out.println("The average of the numbers so far is " + average);
		
		
		System.out.println("--------------------------------------- ");
		
		
		System.out.print("Please enter third number here: ");
		number3 = EasyIn.getDouble();
		
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		average = (number1 + number2 + number3) / 3;
		
		System.out.println("The sum of the numbers so far is " + sum);
		System.out.println("The product of the numbers so far is " + product);
		System.out.println("The average of the numbers so far is " + average);		
	}
}