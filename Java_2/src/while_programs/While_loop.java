package while_programs;

public class While_loop {
	
	public static void main(String args[])
	  {

	  While_loop obj = new While_loop();
	             obj.print_hi_5times();
	  System.out.println("----------------");
	             obj.print_100_10times();
	  System.out.println("----------------");
	             obj.print_1to10();
	  System.out.println("----------------");
	             obj.print_first_5even_num();
	  System.out.println("----------------");
	             obj.print_last_5even_num();
	  System.out.println("----------------");

	  }
	    
	        // This method is used for
	        // Print HI as 5-times 
	        // Using WHILE-LOOPING
	        public void print_hi_5times()
	        {
	        System.out.println("Print HI 5-times");
	        System.out.println(" ");
	        int i = 1;
	        while(i <= 5)
	          {
	          System.out.println(i + " -- HI");
	          i++;
	          }
	        }
	                // This method is used for 
	                // Print 100 as 10-times
	                // Using WHILE-LOOPING
	                public void print_100_10times()
	                {
	                System.out.println("Print 100 as 10-times");
	                System.out.println(" ");
	                int value = 100;
	                int i = 1;
	                while(i<=10)
	                  {
	                  System.out.println(i + " -- " + value);
	                  i++;
	                  }
	                }
	                        // This method is used for
	                        // Print 1 to 10 numbers
	                        // Using WHILE-LOOPING
	                        public void print_1to10()
	                        {
	                        System.out.println("Print 1 to 10 numbers");
	                        System.out.println(" ");
	                        int num = 1;
	                        int i = 1;
	                        while(i<=10)
	                          {
	                          System.out.println(i + " -- " + num);
	                          num = num+1;
	                          i++; 
	                          }
	                        }
	                                // This method is used for 
	                                // Print first 5-even numbers
	                                // Using WHILE-LOOPING
	                                public void print_first_5even_num()
	                                {
	                                System.out.println("Print first 5-even numbers");
	                                System.out.println(" ");
	                                int num = 2;
	                                int i = 1;
	                                while(i<=5)
	                                  {
	                                  System.out.println(i + " -- " + num);
	                                  num = num + 2;
	                                  i++;
	                                  }
	                                }
	                                        // This method is used for 
	                                        // Print last to first 5 even numbers
	                                        // Using WHILE-LOOPING 
	                                        public void print_last_5even_num()
	                                        {
	                                        System.out.println("Print Last 5-Even numbers ");
	                                        System.out.println(" ");
	                                        int num = 10;
	                                        int i = 1;
	                                        while(i<=5)
	                                          {
	                                          System.out.println(i + " -- " + num);
	                                          num = num-2;
	                                          i++;
	                                          }
	                                        }   

	}           


