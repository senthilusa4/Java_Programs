package concept_programs;

public class Lcm_3num {
	
	public static void main(String args[])
	
	{
		Lcm_3num obj = new Lcm_3num();
		         obj.number(8,6,4);
	} 
    	// This method is used for find a LEAST COMMON MULTIPLYER
        // Given all the number have some specific Multiplyer 
	    // That specific Multiplyer's list to find who is LEAST MULTIPLYER.
		public void number(int a , int b , int c)
		{
			int d = a>b ? a:b;
			int large = d>c ? d:c;    
			int range = a*b*c;
			int value = large;
			
			while(large<=range)
			{
				if((large % a ==0) && (large % b ==0)  && (large % c ==0))
                  {
                	System.out.println(a + " , " + b + " , " + c + "  Lcm is " +large);
                	break;
                  }
				large = large + value;
			}
		}

}
