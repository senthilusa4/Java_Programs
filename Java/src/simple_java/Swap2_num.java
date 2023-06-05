package simple_java;

public class Swap2_num {

	  // Swap two number's using third variable
	  public static void main(String args[])
	  {
	  Swap2_num obj = new Swap2_num();
	            obj.number();
	  } 
	    // Swap two number's method
	    public void number()
	    {
	    int first_num = 10;
	    int second_num = 20;
	    System.out.println("First number is: " + first_num);
	    System.out.println("Second number is: " + second_num);

	    // Logic of the Swap two number's using third variable
	    int third_num = first_num;//10
	    first_num =second_num;    //20
	    second_num = third_num;   //10  

	    System.out.println("After the swap first number is: " + first_num);
	    System.out.println("After the swap second number is: " + second_num);
	    }
	
}
