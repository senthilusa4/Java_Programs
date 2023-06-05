package simple_java;

public class Constructor_template {
	
	// Instance variable
	private String name;
	private String pan_no;
	private String ifsc_no = "SBI001";
	private int bank_bal;
	private int pincode = 638752;
	
	// No arguments Constructor 
	Constructor_template()
	{
		this.name = "null";
		this.pan_no = "null";
		this.bank_bal = 0;
	}
	        // Parameterized Constructor
			Constructor_template(String name, String pan_no, int bank_bal)
			{
				this.name = name;
				this.pan_no = pan_no;
				this.bank_bal = bank_bal;
	        }
			
					        // Parameterized Constructor 
							Constructor_template(String name, String pan_no)
							{
								this.name = name;
								this.pan_no = pan_no;
							}
					
							        // Single Parameterized constructor
									Constructor_template(int bank_bal)
									{
										this.bank_bal = bank_bal;
									}
									
									// Set a value to the variable
									void setname(String name)
									{
										this.name = name;
									}
									
										void setpan_no(String pan_no)
										{
											this.pan_no = pan_no;
										}
                                	
											void setbank_bal(int bank_bal)
											{
												this.bank_bal = bank_bal;
											}
											
											// get a value to the variable
											void getname()
											{
												System.out.println(this.name);
											}
											
												void getpan_no()
												{
													System.out.println(this.pan_no);
												}
		                                	
													void getbank_bal()
													{
														System.out.println(this.bank_bal);
													}
											
											
	void display_details()
	{
		System.out.println(this.name + " " + this.pan_no + " " + this.ifsc_no + " " + this.bank_bal + " " + this.pincode);
	}
	
	// this method for find a Elligible
	void loan_elligible()
	{
		if(this.bank_bal >= 2000)
		{
			System.out.println("Elligible");
		}
		else
		{
			System.out.println("Not Elligible");
		}
	}
	                       

}
