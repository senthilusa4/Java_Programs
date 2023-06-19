package user_defined_object;

import java.util.Comparator;

public class Offer_sort implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		Shoes s1 = (Shoes)o1;
		Shoes s2 = (Shoes)o2;
		
		if(s1.getOffer()>s2.getOffer())
		{
			return -1;
		}
		
		else if(s1.getOffer()<s2.getOffer())
		{
			return 1;
		}
		
		else
		{
			return 0;
		}
		
	}

}
