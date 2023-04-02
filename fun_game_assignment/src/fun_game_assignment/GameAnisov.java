package fun_game_assignment;
//used for importing scanner and random class
import java.util.*;

//Name: Vlad Anisov
//Date:03/30/23
//Desc: this is a "Guess the number" game, where the user defines two limits, a min and a max, and the computer will randomly pick a number. It is then up to the user to guess what the number is.
//Self-Grade: %100, as my code compiles and runs and works perfectly. It also matches the output of the assignment. I also provided comments all throughout

public class GameAnisov {

	//this is the main method which runs the two primary methods, interact() and action() in order for the program to work.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		interact(sc);
		action(sc);
	}
	
	// this method simply is in charge of the user input for the min and max values. It validates the given integer to make sure its a valid input and then returns it.
	public static int prompt (Scanner sc, String s) {
		
		int userInput = 0;
		
		System.out.println(s);
		
		userInput = sc.nextInt();
		sc.nextLine();
		
		while (userInput < 0) {
			System.out.println("The input you've provided is invalid. Postive integers only.");
			System.out.println(s);
			userInput = sc.nextInt();
			sc.nextLine();
		}
		return userInput;
	}

	//this method is an introduction to the application and how it works. 
	public static void interact(Scanner sc) {
		System.out.println("Hello, I am a computer playing a \"Guess The Number\" game with you. What would you like to call me?");
		String compName = sc.nextLine();
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Wow! I really like the name " + compName + "!\nWhat is your name?");
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
	
	//this method reports overall stats of the number of games played, and total number of guesses by the user
	public static void report (int numGames, int totalGuesses) {
		System.out.println("Overall Results");
		System.out.println("\tTotal Games: " + numGames);
		System.out.println("\tTotal Number of Guesses: " + totalGuesses);
		System.out.println("------------------------------------");
		System.out.println("Thank you for playing!");
	}
	
	//this method holds all the logic for the actual setting of min and max values, as well as the generation of the random numbers within the min and max values.
	public static int funGame (Scanner console, int min, int max) {
		
		//this is what generates a random number within the min and max values. 
		Random random = new Random();
		int compNum = random.nextInt(min, max);
		
		int userGuess = 0;
		int numOfGuesses = 0;
		
		System.out.println("I am thinking of a number between " + min + " and " + max + "...");
		
		//"press enter to continue" function
		System.out.println("Press Enter key to continue...");
		try
		{
		System.in.read();
		}
		catch(Exception e)
		{}

		// while the user guess is not equal to the computers number, it will run the program
		while(userGuess != compNum) {
			numOfGuesses++;
			System.out.println("Enter your guess: ");
			userGuess = console.nextInt();
			
			String result = match(userGuess, compNum);
			
			if (result == "Match") {
				System.out.println("******* Congratulations! *******");
				System.out.println("You guessed my number in: " + numOfGuesses + " guesses!");
			} else {
				System.out.println(result);
			}	
		}
		System.out.println();
		return numOfGuesses;
	}
	
	//this is the primary method which runs all of the other methods in order to completely compile and run this code successfully
	public static void action (Scanner console) {
		int numOfGames = 0;
		int totalGuesses = 0;
		int min = 0;
		int max = 0;
		String repeat = "yes";
		
		while (repeat.equalsIgnoreCase("yes")) {
			
			
			String s = "Enter a minimum value: ";
			String s1 = "Enter a maximum value: ";
		
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
		
			System.out.println("Play again? Type \"yes\", otherwise you can type \"no\"");	
			
			while (!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no")) {
	            System.out.println("Invalid input. Please type \"yes\" or \"no\".");
	            repeat = console.next();
	        }
		
			repeat = console.next();
		
		}
		
		report(numOfGames, totalGuesses);
	}


}
