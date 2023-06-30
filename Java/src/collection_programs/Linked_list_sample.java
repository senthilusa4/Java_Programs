package collection_programs;

import java.util.LinkedList;
//import java.util.List;

//List is a  parent class of LinkedList

public class Linked_list_sample {
	
	// LinkedList is easy to process for manipulating(update) an data Comparatively ArrayList
	// In linkedList Search(Search an element) is take more time comparatively ArrayList
	
	public static void main(String[] args)
	{
		LinkedList<Integer> m = new LinkedList<Integer>();
		
		m.add(8);
		m.add(9);
		m.addLast(10);   // add element in end of the list  Return-type = void
		m.addFirst(7);   // add element in first of the list Return-type = void
		System.out.println(m);
		
		System.out.println(m.element());  // Retrieves - first element of this list (but does not remove)
		
		System.out.println(m.getFirst());  // Returns the first element in this list
		System.out.println(m.getLast());   // Returns the last element in this list
		
		m.offer(11);       // Add specified element as the tail (last element) of this list
		m.offerFirst(6);   // Inserts the specified element at the front of this list
		m.offerLast(12);   // Inserts the specified element at the end of this list
		System.out.println(m);
		
		System.out.println(m.peek());  // Retrieves first element of this list (but does not remove) 
		
		System.out.println(m.poll());  // Retrieves and removes first element of this list
		System.out.println(m);
		
		System.out.println(m.pop());  // Pops an element from the stack represented by this list (First-element)
		System.out.println(m);
		
		m.push(7);   //  Pushes an element onto the stack represented by this list (Insert front of the list)
		System.out.println(m);
		
		m.removeFirst();  //  Removes and returns the first element from this list
		
		System.out.println(m.removeFirstOccurrence(100));  // Removes the first occurrence of the specified element in this list 
		System.out.println(m);                             // Return type boolean
		
		System.out.println(m.removeLastOccurrence(100));  // Removes the last occurrence of the specified element in this list 
		System.out.println(m);                             // Return type boolean
		
		
	}

}