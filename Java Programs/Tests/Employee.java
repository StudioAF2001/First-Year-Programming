class Employee
{

	private String name;
	private String employeeId;
	private int age;
	
    public Employee()
    {

    }

	public Employee (String theName, String theID, int theAge) // constructor
	
	{
		name = theName;
		employeeId = theID;
		age = theAge;
	}
	
	// Mutators (Setter Methods)
	
	public void setName (String theName)
	
	{
		name = theName;
	}
	
	public void setId (String theId)
	
	{
		employeeId = theId;
	}
	
	public void setAge (int theAge)
	
	{
		age = theAge;
	}
	
	// Selectors (Getter Methods) no parameters
	
	public String getName ()
	
	{
		return name;
	}
	
	public String getId ()
	
	{
		return employeeId;
	}
	
	public int getAge ()
	
	{
		return age;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
        myString += "\n";
		myString += "\n Name :: " + name;
		myString += "\n ID   :: " + employeeId;
		myString += "\n age  :: " + age;

		return myString;
	
	} 

}
