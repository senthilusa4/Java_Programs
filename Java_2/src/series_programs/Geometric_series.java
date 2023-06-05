package series_programs;

public class Geometric_series {
	
	public static void main(String args[])
	{
		Geometric_series obj = new Geometric_series();
		                 obj.geometric_number(5);
	}
	
	// This method is for find a GEOMETRIC NUMBER
	// The sum of the term is geometric series
	// 5 10 20 40 80......
	public void geometric_number(int n)
	{
		int num = 5;
		
		if(n>=1)
		{
			System.out.print(num);
		}
		
			for(int i=2;i<=n;i++)
			{
				// num = num * 2;
				num = num + num ;  
				System.out.print(" " + num);
			}
	}

}
