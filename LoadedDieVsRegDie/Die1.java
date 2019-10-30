package LoadedDieVsRegDie;

public class Die1 {
	protected int val;
	private final static int HIGHEST_DIE_VALUE = 6;
	private final static int LOWEST_DIE_VALUE = 1;
	
	public Die1 () {
		val = ((int)(Math.random()*100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	public int getVal() {
		return val;
	}

}
