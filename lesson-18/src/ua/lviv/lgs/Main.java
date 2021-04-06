package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		minimum();
		
		maximum();
		
	}
	

	
	/* метод addStringToList не має дженеріков, тому можливо додати String.
	 * щоб цього не допустити, вірно було б написати: addStringToList(List<Integer> list, String string) */
	private static void addStringToList(List list, String string) {
		list.add(string);
	}
	
	public static void minimum() {
		List<Integer> list = new ArrayList<Integer>();	
		list.add(-67);
		list.add(374);
		addStringToList(list, "158");
		addStringToList(list, "76");
		addStringToList(list, "-29");
		addStringToList(list, "647");
		System.out.println(list);
	}
	
	public static void maximum() {
		Map<Integer, String> map = new Map<Integer, String>();
		System.out.println("Added a new object");
        map.put(1, "The Shawshank Redemption");
        map.put(2, "The Godfather");
        map.put(8, "Schindler's List");
        map.put(5, "Pulp Fiction");
        map.put(17, "Fight Club");
        map.put(22, "The Silence of the Lambs");
        System.out.println();
        
        System.out.println("Displaying all Map");
        map.displayMap();
        System.out.println();
        
        System.out.println("Added a repeated objects");
        map.put(1, "Fight Club");
        map.put(2, "The Godfather: Part II");
        System.out.println();
        
        System.out.println("Deleted the map object by key 2");
        map.removeByKey(2);
        map.displayMap();
        System.out.println();
        		
        System.out.println("Deleted the map object by value Fight Club");
        map.removeByValue("Fight Club");
        map.displayMap();
        
        System.out.println();
        System.out.println("Displayed Set of keys");
        map.displayKeys();
        
        System.out.println();
        System.out.println("Displayed List of values");
        map.displayValues();
        
	}

}
