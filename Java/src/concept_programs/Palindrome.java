package concept_programs;

public class Palindrome {
	

	public static void main(String args[])
	  {
	  Palindrome obj = new Palindrome();
	              obj.number(121);
	              obj.number(963);
	              obj.number(-121);
	              obj.number(7);
	  }
	        
	        // This method is used for 
	        // To check given number is palindrome or not
	        // Using WHILE-LOOP (while+if)
	        public void number(int actual_num)
	        {
	        int given_num = actual_num;
	        int reverse_num = 0;
	 
	            if(given_num >9)
	              {
	              while(given_num > 0)
	                {
	                int num = given_num % 10;
	                reverse_num = (reverse_num * 10) + num;
	                given_num = given_num / 10;
	           
	                }
	              }
	               
	          
	               if(actual_num == reverse_num)
	                  {
	                  System.out.println(actual_num + " is palindrome");
	                  }
	                else
	                  {
	                  System.out.println(actual_num + " is not palindrome");
	                  }    
	          }
	}
