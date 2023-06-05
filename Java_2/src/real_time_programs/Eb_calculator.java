package real_time_programs;

import java.util.Scanner;

public class Eb_calculator {
	
	// Instance variable
	int eb_number;
	String name;
	
	// TWO Parameter Constructor 
	Eb_calculator(int eb_number, String name)
	{
	    this.eb_number = eb_number;
	    this.name = name;
  	}
	
	// Display method
	public void billing()
  	{
  		System.out.println("EB-NUMBER - " +this.eb_number);
  		System.out.println("     NAME - " + this.name);
  	}
	
	
	public static void main(String args[])
	{
		Eb_calculator obj = new Eb_calculator(12345, "SENTHIL");
		obj.billing();  // Display method
		// obj.calc(450);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EB-UNIT - ");
		double unit = sc.nextDouble();
		
		obj.calc(unit);   // Calling the method while input giving RUNTIME
		
		
	}

		
		public void calc(double unit)
		{
			double eb_unit = unit;
			double cost = 0;
			double unit1 = 225;
			double unit2 = 900;
          
          	if(unit >= 0)
          	{
          	  if((unit >= 0) && (unit <= 100))
          	  {
                 cost = 0;
                 System.out.println("UNIT " + unit + " = Free");
          	  }
          	  
          	  	if((unit >= 101) && (unit <= 200))
          	  	{
          	  		cost = cost + (2.25 * (unit-100)); 
          	  		System.out.println("UNIT -- " +unit + " cost is " + cost);
          	  	}
          	  
          			if((unit >= 201) && (unit <= 400))
          			{
          				cost = unit1 + (4.50 * (unit-200));
          				System.out.println("UNIT -- " + unit + " cost is " + cost);
          			}
          			
          				if((unit >= 401) && (unit <= 500))
          				{
          					cost = unit1 + unit2 + (6.00 * (unit-400));
          					System.out.println("UNIT -- " + unit + " cost is " + cost);
          				}				
          	}
          	else
          	{
          		System.out.println(unit + "Enter valid unit");
          	}
		}    	
}
