package thread_programs;

public class Run_with_lambda {
	
	//### Thread

	// By creating implements Runnable interface
		
		public static void main(String args[])
		{
			
			//  Runnable r1 = new First();
			//  Runnable r2 = new Second();
			
			/* 	
			 * 		Runnable class having only one ABSTRACT method (run-method)
			 * 
			 * 	 Each thread will implement that run method so will create new class for that
			 * 
			 *                    So go for LAMBDA EXPRESSION 
			 * 	
			 */

			
			
			Runnable r1 = () -> {
			
			for(int i=0;i<5;i++)
			{
				System.out.println(i + "-First");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			};
			
			Runnable r2 = () -> {
				
				for(int i=0;i<5;i++)
				{
					System.out.println(i + "-Second");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			
			
			Thread t1 = new Thread(r1);
			Thread t2 = new Thread(r2);
			
			t1.start();
			t2.start();
			
		}

	}


