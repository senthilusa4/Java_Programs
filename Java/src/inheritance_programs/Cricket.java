package inheritance_programs;

public class Cricket extends Sports {
	
	public static void main(String args[])
	{
		Cricket obj = new Cricket();
		        obj.endurance(); // Parent class 
		        obj.stamina();   // parent class
		        obj.run();       // Child class override a parent class
		        obj.skill();     // child class method
	}
	
	static public void run()
	{
		System.out.println("In cricket run means SCORE  -- Child class");
	}
	
	public void skill()
	{
		System.out.println("Skill Highly need -- Child class");
	}

}
