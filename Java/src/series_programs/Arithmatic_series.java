package series_programs;

public class Arithmatic_series {
	
	public static void main(String args[])
	{
		Arithmatic_series obj = new Arithmatic_series();
		                  obj.number(10);
	}
	
	// This method is used for find a ARITHMATIC SERIES
	// An ordered set of number's that have common difference between each consecutive term
	// 1 4 7 10 13 16 19.....
	public void number(int n)
	{
		int num = 1;
		int d = 3;
		if(n>=1)
		{
			System.out.print(num);
		}
		
		for(int i=2;i<=n;i++)
		{
			num = num + d;
			System.out.print(" " + num);
		}
	}

}
