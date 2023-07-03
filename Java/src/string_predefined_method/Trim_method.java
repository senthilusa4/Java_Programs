package string_predefined_method;

import java.util.Scanner;

public class Trim_method {
	
	public static void main(String[] args) 
	{
		Trim_method obj = new Trim_method();
		       String s = obj.trim();
		       System.out.println("----Trim-ed String is----");
		       System.out.println(s);
	}
	
	public String trim()
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
		
	//	System.out.println(s);
		
		
				String h = "";
				
				boolean flag = false;
				for(int i=s.length()-1;i>=0;i--)
				{
					if((s.charAt(i)!=' ') && (flag==false))
					{
						h = h + s.charAt(i);
						flag = true;
					}
					
					else if(flag==true)
					{
						h = h + s.charAt(i);
					}
				}
				
			//	System.out.println(h);
				
		sc.close();
		return h;	
	}
	

}
