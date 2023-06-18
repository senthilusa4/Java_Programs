package string_programs;

public class Replace_string_character {
	
	public static void main(String[] args) {
		
		Replace_string_character obj = new Replace_string_character();
		                         obj.replace();
		
	}
	
	public void replace()
	{
		String s = "indian is alway's a indian";
		String s1 = "indian is alway's a indian";
		String s2 = "indian is alway's a indian";
		
		// when ever a present in a string that will change to replace value
		s = s.replace('a', 'z');
		System.out.println(s);
		
				// When ever indian came that will replace INDIAN(replace value)
				s1 = s1.replaceAll("indian", "INDIAN");
				System.out.println(s1);
				
				    	// first present char_string will replace to (replace value)
						// FIRST TIME ONLY REPLACE
						s2 = s2.replaceFirst("indian", "INDIAN");				
						System.out.println(s2);
	}

}
