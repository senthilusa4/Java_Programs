package series_programs;

public class Odd_even_series {
	
	public static void main(String args[])
	{
		Odd_even_series obj = new Odd_even_series();
		                       obj.odd_series(10);
		                       obj.even_series(5);
	}
        // This method is for find a ODD NUMBER SERIES
	
		public void odd_series(int n)
		{
			int num = 1;
			System.out.print(num);
			
				for(int i=2;i<=n;i++)
				{
					num =num + 2;
					System.out.print(" " + num);
				}
		}
		
		        // This method is for find a EVEN NUMBER SERIUS
				public void even_series(int n)
				{
					int num = 2;
					if(num%2 != 0)
					{
						num++;
						System.out.print(num);
					}
					else
					{
						System.out.print(num);
					}
					
						for(int i=2;i<=n;i++)
						{
							num = num + 2;
							System.out.print(" " + num);
						}
				}


}
