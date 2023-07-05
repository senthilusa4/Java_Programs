package collection_programs;

import java.util.HashMap;
import java.util.Map;

public class Map_sample {
	
	public static void main(String[] args)
	{
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1, "Virat");
		m.put(2, "Yuvaraj");  // specified value with the specified key in this map
		m.putIfAbsent(3, null);
		
		m.putIfAbsent(2, "Dhoni");  // specified key is not already associated with a value means  
		m.putIfAbsent(3, "Dhoni");  // given value associate to the respective key.
		System.out.println(m);
		
		Map<Integer,String> m1 = new HashMap<Integer,String>(m);
		
		System.out.println(m.get(1));  // Returns the value to which the specified key is mapped
		
		// m.clear();   // Removes all of the mappings from this map || Return type = void
        System.out.println(m.isEmpty());  // Returns(boolean) true if this map contains no key-value mappings
		
		m.containsKey(1);  // Returns(boolean) true if this map contains a mapping for the specified key.
		m.containsValue("Virat");  // Returns true if this map maps one or more keys to the specified value
		
		System.out.println(m.equals(m1));  //  Compares the specified object with this map for equality
		
		// System.out.println(m.remove(3));   // Removes the mapping for a key from this map if it is present
		// System.out.println(m.remove(3, "Dhoni"));  // Removes respective key,value  || return type BOOLEAN
		
		m.replace(3, "MS"); // Replaces the entry for the specified key only if it is currently mapped to some value
		System.out.println(m.replace(3, "MS", "MS_DHONI"));  // return type = BOOLEAN
		System.out.println(m);
		
		System.out.println(m.size());  // Return-type = int  |  returns SIZE of the map
		
		System.out.println("entrySet " + m.entrySet());;  // Returns a Set view of the mappings contained in this map.
		System.out.println("keySet "+ m.keySet());    // Return SET(Collection)
		System.out.println("values " +m.values());	   // Return One of the Collection type	
		
	}

}
