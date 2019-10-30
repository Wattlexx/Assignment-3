package LoadedDieVsRegDie;

public class TestLoadedDie {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			Die1 die = new Die1();
			Die1 die1 = new Die1();
			if (die.getVal() > die1.getVal()) {
				count++;
			}
		}
		System.out.println("With two regular Die, the first die won " + count + " times.");

		
		count = 0;
		for (int i = 0; i < 1000; i++) {
			LoadedDie dieL = new LoadedDie();
			Die1 die2 = new Die1();
			if (dieL.getVal() > die2.getVal()) {
				count++;
			}
		}
		System.out.println("With one loaded die and one regular one, the loaded die won " + count + " times.");

	}

}
