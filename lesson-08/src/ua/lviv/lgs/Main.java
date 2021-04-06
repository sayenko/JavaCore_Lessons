package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		viewMonth1();
		viewMonth2();
		viewMonth3();
		viewMonth4();
		viewMonth5();
		viewMonth6();
		viewMonth7();
		viewMonth8();
		viewMonth9();
		viewMonth10();
	}
	
	public static void viewMonth1() {
		System.out.println("Enter Month:");
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		Months [] mas = Months.values();
		
		boolean flag = false;
		for(Months m : mas) {					
			if(m.name().equalsIgnoreCase(month)) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Month exist");
		}else {
			System.out.println("Month doesn't exist");
		}
	}
	
	public static void viewMonth2() {
		System.out.println("Enter Season:");
		Scanner sc = new Scanner(System.in);
		String season = sc.nextLine();
		Months [] mas = Months.values();
		boolean flag = false;
		
		for(Months m : mas) {					
			if(m.getSeason().name().equalsIgnoreCase(season)) {
				System.out.println(m.name());
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("Season doesn't exist");
		}
	}
	
	public static void viewMonth3() {
		System.out.println("Enter number of days (29, 30, 31):");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		Months [] mas = Months.values();
		
		for(Months m : mas) {					
			if(m.day == day) {
				System.out.println(m.name());
			}
		}
	}
	
	public static void viewMonth4() {
		System.out.println("Enter number of days:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		Months [] mas = Months.values();
		
		for(Months m : mas) {					
			if(m.day < day) {
				System.out.println(m.name());
			}
		}
	}

	public static void viewMonth5() {
		System.out.println("Enter number of days:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		Months [] mas = Months.values();
		
		for(Months m : mas) {					
			if(m.day > day) {
				System.out.println(m.name());
			}
		}
	}
	
	public static void viewMonth6() {
		System.out.println("Enter Season:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		boolean flag = false;
		
		Seasons mas[] = Seasons.values();
		for(Seasons season : mas) {
			if(season.name().equals(s)) {
				flag = true;
			}
		}
		if(flag) {
			int value = Seasons.valueOf(s).ordinal();
			int length = mas.length;
			if(value < length-1) {
				System.out.println("Next season is: " + mas[value+1]);
			} else if (value == length-1) {
				System.out.println("Next season is: " + mas[0]);
			}
		}
		else {
			System.out.println("Season doesn't exist");
		}		
	}

	public static void viewMonth7() {
		System.out.println("Enter Season:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		boolean flag = false;
		
		Seasons mas[] = Seasons.values();
		for(Seasons season : mas) {
			if(season.name().equals(s)) {
				flag = true;
			}
		}
		if(flag) {
			int value = Seasons.valueOf(s).ordinal();
			int length = mas.length;
			if(value == 0) {
				System.out.println("Previous season is: " + mas[length-1]);
			} else if (value > 0) {
				System.out.println("Previous season is: " + mas[value-1]);
			}
		}
		else {
			System.out.println("Season doesn't exist");
		}		
	}

	public static void viewMonth8() {
		Months [] mas = Months.values();
		
		for(Months m : mas) {					
			if(m.day%2 == 0) {
				System.out.println(m.name());
			}
		}
	}
	
	public static void viewMonth9() {
		Months [] mas = Months.values();
		
		for(Months m : mas) {					
			if(m.day%2 != 0) {
				System.out.println(m.name());
			}
		}
	}
	
	public static void viewMonth10() {
		System.out.println("Enter Month:");
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		Months [] mas = Months.values();
		
		boolean flag = false;
		for(Months m : mas) {					
			if(m.name().equalsIgnoreCase(month)) {
				flag = true;
				if(m.day%2 == 0) {
					System.out.println("the month " + m.name() + " has an even number of days");
				} else {
					System.out.println("the month " + m.name() + " has an odd number of days");
				}
			}
		}
		
		if(!flag) {
			System.out.println("Month doesn't exist");
		}
	}
}
