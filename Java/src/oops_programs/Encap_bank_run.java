package oops_programs;

public class Encap_bank_run {
	
	// This method is for Calling parent class private instance variable	
	public static void main(String args[])
	{
		Encap_bank_class obj = new Encap_bank_class();
		                 
		                 obj.set_credit(500);     // 0 + 500   = 500
		                 obj.set_credit(250);     // 500 + 250 = 750
		                 obj.set_debit(700);      // 750 - 700 = 50
		                 obj.get_check_balance(); // 50
	}

}
