package fun_game_assignment;
import java.util.*;

//Name: Vlad Anisov
//Date:03/30/23
//Desc: TODO
//Self-Grade: TODO

public class GameAnisov {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		interact(sc);
		action(sc);
	}
	
	public static int prompt (Scanner sc, String s) {
		
		int userInput = 0;
		
		System.out.println(s);
		
		userInput = sc.nextInt();
		
		while (userInput < 0) {
			System.out.println("The input you've provided is invalid.");
			System.out.println(s);
			userInput = sc.nextInt();
		}
		return userInput;
	}
	
	public static void interact(Scanner sc) {
		System.out.println("Hello, I am a computer playing a \"Guess The Number\" game with you. What would you like to call me?\n");
		String compName = sc.nextLine();
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Wow! I really like the name " + compName + "!\nWhat is your name?\n");
		String playerName = sc.nextLine();
		
		System.out.println("Hey " + playerName + ", I'm excited to play the guessing game with you!\nI will think of a number between a low and a high value that you will enter, which I will allow you to guess until you get it.");
		System.out.println("For each guess, I will give you a hint whether the right answer is higher or lower than your guess.");
		System.out.println("--------------------------------------------------------------------");
	}
	
	public static String match (int guess, int randNum) {
		if (guess > randNum)
			return "Lower";
		else if (guess < randNum)
			return "Higher";
		else
			return "Match";
	}
	
	public static void report (int numGames, int totalGuesses) {
		System.out.println("Overall Results");
		System.out.println("\tTotal Games: " + numGames);
		System.out.println("\tTotal Number of Guesses: " + totalGuesses);
	}
	
	public static int funGame (Scanner console, int min, int max) {
		Random random = new Random();
		
		int compNum = random.nextInt(min, max);
		
		int userGuess = 0;
		int numOfGuesses = 0;
		
		console.next();
		
		System.out.println("I am thinking of a number between " + min + " and " + max + "...");
		console.nextLine();
		
		
		
		while(userGuess != compNum) {
			numOfGuesses++;
			System.out.println("Enter your guess: ");
			userGuess = console.nextInt();
			
			String result = match(userGuess, compNum);
			
			if (result == "Match") {
				System.out.println("******* Congratulations! *******");
				System.out.println("You guessed my number in: " + numOfGuesses);
			} else {
				System.out.println(result);
			}	
		}
		System.out.println();
		return numOfGuesses;
	}
	
	public static void action (Scanner console) {
		int numOfGames = 0;
		int totalGuesses = 0;
		int min = 0;
		int max = 0;
		String repeat = "yes";
		
		while (repeat.equalsIgnoreCase("yes")) {
		String s = "Enter a low value: ";
		String s1 = "Enter a high value: ";
		
		//initializing min and max values according to user input
		min = prompt(console, s);
		max = prompt(console, s1);
		
		//validating min and max values to ensure proper dynamics of the program.
		while (max < min) {
			System.out.println("You entered an invalid value for max. Max must be greater than min. Lets start all over again\n");
			min = prompt(console, s);
			max = prompt(console, s1);
		}
		
		int guesses = funGame(console, min, max);
		
		totalGuesses = guesses + totalGuesses;
		
		numOfGames++;
		
		System.out.println("Play again? Type \"yes\", otherwise you can type \"no\"\n");
		
		repeat = console.nextLine();
		
		}
		report(numOfGames, totalGuesses);
		
	}

}