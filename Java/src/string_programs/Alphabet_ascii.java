package string_programs;

public class Alphabet_ascii {
	
	/*
	 *      #  In String whatever give's it will consider as char
	 * 
	 * 		#  Char variable type-casting to (byte|short|int|long) that will return ASCII-Value
	 * 
	 */
	
	
	public static void main(String args[])
	{
		Alphabet_ascii obj = new Alphabet_ascii();
		               obj.small_alphabet_ascii();
		               obj.caps_alphabet_ascii();
		               obj.number_ascii();
	}
	
	// s.length() 
	//  s - String name
	//  length() - method   | input(String) return(int)
	
	public void small_alphabet_ascii()
	{
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("LOWER case alphabets ASCII-value's");
		System.out.println();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);  // At based on i-value which string present | That will show
			int n = (int)c;        // char will type_casting to int means it provide that ASCII-VALUE 
			
			System.out.println(c + " ASCII VALUE = " + n);
		}
	}
	
				// s.charAt(i);
	            // s - String name
	            // charAt(i) (understand) In string that char at present in i | 
	            //           i means iteration if give 1 means that will return first position of the Given string
	
				public void caps_alphabet_ascii()
				{
					System.out.println();
					String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					
					System.out.println("Capital case alphabets ASCII-value's");
					System.out.println();
					for(int i=0;i<s.length();i++)
					{
						char c = s.charAt(i);  // At based on i-value which string present | That will show
						int n = (int)c;        // char will type_casting to int means it provide that ASCII-VALUE 
						
						System.out.println(c + " ASCII VALUE = " + n);
					}
				}

						// Find the Numbers | ASCII value | 
						public void number_ascii()
						{
							System.out.println();
							String s = "0123456789";
							
							System.out.println("NUMBERS ASCII-value's");
							System.out.println();
							for(int i=0;i<s.length();i++)
							{
								char c = s.charAt(i);  
								int n = (int)c;         
								
								System.out.println(c + " ASCII VALUE = " + n);
							}
						}
}




