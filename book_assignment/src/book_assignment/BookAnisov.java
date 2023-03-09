/*
 * NAME: Vlad Anisov
 * DATE: 03/09/2023
 * PROGRAM DESC: This program is a simple story teller. It works by asking the user for their input, and uses that input to create a story.
 * SELF-GRADE: 100%, as my code compiles and runs. It also meets all requirements according to the assignment, and I provided comments throughout the code explaining each step of the process. 
 */


package book_assignment;
//importing java.util for the scanner class
import java.util.*;

public class BookAnisov {
	
	//main method holds the initialized scanner as well as the for loop, which loops through the story according to the users input.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many stories do you want to make? : ");
		int storyCount = sc.nextInt();
		for (int i = 1; i <= storyCount; i++) {
			System.out.print("\nAnswer some questions, and I will write you a story \n");
			storyTime(sc);
		}
	}
	
	//this is the method which takes in the users input and stores it in a variable, which then is used to display the story using the input from the user.
	public static void storyTime (Scanner sc) {
		
		//take in user input depending on the question.
		System.out.println("\nChoose a name: ");
		String name1 = sc.next();
		
		System.out.println("Give me an adjective: ");
		String adj1 = sc.next();
		
		System.out.println("Choose an age: ");
		int age1 = sc.nextInt();
		
		System.out.println("Give me a verb: ");
		String verb1 = sc.next();
		
		System.out.println("Give me a verb ending in -ing: ");
		String verb2 = sc.next();
		
		System.out.println("Give me an adjective");
		String adj2 = sc.next();
		
		System.out.println("Introduce a new name: ");
		String name2 = sc.next();
		
		System.out.println("Provide a new age: ");
		int age2 = sc.nextInt();
		
		System.out.println("Give me an activity ending in -ing: ");
		String activity1 = sc.next();
		
		System.out.println("Give me another activity ending in -ing: ");
		String activity2 = sc.next();
		
		System.out.println("Give me your favorite number: ");
		int favNum = sc.nextInt();
		
		//print out the full story including the user's input
		System.out.print(name1 + " was a " + adj1 + " cat, who was " + age1 + " years old, and loved to " + verb1 + " in the sunshine. One day while " + verb2 + " in the park, " + name1 + " met a " + adj2 + " dog named " + name2 + ", who was " + age2 + " years old.\n At first, " + name1 + " was scared of the " + adj2 + " dog, but they soon became bestfriends. They would play together in the park, " + activity1 + " and " + activity2 + " until the sun went down.\n And even though " + name1 + " was a cat and " + name2 + " was a dog, they knew that their friendship would last forever.\n Oh, and your favorite number is: " + favNum + "\n");
	
	}
}
