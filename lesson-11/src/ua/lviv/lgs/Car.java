package ua.lviv.lgs;

public class Car {

	private int horsepower;
	private int year;
	private Helm helm;
	private Engine engine;
	
	public Car(int horsepower, int year, Helm helm, Engine engine) {
		super();
		this.horsepower = horsepower;
		this.year = year;
		this.helm = helm;
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [horsepower=" + horsepower + ", year=" + year + ", " + helm.toString() + ", " + engine.toString() + "]";
	}
	
	
}
