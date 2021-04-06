package ua.lviv.lgs;

import java.util.Comparator;

public class GoodsLengthComparator implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		if(o1.getLength()>o2.getLength()) {
			return 1;
		} else if(o1.getLength()<o2.getLength()) {
			return -1;
		}
		return 0;
	}

}
