package simple_java;

public class Fin_class {

	public static void main(String args[])
	  {
	  Fin_class obj = new Fin_class();
	            obj.divide_class(100);
	  System.out.println("----------------------------------------------------------------------------------------");
	  }

	      // This method used for 
	      // Based on the given amount |  should divide fin-class
	      // Using IFELSE Lader condition 
	      public void divide_class(long amount)
	      {
	      System.out.println(""); 
	      System.out.println("Above 1000000 (10lakhs)             people's are            --HIGH CLASS--"); 
	      System.out.println("100000 to 1000000(1lakh to below 1000000lakhs) people's are --UPPER MIDDLE CLASS--");
	      System.out.println("10000  to 100000(10thousand to below 1lakh) people's are    --MIDDLE CLASS--");
	      System.out.println("1000   to 10000(thousand to below 10thousand) people's are  --LOWER MIDDLE CLASS--");
	      System.out.println("1      to 1000 amount               people's are            --LOWER MIDDLE CLASS--");
	      System.out.println("");
	      System.out.println("----------------------------------------------------------------------------------------");
	      

	      if(amount >= 1000000)
	      {
	      System.out.println(amount + "  Based on the amount --HIGH CLASS--"); 
	      }
	          else if((amount >= 100000) && (amount < 1000000))
	          {
	          System.out.println(amount + "  Based on the amount --UPPER MIDDLE CLASS--"); 
	          }
	               else if((amount >= 10000) && (amount < 100000))
	               {
	               System.out.println(amount + "  Based on the amount --MIDDLE CLASS--"); 
	               }
	                    else if((amount >= 1000) && (amount < 10000))
	                    {
	                    System.out.println(amount + "  Based on the amount --LOWER MIDDLE CLASS--"); 
	                    }
	                         else if((amount >= 1) && (amount < 1000))
	                         {
	                         System.out.println(amount + "  Based on the amount --LOWER CLASS--"); 
	                         }
	                              else 
	                              {
	                              System.out.println(amount + " YOUR ACCOUNT WILL CLOSE | PLEASE REACH BANK OR MANAGER"); 
	                              }                    

	      }
	}
