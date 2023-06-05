package series_programs;

public class Fibonacci_with_third_var_for {
	
	public static void main(String args[])
	
	{
		Fibonacci_with_third_var_for obj = new Fibonacci_with_third_var_for();
		                             obj.third_var(10);
	}
	
	public void third_var(int n)
	{
		int first=0;
		int second=1;
	    if(n>=1)
	    {
		    System.out.println(first);
	    }
	       if(n>=2)
	       {
		   System.out.println(second);
           }
	
		       for(int i=3;i<=10;i++)
		       {
			   int num = first + second;
			   System.out.println(num);
			   first = second;
			   second = num;
	           }
	}

}
