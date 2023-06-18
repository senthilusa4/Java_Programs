package concept_programs;

import java.util.Scanner;

public class Armstrong_magic_neon_programs {
		
		  public static void main(String args[])
		    {
			  Armstrong_magic_neon_programs obj = new Armstrong_magic_neon_programs();
			  
			  Scanner sc = new Scanner(System.in);
			  System.out.println("This is for checking Given numner is ARMSTRONG OR NOT");
			  System.out.println("Enter a number - ");
			  int num = sc.nextInt();
			  
			//  sc.close();
   
			  obj.arm_strong_num(num);
		/////////////////////////////////////////////////
			  
			  Scanner sc1 = new Scanner(System.in);
			  System.out.println("This is for checking Given numner is NEON OR NOT");
			  System.out.println("Enter a number - ");
			  int num1 = sc1.nextInt();
			  
			  //sc1.close();
		       
			  obj.neon_num(num1);
		/////////////////////////////////////////////////
			  
			  Scanner sc2 = new Scanner(System.in);
			  System.out.println("This is for checking Given numner is MAGIC OR NOT");
			  System.out.println("Enter a number - ");
			  int n = sc2.nextInt();
			  
			 // sc2.close();
		                  
			  obj.magic_num(n);
		    } 
	           
		        // This method is for to find a Armstrong number
		        // Armstrong number means - Split the digit | cube each digit 
		        // Sum of each cube digit
		        // Given number = sum of each cube digit means is ARMSTRONG
		        public void arm_strong_num(int num)
		        {
		        int n = num;
		        int i = 0;
		        int sum = 0;
		        if(n>0)
		        { 
		          while(n > i)
		            {
		            int mod = n % 10;
		            int value = mod * mod * mod ;
		            sum = sum + value;
		            n = n / 10; 
		            }

		                if(sum == num)
		                  {
		                  System.out.println(num + " is ARMSTRONG NUMBER");
		                  }
		                else
		                  {
		                  System.out.println(num + " is NOT A ARMSTRONG NUMBER");
		                  }
		         }
		       else 
		         {
		         System.out.println(num + " Check your given number");
		         } 
		                                
		         }

		///////////////////////////////////////////////////////////////////////////////////////

		        
		                                // This method is for to find a Ne_on number
		                                // Square the given number | Spilt the digit | Square the each digit
		                                // Sum of square the each digit = Given number is NEON
		                                public void neon_num(int num1)
		                                {
		                                int n = num1;
		                                int i = 0;
		                                int sum = 0;
		                                int square_num = n * n ;
		             
		                                if(n > 0)
		                                {  
		                                  while(square_num > i)
		                                    {
		                                    int mod = square_num % 10;
		                                    sum = sum + mod;
		                                    square_num = square_num / 10; 
		                                    } 

		                                            if(sum == num1)
		                                              {
		                                              System.out.println(num1 + " is NEON NUMBER");
		                                              }
		                                            else
		                                              {
		                                              System.out.println(num1 + " is NOT A NEON NUMBER");
		                                              }
		                                } 
		                                else 
		                                  {
		                                  System.out.println(num1 + " Check your given number");
		                                  } 
		                                } 

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
		                  
	                                                             // This method is for to find a Magic number
		                                                         // split digit | sum of digit | Reverse a sum of digit
		                                                         // Reverse a sum of digit * sum of digit = Given number is MAGIC 
		                                                         public void magic_num(int n)
		                                                         {
		                                                         int num = n;
		                                                         int sum = 0;
		                                                         int rev = 0;
		                                                             // Split and sum the digit
		                                                             while(num > 0)
		                                                             {
		                                                             int split = num % 10;
		                                                             sum = sum + split;
		                                                             num = num / 10;
		                                                             }
		                                                            
		                                                                 // Reverse the sum of digit
		                                                                 int value = sum;
		                                                                 while(value > 0)
		                                                                   {
		                                                                   int mod = value % 10;
		                                                                   rev = (rev * 10) + mod;
		                                                                   value = value / 10;
		                                                                   }
		                                                      
		                                                             int magic = sum * rev;

		                                                             if(magic == n)
		                                                               {
		                                                               System.out.println(n + " is MAGIC NUMBER");
		                                                               }
		                                                             else
		                                                               {
		                                                               System.out.println(n + " is NOT A MAGIC NUMBER");
		                                                               }
		                                                         }

		}






