package array_programs;

public class Second_max_min {
	
	public static void main(String args[])
	{
		Second_max_min obj = new Second_max_min();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
		               
		int second_max = obj.Second_max();
		System.out.println("Ingiven ARRAY SECOND MAXIMUM ELEMENT is " + second_max);
		
		int second_min = obj.Second_min();
		System.out.println("Ingiven ARRAY SECOND MINIMUM ELEMENT is " + second_min);
	}
	
	
	// This method is used for find a SECOND LARGEST ELEMENT
	// Take the input via the static method class name Static
	public int Second_max()
	{
		int max   = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		
		for(int i=0;i<Static.a.length;i++)
		{
			if(max < Static.a[i])
			{
				s_max = max;
				max = Static.a[i];
			}
			
			if((s_max < Static.a[i]) && (Static.a[i] != max))
			{
				s_max = Static.a[i];
			}
		}
	return s_max;		
	}

	            // This method is used for find a SECOND MINIMUM ELEMENT
		        // Take the input via the static method class name Static
				public int Second_min()
				{
					int min   = Integer.MAX_VALUE;
					int s_min = Integer.MAX_VALUE;
		
					for(int i=0;i<Static.a.length;i++)
					{
						if(min > Static.a[i])
						{
							s_min = min;
							min = Static.a[i];
						}
			
						if((s_min > Static.a[i]) && (Static.a[i] != min))
						{
							s_min = Static.a[i];
						}
					}
					return s_min;		
				}

}
