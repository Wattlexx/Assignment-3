package LoadedDieVsRegDie;

public class LoadedDie {
	protected int val;
	private final static int HIGHEST_DIE_VALUE = 6;
	private final static int LOWEST_DIE_VALUE = 2;
	
	public LoadedDie () {
		val = ((int)(Math.random()*100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	public int getVal() {
		return val;
	}

}