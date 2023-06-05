package simple_java;

public class Final1 {
	
	final private String nationality = "INDIAN";
	static private int num;
	private int statecode;
	private String state;
	private String district;
	
    

	Final1()
	{
	this.statecode = 91;	
	}
	
	Final1(int num)
	{
		this();
		this.num = num;
	}
	
	public void setnum(int num)
	{
		this.num = num;
	}
	
	public void display()
	{
		System.out.println(this.nationality + " " + this.statecode + " " + this.num);
	}
	
	
	public static void main(String args[])
	{
		Final1 obj = new Final1();
		Final1 ob = new Final1(20);
		obj.display();
		obj.setnum(1111);
		ob.display();
		
		
	}
}	

	
