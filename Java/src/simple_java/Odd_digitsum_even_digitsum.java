package simple_java;

public class Odd_digitsum_even_digitsum {
	
	public static void main(String args[])
	{
		Odd_digitsum_even_digitsum obj = new Odd_digitsum_even_digitsum();
		                           obj.number(149327);
		                         //  obj.number(1234);
		                         //  obj.number(75351);	             
	}
	
	public void number(int num)
	{
		System.out.println("Given is " + num);
        int sum1 = 0;
        int sum2 = 0;
		int n = num;
		int number = n;
		int count = 0;
		
		for(int i=0;i<number;number=number/10)
		{
			count++;
		}
		
		
		for(int i=0;num>i;num=num/10)
		{
				int mod = num %10;
				
					if(count%2==0)
					{
						sum2 = sum2 + mod;	
					}
					else
					{
						sum1 = sum1 + mod;
					}
					
					count--;
		}
		
		System.out.println("odd digit sum is " + sum1);
		System.out.println("even digit sum is " + sum2);
		System.out.println("final answer is " + (sum2 - sum1));
	}

}
