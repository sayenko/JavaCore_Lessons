package ua.lviv.lgs;

public class Pet {
	private String kindOfPet;
	private String name;
	public Pet(String kindOfPet, String name) {
		super();
		this.kindOfPet = kindOfPet;
		this.name = name;
	}
	public String getKindOfPet() {
		return kindOfPet;
	}
	public void setKindOfPet(String kindOfPet) {
		this.kindOfPet = kindOfPet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [kindOfPet=" + kindOfPet + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kindOfPet == null) ? 0 : kindOfPet.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (kindOfPet == null) {
			if (other.kindOfPet != null)
				return false;
		} else if (!kindOfPet.equals(other.kindOfPet))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
