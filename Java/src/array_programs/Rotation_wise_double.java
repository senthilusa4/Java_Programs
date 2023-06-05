package array_programs;

public class Rotation_wise_double {
	
	public static void main(String args[])
	{
		Rotation_wise_double obj = new Rotation_wise_double();
		int result[] = obj.rotation_double();
	}
	
	    /*
	     *   input  1 2 3 4
	     * 	output	3 4	1 2
	     */
	
		// This method is for ROTATE THE GIVEN ARRAY
	    //     # first rotate the array output-like (4123)
	    //     # then that rotated array again do rotate means our output like (3412) 
		public int[] rotation_double()
		{ 
			int a[] = {1,2,3,4};
			int b[] = a;
			
			int temp = a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
			
					// Display the array after single rotation
			        System.out.println("After the single rotation ");
			        for(int i=0;i<a.length;i++)
			        {
			        	System.out.print(a[i]);
			        }
			        
			System.out.println();        
			int temp1 = a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp1;
			
					// Display the array after single rotation
					System.out.println("After the double rotation ");
					for(int i=0;i<a.length;i++)
					{
						System.out.print(a[i]);
					}			
		return a;	
		}

}








