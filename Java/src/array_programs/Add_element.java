package array_programs;

import java.util.Scanner;

public class Add_element {
	
	public static void main(String args[])
	{
		Add_element obj = new Add_element();
		Static.size();
		Static.element();
		Static.display();
		obj.add();
	}
	
	// This method is for 
	// Inserting the new element in existing array and also index position will select by the user while runtime.
	
	// First should create the new-array
	// Because array size is fixed requirement is insert one element in existing array so  only
	// Whenever given index and iteration value should equal that time inserting given value in the index
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the add element value ");
		int given = sc.nextInt();
		
		System.out.println("Please enter which index place will to be occupy");
		int index = sc.nextInt();
		
		int b[] = Static.a;
		int n = b.length+1;
		
		int c[] = new int[n];
		
		int temp = 0;
		for(int i=0;i<c.length;i++)
		{
			if(i!=index)
			{
				c[i]=b[temp];
				temp++;
			}
			else 
			{
			c[i] = given;
			}
		}
				System.out.println();
				System.out.println("After insert a element in a array");
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]+ " ");
				}
		
	}

}
