package array_programs;

public class Concatenete_array {
	
	public static void main(String args[])
	{
		Concatenete_array obj = new Concatenete_array();
		                  obj.concatenate();             
	}
	
	// Concatenate two array
	// join two array in one array
	public void concatenate()
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8};
		
		int c[] = new int[a.length + b.length];
		
		// Logic for set the a-array element in c-array
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		
			// Display the c-array  |  after a-array added
			System.out.println();
			System.out.println("c[i] array is");
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i] + " ");
			}
			
					// Logic for concatenate add array (continuity)
					for(int i=0;i<b.length;i++)
					{
						c[a.length+i] = b[i];
					}
								
								// Display the c-array |  after a-array & b-array added
					            System.out.println();
								System.out.println();
								System.out.println("After c[] array is");
								for(int i=0;i<c.length;i++)
								{
									System.out.print(c[i] + " ");
								}
		
	}

}
