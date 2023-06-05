package array_programs;

import java.util.Scanner;

public class Rotation_double {
	
	public static void main(String args[])
	{
		Rotation_double obj = new Rotation_double();
		                Static.size();
		                Static.element();
		                Static.display();
		                obj.rotate_twice();
	}
	
		// This method is for ROTATE the array DOUBLE THE TIME
	    //     # Swap the index
	    //       Store the 0th index in one temp variable
	    //       Then SWAP the index
	
	    //     # AGAIN Swap the index | (Swap-ed array)
        //       Store the 0th index in another one temp variable
        //       Then SWAP the index
		public void rotate_twice()
		{
			int b[]=Static.a;
			int temp = b[0];
			
			for(int i=0;i<b.length-1;i++)
			{
				b[i] = b[i+1];
			}
			b[b.length-1]=temp;
			
					System.out.println("First rotate array");
					for(int i=0;i<b.length;i++)
					{
						System.out.println(b[i] + " ");
					}
			
			System.out.println();
			int temp1 = b[0];		
			for(int i=0;i<b.length-1;i++)
			{
				b[i] = b[i+1];
			}
			b[b.length-1]=temp1;
			
					System.out.println("Second rotate array");
					for(int i=0;i<b.length;i++)
					{
						System.out.println(b[i] + " ");
					}
		}

}
