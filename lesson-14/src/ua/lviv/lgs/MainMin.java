package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainMin {

	public static void main(String[] args) {

		Set<Human> setHuman = new HashSet<Human>();
		
		setHuman.add(new Human("Ivan", 21));
		setHuman.add(new Human("Maria", 18));
		setHuman.add(new Human("Yura", 36));
		setHuman.add(new Human("Olena", 24));
		setHuman.add(new Human("Nadiya", 48));

		System.out.println("Before sorting");
		for (Human human : setHuman) {
			System.out.println(human);
		}
		
		System.out.println("Sorting by Comparable");
		List<Human> listHuman = new ArrayList<Human>(setHuman);
		Collections.sort(listHuman);
		for (Human human : listHuman) {
			System.out.println(human);
		}
		
		System.out.println("Sorting by Comparator");
		Collections.sort(listHuman, new HumanAgeComparator());
		for (Human human : listHuman) {
			System.out.println(human);
		}
		
	}

}
