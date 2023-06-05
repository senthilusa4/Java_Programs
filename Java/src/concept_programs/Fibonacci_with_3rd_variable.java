package concept_programs;

public class Fibonacci_with_3rd_variable {
	
	public static void main(String args[])
	
	   {
		Fibonacci_with_3rd_variable obj = new Fibonacci_with_3rd_variable();
		                            obj.number(5);
	   }
	
	   // This method is for find a Fibonacci number(With 3rd variable)
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
			   int temp = first + second; 
			   System.out.println(temp);
			   
			   first = second;
			   second = temp;
			   count++;
		      }
		}
}


