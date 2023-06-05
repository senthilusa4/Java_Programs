package series_programs;

public class Fibonacci_with_two_var_for {

    public static void main(String args[])
    {
    Fibonacci_with_two_var_for obj = new Fibonacci_with_two_var_for();
	                           obj.two_var(10);
    }
    
    public void two_var(int n)
    {
    	int first = 0;
    	int second = 1;
    	if(n>=1)
    	{
    		System.out.println(first);
    	}
    		if(n>=2)
    		{
    			System.out.println(second);
    		}
    		
    			for(int i=3;i<=n;i++)
    			{
    				System.out.println(first+second);
    				second = first + second;
    				first = second - first;
    			}
    }
}    


