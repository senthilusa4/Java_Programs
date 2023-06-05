package concept_programs;

public class Prime_with_boolean {

	public static void main(String args[])
	
		{
		Prime_with_boolean obj = new Prime_with_boolean();
		                   obj.prime(7);
		                   obj.prime(8);
		                   obj.prime(47);
		}
	
	// This method is used for 
    // To check given number is PRIME or not
    // Using bOOLEAN | WHILE-LOOP (while+if)
	public void prime(int num)
	{
		boolean flag = false;
		int n = num / 2;
		int i = 2;
		while(i<n)
		{
			if(n % i == 0)
			{
				flag = true;
			}
		i++;	
		}
		
			if(flag == true)
			{
				System.out.println(num + " Not a PRIME");
			}
			else
			{
				System.out.println(num + " Prime");
			}
	}
}
