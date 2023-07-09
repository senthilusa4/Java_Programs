package pattern_programs;

public class Number_pattern {
	
	public static void main(String[] args) 
	{
		Number_pattern obj = new Number_pattern();
		               obj.num();
		               System.out.println();
		               obj.num1();
	}
	
	
	/*
	 *   9 6 3 
	 *   8 5 2
	 *   7 4 1
	 */
	public void num()
	{
		int n=9;
		int s = (n/2) + 1;
	//	System.out.println(s);
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(n+" ");
				if(j!=3)
				n = n-3;
			}
			n=n+s;
			System.out.println();
		}
	}
	
	public void num1()
	{
		int g = 10;
		int n = 3;
		for(int i=1;i<=n;i++)
		{
			int num = g-i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+ " ");
				num = num-n;
			}
			System.out.println();
		}
	}

}
