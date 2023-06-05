package inheritance_programs;

public class Calc extends Calculator {
	
	public static void main(String args[])
	
	{
		Calc obj = new Calc();
		int addition = obj.add(5,5);
		System.out.println(addition);
		int multiplication = obj.mul(5,5);
		System.out.println(multiplication);
		int divide = obj.mod(10,2);
		System.out.println(divide);
	}
	
	public int mod(int a, int b)
	{
		int c = a % b;
		return c;
	}

}
