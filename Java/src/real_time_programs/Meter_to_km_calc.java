package real_time_programs;

public class Meter_to_km_calc {
	
	double meter;
	double km;
	
	public static void main(String args[])
	{
		Meter_to_km_calc obj = new Meter_to_km_calc();
		                 obj.meter_to_km_converter(500);
		                 obj.km_to_meter_converter(0.1);
	}
	
	// This method is for METER TO KM CONVERTER
	public void meter_to_km_converter(double meter)
	{
		km = meter / 1000;
		System.out.println("Meter -- " + meter + " Converting to KM -- " + km +"KM");
	}
	
	// This method is for KM TO METER CONVERTER
	public void km_to_meter_converter(double km)
	{
		meter = km * 1000;
		System.out.println("KM -- " + km  + " Converting to METER -- " + meter+"M");
	}

}
