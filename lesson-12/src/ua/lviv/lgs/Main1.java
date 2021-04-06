package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main1 {

	public static void main(String[] args) {
		
		firstTask(5, 5);
		
	}
	
	public static void firstTask(int maxMas1, int maxMas2) {
		
		Random r = new Random();
		int m1 = r.nextInt(maxMas1)+1;
		int m2 = r.nextInt(maxMas2)+1;
		
		ArrayList<ArrayList> carList1 = new ArrayList();		
		
		int i, j;
		
		System.out.println("Random values of array");
		for(i = 0; i < m1; i++) {
			ArrayList<Car> carList2 = new ArrayList();
			for(j = 0; j < m2; j++) {
				int horsepower = r.nextInt(1000);
				int year = r.nextInt(30) + 1990;
				
				int diameter = r.nextInt(9)+35;
				Material material = Material.values()[r.nextInt(Material.values().length)];
				Helm helm = new Helm(diameter, material);
				
				int numberOfCylinders = r.nextInt(24)+1;
				Engine engine = new Engine(numberOfCylinders);
				
				carList2.add(new Car(horsepower, year, helm, engine));
			}
			carList1.add(carList2);
			System.out.println(carList2);
		}
		
		System.out.println();
		
		System.out.println("Array with the same Car class");
		Car car = new Car(300, 2020, new Helm(40, Material.ALCANTARA), new Engine(16));
		for(i = 0; i < carList1.size(); i++) {
			ArrayList<Car> carList2 = carList1.get(i);
			for(j = 0; j < carList2.size(); j++) {
				carList2.set(j, car);
			}
			System.out.println(carList2);
		}
	}
	
	
}
