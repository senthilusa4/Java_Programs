package string_programs;

import java.util.Scanner;

public class Check_numericalChar_present {
	
	public static void main(String[] args) {
		
		Check_numericalChar_present obj = new Check_numericalChar_present();
									obj.numerical_char();
	}
	
	
	// This method is for
	// To check the given String if any numerical character present means 
	//                              print the presented numerical character
	
	//		### Ascii value based finding the given character is number (or) not
	public void numerical_char()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		
		sc.close();
		
		/* 
		 * 		Type_casting
		 */
		
		boolean flag = false;
		
//		for(int i=0;i<s.length();i++)
//		{
//			int n = s.charAt(i);
//			if((n>=48) && (n<=57))
//			{
//				flag = true;
//				System.out.println(s.charAt(i));
//			}
//		}
						// Direct (or) with third variable using type_casting
						for(int i=0;i<s.length();i++)
						{
							if( ((int)s.charAt(i)>=48)  && ((int)s.charAt(i)<=57) )
							{
								flag = true;
								System.out.println(s.charAt(i));
							}
						}
						
			if(flag==false)
			{
				System.out.println("NO numerical character present in a string");
			}

	}

}
