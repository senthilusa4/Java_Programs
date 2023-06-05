package for_loop_programs;

public class Hcf_program {
	
	public static void main(String args[])
	{
		Hcf_program obj = new Hcf_program();
		            obj.hcf_two_number(12,30);
		            obj.hcf_three_number(18,54,27);
	}

	public void hcf_two_number(int a, int b)
	{
		int factor = 0;
		int small = (a<b) ? a:b;
		
		for(int i =1;i<=small;i++)
		{
			if(a%i==0 && b%i==0)
			{
		        factor = i;
			}
		}
		
		System.out.println(a + " | " + b + " is Highest divisor = " + factor);
	}
	
	
	public void hcf_three_number(int a,int b,int c)
	{
		int factor = 0;
		int d = (a>b) ? b:a;
		int small = (c>d) ? d:a;
		
		for(int i=1;i<=small;i++)
		{
			if((a%i==0) && (b%i==0) && (c%i==0))
			{
				factor = i;
			}
		}
		System.out.println(a + "," + b + "," + c + " is Hignest divisor = " + factor);
	}
}
