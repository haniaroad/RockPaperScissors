import java.util.Scanner;

public class Human extends Player {

	private Scanner scan;
	
	
	@Override
	public Roshambo generateRoshambo() {
		
		scan = new Scanner(System.in);
		String userInput = Validator.getString(scan, "Rock, Paper, or Scissors?: ");
		
		if(userInput.equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
	
		} else if(userInput.equalsIgnoreCase("P")) {
			return Roshambo.PAPER;
		
		}else if(userInput.equalsIgnoreCase("S")) {
			return Roshambo.SCISSORS;
		}

		
		return null;
	}

}
