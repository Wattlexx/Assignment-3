package UserVsCompDieRolling;

public class MainQ1B {
	
	/**
	 * Method that sorts an array
	 * @param nums array of values 
	 */
	public static void sort(int [] nums) {
		
		for (int i = 0; (i+1) < 5; i++) {
			for (int j = 0; (j+1) < 5; j++) {
				if (nums[i] > nums[i+1]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					if (i > 0) {
						i--;
					}
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	/**
	 * Method that returns how many same values there are in a sorted array
	 * @param nums sorted array of ints
	 * @return string describing how many of a similar kind
	 */
	public static String status(int [] nums) {
		
		int count = 1;
		for (int i = 0; i < 4; i++) {
			if (nums[i] == nums[i+1]) {
				if (count > 1) {
					if ((nums[i] == nums[i+1]) && nums[i+1] == nums[i-1]) {
						count++;
					}
				}
				else {
					count++;
				}
			}
		}
		switch (count) {
		case(2):
			return "two of a kind";
		case(3):
			return "three of a kind";
		case(4):
			return "four of a kind";
		case (5):
			return "five of a kind";
		default:
			return "no pairs";
		}
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("The player array of value is: ");
		int [] player = new int [5];
		for (int i = 0; i < 5; i++) {
			Die d = new Die();
			player[i] = d.getVal();
		}
		
		sort(player);
		System.out.println("\nThe status of the player is: " + status(player));
		

		System.out.print("\nThe computer array of values is: ");
		int [] player2 = new int [5];
		for (int i = 0; i < 5; i++) {
			Die d = new Die();
			player2[i] = d.getVal();
		}
		
		sort(player2);
		System.out.println("\nThe status of the computer is: " + status(player2));
	}

}
