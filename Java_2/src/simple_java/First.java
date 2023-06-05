package simple_java;

public class First {
	
	public static void main(String args[])
	{
		First obj = new First();
		int ans = obj.reverse(1534236469);
		System.out.println(ans);
	}	
		   
	public int reverse(int x) {
		        
    int rev = 0;

		if((-2147483647<=x && x<=0) || (2147483647>=x && x<=0))
		{
		   if((x<-9) || (x>9))
		   {
		       if(x>9)
		       {
		          for(int i=0;i<x;x=x/10)
	              {
		              int mod = x%10;
		              rev = (rev*10) + mod;
		          }  
		       }  

		            if(x<-9)
		            {
		                for(int i=0;i>x;x=x/10)
		                {
		                    int mod = x%10;
		                    rev = (rev*10) + mod;
		                }   
		            }
		        }
		        else
		        {
		            return x;
		        }    
		    return rev;        
     } 
	 else
	 {
		 return 0;
	 }               
			
	}
}

