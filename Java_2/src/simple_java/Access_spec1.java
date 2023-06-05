package simple_java;

public class Access_spec1 {
	
	// Default is not a keyword Default can't used in program
	// Access Within class , method , package 
	void nationality()
	{
		System.out.println("DEFAULT -- Indian");
	}
	
		// Open to all | whoever can access
		// Different method's | class | package class
		public void name()
		{
			System.out.println("PUBLIC -- Name");
		}
	
		    // Only can access within a class
		    // class can't be a private
			private void age()
			{
				System.out.println("PRIVATE -- Age");
			}
	
			        // Extends class only can access
			        // Class can't be protected
					protected void address()
					{
						System.out.println("PROTECTED -- Address");
					}

}
