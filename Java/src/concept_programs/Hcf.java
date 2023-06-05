package concept_programs;

public class Hcf {
	
	public static void main(String args[])
	{
		Hcf obj = new Hcf();
		    obj.number(50,60);
	}

	// This method is used for find a HIGHEST COMMON FACTOR
    // Given all the number have some specific factor 
	// That specific factor's list to find who is highest factor
	public void number(int a, int b)
	 { 
		int small = (a>b) ? b:a ;
		int i = 1;
		int hcf = 0;
		
		while(i<=small)
		  {
			if((a%i==0 && b%i==0))
			  {
				 hcf = i;
			  }
			i++;
		  }
		System.out.println(hcf);
	 }
}
