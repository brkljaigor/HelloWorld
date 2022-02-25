import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws FileNotFoundException {
		String theWord;
		System.out.println("1 or 2 player game? ");
		Scanner keyboard = new Scanner(System.in);
		String numOfPlayers = keyboard.nextLine();

		if (numOfPlayers.equals("1")) {
			Scanner input = new Scanner(new File("Hangman.txt"));

			List<String> words = new ArrayList<>();

			while (input.hasNext()) {
				words.add(input.nextLine());
			}

			Random rand = new Random();

			theWord = words.get(rand.nextInt(words.size()));

			
		} else {
			System.out.println("Player 1 type word for player 2!");
			theWord = keyboard.nextLine();
		}

		List<Character> playerGuesses = new ArrayList<>();

		int wrongCount = 0;
		while (true) {

			printHangedMan(wrongCount);

			if (wrongCount >= 6) {
				System.out.println("You lost! ");
				System.out.println(theWord);
				break;
			}

			printWordState(theWord, playerGuesses);
			if (!getPlayerGuess(keyboard, theWord, playerGuesses)) {
				wrongCount++;
			}

			if (printWordState(theWord, playerGuesses)) {
				System.out.println("You win!");
				break;
			}

			System.out.println("Please enter your guess for the whole word: ");
			if (keyboard.nextLine().equals(theWord)) {
				System.out.println("You win!");
				break;
			} else {
				System.out.println("Nope! ");
			}
		}
	}

	private static void printHangedMan(int wrongCount) {
		System.out.println(" ------- ");
		System.out.println(" |     | ");

		if (wrongCount >= 1) {
			System.out.println(" O ");
		}

		if (wrongCount >= 2) {
			System.out.print("\\ ");
			if (wrongCount >= 3) {
				System.out.println("/");
			} else {
				System.out.println("");
			}
		}

		if (wrongCount >= 4) {
			System.out.println(" | ");
		}

		if (wrongCount >= 5) {
			System.out.print("/");
			if (wrongCount >= 6) {
				System.out.println(" \\");
			} else {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("");
	}

	private static boolean getPlayerGuess(Scanner keyboard, String theWord, List<Character> playerGuesses) {
		System.out.println("Enter a letter: ");
		String letterGuess = keyboard.nextLine();

		// Protection, no matter what player enters game will take only 1st charachter
		playerGuesses.add(letterGuess.charAt(0));

		return theWord.contains(letterGuess);
	}

	private static boolean printWordState(String theWord, List<Character> playerGuesses) {
		int correctCount = 0;
		for (int i = 0; i < theWord.length(); i++) {
			if (playerGuesses.contains(theWord.charAt(i))) {
				System.out.print(theWord.charAt(i));
				correctCount++;
			} else {
				System.out.print("-");
			}
		}
		System.out.println();

		return (theWord.length() == correctCount);
	}

}
