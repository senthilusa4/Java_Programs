package real_time_programs;

public class Dollar_to_rupees_calc {
	
	double dollar_rate = 1;
	double dollar_in_rupee_rate = 82.12;
	
	public static void main(String args[])
	{
		Dollar_to_rupees_calc obj = new Dollar_to_rupees_calc();
		                      obj.rupee_to_dollar_converter(164.24);
		                      obj.dollar_to_rupees_converter(6);		                      
		                      
	}
	
	// This method is for DOLLAR TO RUPEES CONVERTER
	public void dollar_to_rupees_converter(double dollar)
	{
		double rupee_converter = dollar * dollar_in_rupee_rate;
		System.out.println("$" + dollar + " = " + "Rs" + rupee_converter);
	}

	// This method is for RUPEES TO DOLLAR CONVERTER
	public void rupee_to_dollar_converter(double rupee) 
	{
		double dollar_converter = rupee / dollar_in_rupee_rate;
		System.out.println("Rs" + rupee + " = " + "$" + dollar_converter);
	}
}
