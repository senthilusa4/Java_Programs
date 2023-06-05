package while_programs;

public class While_casestudy {

	public static void main(String args[])
	  {
	  While_casestudy obj = new While_casestudy();
	                  obj.print_natural_num(5);
	                  obj.print_reverse_natural_num(5);
	                  obj.sum_natural_num(5);
	                  obj.sum_even_num(11);
	                  obj.sum_odd_num(11);
	                  obj.count_numof_digit(123);
	                  obj.find_first_last_digit(456);
	                  obj.sum_first_last_digit(456);
	                  obj.sum_digit(123);
	                  obj.reverse_num(987);
	  }
	    
	        public void print_natural_num(int n)
	        {
	        int i = 1;
	        while(i <= n)
	          {
	          System.out.println(i);
	          i++;
	          } 
	        } 

	                public void print_reverse_natural_num(int n)
	                {
	                int i = 1;
	                while(i<=n)
	                  {
	                  System.out.println(n);
	                  n--;
	                  }
	                
	                }

	                        public void sum_natural_num(int n)
	                        {
	                        int i = 1;
	                        int sum = 0;
	                        while(i<=n)
	                          {
	                          sum = sum + i;
	                          i++;
	                          }
	                        System.out.println(n + "--- Sum of natural number is ---> " + sum);
	                        }

	                                public void sum_even_num(int n)
	                                {
	                                int i = 1;
	                                int sum = 0;
	                                while(i<=n)
	                                  {
	                                  if(i%2 == 0)
	                                    {
	                                    sum = sum + i;
	                                    }
	                                  i++;
	                                  }
	                                System.out.println(n + "--- Sum of even number is ---> " + sum);
	                                }


	                                        public void sum_odd_num(int n)
	                                        {
	                                        int i = 1;
	                                        int sum = 0;
	                                        while(i<=n)
	                                          {
	                                          if(i%2 != 0)
	                                            {
	                                            sum = sum + i;
	                                            }
	                                          i++;
	                                          }
	                                        System.out.println(n + "--- Sum of odd number is ---> " + sum);
	                                        }

	                                                public void count_numof_digit(int n)
	                                                {
	                                                int num = n;
	                                                int i = 0;
	                                                int count = 0;
	                                                while(n>i)
	                                                  {
	                                                  count++;
	                                                  n = n / 10;
	                                                  } 
	                                                System.out.println(num + "--- Count is ---> " + count);
	                                                }

	                                                        public void find_first_last_digit(int n)
	                                                        {
	                                                        int first = n;
	                                                        int i = 9;
	                                                        int last = n % 10; 
	                                                        
	                                                        while(first > i)
	                                                          {
	                                                           first = first / 10;
	                                                          }
	                                                        System.out.println(n + " --- first_digit is " + first + " and last digit is " + last);
	                                                        }
	                         
	                                                                public void sum_first_last_digit(int n)
	                                                                {
	                                                                int first = n;
	                                                                int i = 9;
	                                                                int last = n % 10; 
	                                                        
	                                                                while(first > i)
	                                                                  {
	                                                                  first = first / 10;
	                                                                  }
	                                                                int sum = first + last;
	                                                                System.out.println(n + " --- Sum of first & last digit is ---> " + sum);
	                                                                }

	                                                                        public void sum_digit(int n)
	                                                                        {
	                                                                        int num = n;
	                                                                        int sum = 0;
	                                                                        while(num > 0)
	                                                                          {
	                                                                          int split = num % 10;
	                                                                          sum = sum + split;
	                                                                          num = num / 10;
	                                                                          }
	                                                                        System.out.println(n + " --- Sum of the digit is ---> " + sum);
	                                                                        }

	                                                                                public void reverse_num(int n)
	                                                                                {
	                                                                                int num = n;
	                                                                                int rev = 0;
	                                                                                while(num > 0)
	                                                                                  {
	                                                                                   int mod = num % 10;
	                                                                                   rev = (rev * 10) + mod;
	                                                                                   num = num / 10;
	                                                                                  }
	                                                                                System.out.println(n + " ---  Reverse number is ---> " + rev); 
	                                                                                }

	}



