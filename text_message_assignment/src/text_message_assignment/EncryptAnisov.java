package text_message_assignment;
import java.util.Scanner;

public class EncryptAnisov {

	public static void main(String[] args) {
		
		app();
		
	}
	public static void app() {
		try (
		//initialize scanner class
		Scanner sc = new Scanner(System.in)) {
			for (int i = 1; i < 20; i++) {
				menu();
				
				System.out.print("Please enter your choice ---> ");
				String choice = sc.next();
				
				if(!(choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("D"))) {
					System.out.println("Invalid Choice - Must be \"E\" or \"D\"\n");
					continue;
				}
				
				String encMessage = "";
				String decMessage = "";
				
				if ((choice.equalsIgnoreCase("E"))) {
					System.out.print("Please enter the message you would like to ENCRYPT ---> ");
					encMessage = sc.next();
				} else if ((choice.equalsIgnoreCase("D"))) {
					System.out.print("Please enter the message you would like to DECRYPT ---> ");
					decMessage = sc.next();
				}
				
				
				System.out.print("Please enter a KEY ---> ");
				int key = sc.nextInt();
				
				if(key < 0 ) {
					System.out.println("Invalid Choice - Must be a Positive Number\n");
					continue;
				}
				
				if ((choice.equalsIgnoreCase("E"))) {
					String enc = encryption(encMessage, key);
					System.out.println(enc);
				} else if ((choice.equalsIgnoreCase("D"))) {
					String dec = decryption(decMessage, key);
					System.out.println(dec);
				}
				
			}
		}
	}
	public static void menu() {
		System.out.println("Enter \"e\" or \"E\" to ENCRYPT whatever message you input.");
		System.out.println("Enter \"d\" or \"D\" to DECRYPT a message");
		System.out.println("-----------------------------------------------------------");
	}
	
	public static String encryption(String message, int key) { 
		//upper case the users message for the encryption process
		message.toUpperCase();
		String encryptedMsg = "";
		for(int i = 0; i < message.length(); i++ ) {
			char letter = message.charAt(i);
			
			if (letter == ' ') {
				letter = '#';
			} else{
				if (letter >= 26 && letter <= 90 ) {
					letter = (char) (letter + key);
				} else if (letter > 90 ) {
					letter = (char) (letter - 26);
				} else {
					letter = (char) (letter + 26);
				}
			}
			
			encryptedMsg = encryptedMsg + letter;
			
		}
		return encryptedMsg;
	}
	
	public static String decryption(String message, int key) { 
		String decryptedMsg = "";
		
		for(int i = 0; i < message.length(); i++ ) {
			char letter = message.charAt(i);
			
			if (letter == '#') {
				letter = ' ';
			} else if (letter >= 64 && letter <= 90) {
				letter = (char) (letter - key);
			} else if (letter < 64) {
				int diff = 64 - letter;
				letter = (char)(90 + diff + 1);
			} else if (letter > 90){
				int diff = 90 - letter;
				letter = (char)(90 + diff + 1);
			}
			
			decryptedMsg = letter + decryptedMsg;
		}
		return decryptedMsg;
	}

}
