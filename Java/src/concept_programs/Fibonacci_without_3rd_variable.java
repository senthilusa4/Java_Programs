package concept_programs;

public class Fibonacci_without_3rd_variable {
	
	public static void main(String args[])
	
	{
		Fibonacci_without_3rd_variable obj = new Fibonacci_without_3rd_variable();
		                            obj.number(10);
	}
		
     	// This method is for find a Fibonacci number(Without 3rd variable)
	    // Fibonacci serious is 0 1 1 2 3 5 8 13
	    // Find Third number = ADD before two numbers 
		public void number(int num)
		{
			int first = 0;
			int second = 1;
			if(num >= 1)
			{
				System.out.println(first);
			}
			
			   if(num > 1)
			   {
				   System.out.println(second);
			   }
			        
			        int count = 3;
			        while(num >= count)
			          {
			        	System.out.println(first + second);
			        	second = first + second;             // 0+1= 1
			        	first = second - first;              // 1-0 = 1 
			            count++;
			          }	   
		}
}
