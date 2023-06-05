package oops_programs;

public class Dynamic_binding_run extends Dynamic_binding {
	
	/*
	 *  Dynamic binding 
	 *  ONLY Child class overriding the parent class happens 
	 *  
	 *  Parent class all methods came in to the child class
	 *  which methods are HAVING in the child class that can override
	 *  which methods are NOT HAVING in the child class it fetch the parent class method 
	 */
	
	public static void main(String args[])
	{
		Dynamic_binding obj = new Dynamic_binding_run();
		                obj.dream();
		                new Dynamic_binding_run().hobby1(); // SYNTAX | Calling the child class method while doing dynamic binding
		                obj.hobby();
		                obj.job();  // Child Not having this method
	}
	
	void hobby1()
	{
		System.out.println("Child-class hobby1 Playing cricket");
	}
	
		void hobby()
		{
			System.out.println("Child-class hobby Watching movie");
		}
		
			void dream()
			{
				System.out.println("Child-class dream Become a cricketer");
			}

}
