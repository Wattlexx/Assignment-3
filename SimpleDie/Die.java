package SimpleDie;

/**
 * The Die class which generates a random number when the die is created
 * @author Nicholas Pinney
 */
public class Die {
	private int val;
	private final static int HIGHEST_DIE_VALUE = 6;
	private final static int LOWEST_DIE_VALUE = 1;
	
	public Die () {
		val = ((int)(Math.random()*100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	public int getVal() {
		return val;
	}

}
