package collection_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_oneTime_presentElement_Tostore_List {

	// This method is for
	/*
	 * 		Given List Duplicate elements will remove and 
	 *      Non_repeative elements only should store to another list
	 *      
	 *      Input =  [1,1,2,2,3,4]
	 *      Output = [3,4]
	 */
	public static void main(String[] args) 
	{
		List_oneTime_presentElement_Tostore_List obj = new List_oneTime_presentElement_Tostore_List();
	              List<Integer> l = obj.dup();
	            			        obj.remove_dup(l);
    }
	
	
	// This method is for
	// 		
	//		### Repeat elements came means THAT should change(set-to) to another value(Integer.MIN_VALUE)
	//      ### InnerLoop last-iteration ||  That, change value if block execute means 
	//                                   Should also || * respective index change to another value(Integer.MIN_VALUE) 
	//                                       Otherwise can't
	//
	public List<Integer> dup()
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
		
				for(int i=0;i<l.size();i++)
				{
					boolean f = false;
					for(int j=i+1;j<l.size();j++)
					{
						if(l.get(i)==l.get(j))
						{
							l.set(j, Integer.MIN_VALUE);
							f = true;
						}
						
						if((f==true)&&(j==l.size()-1))
						{
							l.set(i, Integer.MIN_VALUE);
						}
					}
				}
	 return l;			
	 }		
		
		// This method is for ADD NON-REPEATIVE elements to the LIST
		// ##  Which all are not equal to that change value(Integer.MIN_VALUE) means
	    //                                           +That can add to the result LIST
		public void remove_dup(List<Integer> l)
		{
		
		List<Integer> result = new LinkedList<Integer>(); 
		
		Iterator<Integer> z	= l.iterator();
		
		while(z.hasNext())
		{
			int p = z.next();
			if(p !=Integer.MIN_VALUE)
			{
				result.add(p); 
			}
		}
		
		System.out.println();
		System.out.println("Result of Non-Duplicate element present LIST is ");
		System.out.println(result);
		
	}
}
