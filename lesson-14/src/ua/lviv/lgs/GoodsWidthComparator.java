package ua.lviv.lgs;

import java.util.Comparator;

public class GoodsWidthComparator implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		if(o1.getWidth()>o2.getWidth()) {
			return 1;
		} else if(o1.getWidth()<o2.getWidth()) {
			return -1;
		}
		return 0;
	}

}
