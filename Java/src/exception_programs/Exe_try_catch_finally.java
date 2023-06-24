package exception_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe_try_catch_finally {
	
	public static void main(String[] args) {
		
		Exe_try_catch_finally obj = new Exe_try_catch_finally();
		                        obj.first();
		                        obj.second();
		                		obj.add();
		                		obj.div();
		
	}
	
	public void first()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");

		try{
			 int a = sc.nextInt();
		   }
		
		catch(InputMismatchException e )
		{
			String s = e.getMessage();
			System.out.println(s);
			System.out.println("Input mis_match EXCEPTION");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception" + e.getMessage());
		}	
		
	}
		
		public void second()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first value");
			
			try{
				 int b = sc.nextInt();
			   }
			
			catch(InputMismatchException e )
			{
				String s = e.getMessage();
				System.out.println(s);
				System.out.println("Input mis_match EXCEPTION");
			}
			
			catch(Exception e)
			{
				System.out.println("Exception" + e.getMessage());
			}
			
		}
		
			public void add()
			{
				int a = 10;
				int b = 0;
				try {
				int c = a+b;
				System.out.println(a + "+" + b + "  =" + c );
				}
					catch(ArithmeticException c)
					{
						String s = c.getMessage();
						System.out.println(s);
						System.out.println("Arithmetic EXCEPTION");
					}
					catch(InputMismatchException e )
					{
						String s = e.getMessage();
						System.out.println(s);
						System.out.println("Input mis_match EXCEPTION");
					}
					
					catch(Exception e)
					{
						System.out.println("Exception" + e.getMessage());
					}
				}
			
				public void div()
				{
					int a = 10;
					int b = 0;
					
					try
					{
						int c = a/b;
					    System.out.println(a + "/" + b + "  =" + c );
				    }
						catch(ArithmeticException c)
						{
							String s = c.getMessage();
							System.out.println(s);
							System.out.println("Arithmetic EXCEPTION");
						}
						catch(InputMismatchException e )
						{
							String s = e.getMessage();
							System.out.println(s);
							System.out.println("Input mis_match EXCEPTION");
						}
						
						catch(Exception e)
						{
							System.out.println("Exception" + e.getMessage());
						}
			
				}
}
