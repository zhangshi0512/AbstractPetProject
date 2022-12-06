package pet;

import java.util.ArrayList;

/**
 * Abstract class pet represents a generic (or abstract) pet.
 * @author Shi Zhang
 *
 */
public abstract class Pet {
	
	//instance variables
	int age;
	
	String name;
	
	double weight;
	
	//constructor
	/**
	 * called by subclass pet to create instances of different types of pets.
	 * @param age
	 * @param name
	 * @param weight
	 */
	public Pet(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//getters and setters
	/**
	 * gets the weight
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * sets the weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//non-abstract method
	/**
	 * tells pet to eat given food
	 * @param food
	 */
	public void eat(Food food) {
		this.weight += (food.getCalories() / 100);
	}
	
	//abstract method
	/**
	 * forces all pets to make their own sound
	 * all subclasses of pet must implement this method
	 */
	public abstract void makeSound();
	
	/**
	 * forces all pets to override toString for printing and debugging
	 */
	public abstract String toString();
	

	public static void main(String[] args) {
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		Dog dog = new Dog("Buster", 14, 100, "German Shepherd");
		
		Cat cat = new Cat("Snuggles", 3, 40, "House Cat");
		
		//add pets to list
		pets.add(dog);
		pets.add(cat);
		
		for (Pet p : pets) {
			//pet makes sound
			//abstract method in pet class
			//every subclass of pet must have this method implemented
			p.makeSound();
		}
		
		for (Pet p : pets) {
			//print pet
			//abstract method in pet class
			//every subclass of pet must have this method implemented
			System.out.println(p);
		}
		
		//call specific method in dog class
		String breed = dog.getBreed();
		System.out.println("dog breed: "+ breed);
		
		//call specific method in cat class
		String type = cat.getType();
		System.out.println("cat type: " + type);
		
		//get and print dog's current weight
		//calls non-abstract method in pet class
		System.out.println("dog's weight: " + dog.getWeight());
		
		//create pet food
		Food food = new Food(1000);
		
		//calls non-abstract method defined in pet class
		dog.eat(food);
		
		System.out.println("dog's new weight: " + dog.getWeight());
	}

	

}
