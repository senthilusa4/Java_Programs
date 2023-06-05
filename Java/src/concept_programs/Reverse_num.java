package concept_programs;

import java.util.Scanner;

public class Reverse_num {
	
	public static void main(String args[])
	  {
		
		// Runtime input 
		// Scanner class is in util package (import java.util.Scanner)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int actual_num = scanner.nextInt();
		
		Reverse_num obj = new Reverse_num();
		            obj.reverse(actual_num);
		
/*	                 obj.reverse(6543);
	                 obj.reverse(6);
	                 obj.reverse(-100);
*/	  }
	 
	        // This method is used for
	        // Finding the reverse number of an given number
	        // Using WHILE-LOOP (while+if)
	        public void reverse(int actual_num)
	        {
	          int given_num = actual_num;
	          int reverse_num = 0;

	          if(given_num > 9)
	            {
	            while(given_num > 0)
	              {
	              int remain = given_num % 10;
	              reverse_num = (reverse_num * 10) + remain;
	              given_num = given_num / 10; 
	              }
	            System.out.println(actual_num + "-- Reversed value is -- " + reverse_num);
	            }
	          else
	            {
	            System.out.println(actual_num + " can't proceed with this number");
	            }
	         }
	}


