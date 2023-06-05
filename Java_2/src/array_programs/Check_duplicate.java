package array_programs;

public class Check_duplicate {
	
	public static void main(String args[])
	{
		Check_duplicate obj = new Check_duplicate();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
	
	        	       obj.duplicate_present_or_not();             
	}
	
	// This method is for Checking the duplicate element present or not
	public void duplicate_present_or_not()
	{
		boolean flag = false; 
		for(int i=0;i<Static.a.length;i++)
		{
			for(int j=i+1;j<Static.a.length;j++)
			{
				if(Static.a[i] == Static.a[j])
				{
					flag = true;
					break;
				}
			}
		}
		
				if(flag == false)
				{
					System.out.println("NO DUPLICATE PRESENT " + "a[i]" + " ARRAY");
				}
				else
				{
					System.out.println("DUPLICATE PRESENT " + "a[i]" + " ARRAY");
				}
	}
}
