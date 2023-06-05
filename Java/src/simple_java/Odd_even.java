package simple_java;

public class Odd_even {
	
	public static void main(String args[])
	  {
	   Odd_even obj = new Odd_even();
	           obj.check(100);

	  }  

	    // This method is for
	    // Write a logic to find a given number is odd number or even number 
	    // Using IFELSE condition 
	    public void check(int num)
	    {
	      if(num % 2 == 1)
	      {
	      System.out.println(num + " is a odd number");
	      }
	      else
	       {
	       System.out.println(num + " is an even number");
	       }
	    }
	}     


