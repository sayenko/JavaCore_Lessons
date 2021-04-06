package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human{

	private String surname;
	private String name;
	private int age;
	private boolean bribeTaker;
	private int sizeOfTheBribe;
	
	public Deputy(int weight, int height, String surname, String name, int age, boolean bribeTaker) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBribeTaker() {
		return bribeTaker;
	}
	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}
	public int getSizeOfTheBribe() {
		return sizeOfTheBribe;
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", sizeOfTheBribe=" + sizeOfTheBribe + ", toString()=" + super.toString() + "]";
	}
	
	public void giveABribe() {
		if(!this.bribeTaker) {
			System.out.println("Цей депутат не бере хабарів");
		} else {
			System.out.println("Яку суму хабаря пропонуєте?");
			Scanner scanner = new Scanner(System.in);
			int bribe = scanner.nextInt();
			if(bribe > 5000) {
				System.out.println("Поліція \"ув'язнить\" депутата");
			} else {
				System.out.println("Депутат взяв хабар в розммірі " + bribe + "$");
				sizeOfTheBribe += bribe;
			}
		}
	}
}
