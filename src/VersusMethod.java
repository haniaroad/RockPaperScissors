import java.util.Scanner;

public class VersusMethod {

	public static void dummyVersus() {

		Scanner scan = new Scanner(System.in);
		String gamePick;
		Roshambo oppPick;

		Dummy rock = new Dummy();

		gamePick = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S): ");

		if (gamePick.equalsIgnoreCase("R")) {
			
			oppPick = Roshambo.ROCK;
			
			System.out.println("Your opponent picked Rock. You both tied!");
		
		} else if (gamePick.equalsIgnoreCase("S")) {
			
			oppPick = Roshambo.ROCK;
			
			System.out.println("Your opponent picked Rock. You lost, Dummy won!");
	
		} else if(gamePick.equalsIgnoreCase("P")) {
			
			oppPick = Roshambo.ROCK;
			
			System.out.println("Your opponent picked Rock. You won, Dummy lost!");
		}

	}

	public static void randomPickVersus() {

		Scanner scan = new Scanner(System.in);
		String gamePick;

		RandomPick randomOpp = new RandomPick();
		gamePick = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S): ");

		if (gamePick.equalsIgnoreCase("R")) { // Start checking Rock conditions

			Roshambo oppPick = randomOpp.generateRoshambo();

			if (oppPick == Roshambo.PAPER) {
				System.out.println("Your opponent picked Paper. You lost, random wins!");

			} else if (oppPick == Roshambo.ROCK) {

				System.out.println("Your opponent picked Rock. You both tied!");

			} else if (oppPick == Roshambo.SCISSORS) {
				System.out.println("Your opponent picked Scissors. You win, random loses!"); // Checking last rock conditions

			}

		}

		if (gamePick.equalsIgnoreCase("P")) { // Start checking paper conditions

			Roshambo oppPick = randomOpp.generateRoshambo();

			if (oppPick == Roshambo.PAPER) {
				System.out.println("Your opponent picked Paper. You both tied!");

			} else if (oppPick == Roshambo.ROCK) {

				System.out.println("Your opponent picked Rock. You win, random loses!");

			} else if (oppPick == Roshambo.SCISSORS) {
				System.out.println("Your opponent picked Scissors. You lost, random wins!"); // Finish checking paper conditions

			}

		}

		if (gamePick.equalsIgnoreCase("S")) { // Start checking Scissor conditions

			Roshambo oppPick = randomOpp.generateRoshambo();

			if (oppPick == Roshambo.PAPER) {
				System.out.println("Your opponent picked Paper. You win, random loses!");

			} else if (oppPick == Roshambo.ROCK) {

				System.out.println("Your opponent picked Rock. You lost, random wins!");

			} else if (oppPick == Roshambo.SCISSORS) {
				System.out.println("Your opponent picked Scissors. You both tied!"); // Checking last Scissor conditions

			}

		}

	}

}
