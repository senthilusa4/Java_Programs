package string_programs;

import java.util.Scanner;

public class Reverse_word_string {
	
	public static void main(String args[])
	{
		Reverse_word_string obj = new Reverse_word_string();
		                 //   String s = obj.trim();
		                 //   obj.string_word_reverse(s);
		                    obj.trim2();
	}
	
	// Trim method || remove the front and tail space's
	
	public String trim()
	{
		String s = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String a = sc.nextLine();
		
		boolean f = false;
		for(int i=0;i<a.length();i++)
		{
			if((a.charAt(i)!=' ') && (f==false))
			{
				s = s + a.charAt(i);
				f = true;
			}
			
			else if(f==true)
			{
				s = s + a.charAt(i);
			}
		}
		
		sc.close();
		
		return s;
	}
	
	
	public void trim2()
	{
		String s = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String a = sc.nextLine();
		
		boolean f = false;
		for(int i=a.length()-1;i>=0;i--)
		{
			if((a.charAt(i)!=' ') && (f==false))
			{
				s = s + a.charAt(i);
				f = true;
			}
			
			else if(f==true)
			{
				s = s + a.charAt(i);
			}
		}
		
		System.out.println(s);
		
		String h = "";
		
		boolean flag = false;
		for(int i=s.length()-1;i>=0;i--)
		{
			if((s.charAt(i)!=' ') && (flag==false))
			{
				h = h + a.charAt(i);
				flag = true;
			}
			
			else if(flag==true)
			{
				h = h + s.charAt(i);
			}
		}
		
		System.out.println(h);
	}
	
//	----------------------------------------------------------------------------------------------
	
			public void string_word_reverse(String s)
			{
				int count = 0;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)==' ')
					{
						count++;
					}
				}
				
				String ss[] = new String[count+1]; 
				 
				String z = "";
				int temp = 0;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)!=' ')
					{
						z = z + s.charAt(i);
					}
					if((s.charAt(i)==' ') || (i==s.length()-1))
					{
						ss[temp]=z;
						temp++;
						z="";
					}
				}
				
				// Display array
				for(String p : ss)
				{
					System.out.println(p);
				}
				
						System.out.println("------------------------");
						System.out.println("Reverse word string ");
						System.out.println("------------------------");
						String x = "";
						for(int i=ss.length-1;i>=0;i--)
						{	
							x = x + ss[i];
							
							if(i!=0)
							{
							x = x + ' ';
							}
						}
						
						System.out.println(x);
			}
		
}
