package array_programs;

import java.util.Scanner;

public class Remove_element {
	
	public static void main(String args[])
	{
		Remove_element obj = new Remove_element();
		Static.size();
		Static.element();
		Static.display();
	    obj.remove();
	}
	
	// This method is for 
	// Removing the element in existing array ||  index position based element also
	
	// First should create the new-array
	// Because array size is fixed requirement is remove one element in existing array so  only
	// Whenever given index and iteration value should equal that time removing the given value in the array 
	public void remove()
	{
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the add element value ");
		//int given = sc.nextInt();
		
		System.out.println("Please enter which index place will to be occupy");
		int index = sc.nextInt();
		
		int b[] = Static.a;
		int n = b.length-1;
		
		int c[] = new int[n];
		
		int temp = 0;
		for(int i=0;i<b.length;i++)
		{
			if(i!=index)
			{
				c[temp]=b[i];
				temp++;
			}
		}
				System.out.println();
				System.out.println("After Removing a element in a array");
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]+ " ");
				}

		
	}

}
