import java.util.Scanner;

public class RPSGameApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Player user = new Human();

		Roshambo userValue;

		String userName;
		String userChoice;
		String playAgain;

		do {

			userName = Validator.getString(scan, "Enter your name: ");
			user.setName(userName);

			userChoice = Validator.getString(scan, "Would you like to play against The Dummy or The Random? (D/R)");

			if (userChoice.equalsIgnoreCase("D")) {

				VersusMethod.dummyVersus();

			}

			if (userChoice.equalsIgnoreCase("R")) {

				VersusMethod.randomPickVersus();

			}

			System.out.println("Play again? (Y/N)");
			playAgain = scan.nextLine();

		} while (playAgain.equalsIgnoreCase("Y"));
	}
}
