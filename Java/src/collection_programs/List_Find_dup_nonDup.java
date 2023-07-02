package collection_programs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class List_Find_dup_nonDup {
	
	public static void main(String args[])
	{
		List_Find_dup_nonDup obj = new List_Find_dup_nonDup();
		                     obj.repeat_and_non_repeat();
	}
	
	
	// This method is finding repeat || Non-repeat elements
	// ###  That find elements should store to Respective List(Repeat)(Non-Repeat)
	public void repeat_and_non_repeat()
	{
        List<Character> l = new LinkedList<Character>();
		
		l.add('a');
		l.add('z');
		l.add('e');
		l.add('a');
		l.add('z');
		l.add('a');
		l.add('t');
		
		System.out.println("Given List ");
		System.out.println(l);

		Set<Character> s = new HashSet<Character>(); // Non-Repeat
		Set<Character> w = new HashSet<Character>(); // Repeat
		
		for(Character c : l)  // 
		{
			if(s.contains(c))  // s-set having Nothing(Initially) so, First time if-block not allow  
			{				   //	else-block will allow  ||  Then add Respective set  
				w.add(c);	   // # NEXT TIME Repeat element came means if-block will allow 	
			}				   // 						   ||  Then add Respective set
			else
			{
				s.add(c);		// SET NOT ALLOW DUPLICATE'S 
			}
		}
		
		System.out.println();  // Showing | store non-repeat elements
		System.out.println("Without duplicate List");
		System.out.println(s);
		
		System.out.println();  // Showing | store repeat elements
		System.out.println("Duplicate element presence's List");
		System.out.println(w);
		
	}

}
