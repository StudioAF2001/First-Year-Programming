public class methodExample
{


    public static void top()
    {
	    System.out.println("Top" );
    }


    public static void middle()
    {
	    top();
	    System.out.println("Middle" );
	    bottom();
    }   


    public static void bottom()
    {
	    System.out.println("Bottom" );
    }


    public static void main(String[] args)

    {
		middle();
    }
}
