package string_programs;

import java.util.Scanner;

public class Runtime_array_dup_cant_store {
	
	public static void main(String[] args)
	{
		Runtime_array_dup_cant_store obj = new Runtime_array_dup_cant_store();
		                           int n = obj.size_of_array();
		                                   obj.store_without_dup_object(n);
	}
	
	
	// This method is return the input size of an array
	public int size_of_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter (input)size of array");
		int n = sc.nextInt();
		
		return n;
	}
	
	  	   /*
		    * 	CHECKING ||  GIVEN INPUT IS ALREADY PRESENT IN A ARRAY MEANS THAT ONE NOT STORE TO ARRAY
		    * 
		    * 	### In-RUNTIME CHECKING 
		    *      
		    *     IF GIVEN INTEGER IS ALREADY PRESENT IN A ARRAY MEAN'S THAT INT_ELEMENT CAN'T STORE TO AN ARRAY
		    * 
		    * 		In runtime give input integer value's (Using scanner)
		    *       Is already present means That element can't to array
		    */
		    public void store_without_dup_object(int n)
			{
				int a[] = new int[n];
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter product name's");
				for(int i=0;i<a.length;i++)
				{
					int s = sc.nextInt();
					boolean flag = false;
					for(int j=0;j<a.length;j++)
					{
						if(a[j]==s)
						{
							flag = true;
							break;
						}
				    }
					
					if(flag==false)
					{
						a[i]= s;
					}
			   }
				
			   sc.close();	
				
				System.out.println(" Given array is : ");
				System.out.println();
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
			}	

}
