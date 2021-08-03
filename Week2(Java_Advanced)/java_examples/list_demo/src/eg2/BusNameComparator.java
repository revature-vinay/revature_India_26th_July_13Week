package eg2;

import java.util.Comparator;

public class BusNameComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus o1, Bus o2) {
		
		return o2.getProviderName().compareTo(o1.getProviderName());
	}

}
