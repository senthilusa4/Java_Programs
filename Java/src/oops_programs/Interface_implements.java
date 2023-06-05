package oops_programs;

public class Interface_implements implements Interface {
	
	public static void main(String args[])
	{
		Interface obj = new Interface_implements();
		                     obj.dream();
		                     obj.hobby();
		                     obj.job();
		                     
	}
	
	public void hobby()
	{
		System.out.println("Parent-class hobby Reading Books");
	}
	
		public void dream()
		{
			System.out.println("Parent-class dream Become a GOVERNMENT employee");
		}
		
			public void job()
			{
				System.out.println("Parent-class job Grocery_shop owner");
			}


}
