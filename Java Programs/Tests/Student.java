class Student
{

	private String name;
	private String StudentId;
	private int average;

	public Student () // constructor
	
	{
		
	}
	
	public Student (String theName, String theID, int theAverage) // constructor
	
	{
		name = theName;
		StudentId = theID;
		average = theAverage;
		
	}
	
	// Mutators (Setter Methods)
	
	public void setName (String theName)
	
	{
		name = theName;
	}
	
	public void setId (String theId)
	
	{
		StudentId = theId;
	}
	
	public void setAverage (int theAverage)
	
	{
		average = theAverage;
	}
	
	// Selectors (Getter Methods) no parameters
	
	public String getName ()
	
	{
		return name;
	}
	
	public String getId ()
	
	{
		return StudentId;
	}
	
	public int getAverage ()
	
	{
		return average;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "\n Name : " + name;
		myString += "\n ID   : " + StudentId;
		myString += "\n average  : " + average;
		
		return myString;
	
	}

}
