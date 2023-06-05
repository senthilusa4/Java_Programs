package concept_programs;

public class Recursion_sumof_num {
	
	public static void main(String args[])
	{
		Recursion_sumof_num obj = new Recursion_sumof_num();
		int sum_number = obj.sum(5);
		System.out.println(sum_number);
	}
	
	public int sum(int n)
	{
		int value = 0;
		if(n == 1)
		{
			return 1;
		}
		
		value = value + sum(n-1);
			return value;
		
	}

}
