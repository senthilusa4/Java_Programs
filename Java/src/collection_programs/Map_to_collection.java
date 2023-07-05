package collection_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Map_to_collection {

	// This method is converting One of the Collection to MAP
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<String>();  
		
		l.add("Virat");
		l.add("Sachin");
		l.add("Yuvaraj");
		l.add("Dhoni");
		l.add("Jadeja");
		l.add("Pant");
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		for(int i=0;i<l.size();i++)
		{
			m.put(i+1, l.get(i));
		}
		
		System.out.println(m);
		
		List<Object> ll = new LinkedList<Object>(m.entrySet());  // map to collection(One of the Object)
		System.out.println(ll);
		
		List<Integer> x = new LinkedList<Integer>(m.keySet());  // map to collection
		System.out.println(x);
		
		List<String> q = new LinkedList<String>(m.values());  // map to collection
		System.out.println(q);
	
	}

}
