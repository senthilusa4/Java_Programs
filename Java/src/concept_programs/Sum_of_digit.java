package concept_programs;

public class Sum_of_digit {
	
	public static void main(String args[])
	  {
	  Sum_of_digit obj = new Sum_of_digit();
	                     obj.sum_digit(123);
	                     obj.sum_digit(8);
	                     obj.sum_digit(-123);
	                     obj.sum_digit(9879);
	  }

	        // This method is used for 
	        // To find sum of digit of an given number
	        // Using WHILE-LOOP (while+if)
	        public void sum_digit(int actual_num)
	        {
	          int given_num = actual_num;
	          int sum = 0;

	            if(given_num > 9)
	              {
	              while(given_num>0)
	                {
	                int n = given_num % 10;
	                sum = sum + n;
	                given_num = given_num / 10;
	                }
	              System.out.println(actual_num + " sum of digit is : " + sum);
	              } 
	            else
	              {
	               System.out.println(actual_num + " can't  proceed with the number | check the number");
	              } 
	        }
	}
