package string_programs;

public class First_repeative_string {
	
	public static void main(String args[])
	{
		StaticS.input();
		First_repeative_string obj = new First_repeative_string();
		                       obj.find_first_repeat();
	}
	
	public void find_first_repeat()
	{
			String a = StaticS.s;
			
			boolean flag = false;
			for(int i=0;i<a.length()-1;i++)
			{
				int count = 0;
				for(int j=i+1;j<a.length();j++)
				{
					if(a.charAt(i)==a.charAt(j))
					{
						count++;
						flag = true;
						break;
					}
				}
					if(count==1)
					{
						System.out.println("First repeative element is --" + a.charAt(i) + "-- present in " + i + "-index");
						break;
					}
			}
			
			if(flag==false)
			{
				System.out.println("Repeative NOT PRESENT IN A STRING");
			}
	}

}
