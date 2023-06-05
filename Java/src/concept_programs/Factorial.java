package concept_programs;

public class Factorial {
	
	public static void main(String args[])
	
	{
	
	Factorial obj = new Factorial();
	          obj.number(5);
	}
	
	// This method is used for
	// Given number is 5 means = 5*4*3*2*1 = 120
	public void number(int num)
	{
		
		int fact = 1;
		int i = 1;
		
		while(i<=num)
		{
			fact = fact * i;
			i++;		
		}
		System.out.println(fact);
	}

}
