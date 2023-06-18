package string_programs;

import java.util.Scanner;

public class Vowels_present {
	
	public static void main(String[] args) {
		
		Vowels_present obj = new Vowels_present();
			      //     obj.vowels_present();
			           obj.each_vowels_present();
		
	}
	
	// This method is for TO CHECK In given string how many vowels present 
	public void vowels_present()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		
		sc.close();
		
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(('a'==s.charAt(i)) || ('e'==s.charAt(i)) || ('i'==s.charAt(i)) || ('o'==s.charAt(i)) || ('u'==s.charAt(i))) 
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
				// This method is for
	            // To check each vowel how many time present in a given string
				public void each_vowels_present()
				{
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter string");
					String s = sc.nextLine();
					
					sc.close();
					
					int a_vowel = 0;
					int e_vowel = 0;
					int i_vowel = 0;
					int o_vowel = 0;
					int u_vowel = 0;
					
					for(int i =0;i<s.length();i++)
					{
						if('a'==s.charAt(i))
						{
							a_vowel++;
						}
						    else if('e'==s.charAt(i))
							{
								e_vowel++;
							}
						        else if('i'==s.charAt(i))
								{
									i_vowel++;
								}
						            else if('o'==s.charAt(i))
									{
										o_vowel++;
									}
						            else if('u'== s.charAt(i))
						            {
						            	u_vowel++;
						            }		
					}
					
					System.out.println("a_vowel count " + a_vowel);
					System.out.println("e_vowel count " + e_vowel);
					System.out.println("i_vowel count " + i_vowel);
					System.out.println("o_vowel count " + o_vowel);
					System.out.println("u_vowel count " + u_vowel);
				}


}
