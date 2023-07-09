package string_programs;

public class Sample {
	
	public static void main(String args[])
	{
		String s1 = "hello world";
		String s2 = "h";
		String s3 = "apple";
		String s4 = "saw";
		String s5 = "world";
		String s6 = "bat";
		String s7 = "bat";
		String s8 = "Was";
		String s9 = "hash";
		String ss = " apple ";
		char a[] = {'a','b'};
		
		int b = 10;
		char c = 'a';
		boolean f = false;
		
		// Input-string  |  Return type- int
		// a-ascii value 65  b-ascii value 66
		// a compareTo b means output is -1
		// b comapreTo a means output is  1
		System.out.println("compareTo method");
		System.out.println();
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s6));
		System.out.println(s6.compareTo(s7));
		System.out.println(s4.compareTo(s8));
		
		System.out.println("--Concatenation | concat() method--");
		System.out.println(s1.concat(s2));
		
		System.out.println("--endWith() method--");
		System.out.println();
		System.out.println(s1.endsWith(s2)); 
		System.out.println(s1.endsWith(s5));
	
		// checking the the string start_with that string or not
		System.out.println("--startsWith() method--");
		System.out.println();
		System.out.println(s1.startsWith(s2)); // T
		// s1 offset 6 is w | so s5 is start with the index or not                
		System.out.println(s1.startsWith(s5, 6));
		
		
		System.out.println("--indexOf() method--");
		System.out.println();
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.indexOf(s5));
		System.out.println(s1.indexOf("w",1));
		System.out.println(s1.indexOf(s5, 2));
		
		//  stripLeading() - Removes the white space from the beginning
		//  stripTrailing() - Removes the white space from the end
		//  strip() - Removes the white space from both, beginning and the end of string 
		
		System.out.println();
		System.out.println("--stripLeading()--");
		System.out.println(ss.stripLeading());
		
		System.out.println("--stripTrailing()--");
		System.out.println(ss.stripTrailing());
		
		System.out.println("--strip()--");
		System.out.println(ss.strip());
		
		/////////////////////////////////////////////////////////////////////////////////
		
		// replace means this string replace to that
		// In that string hello string replaced to qqq
		System.out.println("--replace--");
		System.out.println(s1.replace("hello", "qqq"));
		System.out.println(s1.replace('l', 'd'));
		
		//  char array change to string
		// input = 'char[]'  return= string
		System.out.println();
		System.out.println("--copyValueOf()");
		System.out.println(s2.copyValueOf(a));
		
		System.out.println();
		System.out.println("--codePointCount()");
		System.out.println(s1.codePointCount(0, 11));
		
		// This string contain that string or not
		System.out.println();
		System.out.println("--contains()--");
		System.out.println(s1.contains("h"));  // T
		System.out.println(s1.contains(s5));   // F
	
		// check this string content equal to the that string 
		System.out.println();
		System.out.println("--contentEquals()--");
		System.out.println(s1.contentEquals(s5));  // 
		
		
		// converting other data-type to string
		// input = primitive dt   return = string
		System.out.println();
		System.out.println("--valueOf()");
		System.out.println(s1.valueOf(b));
		System.out.println(b);
		
		
		System.out.println();
		System.out.println("--split()--");
		String ab[]=s1.split(" ");
		
		// string convert to integer
		// Integer.parseInt
		
		// string convert to double
		// Double.parseDouble
		
		// Arrays.sort(s);   input-array | return=void
				
		
		
	}
	
	

}
