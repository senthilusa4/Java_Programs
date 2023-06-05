package simple_java;

public class Static1 {
	
	// This static variable will create one copy for entire class
	// Without static means each object will create each copy
	// Static keyword mainly used for memory management
	
	static private int pincode = 638752;  // static variable
	// Instance variable
	private int citycode;
	private String name;
	
	// No arguments passed constructor 
	Static1()
	{
		citycode = 91;
	}
	    // Single argument passed constructor
		Static1(String name)
		{
			this();  // this() is calling the no arguments passed constructor
			this.name = name;
		}
		
			public void display()  // non-static method
			{
				// without static method can access the static variable.
				System.out.println(this.pincode);
				System.out.println(this.citycode + " " + this.name);
			}
			
			public static void print()   // static method
			{
				System.out.println(pincode);
		//		System.out.println(citycode); | non-static variable can't access with in a static method
			}

}
