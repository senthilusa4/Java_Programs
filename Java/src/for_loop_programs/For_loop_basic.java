package for_loop_programs;

public class For_loop_basic {
	
	public static void main(String args[])
	{
		For_loop_basic obj = new For_loop_basic();
		         System.out.println("Print HI 5times");
		         obj.print_hi_5times();
		         
		         System.out.println("Print 100 as 10times");
		         obj.print_100_10times();
		         
		         System.out.println("Print 1 to 10 Natural number");
		         obj.print_1to10_natural_numbers();
		         
		         System.out.println("Print first 5 even number");
		         obj.first_5even_num();
		         
		         System.out.println("Print first 5 odd number");
		         obj.first_5odd_num();
		         
		         System.out.println("Print last 5 even number");
		         obj.last_5even_givenrange();
		         
		         System.out.println("Print 300 to 200 range divisible by 9");
		         obj.print_300to250_div_9();
		         
		         System.out.println("Print 100 to 200 divisible by 3 and 5");
		         obj.print_100to200_div_3and5();
		         
		         System.out.println("Print 100 to 500 divisible by 7 and greaterthan 450);");
		         obj.print_100to500_div_7and_greaterthan_450();
	}
	
	public void print_hi_5times()
	{
	  int n = 5;	
	  for(int i =0; i<=n; i++)
	    {
		System.out.println("Hi");
	    }
	}
	
	//////////////////////////////////////////////////////////
	
		public void print_100_10times()
		{
			int n = 10;
			for(int i=1; i<=n; i++)
			{
				System.out.println(100);
			}
		}
		
   /////////////////////////////////////////////////////////		
			public void print_1to10_natural_numbers()
			{
				int n = 10;
				for(int i=1;i<=n;i++)
				{
					System.out.println(i);
				}
				
			}
			

///////////////////////////////////////////////////////////
				public void first_5even_num()
				{
					int num = 2;
					int n = 5;
					for(int i=1;i<=n;i++,num=num+2)
					{
						System.out.println(num);
					}
				}
				
//////////////////////////////////////////////////////////				
				
					public void first_5odd_num()
					{
						int num = 1;
						int n = 5;
						for(int i=1;i<=n;i++,num=num+2)
						{
							System.out.println(num);
						}
					}
					
//////////////////////////////////////////////////////////					
					
						public void last_5even_givenrange()
						{
							int num = 20;
							int n =5;
							for(int i=1;i<=n;i++,num=num-2)
							{
								System.out.println(num);
							}
						}
						
///////////////////////////////////////////////////////////						
						
							public void print_300to250_div_9()
							{
							int n = 250;
							for(int i=300;i>=n;i--)
							{
								if(i % 9==0)
								{
									System.out.println(i);
								}
							}
							}
							
///////////////////////////////////////////////////////////
							
								public void print_100to200_div_3and5()
								{
									for(int i=100;i<=200;i++)
									{
										if((i%3==0) && (i%5==0))
										{
										System.out.println(i);
										}
									}
								}
		
			//////////////////////////////////////////////////////////////////////
								
									public void print_100to500_div_7and_greaterthan_450()
									{
								
										for(int i=100;i<=500;i++)
										{
											if((i>450) && (i%7 == 0))
											{
												System.out.println(i);
											}
										}
									}	

}
