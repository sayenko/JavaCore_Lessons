package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {
	
	Map<Person, List<Pet>> map;

	public ZooClub() {
		this.map = new HashMap<Person, List<Pet>>();
	}
	
	public void addClubMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м€ учасника");
		String name = scanner.nextLine();		
		
		int age;
		while(true) {
			try {
				System.out.println("¬вед≥ть в≥к учасника");
				age = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		Person person = new Person(name, age);
		map.put(person, new ArrayList<Pet>());		
	}
	
	public void addPet() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬вед≥ть ≥м€ учасника");
		String name = scanner.nextLine();
		
		int age;
		while(true) {
			try {
				System.out.println("¬вед≥ть в≥к учасника");
				age = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		Person person = new Person(name, age);
		
		System.out.println("¬вед≥ть вид тваринки");
		scanner.nextLine();
		String kindOfPet = scanner.nextLine();
		
		System.out.println("¬вед≥ть ≥м€ тваринки");
		String petName = scanner.nextLine();
		
		Pet pet = new Pet(kindOfPet, petName);		
		
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if(next.getKey().equals(person)) {
				List<Pet> value = next.getValue();
				value.add(new Pet(kindOfPet, petName));
				next.setValue(value);
			}
		}
	}
	
	public void removePetFromClubMember() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬вед≥ть ≥м€ учасника");
		String name = scanner.nextLine();
	
		int age;
		while(true) {
			try {
				System.out.println("¬вед≥ть в≥к учасника");
				age = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		
		Person person = new Person(name, age);
		
		System.out.println("¬вед≥ть вид тваринки");
		scanner.nextLine();
		String kindOfPet = scanner.nextLine();		
	
		System.out.println("¬вед≥ть ≥м€ тваринки");
		String petName = scanner.nextLine();
	
		Pet pet = new Pet(kindOfPet, petName);		
	
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
	
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if(next.getKey().equals(person)) {
				List<Pet> value = next.getValue();
				value.remove(new Pet(kindOfPet, petName));
				next.setValue(value);
			}
		}		
	}
	
	public void removeClubMember() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬вед≥ть ≥м€ учасника");
		String name = scanner.nextLine();
	
		int age;
		while(true) {
			try {
				System.out.println("¬вед≥ть в≥к учасника");
				age = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.next();
			}
		}
		Person person = new Person(name, age);
		
		map.remove(person);
	}

	public void removePet() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬вед≥ть вид тваринки");
		String kindOfPet = scanner.nextLine();		
	
		System.out.println("¬вед≥ть ≥м€ тваринки");
		String petName = scanner.nextLine();
	
		Pet pet = new Pet(kindOfPet, petName);		
	
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
	
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			List<Pet> value = next.getValue();
			if(value.contains(pet)) {
				value.remove(new Pet(kindOfPet, petName));
				next.setValue(value);
			}
		}		
	}

	public void showZooClub() {
		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	public void exit() {
		System.exit(0);
	}
}
