package array_programs;

public class Store_sumOf_digit_untilbecome_single_digit {
	
	public static void main(String args[])
	{
		                                       Static.size();
		                                       Static.element();
		                                       Static.display();
	Store_sumOf_digit_untilbecome_single_digit obj = new Store_sumOf_digit_untilbecome_single_digit();
                                               obj.store_single_digit();
	}
	
	// This method is for check the given array elements
	// The array elements | SUM OF DIGIT UNTIL BECOMES A SINGLE DIGIT
	// That single digit value will stored in RESULT_ARRAY
	//     # INPUT - 123 910 987 
	//     # EXPECT - 6   1   6  EXPLAIN = 1+2+3=6 | 9+1+0=10--> 1+0=1 | 9+8+7=24-->2+4=6
	public void store_single_digit()
	{
		int b[] = Static.a;
		int c[] = new int[b.length];
		
		for(int i=0;i<b.length;i++)
		{
			int sum = 0;
			for(int j=0;j<b[i];)  
			{
				int mod = b[i]%10;
				sum = sum + mod;
				b[i]=b[i]/10;
				
				if(b[i]==0 && sum>9)
				{
					b[i]=sum;
					sum=0;
				}
			}
			c[i]=sum;
		}
		
				System.out.println();
				System.out.println("Result array");
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]+ " ");
				}
	}
}
