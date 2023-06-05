package inheritance_programs;

// OUTSIDE THE PACKAGE

import simple_java.Access_spec1;

public class Access_spec3 extends Access_spec1 {
	
	public static void main(String args[])
	{
		Access_spec3 obj = new Access_spec3();
		             obj.name();
		             obj.address();
		             
	}

}
