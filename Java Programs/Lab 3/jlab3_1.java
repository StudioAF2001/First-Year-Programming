// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				30/10/20
// Purpose :            conversion table that terminates when number 7 is entered
import java.util.Scanner;

public class jlab3_1
{
    public static void main(String args[])
    {
        
        Scanner menuNumber = new Scanner(System.in);

        int menuSelection = 0;
        double input;
        double output;

        while(menuSelection != 7)
        {
            
            System.out.println("________CONVERSION TABLE________");
            System.out.println("Select an option by entering a number");
            System.out.println("1) Fahrenheit to Celcius");
            System.out.println("2) Celcius to Fahrenheit");
            System.out.println("3) Inches to Centimetres");
            System.out.println("4) Centimetres to Inches");
            System.out.println("5) Pounds to Kilogram");
            System.out.println("6) Kilogram to Pounds");
            System.out.println("7) Quit the program");

            System.out.println("");
            System.out.print("-->");

            menuSelection = menuNumber.nextInt();

            if (menuSelection <= 0 || menuSelection > 7)
                {
                    System.out.println("<<Invalid number selection >>");
                }
            else 
            {
            System.out.println("______________________________");
            switch(menuSelection)
                {
                case 1:
                        System.out.println("Fahrenheit to Celcius conversion");
                        System.out.println(" Celcius = (Fahrenheit / 5/9) - 32");
                        System.out.println("Please enter your value in celcius " );
                        System.out.println("Please enter value in inches ");
                        input = menuNumber.nextDouble();
                        output = (input / 0.55555) - 32;
                        System.out.println("Your value in Celcius is " + output);
                        System.out.println("______________________________");
                        System.out.println("");
                        break;
                case 2:
                        System.out.println("Celcius to Fahrenheit conversion");
                        System.out.println("Fahrenheit = (Celcius * 9/5) + 32");
                        System.out.println("Please enter value in inches ");
                        input = menuNumber.nextDouble();
                        output = (input * 1.8) + 32;
                        System.out.println("Your value in Fahrenheit is " + output);
                        System.out.println("______________________________");
                        System.out.println("");
                        break;
                case 3:
                        System.out.println("Inches to Centimetres conversion");
                        System.out.println("Centimetres = Inches * 2.54");
                        System.out.println("Please enter value in inches ");
                        input = menuNumber.nextDouble();
                        output = input * 2.54;
                        System.out.println("Your value in centimetres is " + output);
                        System.out.println("______________________________");
                        System.out.println("");
                        break;
                case 4:
                        System.out.println("Centimetres to Inches conversion");
                        System.out.println("Inches = Centimetres / 2.54");
                        System.out.println("Please enter value in inches ");
                        input = menuNumber.nextDouble();
                        output = input / 2.54;
                        System.out.println("Your value in inches is " + output);
                        System.out.println("______________________________");
                        System.out.println("");
                        break;
                case 5:
                        System.out.println("Pounds to Kilogram conversion");
                        System.out.println("Kilogram = Pounds / 2.205");
                        System.out.println("Please enter value in inches ");
                        input = menuNumber.nextDouble();
                        output = input / 2.205;
                        System.out.println("Your value in kilogram is " + output);
                        System.out.println("______________________________");
                        System.out.println("");
                        break;
                case 6:
                        System.out.println("Kilogram to Pounds conversion");
                        System.out.println("Pounds = Kilogram * 2.205");
                        System.out.println("Please enter value in kilogram ");
                        input = menuNumber.nextDouble();
                        output = input * 2.205;
                        System.out.println("Your value in pounds is " + output);
                        System.out.println("______________________________");
                        System.out.println("");
                        break;
                case 7:
                        System.exit(0);
                }
            
            }
        }
        menuNumber.close();
    }
}