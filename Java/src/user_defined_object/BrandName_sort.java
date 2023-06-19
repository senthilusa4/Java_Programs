package user_defined_object;

import java.util.Comparator;

public class BrandName_sort implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Shoes s1 = (Shoes)o1;
		Shoes s2 = (Shoes)o2;
		return s1.getBrand_name().compareTo(s2.getBrand_name());
	}

}
