package simple_java;

public class Without_minus_operator {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		// int c = (a+b)%b;  Trying but || this way output not came properly
		
		int d = a + (~b) + 1;
		
	//	System.out.println(a + "-" + b + "=" + c);
		
		System.out.println(a + "-" + b + "=" + d);
	}

}
