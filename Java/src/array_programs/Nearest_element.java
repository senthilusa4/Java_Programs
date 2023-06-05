package array_programs;

public class Nearest_element {
	
	public static void main(String args[])
	{
		Nearest_element obj = new Nearest_element();
		                obj.near_max_element();
	}
	
	
	// This method is for finding the nearest maximum element
	// 	   # INPUT - 2,4,7,3
	//     # OUTPUT - 2-near-3  4-near-7  7-near-nothing  3-near-4 
	
	/*
	 *     		# Checking the nearest maximum element in a array
	 *     Step-1 Comparing each element in a array
	 *     Step-2 Set condition checking-element greater_than comparing element
	 *     Step-3 came first-time to store its a near
	 *     Step-4 came another-time means checking existing near is greater means should change the near   
	 */
	public void near_max_element()
	{
		int a[] = {2,5,1,9,3,7};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int near=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j]) // when ever max value came this if-condition will allow
				{
					count++;
					if(count==1)  // first-time max came means i store it a near max
					{
					near = a[j];  // 
					}
					if(near>a[j]) // Then comparing upcoming value and before set a near | if Before set a near value greater-than  
					{                                                                // will change the near value set the new-one
						near=a[j];
					}
				}	
			}	
			System.out.println(a[i] + "-Nearest value is " + near);
	    }
	}
}
