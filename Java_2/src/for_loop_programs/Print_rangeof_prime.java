package for_loop_programs;

public class Print_rangeof_prime {
	
	public static void main(String args[])
	
	{
		Print_rangeof_prime obj = new Print_rangeof_prime();
		                  //  obj.range_prime();
		                  //  obj.times_prime();
		                    obj.count_prime();
	}
	
	public void range_prime()
	{
		
		for(int i=1;i<=100;i++)
		{
			int count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
				public void times_prime()
				{
					int prime = 2;
					int times = 15;
					
					for(int i=1;i<=times;)
					{
						int count = 0;
						for(int j=1;j<=prime;j++)
						{
							if(prime%j==0)
							{
							count++;
					     	}
						}							
								if(count==2)
								{
									System.out.println(prime);
									prime++;
									i++;
								}
								else
								{
									prime++;
								}
								
					}
				}	
					
/////////////////////////////////////////////////////////////////////////////////
					
							public void count_prime()
							{
							int counter = 0;
							
							  for(int i=1;i<=100;i++)
							  {
								 int count = 0;
								 for(int j=1;j<=i;j++)
								 {
									if(i%j==0)
									{
										count++;
									}
								 } 	
										if(count==2)
										{
											counter++;
										}
								 } 
							  
							  System.out.println(counter);
							}
		}


