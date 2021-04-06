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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
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
