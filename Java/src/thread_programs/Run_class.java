package thread_programs;

//### Thread

// By creating implements Runnable interface

public class Run_class {
	
	public static void main(String args[])
	{
		Runnable r1 = new First();
		Runnable r2 = new Second();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}

}
