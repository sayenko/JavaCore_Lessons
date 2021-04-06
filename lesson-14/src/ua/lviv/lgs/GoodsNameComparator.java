package ua.lviv.lgs;

import java.util.Comparator;

public class GoodsNameComparator implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {		
		return o1.getName().compareTo(o2.getName());
	}

}
