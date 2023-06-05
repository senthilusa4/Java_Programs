package simple_java;

public class Nested_if {

	public static void main(String args[])
	  {
	  Nested_if bank = new Nested_if();
	            bank.loan_eligible(20000);
	  /*          bank.loan_eligible(75000);
	            bank.loan_eligible(100000);
	            bank.loan_eligible(200000);
	            bank.loan_eligible(1234560);
	            bank.loan_eligible(19000); 
	  */
	  System.out.println("------------------------------------------------------------------");
	  }

	    // This method is used for
	    // Finding the load eligiblity salary range
	    // Using NESTEDIF condition
	    public void loan_eligible(int salary)
	    {
	    
	    System.out.println(""); 
	    System.out.println("Above 20k to below 50k is eligible for applying TWO WHEELER LOAN");
	    System.out.println("50k to below 1L is eligible for applying FOUR WHEELER LOAN");
	    System.out.println("1L to below 2L is eligible for applying  HOUSING LOAN");
	    System.out.println("2L and Above 2L is eligible for applying BUSINESS LOAN");
	    System.out.println("");
	    System.out.println("------------------------------------------------------------------");
	    
	    if(salary >= 20000)
	    {
	        if((salary >=20000) && (salary < 50000))
	        {
	        System.out.println(salary +" You are eligible for applying TWO WHEELER LOAN");
	        }
	            else if((salary >=50000) && (salary < 100000))
	            {
	            System.out.println(salary + " You are eligible for applying FOUR WHEELER LOAN");
	            }
	                 else if((salary >=100000) && (salary < 200000))
	                 {
	                 System.out.println(salary + " You are eligible for applying HOUSING LOAN");
	                 }
	                      else
	                      {
	                      System.out.println(salary + " You are eligible for applying BUSINESS LOAN");
	                      }
	    }
	      else
	      {
	      System.out.println(salary + " You are not eligible for applying loan");
	      }
	   }
	}

