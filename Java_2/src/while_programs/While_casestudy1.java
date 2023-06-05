package while_programs;

public class While_casestudy1 {
	
	public static void main(String args[])
	  {
	  While_casestudy1 obj = new While_casestudy1();
	                   obj.palindrome(787);
	                   obj.palindrome(987);
	                   obj.palindrome(3);
	                   obj.palindrome(-123);
	System.out.println("------------------------------------");
	////////////////////////////////////////////////
	                   obj.find_divisor_num(20);
	                   obj.find_divisor_num(-12);
	                   obj.find_divisor_num(0);
	                   obj.find_divisor_num(1);
	System.out.println("------------------------------------");
	///////////////////////////////////////////////
	                   obj.prime_or_not(47);
	                   obj.prime_or_not(25);
	                   obj.prime_or_not(1);
	                   obj.prime_or_not(-147);
	System.out.println("------------------------------------");
	///////////////////////////////////////////////  
	                   obj.reverse_num_and_check_prime_or_not(74);
	                   obj.reverse_num_and_check_prime_or_not(99);
	                   obj.reverse_num_and_check_prime_or_not(751);
	System.out.println("------------------------------------");
	///////////////////////////////////////////////
	                   obj.sum_digit_and_check_prime_or_not(1234);
	                   obj.sum_digit_and_check_prime_or_not(14);
	                   obj.sum_digit_and_check_prime_or_not(-2036);              
	                     
	  }
	  
	  
	        public void palindrome(int n)
	        {
	        int num = n;
	        int rev = 0;        
	        
	        if(n>9)
	          {
	          while(num > 0)
	            {
	            int mod = num % 10;
	            rev = (rev * 10) + mod;
	            num = num / 10;
	            }
	              if(n == rev)
	              {
	              System.out.println( n + " --- is an PALINDROME");
	              }
	            else
	              {
	              System.out.println( n + " --- is an not a PALINDROME");
	              }
	          }
	        else
	          {
	          System.out.println(n + " --- Check your given number");
	          }
	        }

	/////////////////////////////////////////////////////////////////////////////////

	                    public void find_divisor_num(int n)
	                    {
	                    int i = 1;
	                    int num = n;
	                   
	                    if(num > 1)
	                      { 
	                      System.out.println(n + " --- Divisor's are :");                   
	                      while(num > i)
	                        {
	                        if(num % i == 0)
	                          {
	                          System.out.println(i);
	                          }
	                        i++;
	                        }
	                      }
	                    else
	                      {
	                      System.out.println(n + " --- Check your given number");
	                      }
	                    }

	/////////////////////////////////////////////////////////////////////////////////////
	                     
	                                public void prime_or_not(int n)
	                                {
	                                  int num =  n;
	                                  int i = 2;
	                                  int count = 0;
	                                   
	                                  if(num > 0)
	                                  {
	                                    while(i<=num)
	                                    { 
	                                      if(num % i == 0)
	                                      {
	                                        count++;
	                                      }  
	                                    i++;
	                                    }
	                                        if(count == 1)
	                                          {
	                                          System.out.println(n + " --- is a PRIME NUMBER");
	                                          }
	                                        else
	                                          {
	                                          System.out.println(n + " --- is NOT A PRIME NUMBER");
	                                          }
	                                  }
	                                    else
	                                      {
	                                      System.out.println(n +" --- Check your given number");
	                                      }
	                                }

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	                                                public void reverse_num_and_check_prime_or_not(int n)
	                                                {
	                                                int num = n;
	                                                int rev = 0;
	                                                int i = 2;
	                                                int count = 0;

	                                                while(num > 0)
	                                                  {
	                                                  int mod = num % 10;
	                                                  rev = (rev * 10) + mod;
	                                                  num = num / 10;
	                                                  }
	                                                
	                                                 while(i<=rev)
	                                                   { 
	                                                   if(rev % i == 0)
	                                                     {
	                                                     count++;
	                                                     }  
	                                                   i++;
	                                                   }
	                                                       if(count == 1)
	                                                         {
	                                                         System.out.println(n + "-- Reversed num is " + rev + "--- is a PRIME NUMBER");
	                                                         }
	                                                       else
	                                                         {
	                                                         System.out.println(n +" -- Reversed num is " + rev +" --- is NOT A PRIME NUMBER");
	                                                         }
	                                                 }

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	                                                                            
	     public void sum_digit_and_check_prime_or_not(int n)
	     { 
	     int num = n;
	     int sum = 0;
	     int i = 2;
	     int count = 0;

	     if(num > 9)
	     {
	     while(num > 0)
	       {
	       int split = num % 10;
	       sum = sum + split;
	       num = num / 10;
	       }
	        
	      
	          while(i<=sum)
	          { 
	            if(sum % i == 0)
	            {
	            count++;
	            }  
	          i++;
	          }
	     
	           if(count == 1)
	             {
	             System.out.println(n + "-- sumed number is " + sum + "--- is a PRIME NUMBER");
	             }
	           else
	             {
	             System.out.println(n +" -- sumed number is " + sum +" --- is NOT A PRIME NUMBER");
	             }
	      }
	      else
	       {
	       System.out.println(n + " Check the given number");
	       }
	     }
	}

	 


