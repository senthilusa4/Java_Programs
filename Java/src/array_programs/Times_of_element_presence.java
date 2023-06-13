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
	
			//   This method is for In a array present of duplicate element count
	
			//   First checking the each element
	
	       /*       
	        * 	###   That element is repeated means count that element how many time's present in the array
	        * 
	        * 	###   That element is repeated means once its count that element value should change so that only that element will not check again
	        * 	
	        *   ###   and should write the condition change element value will not count again 
	        */
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
									c[j]=value;
								}
							}
							
							if(c[i]!= value && count!=1)
							{
							     System.out.println(c[i] + " Present " + count + " times");
						    }
						}	
			}

}
