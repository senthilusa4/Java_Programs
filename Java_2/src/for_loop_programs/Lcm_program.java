package for_loop_programs;

public class Lcm_program {
	
	public static void main(String args[])
	
	{
		Lcm_program obj = new Lcm_program();
		                       obj.lcm_two_number(25,15);
		                       obj.lcm_three_number(15,25,35);
	}
	
	public void lcm_two_number(int a,int b)
	{
		int range = a*b;
		int large = (a>b) ? a:b ;
		
		for(int i=large;i<=range;i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	
			public void lcm_three_number(int a, int b, int c)
			{
				int range = a*b*c;
				int d = (a>b) ? a:b;
				int large = (c>d) ? c:d;
				
				for(int i=large;i<=range;i++)
				{
					if((i%a ==0) && (i%b ==0) && (i%c ==0))
					{
						System.out.println(i);
						break;
					}
				}
			}

}
