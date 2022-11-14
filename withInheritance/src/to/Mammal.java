package to;

public class Mammal extends Animal {
	private String food;

	public Mammal(String name, double weight, String food) {
		super(name, weight);
		this.food = food;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Mammal [food=" + getFood() + ", name=" + getName() + ", weight=" + getWeight() + "]";
	}
	
	

}
