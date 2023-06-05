package while_programs;

public class While_practical {
	
	public static void main(String args[])
	  {
	   While_practical obj = new While_practical();
	   System.out.println("");
	   System.out.println("First 5 odd number's ");
	   System.out.println("");

	                   obj.print_first_5odd_number();

	   System.out.println("");
	   System.out.println("300-250 range ODD number's that divisible by 9  ");
	   System.out.println("");

	                   obj.print_300to250_div_by_9(); 

	   System.out.println("");
	   System.out.println("print 1-100 that divisible by 3 and 5 ");
	   System.out.println("");

	                   obj.print_1to100_div_3and5(); 

	   System.out.println("");

	                   obj.print_count_div9_range_1to100();

	   System.out.println("");
	   System.out.println("print 1-100 that divisible by 7 and 9 (WITHOUT USING AND OPERATOR)");
	   System.out.println("");

	                   obj.print_1to100_div_7and9();

	   System.out.println("");
	   System.out.println("print 1-100 that divisible by 7 and greaterthan 450");
	   System.out.println("");

	                   obj.print_100to500_div7_and_greaterthan_450();

	   System.out.println("");
	   System.out.println("print all divisor's for the given number"); 
	 
	                   obj.print_all_divisor_of_givennumber();


	  }
	   
	                  
	        // This method is used for 
	        // To find first 5 odd number's 
	        // Using WHILE-LOOP
	        public void print_first_5odd_number()
	        {
	        int i = 1;
	        int num = 1;
	        while(i<=5)
	          {
	          System.out.println(num);
	          i++;
	          num = num + 2;
	          }
	        }

	                // This method is used for 
	                // To finding the 300 to 250 range number that divisible by 9
	                // Using WHILE-LOOP (while+if)
	                public void print_300to250_div_by_9()
	                {
	                int i = 300;
	                
	                while(i>=250)
	                  {
	                  if(i % 9 == 0)
	                    {
	                    System.out.println(i);
	                    }
	                  i--;
	                  }
	                }
	                    
	                        // This method is used for
	                        // To printing the 1-100 that divisible by 3 and 5
	                        // Using WHILE-LOOP (while+if) 
	                        public void print_1to100_div_3and5()
	                        {
	                        int i = 1;
	                        while(i<=100)
	                          {
	                          if((i % 3 == 0) && (i % 5 == 0))
	                            { 
	                             System.out.println(i);
	                            }
	                        i++;
	                          }
	                        }

	                                // This method is used for
	                                // print count of divisor(9) given range is 1-100
	                                // Using WHILE-LOOP (while+if)
	                                public void print_count_div9_range_1to100()
	                                {
	                                int i = 1;
	                                int count = 0;
	                                while(i<=100)
	                                  {
	                                  if(i % 9 == 0)
	                                    {
	                                    count++;
	                                    }
	                                i++;
	                                  }
	                                System.out.println("Count of divisor(9) given range is 1-100--->  " + count);
	                                }

	                                        // This method is used for 
	                                        // print 1 to 100 that divisible by 7 and 9 (WITHOUT USING AND OPERATOR)
	                                        // Using WHILE-LOOP (while+if)
	                                        public void print_1to100_div_7and9()
	                                        {
	                                        int i = 1;
	                                        while(i<=100)
	                                          {
	                                          if(i % 7 ==0)
	                                            {
	                                            if(i % 9 == 0)
	                                              {
	                                              System.out.println(i);
	                                              } 
	                                            }
	                                          i++;
	                                          }
	                                        }


	                                                // This method used for
	                                                // print the divisor of 7 from 100-500 then which are greaterthan 450
	                                                // Using WHILE-LOOP (while+if)
	                                                public void print_100to500_div7_and_greaterthan_450()
	                                                {
	                                                int i = 100;
	                                                while(i<=500)
	                                                  {
	                                                  if(i % 7 == 0)
	                                                    {
	                                                    if(i >= 450)
	                                                      {
	                                                      System.out.println(i);
	                                                      }
	                                                    }
	                                                   i++;
	                                                  }
	                                                }
	     
	                                                        // This method is used for
	                                                        // print all the divisor for the given number
	                                                        // Using WHILE-LOOP (while+if)
	                                                        public void print_all_divisor_of_givennumber()
	                                                        {
	                                                        int i = 1;
	                                                        int num = 20;
	                                                        while(i <= num)
	                                                          {
	                                                          if(num % i == 0)
	                                                            {
	                                                            System.out.println(i);
	                                                            }
	                                                           i++;
	                                                          } 
	                                                        }
	}
