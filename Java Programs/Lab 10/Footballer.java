class Footballer 
{
    
    private String name;
    private int goalsScored;
    private int pointsScored;
    
    public Footballer ( String theName, int theGoals, int thePoints)
    {
        name = theName;
        goalsScored = theGoals;
        pointsScored = thePoints;
    }

    //mutators

    public void setName(String theName)
    {
        name=theName;
    }
    
    public void setGoals(int theGoals)
    {
        goalsScored=theGoals;
    }

    public void setPoints(int thePoints)
    {
        pointsScored= thePoints;
    }
    
    //selectors
    public String getName ()
	
	{
		return name;
	}
	
	public int getGoals ()
	
	{
		return goalsScored;
	}
	
	public int getPoints ()
	
	{
		return pointsScored;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
        myString += "\n";
		myString += "\n Name :: " + name;
		myString += "\n goalsScored   :: " + goalsScored;
		myString += "\n pointsScored  :: " + pointsScored;

		return myString;
	
	} 
}
