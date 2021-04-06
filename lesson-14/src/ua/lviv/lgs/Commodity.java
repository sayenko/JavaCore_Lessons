package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Commodity {
	private List<Goods> listGoods;
	
	public Commodity() {
		this.listGoods = new ArrayList<Goods>();
	}
	
	public void add() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬вед≥ть назву товару");
		String name = scanner.nextLine();
		
		int length;
		while (true) {
			try {
				System.out.println("¬вед≥ть довжину товару");
				length = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		int width;
		while (true) {
			try {
				System.out.println("¬вед≥ть ширину товару");
				width = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		int weight;
		while (true) {
			try {
				System.out.println("¬вед≥ть вагу товару");
				weight = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		listGoods.add(new Goods(name, length, width, weight));
	}
	
	public void remove() {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬вед≥ть назву товару");
		String name = scanner.nextLine();
		
		int length;
		while (true) {
			try {
				System.out.println("¬вед≥ть довжину товару");
				length = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		int width;
		while (true) {
			try {
				System.out.println("¬вед≥ть ширину товару");
				width = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		int weight;
		while (true) {
			try {
				System.out.println("¬вед≥ть вагу товару");
				weight = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		ListIterator<Goods> listIterator = listGoods.listIterator();
		while (listIterator.hasNext()) {
			Goods goods = listIterator.next();
			if(goods.equals(new Goods(name, length, width, weight))) {
				listIterator.remove();
			}
		}
	}
	
	public void set() {
		Scanner scanner = new Scanner(System.in);
		
		int num = -1;
		while(true) {
			System.out.println("¬вед≥ть номер товару з≥ списку, €кий плануЇте зам≥нити");
			num = scanner.nextInt();
			if(num<listGoods.size()&&num>=0) {
				break;
			}
		}
		
		System.out.println("¬вед≥ть новий товар:");
		System.out.println("¬вед≥ть назву товару");	
		
		scanner.nextLine();
		String name = scanner.nextLine();
		
		int length;
		while (true) {
			try {
				System.out.println("¬вед≥ть довжину товару");
				length = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		int width;
		while (true) {
			try {
				System.out.println("¬вед≥ть ширину товару");
				width = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		int weight;
		while (true) {
			try {
				System.out.println("¬вед≥ть вагу товару");
				weight = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		listGoods.set(num, new Goods(name, length, width, weight));
	}
	
	public void sortByName() {
		Collections.sort(listGoods, new GoodsNameComparator());
		for (Goods goods : listGoods) {
			System.out.println(goods);
		}
	}
	
	public void sortByLength() {
		Collections.sort(listGoods, new GoodsLengthComparator());
		for (Goods goods : listGoods) {
			System.out.println(goods);
		}
	}
	
	public void sortByWidth() {
		Collections.sort(listGoods, new GoodsWidthComparator());
		for (Goods goods : listGoods) {
			System.out.println(goods);
		}
	}
	
	public void sortByWeight() {
		Collections.sort(listGoods, new GoodsWeightComparator());
		for (Goods goods : listGoods) {
			System.out.println(goods);
		}
	}
	
	public void get() {
		Scanner scanner = new Scanner(System.in);
		int num = -1;
		while(true) {
			System.out.println("¬вед≥ть номер елемента");
			num = scanner.nextInt();
			if((num<listGoods.size()&&num>=0)) {
				break;
			}
		}
		System.out.println(listGoods.get(num));
	}
	public void exit() {
		System.exit(0);
	}
}
