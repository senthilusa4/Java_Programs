package thread_programs;


class Syn{
	
	int count;   
	
	// why synchronized - Lose the data at parallel execution || so we go for synchronized 
	
	//   synchronized ----- one thread runs at a time  || after complete a thread next thread will execute
	
    //       ###  Disadvantage is More-waiting time
	
	synchronized void count()
	{
		count++;
	}
	
	void total_count()
	{
		System.out.println(count);
	}
	
}

////////////////////////////////////////////////////////////////////////////////////////////////

public class Synchronize {
	
	// LAMBDA - LAMBDA expression can implemented a function interface by defining anonymous functions
	
	public static void main(String args[]) throws InterruptedException
	{
		Syn p = new Syn();
		     
			Runnable r1 = () -> {
			
				for(int i=0;i<5000;i++)
				{
					p.count();
				}
			};
			
					Runnable r2 = () -> {
						
						for(int i=0;i<5000;i++)
						{
							p.count();
						}
					};
			
			
			Thread t1 = new Thread(r1);
			Thread t2 = new Thread(r2);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
			p.total_count();
	}

}
