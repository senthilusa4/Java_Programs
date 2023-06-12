package string_programs;

public class Sample {
	
	public static void main(String args[])
	{
		String s1 = "hello world";
		String s2 = "hi";
		String s3 = "apple";
		String s4 = "indian";
		String s5 = "world";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.endsWith(s5));
	
		System.out.println(s1.startsWith(s2));
		System.out.println(s4.startsWith(s2,1));
		
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.indexOf(s5));
		System.out.println(s1.indexOf("l",4));
		System.out.println(s1.indexOf(s5, 2));
	}
	
	

}
