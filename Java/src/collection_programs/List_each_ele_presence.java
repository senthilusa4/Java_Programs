package collection_programs;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class List_each_ele_presence {
	
	public static void main(String[] args) 
	{
		List_each_ele_presence obj = new List_each_ele_presence();
		                       obj.each_element_present();
	}
	
	// This method is COUNT- EACH element presence
	public void each_element_present()
	{
        List<Integer> l = new LinkedList<Integer>();
		
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(2);
		l.add(5);
		l.add(3);
		l.add(5);
		
		System.out.println("Given LIST");
		System.out.println(l);
		
		Set<Integer> o = new LinkedHashSet<Integer>(l); 
		
		System.out.println();
		System.out.println("Each element count ");
		System.out.println();
		
		for(Integer z : o)
		{
			int x = Collections.frequency(l,z);  // return type = int  ||  Return Each element count 
			System.out.println(z + "-Present --" + x + " Times");
		}
		
	}

}
