class Travel
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				08/10/20
// Purpose : 			A program to calculate the average miles per hour and miles per gallon of a trip
{
    public static void main(String args[])
        {
            Double distance;
            Double hours;
            Double gallons;
            Double answer;
            Double answer2;

            System.out.print("Enter distance in miles >");
                distance = EasyIn.getDouble();
            System.out.print("Enter time in hours >");
                hours = EasyIn.getDouble();
            System.out.print("Enter gallons of pertol used >");
                gallons = EasyIn.getDouble();
                answer = distance/hours;
            System.out.println("The average miles per hour is " + answer);
                answer2 = distance/gallons;
            System.out.println("The average miles per gallon is " + answer2);
        }
    
}