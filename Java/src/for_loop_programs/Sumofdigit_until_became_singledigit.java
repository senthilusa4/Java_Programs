package for_loop_programs;

public class Sumofdigit_until_became_singledigit {
	
	public static void main(String args[])
	{
		Sumofdigit_until_became_singledigit obj = new Sumofdigit_until_became_singledigit();
		                                    obj.single_digit(123);
		                                    obj.single_digit(912);
	}
	
	public void single_digit(int n)
	{
		int num =n;
		int sum = 0;
		
		for(int i=0;i<n;)
		{
			int a = n%10;
			sum=sum+a;
			n=n/10;
			
			if((n==0) && (sum>9))
			{
				n=sum;
				sum=0;
			}
		}
		
		System.out.println(num + " Sum of until it become a single digit " + sum);
	}

}
