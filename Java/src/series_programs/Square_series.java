package series_programs;

public class Square_series {
	
	public static void main(String args[])
	{
		Square_series obj = new Square_series();
		              obj.square_number(5);
	}
	
	
	// This method is for find SQUARE NUMBER SERIUS
	
	public void square_number(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			int square = i * i;
			System.out.print(" " + square);
		}
	}
	


}
