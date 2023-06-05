package array_programs;

public class First_non_repeative_element {
	
	public static void main(String args[])
	{
		First_non_repeative_element obj = new First_non_repeative_element();
		                            obj.non_repeative();
	}
	
	// This method is for finding the first non-repeative element in a array
	// 	   # Comparing the each element 
	//     # Whenever non-repeat element came means just break the outer loop
	//     input - 1 2 3 0 2 3      output - 1
	
	// Each element present (1-time at-least) so set a condition count==1(As same-means) NON-repeat Not present in the array 
	public void non_repeative()
	{		
		int a[] = {1,2,1,2,3};
		
		boolean flag1 = false;
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count++;
				}
			}
			if(count==1)
			{
				System.out.println("element is " + a[i]);
				flag1 = true;
				break;
			}
		}
		if(flag1==false)
		{
			System.out.println("NOT PRESENT");
		}
	}

}
