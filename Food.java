package pet;

/**
 * this represent generic food for a pet
 * @author Shi Zhang
 *
 */
public class Food {
	
	//instance variables
	
	private int calories;
	
	//constructor
	
	public Food(int calories) {
		this.calories = calories;
	}

	//getters and setters
	/**
	 * gets the calories
	 * @return
	 */
	public int getCalories() {
		return calories;
	}
	
	/**
	 * sets the calories
	 * @param calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	

}
