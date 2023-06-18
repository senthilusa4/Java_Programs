package string_programs;

public class Sort_lexicographybased {
	
	public static void main(String[] args) {
		
		Sort_lexicographybased obj = new Sort_lexicographybased();
		                     obj.sort();
	}
	
	
	public void sort()
	{
		String a[] = {"apple","doll","cat","car","banana"};
		
		System.out.println("Before sort ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
				for(int i=0;i<a.length-1;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i].compareTo(a[j])>0)
						{
							String temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
		
		System.out.println();
		System.out.println();
		System.out.println("After nexographically sort ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
