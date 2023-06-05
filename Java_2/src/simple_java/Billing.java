package simple_java;

public class Billing {

	  public static void main(String args[])
	    {
	    Billing obj = new Billing();
	    // int total_amount = obj.addition();
	    //                   obj.discount(total_amount); 

	obj.discount (obj.addition());
	    }
	    public int addition()
	      {
	       int tomato = 40;
	       int onion = 120;
	       int total = tomato + onion;
	       System.out.println("tomato rate is: " + tomato);
	       System.out.println("onion rate is: " + onion);
	       System.out.println("total amount is: " + total);
	       return total;
	      }  
	      public void discount(int total)
	        {
	         int after_discount_amount = total - 5;
	         System.out.println("after a discount total_amount: " + after_discount_amount);       
	        } 
	   }

