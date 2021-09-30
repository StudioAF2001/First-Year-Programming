//find gross pay
//find net pay
//take tax allowances
//add personal allowance
//add child allowance -> 1k per lab sheet
public class Tax
// Student Name : 		Andrew Skelly
// Student Id Number : 	C00261511
// Date :				09/10/20
// Purpose : 
{
    public static void main(String args[])
        {
        //inputs
        double gross;
        double netpay;
        double tax;
        int children;
        double childmoney;
        double answer;

        //process
        System.out.print("Enter gross pay: ");
            gross = EasyIn.getDouble();
        System.out.print("How many children do you have: ");
            children = EasyIn.getInt();

        //Calculation
        tax = gross * 24/100;
        netpay = gross * 76/100;

        //Adding allowance
        answer = netpay + 5000.00;
        childmoney = children * 1000;

        //Getting total
        answer = answer + childmoney;
        
        //print answer
        System.out.println("The tax to be paid is: " + tax);
        System.out.println("The annual income is: " + answer);
    
        }

}
