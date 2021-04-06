package ua.lvil.lgs;

import java.util.Scanner;

/**
 * This is the main class in which methods are called to work with months and seasons.
 * @since java 1.8
 * @author Eugene
 * @version 1.2 
 * */
public class Main {

	public static void main(String[] args) throws WrongInputConsoleParametersException {
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

	/**
	 * Checks to see if there is a month like the one entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth1() throws WrongInputConsoleParametersException {
		System.out.println("Enter Month:");
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		Months[] mas = Months.values();

		boolean flag = false;
		for (Months m : mas) {
			if (m.name().equalsIgnoreCase(month)) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("Month exist");
		} else {
			throw new WrongInputConsoleParametersException("Month doesn't exist");
		}
	}

	
	/**
	 * Displays all months with the same time of year as entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth2() throws WrongInputConsoleParametersException {
		System.out.println("Enter Season:");
		Scanner sc = new Scanner(System.in);
		String season = sc.nextLine();
		Months[] mas = Months.values();
		boolean flag = false;

		for (Months m : mas) {
			if (m.getSeason().name().equalsIgnoreCase(season)) {
				System.out.println(m.name());
				flag = true;
			}
		}
		if (!flag) {
			throw new WrongInputConsoleParametersException("Season doesn't exist");
		}
	}

	
	/**
	 * Displays all months that have the same number of days as entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth3() throws WrongInputConsoleParametersException {
		System.out.println("Enter number of days (29, 30, 31):");		
		try {
			Scanner sc = new Scanner(System.in);
			int day = sc.nextInt();
			Months [] mas = Months.values();
			int i = 0;
			
			for(Months m : mas) {					
				if(m.day == day) {
					i++;
					System.out.println(m.name());
				}
			}
			if(i == 0) {
				throw new WrongInputConsoleParametersException("Wrong number of days");
			}
		} catch (Exception e) {
			throw new WrongInputConsoleParametersException("Wrong number of days");
		}
	}

	
	/**
	 * Displays all months that have fewer days than the month entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth4() throws WrongInputConsoleParametersException {
		System.out.println("Enter number of days:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		Months[] mas = Months.values();
		int i = 0;
		
		for (Months m : mas) {
			if (m.day < day) {
				i++;
				System.out.println(m.name());
			}
		}
		if(i == 0) {
			throw new WrongInputConsoleParametersException("The entered number is less than the minimum value");
		}
	}

	
	/**
	 * Displays all months that have more days than the month entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth5() throws WrongInputConsoleParametersException {
		System.out.println("Enter number of days:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		Months[] mas = Months.values();
		int i = 0;
		
		for (Months m : mas) {
			if (m.day > day) {
				i++;
				System.out.println(m.name());
			}
		}
		if(i == 0) {
			throw new WrongInputConsoleParametersException("Åhe entered number is greater than the maximum value");
		}
	}

	
	/**
	 * Displays the next season of year than the one entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth6() throws WrongInputConsoleParametersException {
		System.out.println("Enter Season:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		boolean flag = false;

		Seasons mas[] = Seasons.values();
		for (Seasons season : mas) {
			if (season.name().equals(s)) {
				flag = true;
			}
		}
		if (flag) {
			int value = Seasons.valueOf(s).ordinal();
			int length = mas.length;
			if (value < length - 1) {
				System.out.println("Next season is: " + mas[value + 1]);
			} else if (value == length - 1) {
				System.out.println("Next season is: " + mas[0]);
			}
		} else {
			throw new WrongInputConsoleParametersException("Season doesn't exist");
		}
	}

	
	/**
	 * Displays the previous season of the year than the one entered through the console.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth7() throws WrongInputConsoleParametersException {
		System.out.println("Enter Season:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		boolean flag = false;

		Seasons mas[] = Seasons.values();
		for (Seasons season : mas) {
			if (season.name().equals(s)) {
				flag = true;
			}
		}
		if (flag) {
			int value = Seasons.valueOf(s).ordinal();
			int length = mas.length;
			if (value == 0) {
				System.out.println("Previous season is: " + mas[length - 1]);
			} else if (value > 0) {
				System.out.println("Previous season is: " + mas[value - 1]);
			}
		} else {
			throw new WrongInputConsoleParametersException("Season doesn't exist");
		}
	}

	
	/**
	 * Displays all months with an even number of days.
	 * 
	 * @param no input params
	 * 
	 * */
	public static void viewMonth8() {
		Months[] mas = Months.values();

		for (Months m : mas) {
			if (m.day % 2 == 0) {
				System.out.println(m.name());
			}
		}
	}
	

	/**
	 * Displays all months with an odd number of days.
	 * 
	 * @param no input params
	 * 
	 * */
	public static void viewMonth9() {
		Months[] mas = Months.values();

		for (Months m : mas) {
			if (m.day % 2 != 0) {
				System.out.println(m.name());
			}
		}
	}

	
	/**
	 * Displays whether the month entered from the console has an even number of days.
	 * 
	 * @param no input params
	 * 
	 * @throws WrongInputConsoleParametersException
	 * */
	public static void viewMonth10() throws WrongInputConsoleParametersException {
		System.out.println("Enter Month:");
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		Months[] mas = Months.values();

		boolean flag = false;
		for (Months m : mas) {
			if (m.name().equalsIgnoreCase(month)) {
				flag = true;
				if (m.day % 2 == 0) {
					System.out.println("the month " + m.name() + " has an even number of days");
				} else {
					System.out.println("the month " + m.name() + " has an odd number of days");
				}
			}
		}

		if (!flag) {
			throw new WrongInputConsoleParametersException("Month doesn't exist");
		}
	}
}
