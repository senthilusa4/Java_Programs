package collection_programs;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Array_list_sample extends ArrayList<Object>{

	// List is an Parent class of ArrayList 
	
	public static void main(String args[])
	{
		List<Object> l = new ArrayList<Object>();  // <generic>  Restrict for allow similar data's 
		List<Object> i = new ArrayList<Object>();
		
// ------------------------------------------------------------------------------------------------		
		
		Array_list_sample obj = new Array_list_sample();  // removeRange method is protected
		obj.removeRange(0, 0);	                          // So, extends class only can access the method Otherwise CAN'T  
		
//-------------------------------------------------------------------------------------------------		
		ArrayList<Integer> u = new ArrayList<Integer>();
		u.add(8);
		u.add(9);		// ArrayList class method so should create object for ArrayList Class
		u.add(8);       // So only can access the respective method 
		u.add(9);
		u.trimToSize();  
// ------------------------------------------------------------------------------------------------		
		
		i.add(888); // add specified element to list   RETURN_TYPE = BOOLEAN
		
		int a = 9;
		Integer o = (Integer) a;
		l.add(o);
		
		l.add(null);   // Converting primitive data_type into Respective Wrapper_class object ||  AUTO-BOXING 
		l.add("String");
		l.add('c');
		l.add(null);
		l.add(8.9); // Append the specified element at the end of the list 
		System.out.println(l);
		
		l.add(1, 123);  // add elements with specified index
		System.out.println(l);
		
		i.addAll(l);
		System.out.println(i);  // Copied a existing list in to another list
		
		i.clear();  // Remove all elements in a list
		System.out.println(i.isEmpty());  // List is empty or not  || Return_type is boolean 
		System.out.println(i);
		
		// contains given element is present or not || Return-type is boolean 
		System.out.println(l.contains(null));
		
		// return the element at the specified index
		System.out.println(l.get(0));
		
		// Specified element present means it return index position of the element ( RETURN - First occurrence index position)
		System.out.println(l.indexOf(999));  // Not present means return -1
		System.out.println(l.indexOf(null));
		
		System.out.println(l.lastIndexOf(null));  // Not present means return -1
		System.out.println(l.lastIndexOf(999));   // ( RETURN - last occurrence index position)
		
		// Remove specified index position element
		Object s = l.remove(4);
		System.out.println(s);
		System.out.println(l.remove(8.9));  // Remove specified element at first occurrence of an List
		
		// l.removeAll(collection)   || Remove specified list elements
		
		System.out.println(l);
		
		// Replaces the element at the specified index position
		l.set(2, 8.9);
		System.out.println(l);
		
		int n = l.size();
		System.out.println("Returns the number of elements in this list "+n);
		
		// Returns list 
		// Between the specified fromIndex | toIndex  0 to 2 means return 0 & 1 index position element
		System.out.println(l.subList(0, 2));
		System.out.println(l);
		
	}

}

