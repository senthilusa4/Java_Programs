package array_programs;

public class Middle_element {
	
	public static void main(String args[])
	{
		Middle_element obj = new Middle_element();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
	
	        	       obj.middle_element();             
	}
	
	
	// This method is used for FINDING THE MIDDLE ELEMENT ON THE GIVEN ARRAY
	// if ODD LENGTH OF ARRAY MEANS PROVIDE MID ELEMENT
	// if EVEN LENGTH OF ARRAY MEANS PROVIDE TWO MID ELEMENT 
	public void middle_element()
	{
		System.out.println();
		System.out.println("Middle element is");
		int mid = Static.a.length / 2;
		if(Static.a.length % 2 != 0)
		{
			System.out.println(Static.a[mid]);
		}
		else
		{
			System.out.println(Static.a[mid]);
			System.out.println(Static.a[mid-1]);
		}
	}	

}
