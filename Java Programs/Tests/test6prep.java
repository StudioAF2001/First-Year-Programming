public class test6prep 
{

    public int balanceNumber(Customer[] customerArray, int balVal,  int numberOfElements)
    {
        int result =0;

        for(int i = 0; i<customerArray.length; i++)
            {
                if (customerArray[i].getBalance<balVal)
                    {
                        result ++;
                    }
            }
    }    
}
