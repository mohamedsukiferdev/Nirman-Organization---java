package AnimalBehavior;

public interface Animal {
	String CATEGORY = "Living Being";

	static boolean isMammal(String animalName) {
		return animalName.equalsIgnoreCase("Dog") || animalName.equalsIgnoreCase("Cat")
				|| animalName.equalsIgnoreCase("Human");
		
	}
	default void Speak() {
		System.out.println("Animal is Making Sound");
	}
	void move();

}
