package GamblingSimulation;

public class GamblingSimulation {

	//Initialize the static variables Stake Amount for a day and bet amount
	private static final int STAKE_AMOUNT = 100;
	private static final int BET_AMOUNT = 1;
	private static int gambleAmount = STAKE_AMOUNT;
	public static void main(String[] args) {
		System.out.println("Welcome to the Gamble Zone!! Let's get started.............");
		gamble();
	}

	// This function will generate the roll outcome
	public static void gamble() {
		System.out.println("Try your luck!!!");
		final int rollOut = (int)Math.floor(Math.random() * 10) % 2;
		// Winning condition
		if (rollOut == 1) {
			System.out.println("Congratulations!! You won $1.");
			gambleAmount+= BET_AMOUNT;
		} //Loosing condition
		else {
			System.out.println("Bad luck, you lost $1. Try your luck next time!");
			gambleAmount-= BET_AMOUNT;
		}
		if (gambleAmount == 50 || gambleAmount == 150) {
			System.out.println("You are resigned for the day");
		}
	}
}

