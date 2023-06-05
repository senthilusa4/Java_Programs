package array_programs;

import java.util.Scanner;

public class Sum_index_consecutive_index {
	
	public static void main(String args[])
	{
		Sum_index_consecutive_index obj = new Sum_index_consecutive_index();
		                            obj.sum_index();
                                    obj.consecutive_index();
		
	}
	
	// This method is for CHECK which index value sum equal to the given value
	// 	  # Example - ARRAY[1,4,2,0,3] which 2 index value sum equal to the some-value(user-give 3 means)
	//      EXPECT -  index[0] & index[2] sum 3
	//                index[3] & index[4] sum 3
	public void sum_index()
	{
		int a[] = {1,9,2,7,3,4,6,8};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expected sum number");
		int n = sc.nextInt();
		
		System.out.println("SUM OF INDEXES ARE ");
		//int count =0;
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int value = a[i]+a[j];
				if(value==n)
				{
					System.out.println(i + "-index " + a[i] + " | " + j + "-index " + a[j] + " Sum is " + n );
					//count++;
					flag=true;
				}
			}
		}
		    if(flag==false)
		//	if(count==0)
			{
				System.out.println("NO Sum-of-index value present");
			}
	}
	
	                        // This method is for CHECK which CONSECUTIVE index value sum equal to the given value
	                    	// 	  # Example - ARRAY[1,2,4,0,3] which 2 index value sum equal to the some-value(user-give 3 means)
							//      EXPECT -  index[0] & index[1] sum 3
							//                index[3] & index[4] sum 3
							public void consecutive_index()
							{
								int b[] = {1,9,2,7,3,4,6,8};
								
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter the expected sum number");
								int n = sc.nextInt();
								
								System.out.println("SUM OF CONSECUTIVE INDEXES ARE ");
								int count=0;
								for(int i=0;i<b.length-1;i++)
								{
									for(int j=i+1;j<b.length;j++)
									{
										int value = b[i]+b[j];
										if(value==n)
										{
											System.out.println(i + "-index " + b[i] + " | " + j + "-index " + b[j] + " Sum is " + n );
											count++;
										}
										break;
									}
								}
								
									if(count==0)
									{
										System.out.println("NO Sum-of-consecutive_index value present");
									}
							}

}
