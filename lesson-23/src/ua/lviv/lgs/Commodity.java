package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		Goods goods = new Goods(name, length, width, weight);
		listGoods.removeIf(s -> s.equals(goods));
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
		listGoods.stream().sorted(Comparator.comparing(Goods::getName)).forEach(System.out::println);
	}
	
	public void sortByLength() {
		listGoods.stream().sorted(Comparator.comparing(Goods::getLength)).forEach(System.out::println);
	}
	
	public void sortByWidth() {
		listGoods.stream().sorted(Comparator.comparing(Goods::getWidth)).forEach(System.out::println);
	}
	
	public void sortByWeight() {
		listGoods.stream().sorted(Comparator.comparing(Goods::getWeight)).forEach(System.out::println);
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
