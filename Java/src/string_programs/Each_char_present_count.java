package string_programs;

public class Each_char_present_count {
	
	public static void main(String[] args)
	{
		StaticS.input();
		Each_char_present_count obj = new Each_char_present_count();
		int dup = obj.duplicate_present();
	     		  obj.without_dup(dup);
		
	}
	
	// This method is for find the duplicate presence's count
	//		## checking index to another index if equal came means count++ otherwise nothing
	//      ## if once check the index & equal came means || change some value to that index
	//         BECAUSE THEN ONLY SHOULD AVOID THE AGAINCOUNTING(THAT INDEX COUNT)
	
	public int duplicate_present()
	{
		int count = 0; 
		
		String a = StaticS.s;
		char c[] = a.toCharArray();
		
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && (c[i]!='0'))
				{
					count++;
					c[j] = '0';
				}
			}
		}
		return count;
	}
	
					// This method is for TO FIND EACH CHARACTER PRESENCE IN A STRING
					
					/* 
					 * ---REQUIREMENT IS---
					 * 
					 *  ### Store WITHOUT duplicate character in one array
					 *  ### Each character presence's count stored in another one array
					 * 
					 * 		#	Given string change to char array
					 *      #	First should create two array (ONE_ARRAY for store count) (ANOTHER_ONE for store without dup characters) 
					 *      	|| That NEWLY CREATED Array length is -- String array length (minus(-)) Duplicate_presence ||
					 *      
					 *      #	Checking each character || First time each came that time character should not change
					 *                                  || Second , third time came means that character will change to some value
					 *                                  
					 *      # 	End-of-innerLoop --- Array is filled with changed values(Repeative) and without Changed_value(Respective character)  
					 *      
					 *      #	Outside the innerLoop set condition 
					 *          || Not equal to the changed value mean only can store the value in in Respective arrays(count array | wt_out dup array)                           
					 * 		
					 */
					public void without_dup(int n)
					{
						
						String s = StaticS.s;
						
						char c[] =  s.toCharArray();
						
						char temp[] = new char[c.length-n];
						int count[] = new int[c.length-n];
						
						int o = 0;
						for(int i=0;i<c.length;i++)                                     // d
						{
							int times = 0;                                              // 0   1
							boolean flag = false;                                       // f   
							for(int j=0;j<c.length;j++)                                 // d
							{
								if((c[i]==c[j])&&(flag == false)&&(c[i] != '0'))        // t|t|t
								{
									times++;                                            // times=1
									flag= true;                                         // flag=t
								}
								
								else if((c[i]==c[j]) && (c[i] != '0'))  //
								{               
									times++;                                            //
									c[j] = '0';                                         //
								}
							}
							
								if(c[i] != '0')
								{
									temp[o] = c[i];
									count[o] = times;
									o++;
								}
						}
						
						System.out.println("Presence of each character in a string");
						System.out.println();
						for(int i=0;i<temp.length;i++)
						{
							System.out.println(temp[i] + " present in " + count[i] + "-times");
						}
						
	   	}

}
