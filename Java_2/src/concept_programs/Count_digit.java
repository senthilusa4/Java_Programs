package concept_programs;

public class Count_digit {
	
	public static void main(String args[])
	  {
	  Count_digit obj = new Count_digit();
	              obj.count(123);
	              obj.count(1);
	              obj.count(0);
	              obj.count(-12);
	  }

	        // This method is used for
	        // Counting the number of digit present an given_value
	        // Using WHILE-LOOP (while+if)  
	        public void count(int actual_num)
	        {
	          int given_num = actual_num;
	          int count = 0;
	    
	          if(actual_num > 0)
	            {

	            while(actual_num > 0)
	              { 
	              count++;  
	              actual_num = actual_num / 10;      
	              }
	              System.out.println(given_num + " value count is : " + count);
	            }
	          else
	            {
	            System.out.println(given_num + " check your value");
	            }
	        }
	}
