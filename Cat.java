package pet;

/**
 * represents a cat, and is a subclass of abstract class pet
 * @author Shi Zhang
 *
 */
public class Cat extends Pet {
	
	//static variable
	/**
	 * default sound for all cats.
	 * only accessible within this class.
	 */
	private static String SOUND = "Meow!";
	
	//instance variable 
	/**
	 * type of cat
	 * only accessible within this class
	 */
	private String type;
	
	//constructor
	/**
	 * creates a cat with given name, age, weight, and type
	 * @param name
	 * @param age
	 * @param weight
	 * @param type
	 */
	public Cat(String name, int age, double weight, String type) {
		// must call constructor in superclass pet
		// set age, name, and weight of cat
		super(age, name, weight);
		
		// set type of cat
		this.type = type;
	}

	
	//getters and setters
	/**
	 * gets the type of cat
	 * @return
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * sets the type of cat
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	//inherited abstract methods
	//must override and implement these (provide bodies)
	/**
	 * Cat makes sound
	 */
	@Override
	public void makeSound() {
		System.out.println(Cat.SOUND);
		
	}

	/**
	 * returns name and type of cat for printing/debugging
	 */
	@Override
	public String toString() {
		return this.name + " is a " + this.type;
	}

}
