package real_time_programs;

public class Eb1_calc {
	
	int eb_number;
	String name;
	
	Eb1_calc(int eb_number, String name)    // Constructor
	{
	    this.eb_number = eb_number;
	    this.name = name;
  	}
	
	public void billing()  // Display method
  	{
  		System.out.println("EB-NUMBER - " +this.eb_number);
  		System.out.println("     NAME - " + this.name);
  	}
	
	
	public static void main(String args[])  // Main method
	{
		Eb1_calc bheem = new Eb1_calc(12345,"Bheem");
		bheem.billing();
		bheem.calc(550);
	}

		
		public void calc(double unit)  //  EB-LOGIC method
		{
			double eb_unit = unit;
			double cost = 0;
			double unit1 = 225;
			double unit2 = 900;
			
			
			double bis_eb_unit = unit;
			double bis_cost = 0;
			double bis_unit2 = 1350;
			double bis_unit3 = 600;
			double bis_unit4 = 800;
			double bis_unit5 = 1800;
			double bis_unit6 = 2000;
			
          
          	if(unit <= 500 )  // INPUT 500 and BELOW means This if block will EXECUTION 
          	{
          	  // 1 To 100 unit cost is free for all	
          	  if((unit >= 1) && (unit <= 100))
          	  {
                 cost = 0;
                 System.out.println("UNIT = " + unit + " -FREE-");
          	  }
          	            	  
          	  	if((unit >= 101) && (unit <= 200))
          	  	{
          	  		cost = cost + (2.25 * (unit-100));  // 0+225 = 225
          	  		System.out.println("Unit = " + unit + " cost is " + cost);
          	  	}
          	  
          			if((unit >= 201) && (unit <= 400))
          			{
          				cost = unit1 + (4.5 * (unit-200));  // 225 + (4.5 * (unit_input-200))  
          				System.out.println("Unit = " + unit + " cost is " + cost);
          			}
          			
          				if((unit >= 401) && (unit <= 500))
          				{
          					cost = unit1 + unit2 + (6 * (unit-400));  //  225 + 900 + (6 * (unit_input-400))
          					System.out.println("Unit = " + unit + " cost is " + cost);
          				}				
          	}
          	
          	if(unit > 500)  // INPUT 500 and ABOVE means This if block will EXECUTION
          	{
          	   if((unit >= 1) && (unit <= 100))
               {
                   bis_cost = 0;
                   System.out.println("Unit = " + unit + " cost is " + bis_cost);
               }
              	  
                    if((unit >= 101) && (unit <= 400))
              	  	{
              	  		bis_cost = bis_cost + (4.50 * (unit-100));  //  0 + (4.5 * (unit_input-100)
              	  		System.out.println("Unit = " + unit + " cost is " + bis_cost);
              	  	}
              	  
                        if((unit >= 401) && (unit <= 500))
              			{
              				bis_cost = bis_unit2 + (6 * (unit-400));  // 1350 + (6* (unit_input-400) 
              				System.out.println("Unit = " + unit + " cost is " + bis_cost);
              			}
              			
                            if((unit >= 501) && (unit <= 600))
              				{
                            	//
              					bis_cost = bis_unit2 + bis_unit3 + (8 * (unit-500));  //  1350 + 600 + (8 * (unit_input-500))
              					System.out.println("Unit = " + unit + " cost is " + bis_cost);
              				}
              				
                                if((unit >= 601) && (unit <= 800))
              					{
                                	//                                             
              						bis_cost = bis_unit2 + bis_unit3 + bis_unit4 +(9 * (unit-600));  //  1350 + 600 + 800 + (9 * (unit_input-600))
              						System.out.println("Unit = " + unit + " cost is " + bis_cost);
              					}	

                                    if((unit >= 801) && (unit <= 1000))
              						{
              							bis_cost = bis_unit2 + bis_unit3 + bis_unit4 + bis_unit5 + (10 * (unit-800));  //  1350 + 600 + 800 + 1800 + (10 * (unit_input-800))
              							System.out.println("Unit = " + unit + " cost is " + bis_cost);
              						}
              					    	if(unit > 1000)
              						    {
              							    bis_cost = bis_unit2 + bis_unit3 + bis_unit4 + bis_unit5 + bis_unit6 +(11 * (unit-1000));  //  1350 + 600 + 800 + 1800 + 2000 (unit_input-1000))
              							    System.out.println("Unit = " + unit + " cost is " + bis_cost);
                                        }
		    } 
          	
          	
		}
}
