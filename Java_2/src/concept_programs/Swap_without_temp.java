package concept_programs;

public class Swap_without_temp {

	public static void main(String args[])
	{
		Swap_without_temp obj = new Swap_without_temp();
		                  obj.swap(5,7);
	}
	
	public void swap(int num1 , int num2)
	{
		System.out.println("Before swap num1 is " + num1);
		System.out.println("Before swap num2 is " + num2);
		
		num1 = num1+num2;  // 5+7 = 12(num1)
		num2 = num1-num2;  //12-7 =  5(num2)
		num1 = num1-num2;  //12-5 =  7)num1)
		
		System.out.println("After swap num1 is " + num1);
		System.out.println("After swap num2 is " + num2);
	}
}
