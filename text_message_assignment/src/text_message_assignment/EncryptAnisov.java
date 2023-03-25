package text_message_assignment;


//Name: Vlad Anisov
//Date: 03/23/23
//Desc: This is a simple app which takes a message and either encrypts it or decrypts it. This app uses the Caesar Cipher method for encryption, which takes a key and adds the key to each letter according to the alphabet.
//Self-Grade: 100%, as my code compiles and runs, and i made sure to add comments throughout the code explaining what it does. I also met all the requirements of the assignment.

// import the scanner class in order to be able to take user input
import java.util.Scanner;

public class EncryptAnisov {

	public static void main(String[] args) {
		// calling the app method
		app();
	}
	
	// this is the primary app method which stores all the logic of the code in the proper order, and runs it
	public static void app() {
		try (
		//initialize first scanner class for basic info like which option in menu as well as key.
		Scanner sc = new Scanner(System.in);
				
		// second scanner class for strings of input (this is done so that the user can input spaces without .nextLine() bugging out.
		Scanner userInput = new Scanner(System.in)) {
			// title
			System.out.println("Welcome to EncreDecter 300!\nPlease list one of the following from the menu:");
			System.out.println("-----------------------------------------------------------");
			
			//loops through the app 20 times
			for (int i = 1; i < 20; i++) {
				
				//calls the menu method to display the apps menu
				menu();
				
				//user selects which option they would like to do, either enc or dec
				System.out.print("Please enter your choice ---> ");
				String choice = sc.next();
				
				//checks if the users input is valid, and if not what they should return.
				if(!(choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("D"))) {
					System.out.println("Invalid Choice - Must be \"E\" or \"D\" or a lowercase \"e\" or \"d\"\n");
					continue;
				}
				
				//initialize empty message strings which the user will use to input information into.
				String encMessage = "";
				String decMessage = "";
				
				//if the letter is an e, ask the user for what message they would like to encrypt
				if ((choice.equalsIgnoreCase("E"))) {
					System.out.print("Please enter the message you would like to ENCRYPT ---> ");
					encMessage+=userInput.nextLine();
				} 
				
				//if the letter is a d, ask the user for what message they would like to decrypt
				else if ((choice.equalsIgnoreCase("D"))) {
					System.out.print("Please enter the message you would like to DECRYPT ---> ");
					decMessage+=userInput.nextLine();
				}
				
				//ask the user for a key
				System.out.print("Please enter a KEY ---> ");
				int key = sc.nextInt();
				
				//checks if the key is a valid key, otherwise it will return an error message
				if(key < 0 ) {
					System.out.println("Invalid Choice - The Value Must be a Positive Number\n");
					continue;
				}
				
				// if the message was encrypted, return the new encrypted message
				if ((choice.equalsIgnoreCase("E"))) {
					String enc = encryption(encMessage, key);
					System.out.println("\nYour ENCRYPTED message is ---> " + enc + "\n");
				} 
				// if the message was decrypted, return the decrypted message
				else if ((choice.equalsIgnoreCase("D"))) {
					String dec = decryption(decMessage, key);
					System.out.println("\nYour DECREPTYED message is ---> " + dec + "\n");
				}
				
			}
		}
	}
	
	//this is a very simple menu which explains how to use the app.
	public static void menu() {
		System.out.println("Enter \"e\" or \"E\" to ENCRYPT whatever message you input.");
		System.out.println("Enter \"d\" or \"D\" to DECRYPT a message");
		System.out.println("-----------------------------------------------------------");
	}
	
	//this is the encryption method which takes two parameters, a message, and a key. Each letter in the message is moved up in the alphabet according to the key.
	public static String encryption(String message, int key) { 
		//upper case the users message for the encryption process
		message = message.toUpperCase();
		
		//initialize an empty string to store the encrypted message;
		String encryptedMsg = "";
		
		//loop over every character of the word inputed by the user
		for(int i = 0; i < message.length(); i++ ) {
			char letter = message.charAt(i);
			
			//if the letter is a space, replace it with '#'
			if (letter == 32) {
				letter = 35;
			} else {
					//if the letter is between A - Z then...
					if (letter >= 65 && letter <= 90 ) {
						letter = (char) (letter + key);
						//if the letter is greater than Z, then wrap around back to the letter A
						if (letter > 90 ) {
							letter = (char) (letter - 26);
						}
					} else {
						letter = (char) (letter + 26);
					}
			}
			
			// store each letter into the encrypted message string
			encryptedMsg = encryptedMsg + letter;
		}
					
						
		return encryptedMsg;
	}
	
	//this is the decryption method, which very simply does the opposite of the encryption method
	public static String decryption(String message, int key) {
		
		//initialize an empty string to store the decrypted message;
		String decryptedMsg = "";
		
		//loop over every character of the word inputed by the user
		for(int i = 0; i < message.length(); i++ ) {
			char letter = message.charAt(i);
			
			//if the letter is a '#', replace it with a space
			if (letter == 35) {
				letter = 32;
			} else {
				//if the letter is between A - Z then...
				if (letter >= 65 && letter <= 90) {
					//subtract the key from the letter (to receive original letter)
					letter = (char) (letter - key);
				}
				//if letter is less than A, subtract the difference to wrap around
				if (letter < 65) {
					int diff = 65 - letter;
					letter = (char)(90 - diff + 1);
				} else if (letter > 90){
					int diff = 90 - letter;
					letter = (char)(65 + diff + 1);
				}
			}
			//add each letter to the decrypted message
			decryptedMsg = decryptedMsg + letter;
		}
		return decryptedMsg;
	}

}
