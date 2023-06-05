
package simple_java;
	
	public class Constructor_with_this {
		
		private int virat_odi_runs;
		private int virat_t20_runs;
		private int virat_test_runs;
		private int virat_all_runs;
		
		
		Constructor_with_this()
		{
			virat_all_runs = 25218;
		}
		
		Constructor_with_this(int test_runs, int odi_runs, int t20_runs)
		{
	        this(); // Calling the current constructor class
	        this.virat_test_runs = test_runs;
	        this.virat_odi_runs = odi_runs;
	        this.virat_t20_runs = t20_runs;
		}
		
				Constructor_with_this(int test_runs,int odi_runs)
				{
					this();
					this.virat_test_runs = test_runs;
					this.virat_odi_runs = odi_runs;
				}
				
						Constructor_with_this(int t20_runs)
						{
							this(5620,999); // two argument pass
							this.virat_t20_runs =t20_runs;
							
						}
						
						public void display()
						{
							System.out.println(this.virat_all_runs + " " + this.virat_odi_runs + " " + this.virat_t20_runs + " " + this.virat_test_runs);
						}
	
	}
