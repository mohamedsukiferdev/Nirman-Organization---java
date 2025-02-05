package AnimalBehavior;

public class Main {
 public static void main(String[] args) {
	Dog d = new Dog();
	Bird b = new Bird();
	
	d.move();
	d.Speak();
	
	b.move();
	b.Speak();
	 
	System.out.println(Animal.isMammal("Dog"));
	System.out.println(Animal.isMammal("Cat"));
	System.out.println(Animal.isMammal("ball"));
	System.out.println(Animal.CATEGORY);
	

}
}
