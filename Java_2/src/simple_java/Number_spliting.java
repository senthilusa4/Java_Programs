package simple_java;

public class Number_spliting {
	
	  public static void main(String args[]) 
	    {
	    // Object creating for calling method

	/*    Number_spliting obj = new Number_spliting();
	    int last_digit_value = obj.last_digit(6543);
	    System.out.println("Last digit of the given number        ---> " + last_digit_value);
	    
	    int last_second_digit_value = obj.last_second_digit(6543);
	    System.out.println("Last second digit of the given number ---> " + last_second_digit_value);

	    int last_third_digit_value = obj.last_third_digit(6543);
	    System.out.println("Last third digit of the given number  ---> " + last_third_digit_value);

	    int first_digit_value = obj.first_digit(6543);
	    System.out.println("Last second digit of the given number ---> " + first_digit_value);

	    int sum_of_value = obj.sum_of_digit(last_digit_value,last_second_digit_value,last_third_digit_value,first_digit_value);
	    System.out.println("SUM of given  digit number ---> " + sum_of_value);

	                       obj.swap(sum_of_value);
	*/    

	    Number_spliting obj = new Number_spliting();
	    int sum=obj.sum_of_digit(obj.last_digit(6543),obj.last_second_digit(6543),obj.last_third_digit(6543),obj.first_digit(6543));
	    System.out.println("sum of digit is : " + sum);
	    
	    }
	      // Spliting the last digit of the given number
	      public int last_digit(int number)
	      {
	      int last_num = number % 10;
	      return last_num;
	      }
	        
	         // Fetching or spliting last second digit value of the given number
	         public int last_second_digit(int number)
	         {
	         int num = number / 10;
	         int second_num = num % 10;
	         return second_num;
	         }

	            // fetching the last third digit value of the given number
	            public int last_third_digit(int number)
	            {
	            int num = number / 100;
	            int third_num = num % 10;
	            return third_num;
	            }

	                // fetching or spliting the first digit of the value
	                public int first_digit(int number)
	                {
	                int first_num = number / 1000;
	                return first_num;
	                }

	                    // sum of method's calling the parameter'
	                    public int sum_of_digit(int last_num , int second_num , int third_num , int first_num )
	                    {
	                     int sum = last_num + second_num + third_num + first_num ;
	                     return sum;
	                    }

	                        // Swap the digit of sum number
	                        public void swap(int sum)
	                        {
	                         int swap1 = sum % 10;
	                         int swap2 = sum / 10;
	                         System.out.println("After a swap the number is ---> " + swap1 + swap2);
	                         }
	     
	}


