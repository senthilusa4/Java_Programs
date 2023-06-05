package array_programs;

public class Times_of_element_presence {
	
	public static void main(String args[])
	{
		Times_of_element_presence obj = new Times_of_element_presence();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
	
	        	       obj.presence();             
	}
	
			public void presence()
			{
				int c[] = Static.a;
				int bk[] = Static.a;
				
				System.out.println("Backup array is ");
				for(int i=0;i<bk.length;i++)
				{
					System.out.println(bk[i]);
				}
				
						int value = Integer.MIN_VALUE;
						for(int i=0;i<c.length;i++)
						{
							int count =1;
							for(int j=i+1;j<c.length;j++)
							{
								if((c[i]!=value)&&(c[i]==c[j]))
								{
									count++;
									c[i]=value;
								}
							}
							System.out.println(c[i] + " Present " + count + " times");
						}
				
						
			}

}
