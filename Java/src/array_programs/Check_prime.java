package array_programs;

public class Check_prime {
	
	
	//  ###  CHECK THE GIVEN ARRAY |  Prime element value will STORE in the RESULT ARRAY 
	public static void main(String args[])
	{
					Static.size();
					Static.element();
					Static.display();
		Check_prime obj = new Check_prime();
	 	int size = obj.prime_array_size();
		           obj.check_prime(size);
	}
	
	
	//  This method is for checking (or) finding the how many prime present in the array
	//  because based on the present only can create result array
	public int prime_array_size()
	{
		int b[] = Static.a;
		
		int counter = 0;
		for(int j=0;j<b.length;j++)
		   {
		   int count=0;	
		   for(int i=1;i<=b[j];i++)
		      {
			     if(b[j]%i==0)
			     {
			    	 count++;
			     }
		      }
		   		 if(count==2)
		   		 {
		   			counter++; 
		   		 }
		   }
		System.out.println();
		System.out.println("Prime present " + counter + " Times");
	return counter;	
	} 
	
				// This method is for checking the elements are prime or not
	            // 	   # if that checking element is prime means will store result array (output array) otherwise don't store
				public void check_prime(int prime_present)
				{
					System.out.println();
					if(prime_present!=0)
					{
						int b[] = Static.a;
						int c[] = new int[prime_present]; 
						
						int temp=0;
						for(int i=0;i<b.length;i++)
						{
							int count = 0;
							for(int j=1;j<=b[i];j++)
							{
								if(b[i]%j==0)
								{
									count++;
								}
							}
								if(count==2)
								{
									c[temp]=b[i];
									temp++;
								}
						}
										System.out.println();
										System.out.println("ONLY Prime | c[] Result array is ");
										for(int i=0;i<c.length;i++)
										{
											System.out.print(c[i] + " ");
										}
				    }
					else
					{
						System.out.println("NO PRIME PRESENT IN THE GIVEN ARRAY ");
					}
				}

}














