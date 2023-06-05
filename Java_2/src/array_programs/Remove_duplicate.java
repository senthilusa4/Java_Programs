package array_programs;

public class Remove_duplicate {
	
	public static void main(String args[])
	{
		Remove_duplicate obj = new Remove_duplicate();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
	
	        	       obj.remove_element();             
	}
	
	
	// This method is for REMOVE DUPLICATE ELEMENT VALUE IN A ARRAY
	// Whenever duplicate value came that time should change the value like(Minimum int VALUE)
	// Then Which all element value are not equal the that min value | Display
	public void remove_element()
	{
		int value = Integer.MIN_VALUE;
		
		for(int i=0;i<Static.a.length;i++)
		{
			for(int j=i+1;j<Static.a.length;j++)
			{
				if(Static.a[i]== Static.a[j])
				{
					Static.a[j] = value;
				}
			}
		}
		        // Checking the which element equal to the INTEGER.MIN_VALUE (These all duplicate)
		        //              which element not equal to the INTEGER.MIN_VALUE (These all NOT duplicate)
				System.out.println("After REMOVING DUPLICATE ARRAY ");
				for(int i=0;i<Static.a.length;i++)
				{
					if(Static.a[i] != value)
					{
						System.out.println(Static.a[i]);
					}
				}
	}

}
