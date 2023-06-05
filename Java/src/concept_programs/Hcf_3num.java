package concept_programs;

public class Hcf_3num {
	
	public static void  main(String args[])
	
	{
		Hcf_3num obj = new Hcf_3num();
		         obj.number(8,4,6);
	}
	// This method is used for find a HIGHEST COMMON FACTOR
    // Given all the number have some specific factor 
	// That specific factor's list to find who is highest factor
	public void number(int a , int b , int c)
	{
		int d = (a>b) ? b:a;
		int small = (d>c) ? d:c;
		int i = 1;
		int hcf = 0;
		while(i <= small)
		  {
			if((a%i == 0) && (b%i == 0) && (c%i==0))
			{
				hcf = i;
			}
			i++;
		  }
		System.out.println(hcf);
	}

}
