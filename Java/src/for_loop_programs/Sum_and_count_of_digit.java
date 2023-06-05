package for_loop_programs;

public class Sum_and_count_of_digit {
	
	public static void main(String args[])
	
	{
		Sum_and_count_of_digit obj = new Sum_and_count_of_digit();
		             obj.sumdigit(123);
		             obj.countdigit(1234);
	}
	
	public void sumdigit(int n)
	{
		System.out.println(n + " sum of digit is ");
		int sum = 0;
		for(int i=0;i<n;n=n/10)
		{
			int a = n%10;
			sum = sum+a;
		}
		
		System.out.println(sum);
	}
	
	///////////////////////////////////////////////////
	
				public void countdigit(int n)
				{
				System.out.println(n + " count digit is :");
				
				int count = 0;
				for(int i=0;i<n;n=n/10)
				   {
					count++;
				   }
				
				System.out.println(count);
				}

}
