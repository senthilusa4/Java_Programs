package simple_java;

public class Supermarket {

	 public static void main(String args[])
	   {
	    Supermarket obj   = new Supermarket();
	    int vegtable_bill = obj.vegtables();
	    int grocery_bill  = obj.grocery();
	    int discountFor_vegtables_bill = obj.discountFor_vegtables(vegtable_bill);  
	    int discountFor_grocery_bill   = obj.discountFor_grocery(grocery_bill);
	                                     obj.discountfor_totalBill(discountFor_vegtables_bill,discountFor_grocery_bill); 
	   }
	    public int vegtables()
	    {
	     int tomato = 20;
	     int onion  = 100;
	     int potato = 40;
	     int ladysfinger = 60;
	     int mint = 150;
	     int veg_total = tomato + onion + potato + ladysfinger + mint;
	     System.out.println("Vegtable total amount is : " + veg_total);
	     return veg_total; 
	    }
	       public int grocery()
	       {
	        int powder = 180;
	        int rice   = 1100;
	        int oil    = 240;
	        int soap   = 40;
	        int sugar  = 40;
	        int grocery_total = powder + rice + oil + soap + sugar;
	        System.out.println("Grocery total amount is :" + grocery_total); 
	        return grocery_total;
	       }
	         public int discountFor_vegtables(int veg_total)
	         {
	         int discounted_vegtableBill = veg_total - 50;
	         System.out.println("DISCOUNTED VEGTABLE_BILL = " + discounted_vegtableBill);
	         return discounted_vegtableBill;   
	         } 
	            public int discountFor_grocery(int grocery_total)
	            {
	            int discounted_groceryBill = grocery_total - 100;
	            System.out.println("DISCOUNTED GROCERY_BILL = " + discounted_groceryBill);   
	            return discounted_groceryBill;
	            } 
	               public void discountfor_totalBill (int discounted_vegtableBill,int discounted_groceryBill)
	               {
	               int discounted_totalBill =  discounted_vegtableBill + discounted_groceryBill;
	               System.out.println("Total Bill is : " + discounted_totalBill); 
	               }
	}
	    