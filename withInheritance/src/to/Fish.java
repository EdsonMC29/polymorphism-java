package to;

public class Fish extends Animal {
	private String habitat;
	public Fish(String name, double weight, String habitat) {
		super(name, weight);
		this.habitat = habitat;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "Fish [name" + getName() + ", habitat=" + getHabitat() + ", weight=" + getWeight() + "]";
	}

}
