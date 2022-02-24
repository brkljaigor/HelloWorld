import javax.swing.*;

public class GuessingGame {

	public static void main(String[] args) {
		int computerNumber = (int) (Math.random()*100 + 1);
		int userAnswer = 0;
		System.out.println("Good guess would be " + computerNumber);
		int count = 1;
		
		while(userAnswer != computerNumber) {
			String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100",
					 "Guessing game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
			count++	;
		}
		

	}
	
	public static String determineGuess(int userAnswer, int computerNumber, int count) {
		if(userAnswer <= 0 || userAnswer > 100) {
			return "Your entered value is invalid";
		}
		else if(userAnswer == computerNumber) {
			return "Correct!\nTotal number of guesses: " + count;
		}
		else if(userAnswer > computerNumber) {
			return "You should guess lower.\nTry number: " + count;
		}
		else if(userAnswer < computerNumber) {
			return "You should guess higher.\nTry number: " + count;
		}
		else
		{
			return "Your guess is incorrect.\nTry number: " + count;
		}
	}

}
