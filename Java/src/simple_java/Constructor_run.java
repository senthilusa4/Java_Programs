package simple_java;

public class Constructor_run {
	
	public static void main(String args[])
	{
		Constructor_template dolu = new Constructor_template();
		Constructor_template bolu = new Constructor_template("Bolu","HBAP123",2000);
		Constructor_template bheem = new Constructor_template("Bheem","HBSX456");
		Constructor_template raju = new Constructor_template(1500);
	    dolu.display_details();
	    bolu.display_details();
	    ////////////////////////////
	    bheem.setbank_bal(4000);
	    bheem.display_details();
	    ////////////////////////////
	    raju.setname("Raju");
	    raju.display_details();
	    	    	    
	    bheem.getbank_bal();
	    
	    System.out.println("BANK BALANCE ABOVE 2000 MEANS -- ELLIGIBLE ");
	    
	    bheem.loan_elligible();
	    
	}

}
