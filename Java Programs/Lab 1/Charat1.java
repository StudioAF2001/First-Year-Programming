
class Charat1

// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{	
    public static void main(String[] args) 
    
	{
    	String name;
		int index;
		String revName; // holds the reverse of name
		char theChar;
    	
    	revName = "";
		System.out.print("Enter a name ");
		name = EasyIn.getString();
		for (index = name.length() - 1 ; index >= 0; index --)
			{      
				theChar = name.charAt(index); 							 
				revName = revName + theChar;
			}
		System.out.println("The reverse of " + name + " is " + revName);
	}
}
