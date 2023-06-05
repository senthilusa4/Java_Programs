package for_loop_programs;

public class Prime_or_not_boolean {
	
	public static void main(String args[])
	
	{
		Prime_or_not_boolean obj = new Prime_or_not_boolean();
		                     obj.prime(47);
		                     obj.prime(12);
	}
	
	public void prime(int num)
	{
	  boolean flag = false;
	  int n = num/2;
	  
	  for(int i=2;i<=n;i++)
	  {
		  if(n%i == 0)
		  {
			  flag = true;
		  }
	  i++;	  
      }
	  
	  if(flag == true)
	  {
		  System.out.println(num + " is NOT A PRIME");
	  }
	  
	  else
	  {
		  System.out.println(num + " is PRIME");
	  }
	}

}
