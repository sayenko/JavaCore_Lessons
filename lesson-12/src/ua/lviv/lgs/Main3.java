package ua.lviv.lgs;

public class Main3 {

	public static void main(String[] args) {

		thirdTask();
		
	}
	
	public static void thirdTask() {
		MyArrayList<Object> list = new MyArrayList();
		list.add(12);
		list.add("A");
		list.add(64);
		list.add(19);
		list.add(12);
		list.add("A");
		list.add(64);
		list.add(19);
		list.add(12);
		list.add("A");
		list.add(64);
		list.add(19);
		list.add(12);
		list.add("A");
		list.add(64);
		list.add(19);
		list.add(12);
		list.add("A");
		list.add(64);
		list.add(19);
		
		int l = list.size();
		while(true) {
			list.remove(l--);
			if(l == 0) break;
		}
		
	}

}
