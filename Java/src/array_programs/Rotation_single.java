package array_programs;

public class Rotation_single {
	
	public static void main(String args[])
	{
		Rotation_single obj = new Rotation_single();
		                obj.rotate_logic1();
		              //  obj.rotate_logic();
	}
	public void rotate_logic1()
	{
		int a[] = {1,2,3,4};
		 
		int temp = a[0];
		
		if(a.length > 1)
		{
			for(int i=0;i<a.length;i++)
			{
				if(i==a.length-1)
				{
					a[i]=temp;
				}
				else
				{
					a[i]=a[i+1];
				}
			}
		
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i] + " ");
				}
		}
		else
		{
			System.out.println("Please enter atleast 2 element | CAN'T ROTATE ");
		}
	}
	
			public void rotate_logic()
			{
				int a[] = {1,2,3,4,5,6};
				 
				int temp = a[0];
				
				System.out.println();
				for(int i=0;i<a.length-1;i++)
				{
					a[i]=a[i+1];
				}
				
				a[a.length-1]=temp;
				
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i] + " ");
				}
			}
			

}
