package concept_programs;

public class Sum_until_single_digit {
	
	public static void main(String args[])
	
	   {
		Sum_until_single_digit obj = new Sum_until_single_digit();
		                       obj.number(99);
	   }
	
	public void number(int num)
	{
		int n = num;
		int sum = 0;
		while(num>0)
		{
			int a = num % 10;  // 9  // 9      // 8  // 1
			sum = sum + a;     // 9  // 18     // 8  // 9
			num = num/10;      // 9  // 0      // 1  // 0
			
			if(num==0 && sum>9)  // True | True
			{
			num = sum;
			sum=0;
			}
		}
		System.out.println(n+ " is sum of until its becomes a single digit is"+ " " + sum);
	}

}
