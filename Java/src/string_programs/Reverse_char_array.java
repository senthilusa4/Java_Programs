package string_programs;

public class Reverse_char_array {
	
	// INPUT -  ["s","e","n","t","h","i","l"]
	// OUTPUT - ["l","i","h","t","n","e","s"]
	
	
	/*
	 * 		Rotate the array 
	 * 
	 * 		But every single ROTATE decrement the front index
	 *   #Because last index of array become_to set first index 
	 *   		
	 *   ##  After rotate can't consider the first index
	 *   ##  BECAUSE, first index as set based on the EXPECTATION OR OUTPUT
	 *   ##  After rotation till second index should run the loop                                                                  
	 */
		public static void main(String[] args)
		{
			char c[] = {'s','e','n','t','h','i','l'};    
			
			int var = 0;
			for(int i=c.length-1;i>0;i--)   
			{
				char temp = c[c.length-1];  
				for(int j=c.length-1;j>var;j--)
				{
					c[j]=c[j-1];   
				}
				c[var]=temp;
				var++;	
			}
			
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i] + " ");
			}
		}

}
