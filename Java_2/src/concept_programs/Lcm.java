package concept_programs;

public class Lcm {
	
	public static void main(String[] args)
	{
		Lcm obj = new Lcm();
		    obj.least_num();
	}
	// This method is used for find a LEAST COMMON MULTIPLYER
    // Given all the number have some specific Multiplyer 
    // That specific Multiplyer's list to find who is LEAST MULTIPLYER.
	public void least_num()
	{
		int a = 3;
		int b = 7;
		
		int large = (a>b) ? a:b ;
		int temp = large;
		int range = a*b;
		  
		  while(large<=range)
		  {
			  if((large % a ==0) && (large % b ==0))
			  {
				  System.out.println(a + " and "+ b + " LCM is " + large);
				  break;
			  }
			large = large + temp;  
		  }
		
	}

}
