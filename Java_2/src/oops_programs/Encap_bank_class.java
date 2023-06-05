package oops_programs;

public class Encap_bank_class {
    
	// Encapsulation - Parent class
	private int bal;
	double roi;
	
	// This method is used for
	// Updating Private instance variable
	/* WHY ---  private variable can't access other class so hiding the inside method - private variable
	 *          That method will fetching the private instance variable 
	 *          
	 *  Setter method - used for can written logic to update the variable value (Write)
	 *  Getter method - used for DISPLAY or SHOW the private variable (Read only)         
	 */
	void set_credit(int amt)
	{
		bal = bal + amt;     
		System.out.println("Successfully credited");
	}
	    
		void set_debit(int amt)
		{
			bal = bal - amt;
			System.out.println("Successfully debited");
		}
	
			void get_check_balance()
			{
				System.out.println(bal);
			}
}
