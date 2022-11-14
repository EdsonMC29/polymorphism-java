package to;

public class Bird extends Animal{
	private String movility;
	public Bird(String name, double weight, String movility) {
		super(name, weight);
		this.movility = movility;
	}
	public String getMovility() {
		return movility;
	}
	public void setMovility(String movility) {
		this.movility = movility;
	}
	@Override
	public String toString() {
		return "Bird [name=" + getName() + ", movility=" + getMovility() + ", weight=" + getWeight() + "]";
	}

}
