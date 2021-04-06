package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		firstTask(10, 50);
		
		System.out.println();
		
		secondTask(5, 5);
		
	}

	public static void firstTask(int length, int range) {
		System.out.println("FIRST TASK");
		Random r = new Random();		
		Integer[] mas = new Integer [length];
		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = r.nextInt(range);
		}
				
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(mas));
		
		System.out.println("After sorting asc");
		Arrays.sort(mas);
		System.out.println(Arrays.toString(mas));
		
		System.out.println("After sorting des");
		Arrays.sort(mas, Collections.reverseOrder());
		System.out.println(Arrays.toString(mas));
	}
	
	public static void secondTask(int maxMas1, int maxMas2) {
		System.out.println("SECOND TASK");
		Random r = new Random();
		int m1 = r.nextInt(maxMas1)+1;
		int m2 = r.nextInt(maxMas2)+1;
				
		Car[][] carMas = new Car[m1][m2];
		
		int i, j;
		
		System.out.println("Random values of array");
		for(i = 0; i < m1; i++) {
			for(j = 0; j < m2; j++) {
				int horsepower = r.nextInt(1000);
				int year = r.nextInt(30) + 1990;
				
				int diameter = r.nextInt(9)+35;
				Material material = Material.values()[r.nextInt(Material.values().length)];
				Helm helm = new Helm(diameter, material);
				
				int numberOfCylinders = r.nextInt(24)+1;
				Engine engine = new Engine(numberOfCylinders);
				
				carMas[i][j] = new Car(horsepower, year, helm, engine);
			}
			System.out.println(Arrays.deepToString(carMas[i]));
		}
		
//		System.out.println(Arrays.deepToString(carMas));
		
		System.out.println();
		
		System.out.println("Array with the same Car class");
		for(i = 0; i < m1; i++) {
			Arrays.fill(carMas[i], new Car(300, 2020, new Helm(40, Material.ALCANTARA), new Engine(16)));
			System.out.println(Arrays.deepToString(carMas[i]));
		}
//		System.out.println(Arrays.deepToString(carMas));
	}
}
