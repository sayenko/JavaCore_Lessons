package ua.lviv.lgs;

public class Animal {
	@Annotation (params = "Animal - kind annotation")
	private String kind;
	@Annotation (params = "Animal - name annotation")
	private String name;
	@Annotation (params = "Animal - age annotation")
	private int age;
	private int weight;
	
	public Animal(String kind, String name, int age, int weight) {
		super();
		this.kind = kind;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [kind=" + kind + ", name=" + name + ", age=" + age + ", weight=" + weight +"]";
	}
	
	
}
