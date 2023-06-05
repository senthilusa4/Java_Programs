package for_loop_programs;

public class Reverse_and_add_rev {
	
	public static void main(String args[])
	
	{
		Reverse_and_add_rev obj = new Reverse_and_add_rev();
		                    obj.reverse_num(123);
		                    obj.addition_rev_num(1234);
	}
	
	public void reverse_num(int n)
	{
		System.out.println(n + " - reverse num is ");
		
		int rev = 0;
		for(int i=0;i<n;n=n/10)
		{
			int a = n%10;
			rev = (rev*10) + a;
		}
		System.out.println(rev);
	}
		
////////////////////////////////////////////////////////////
		
				public void addition_rev_num(int n)
				{
					System.out.println(n + " Addition of reverse number is ");
				    int sum = 0;
				    int rev = 0;
				    
				    for(int i=0;i<n;n=n/10)
				    {
				    int a = n%10;
				    rev =(rev*10)+a;
				    }
				    
				    	for(int j=0;j<rev;rev=rev/10)
				    	{
				    		int b = rev%10;
				    		sum = sum + b;
				    	}
				    
				System.out.println(sum);    
				}
				
	}


