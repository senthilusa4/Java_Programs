package simple_java;

// Encapsulation

public class Encapsulation_sample {
	
	int a = 5;
	public static void main(String args[])
	{
		Encapsulation_sample obj = new Encapsulation_sample();
		System.out.println(obj.a);  // a=5
		obj.day1();                 // a=10
		obj.day2();                 // a=16
		obj.a=25;                   // a=25
		System.out.println(obj.a);  
		obj.day1();                 // a=30
		obj.day2();                 // a=36
	}
	
	void day1()
	{
		a = a+5;
		System.out.println(a);
	}
	
	void day2()
	{
		a = a+6;
		System.out.println(a);
	}

}
