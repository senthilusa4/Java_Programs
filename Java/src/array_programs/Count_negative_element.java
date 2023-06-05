package array_programs;

public class Count_negative_element {
	
	public static void main(String args[])
	{
		Count_negative_element obj = new Count_negative_element();
		                       obj.negative_count();
	}
	
	// This method is for finding the how many negative elements present in the array
	// 	   # That negative elements all are should store the another array	
	public void negative_count()
	{
		int a[] = {1,-4,-2,10,-8,5,6,-7,-4};
		
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				count++;
			}
		}
		
		System.out.println("NEGATIVE COUNT " + count);
		
		int b[] = new int[count];
		
				int temp = 0;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]<0)
					{
						b[temp]=a[i];
						temp++;
					}
				}
				
					System.out.println("Negative present's are");
					for(int i=0;i<b.length;i++)
					{
						System.out.println(b[i]);
					}
	}

}
