package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class List_Rotation_single {
	
	public static void main(String args[])
	{
		List_Rotation_single obj = new List_Rotation_single();
		                     obj.rotate();
	}
	
	/*
     *   input  1 2 3 4
     * 	output	4 1 2 3
     */

	// This method is for ROTATE THE GIVEN List
    //     # Single rotate the LIST output-like (4123)
    //     # index[0]=1  | index[1]=2  | index[2]=3  | index[3]=4
	//       First store the index[3](last-element) value in temp variable 
	//       0^th index value will store the 1^st index
	//       1^st index value will store the 2^nd index
	//       2^nd index value will store the 3^rd index
	//       temp-variable value will store the 0^th index

	
	public void rotate()
	{
	List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(9);
		l.add(7);
		l.add(8);
		l.add(99);
		
		System.out.println(l);
	
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=i+1;j<l.size();)
			{
			int temp = l.get(i);
			int js = l.get(j);
			l.set(i, js);
			l.set(j, temp);
			break;
			}
		}
		
		System.out.println(l);
	}

}
