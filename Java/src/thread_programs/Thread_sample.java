package thread_programs;

public class Thread_sample extends Thread {
	
	// By using extend class to creating a thread
	
	public static void main(String args[]) throws InterruptedException
	{
		Thread t1 = new Thread_sample();
		Thread t2 = new Thread_sample();
		Thread t3 = new Thread_sample();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		
		t1.start();   // Thread call the run_method 
	//	t1.sleep(1000);
		t2.start();
		t3.start();
		
		t1.join();  // Main thread waiting for T1 thread task-completion 
		t2.join();
		t3.join();
		
		System.out.println("All task's are Done");
		// After sub-thread task once complete ||  main-doing the main_thread_task
		
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
				System.out.println(i+" welcome");
     			Thread.sleep(1000);  // Waiting time(sleep)
			}
			catch(InterruptedException e)
			{
				String s = e.getMessage();
				System.out.println(s);
			}
		}
	}

}
