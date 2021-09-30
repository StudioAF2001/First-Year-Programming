// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				29/10/20
// Purpose :            conversion table 


import java.util.Scanner;

public class jlab2b6
{
    public static void main(String args[])
    {
        int menuSelection;

        Scanner menuNumber = new Scanner(System.in);

        System.out.println("________CONVERSION TABLE________");
        System.out.println("Select an option by entering a number");
        System.out.println("     1) Fahrenheit to Celcius");
        System.out.println("     2) Celcius to Fahrenheit");
        System.out.println("     3) Inches to Centimetres");
        System.out.println("     4) Centimetres to Inches");
        System.out.println("     5) Pounds to Kilogram");
        System.out.println("     6) Kilogram to Pounds");

        System.out.println("");
        System.out.print("-->");

        menuSelection = menuNumber.nextInt();

        if (menuSelection <= 0 || menuSelection > 7)
            {
                System.out.println("<<Invalid number selection >>");
            }
        else 
        {
            System.out.println("____________________________________________");
            switch(menuSelection)
            {
                case 1:
                        System.out.println("Fahrenheit to Celcius conversion");
                        System.out.println(" Celcius = (Fahrenheit / 5/9) - 32");
                        break;
                case 2:
                        System.out.println("Celcius to Fahrenheit conversion");
                        System.out.println(" Fahrenheit = (Celcius * 9/5) + 32");
                        break;
                case 3:
                        System.out.println("Inches to Centimetres conversion");
                        System.out.println("Centimetres = Inches * 2.54");
                        break;
                case 4:
                        System.out.println("Centimetres to Inches conversion");
                        System.out.println("Inches = Centimetres / 2.54");
                        break;
                case 5:
                        System.out.println("Pounds to Kilogram conversion");
                        System.out.println("Kilogram = Pounds / 2.205");
                        break;
                case 6:
                        System.out.println("Kilogram to Pounds conversion");
                        System.out.println("Pounds = Kilogram * 2.205");
                        break;
            }
        }
        menuNumber.close();
    }
}