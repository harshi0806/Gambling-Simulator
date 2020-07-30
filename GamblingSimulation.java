package GamblingSimulation;

public class GamblingSimulation {

	//Initialize the static variables Stake Amount for a day and bet amount
	private static final int STAKE_AMOUNT = 100;
	private static final int BET_AMOUNT = 1;
	private static int gambleAmount = STAKE_AMOUNT;
	private static int dayCount = 1;
	private static int wins = 0, loose = 0, proAmt = 0, losAmt = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to the Gamble Zone!! Let's get started.............");
		while(dayCount < 30) {
		resignCheck();
      if (dayCount >= 20) {
		System.out.println("After" + dayCount + "days..........");
        	if (wins > loose) {
           	System.out.println("Total Profit : "+ proAmt);
        	}
			else {
           	System.out.println("Total Loss : "+ losAmt);
        	}
		}
		}
		System.out.println("After a month..........");
		System.out.println("Total Wins: "+ wins);
		System.out.println("Total Loose: "+ loose);
		int stakeAmount = 30 * STAKE_AMOUNT;
		int totalProAmt = stakeAmount - proAmt;
		int totalLosAmt = stakeAmount - losAmt;
		if (dayCount >= 30 && wins > loose) {
			System.out.println("Luckiest day: "+ dayCount);
			System.out.println("Total Win Amount :" + totalProAmt);
		}
		else {
			System.out.println("Unluckiest day: "+ dayCount);
			System.out.println("Total Loose Amount :" + totalLosAmt);
		}
	}

	// This function will generate the roll outcome
	public static void gamble() {
		System.out.println("Try your luck!!!");
		final int rollOut = (int)Math.floor(Math.random() * 10) % 2;
		// Winning condition
		if (rollOut == 1) {
			System.out.println("Congratulations!! You won $1.");
			gambleAmount+= BET_AMOUNT;
			proAmt+= gambleAmount;
			wins++;
		} //Loosing condition
		else {
			System.out.println("Bad luck, you lost $1. Try your luck next time!");
			gambleAmount-= BET_AMOUNT;
			losAmt+= gambleAmount;
			loose++;
		}
	}

	// This function resigns the gambler for the day when the gamble amount reaches to 50% of the stake
	public static int resignCheck() {
		while(true) {
			gamble();
			if (gambleAmount <= 50 || gambleAmount >= 150 ) {
				System.out.println("You are resigned for the day");
			}
		break;
		}
		dayCount++;
		return dayCount;
	}
}
