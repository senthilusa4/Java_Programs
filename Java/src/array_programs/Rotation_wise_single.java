package array_programs;

public class Rotation_wise_single {
	
	public static void main(String args[])
	{
		Rotation_wise_single obj = new Rotation_wise_single();
		                     obj.rotation_1();
	}
	
	/*
     *   input  1 2 3 4
     * 	output	4 1 2 3
     */

	// This method is for ROTATE THE GIVEN ARRAY
    //     # first rotate the array output-like (4123)
    //     # index[0]=1  | index[1]=2  | index[2]=3  | index[3]=4
	//       First store the index[3](last-element) value in temp variable 
	//       0^th index value will store the 1^st index
	//       1^st index value will store the 2^nd index
	//       2^nd index value will store the 3^rd index
	//       temp-variable value will store the 0^th index
	public void rotation_1()
	{
		int a[] = {1,2,3,4};
		
		int temp = a[a.length-1];
		
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		
			// Display the Rotation
			System.out.println("After ROTATION");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}

}
