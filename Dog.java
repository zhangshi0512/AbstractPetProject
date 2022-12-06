package pet;

/**
 * represents a dog, and is a sublcass of abstract class Pet.
 * @author Shi Zhang
 *
 */
public class Dog extends Pet {
	
	//static variable
	/**
	 * default sound for all dogs 
	 * only accessible within this class
	 */
	private static String SOUND = "Bark!";
	
	
	//instance variable
	/**
	 * Breed of dog
	 * only accessible within this class
	 */
	private String breed;
	
	//constructors
	/**
	 * Creates a dog with given name, age, weight and breed
	 * @param name
	 * @param age
	 * @param weight
	 * @param breed
	 */
	public Dog(String name, int age, double weight, String breed) {
		// must call constructor in superclass pet
		// set age, name, and weight of dog
		super(age, name, weight);
		
		// set type of dog
		this.breed = breed;
	}
	
	//getters and setters
	/**
	 * return the breed
	 * @return
	 */
	public String getBreed() {
		return breed;
	}
	
	/**
	 * set the breed
	 * @param breed
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//inherited abstract methods
	//must override and implement these (provide bodies)
	/**
	 * Makes dog sound.
	 */
	@Override
	public void makeSound() {
		System.out.println(Dog.SOUND);
	}
	
	/**
	 * returns the name and breed of dog for printing/debugging.
	 */
	@Override
	public String toString() {
		return this.name + " is a " + this.breed;
	}
	
	
}
