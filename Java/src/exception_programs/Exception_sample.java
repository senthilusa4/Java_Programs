package exception_programs;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * 
 * 		--Try block-- Where_ever possibly Exception occurs That area should surround of try block
 *                That try block will catch the exception and throw to the catch block
 *                
 *                 Try block is a must block
 *                 
 *                 try{  -        What kind of exception occurs in runtime 
 *                    }   That All are try block will catch || AND TRY block THROW TO THE CATCH BLOCK
 *                    
 *                 multiple catch block will allow | catch block will provide | Showing what kind of exception is
 *                 
 *                 catch(){  -  What kind of exception throw the try block That catch block will execute
 *                        }   		if in-case unpredictable exception came means 
 *                                  exception parameter passed catch block will execute 
 *                                  
 *                      ### catch(Exception e) must present in |last-catch block|
 *                      ### Because write in first means That will execute every_time 
 *                      ### So in down catch block are going to like unreachable code 
 *                      
 *                 finally{	-	Whatever give in finally it will execute	
 *                 		  }	                            		
 */

public class Exception_sample{
	
	public static void main(String[] args)
	{	
		Exception_sample ob = new Exception_sample();
		                 ob.sample();               
	}
	
	public void sample()
	{
		Scanner sc = new Scanner(System.in);
		
		try {	
			System.out.println("Plz enter first value");
			int a = sc.nextInt();
			System.out.println("plz enter second value");
			int b = sc.nextInt();
			
			int c = a+b;
			System.out.println("Addition of two value is -- " + c);
			
			int d = a/b;
			System.out.println("Divide " + d);
			
			int e[] = null;
			System.out.println(e[4]);   
			
			System.out.println("Thanks");	
		}
			catch(ArithmeticException a)
			{
				System.out.println("Artithmatic exception occurs");
			}
				catch(InputMismatchException e)
				{
					System.out.println("Input Mismatch exception occurs");
				}
		
					catch(ArrayIndexOutOfBoundsException e ) 
		            {
						System.out.println("Entered Index value not in array");
		            }
		
						catch(NullPointerException e )
		                {
							System.out.println("Null pointer exception occurs");
		                }
							catch(Exception e) 
							{
								System.out.println("Exception");
							}
		
		
					
		finally
		{
			System.out.println("Welcome"); 
		}
		
	sc.close();	
	}

}








