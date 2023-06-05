package inheritance_programs;

public class Method_overloading {
	
	public static void main(String args[])
	{
		Method_overloading obj = new Method_overloading();
		int value = obj.add(5,4,3);
		System.out.println(value);
		
		double temp = obj.add(5.5,4.5);
		System.out.println(temp);
	}
	
	public int add(int a,int b)
	{
        int c = a+b;
        return c;
	}
	
		public int add(int a,int b,int c)
		{
			int d = a+b+c;
	        return d;
		}
		
		    public double add(double a,double b)
		    {
	            double c = a+b;
	            return c;
		    }
		    
		    	public double add(int a,double b)
		    	{
		    		double c = a+b;
		    		return c;
		    	}
		
		    		public double add(double a,int b)
		    		{
		    			double c = a+b;
		    			return c;
		    		}
			

}
