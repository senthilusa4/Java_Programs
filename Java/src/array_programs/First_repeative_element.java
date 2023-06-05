package array_programs;

public class First_repeative_element {
	
	public static void main(String args[])
	{
		First_repeative_element obj = new First_repeative_element();
		                        obj.first_repeative();
    }
	
	// This method is for finding the first repeative element in a array
	// 	   # Comparing the each element 
	//     # Whenever repeat element came means just break the outer loop
	//     input - 1 2 3 0 2 3      output - 2
	public void first_repeative()
	{
		int a[] = {1,2,3,4,5};
	
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
				}
			}
			if(flag==true)
			{
				System.out.println(a[i]);
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("No REPEATIVE element present in the array");
		}
	}

}
