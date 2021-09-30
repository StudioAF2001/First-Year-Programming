import java.util.Scanner;

public class objectsPrepSheet 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Employee empArray[] = new Employee[3];

        //inputs 
        String currentName;
        String currentId;
        int currentAge = 0;
        int oldest = 0;
        int youngest = 0;
        int modAge = 0;


        for (int i = 0; i < 3; i++)
            {
                System.out.println("Please enter employee name: ");
                currentName=scan.nextLine();
                System.out.println("Please enter employee ID: ");
                currentId=scan.nextLine();
                System.out.println("Please enter employee age: ");
                currentAge=scan.nextInt();
                System.out.println();
                
                empArray[i] = new Employee(currentName,currentId,currentAge);
                /*empArray[i].setName(currentName);
                empArray[i].setId(currentId);
                empArray[i].setAge(currentAge);*/
                scan.nextLine();
            }
        
        for(int j = 0; j < 3; j++ )
            {
                System.out.print(empArray[j].toString());
            }
        
        for(int k = 0; k < 3; k++)
            {
                empArray[k].getAge();

                oldest=currentAge;
                youngest=currentAge;
                
                if(currentAge>oldest)
                    {
                        oldest=currentAge;

                    }
                if(currentAge<youngest)
                    {
                        youngest=currentAge;
                    }
            }

        modAge=oldest*2;

        System.out.println();
        System.out.println();    
        System.out.println("The oldest employee is " + oldest);
        System.out.println("The youngest employee is " + youngest);
        System.out.println("The modified age of the oldest employee is " + modAge);
        scan.close();
    }
}
