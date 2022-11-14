package to;

public class Test {

	public static void main(String[] args) {
		Animal nuevoAnimal[] = new Animal[4];
		nuevoAnimal[0] = new Animal("animal",3);
		nuevoAnimal[1] = new Mammal("gato", 2,"omnivoro");
		nuevoAnimal[2] = new Bird("gallina", 2.5, "terrestre");
		nuevoAnimal[3] = new Fish("trucha",3,"agua dulce");
		
		for(Animal animal: nuevoAnimal) {
			System.out.println(animal.toString());
			System.out.println("");
		}
	}

}
