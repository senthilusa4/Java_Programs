package simple_java;

public class Super_child extends Super_parent{
	
	public static void main(String args[])
	{
		Super_child obj = new Super_child();
        int bank_bal = obj.bank(5000);
        System.out.println(bank_bal);
		             obj.dream();
		             obj.parent_dream();
		             obj.name();
		
	}
	
	void dream()
	{
		System.out.println("My dream is " + "Cricketer");
	}
	
	void parent_dream()
	{
		System.out.print("My parent dream is ");
		super.dream();
	}
	
	int bank(int amt)
	{
		return amt;
	}
	

}
