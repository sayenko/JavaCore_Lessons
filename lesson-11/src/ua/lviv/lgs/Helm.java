package ua.lviv.lgs;

public class Helm {
	
	private int diameter;
	private Material material;
	
	public Helm(int diameter, Material material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}
	
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + ", material=" + material + "]";
	}	

}
