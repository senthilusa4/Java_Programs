package array_programs;

public class Reverse_array {
	
	public static void main(String args[])
	{
		Reverse_array obj = new Reverse_array();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
	
	        	       obj.reverse();             
	}
	
	// This method is for REVERSE THE ARRAY 
	public void reverse()
	{
		int b[]= new int[Static.a.length];
		int temp = 0;
		for(int i=Static.a.length-1;i>=0;i--)
		{
			b[temp] = Static.a[i];
			temp++;
		}
		
		    System.out.println("Reverse the respective array elements");
		    for(int i=0;i<b.length;i++)
		    {
		    	System.out.println(b[i]);
		    }
	}
	

}
