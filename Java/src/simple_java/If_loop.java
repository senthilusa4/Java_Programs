package simple_java;

public class If_loop {

	public static  void main(String args[])
	  {
	  If_loop obj = new If_loop();
	         obj.sum_if_condition(2,2);
	         obj.pro_if_condition(4,4);
	         obj.div_if_condition(4,4);
	         obj.mul_if_condition(4,4);
	  }

	  // This method is for
	  // sum of given number and product of given number
	  // check both value are equal or not using (IF CONDITION)
	  public void sum_if_condition(int a , int b)
	    {
	    int sum = a+b;
	    int pro = a*b;
	      
	      if(sum == pro)
	      {
	       System.out.println("Sum and product result are same");
	      }
	    }
	    
	        // This method is used for
	        // Sum of given number divisible by 4 and product of given number divisible by 4
	        // Check both value equal or not
	        // Using IF condition with AND(&&) operator
	        public void pro_if_condition(int a , int b)
	        {
	        int sum = a+b;
	        int pro = a*b;
	      
	          if((sum % 4 == 0) && (pro % 4 ==0))
	          {
	          System.out.println("Sum & product of given number and divisibled by 4");
	          }
	        }

	                // Sum of two number is multiply of 2 or product of two number is multiply of 3
	                // Using IF condition with or operator 
	                public void div_if_condition(int a , int b)
	                {
	                int sum = a+b;
	                int pro = a*b;
	              
	                  if((sum % 2 == 0) || (pro % 3 ==0))
	                  {
	                  System.out.println("Sum of two number multiply of 2 or product of two number is multiply of 3");
	                  }
	                }
	 
	                        // Given number is not a multiply of 3 and 7
	                        // Using IF condition(!=) with and operator
	                        public void mul_if_condition(int a , int b)
	                        {        
	                        int sum = a+b;
	                        int pro = a*b;
	              
	                          if((sum % 3 != 0) && (pro % 7 !=0))
	                          {
	                          System.out.println("Given number is not a multiply of 3 and 7");
	                          }
	                        }

}
