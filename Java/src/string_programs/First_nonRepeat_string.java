package string_programs;

public class First_nonRepeat_string {
	
	public static void main(String[] args)
	{
		StaticS.input();
		First_nonRepeat_string obj = new First_nonRepeat_string();
		obj.non_repeat();
		
	}
	
	public void non_repeat()
	{
		String a = StaticS.s;
		
		boolean f = false;
		for(int i=0;i<a.length();i++)
		{
			int count = 0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
				if(count==1)
				{
					f = true;
					System.out.println("First non-repeative element is --" + a.charAt(i) + "-- present in " + i + "-index");    
					break;	
				}
		}
		
		if(f == false)
		{
			System.out.println("Non-repeative not present in a string");  
		}
	}

}
