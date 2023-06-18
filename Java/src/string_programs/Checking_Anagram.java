package string_programs;

public class Checking_Anagram {
	
	public static void main(String args[])
	{
		Checking_Anagram obj = new Checking_Anagram();
		                 obj.check_anagram();
	}
	
	public void check_anagram()
	{
		String s1 = "aas";
		String s2 = "asw";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		int given = c1.length-1;
		int check = c2.length-1;
		
		char z = '0';
		if(given==check)
		{
			int count = 0;
			for(int i=0;i<c1.length;i++)
			{
				for(int j=0;j<c2.length;j++)
				{
					if((c1[i]==c2[j])&&(c1[i]!=z))
					{
						c2[j]=z;
						count++;
						break;
					}
				}	
			}
			
			if(s1.length() == count)
			{
				System.out.println(s2 + " is ANAGRAM");
			}
			else
			{
				System.out.println(s2 + " is not a anagram");
			}
		}	
		else
		{
			System.out.println(s2 + " is not an ANAGRAM");
		}
		
	}

}
