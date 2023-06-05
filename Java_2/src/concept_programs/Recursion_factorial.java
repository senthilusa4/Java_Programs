package concept_programs;

public class Recursion_factorial {
	
	public static void main(String args[])

	{
		Recursion_factorial obj = new Recursion_factorial();
		int factorial_num =obj.fact(5);
		System.out.println(factorial_num);
	}

	public int fact(int n)
	{
		
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return (n*fact(n-1));
		}
	}


}
