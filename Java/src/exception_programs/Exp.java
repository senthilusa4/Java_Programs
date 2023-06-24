package exception_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp {
	
	public static void main(String args[])
	{
		Exp obj = new Exp();
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = sc.nextInt();
		
		System.out.println("Enter second value");
		int b = sc.nextInt();
		
		
		    obj.throwss(a,b);
		}
		catch(ArithmeticException e){
			String s = e.getMessage();
			System.out.println("Arithmetic Exception || " + s + " || Denaminator can't zero");
		}
		catch(InputMismatchException e) {
			String s = e.getMessage();
			System.out.println("Input_mismatch "+s + " || Enter valid number");
		}
		catch(Exception e) {
			System.out.println("Enter valid digit ");
		}
		
	//	sc.close();

	}
	
	
	                // Throws keyword 
	
	/*
	 * 		Only for throwing(WARNING) the possible exception's  
	 */
	public void throwss(int a ,int b) throws ArithmeticException, InputMismatchException
	{
		int c = a/b;
		System.out.println(c);
	}

}