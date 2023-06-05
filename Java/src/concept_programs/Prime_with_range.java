package concept_programs;

public class Prime_with_range {

	public static void main(String args[])
	{
		Prime_with_range obj = new Prime_with_range();
		                 obj.prime(15);
	}
	
	// This method is used for (GIVEN WITH RANGE PRIME) 
    // To check given number is PRIME or not
    // Using WHILE-LOOP (while+if)
	public void prime(int times)
	   {
		int counter = 0;
		int prime = 2;
		System.out.println(" Print first " + times + " PRIME NUMBER  ");
		
		while(counter < times)
		{
		  int i = 1;
	      int count = 0;
	      	      	
	      		while(i<=prime)
	      		{
	      			if(prime % i ==0)
	      			  {
	      		      count++;
	      			  }
	      	    i++;	
	      		}
		
	      		if(count == 2)
		        {
		    	  System.out.println(prime);
		    	  counter++;
		        }
	     prime++; 		
		 }
		
	   }
}
