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
		//TODO
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
		//TODO
	}
	
	public static int funGame (Scanner console, int min, int max) {
		Random random = new Random();
		
		int compNum = random.nextInt(min, max);
		
		int userGuess = 0;
		int numOfGuesses = 0;
		
		console.next();
		
		System.out.println("I am thinking of a number between " + min + " and " + max + "...");
		pressEnterToContinue();
		
		
		
		while(userGuess != compNum) {
			numOfGuesses++;
			System.out.println("Guess: ");
			userGuess = console.nextInt();
			
			String result = match(userGuess, compNum);
			
			if (result == "match") {
				System.out.println("******* Congratulations! *******");
				System.out.println("You guessed my number in: " + numOfGuesses);
			} else {
				System.out.println(result);
			}	
		}
		System.out.println();
		return numOfGuesses;
	}
	
	private static void pressEnterToContinue()
	 { 
		try (Scanner enter = new Scanner(System.in)) {
			System.out.println("Press the Enter key to start...");
	        try
	        {
	            System.in.read();
	            enter.nextLine();
	        }  
	        catch(Exception e)
	        {}
		}  
	 }
	
	public static void action (Scanner console) {
		int numOfGames = 0;
		int totalGuesses = 0;
		int min = 0;
		int max = 0;
		String repeat = "yes";
		
		while (repeat.equalsIgnoreCase("yes")) {
			
		}
	}

}
