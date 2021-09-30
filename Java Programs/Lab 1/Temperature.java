// ask user for fahrenheit value
// subtract 32
// multiply by 5/9
// print fahrenheit


class Temperature
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				09/10/20
// Purpose :            A program to convert degrees to fahrenheit
{
    public static void main(String args[])

        {
            //inputs
            double centigrade;
            double fahrenheit;

            //process
            System.out.print("Enter Fahrenheit value > ");
                fahrenheit = EasyIn.getDouble();
                centigrade = (fahrenheit - 32) * (0.5556);
            System.out.println("Degrees value in centigrade: " + centigrade );
            
        }
}