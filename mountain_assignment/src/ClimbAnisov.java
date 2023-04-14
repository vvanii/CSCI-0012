// Name: Vlad Anisov
// Date: 04/13/2023
// Desc: This program simulates a person climbing a mountain. You define the height, and the program will simulate the climb. You have a 50% chance of either climbing or slipping. If the person slips, they will slip back a random number of steps. If the person climbs, they will climb a random number of steps. The program will continue until the person reaches the top of the mountain.
// Self-Grade: 100% as my program compiles without any errors and runs as expected. I also provided all necessary methods, as well as comments throughout the code.

import java.util.*;

public class ClimbAnisov {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        execute(rand, sc);
    }

    public static void execute(Random rand, Scanner sc) {
        boolean repeat = true;
        description();
        while (repeat) {

            int height = input(sc);

            int slips = climb(height, rand);

            System.out.println("\nYou made it to the top of the mountain!");
            System.out.println("With the height of " + height + ", you slipped " + slips + " times.");

            System.out.print("\nWould you like to climb again? (y/n): ");
            String answer = sc.next();
            if (answer.equals("n")) {
                repeat = false;
            }
        }

        System.out.println("\nGood Bye");
    }

    public static int input(Scanner sc) {
        boolean valid = false;
        int height = 0;

        do {
            System.out.print("\nEnter the height of the mountain: ");

            if (sc.hasNextInt()) {
                height = sc.nextInt();

                if (height > 0) {
                    valid = true;
                } else {
                    System.out.println("Height must be positive.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                sc.next();
            }
        } while (!valid);

        System.out.println("\n");

        return height;
    };

    public static int climb(int height, Random rand) {
        int distance = 0;
        int totalSlips = 0;

        do {
            int chance = rand.nextInt(2);

            if (chance == 1) {

                int steps = rand.nextInt(11) + 20;
                if (height - distance < steps) {
                    steps = height - distance;
                }

                distance += steps;
                System.out.println("You climbed up " + steps + " steps.");
            } else {
                int slip = rand.nextInt(5) + 1;

                if (distance != 0) {

                    distance -= slip;
                    totalSlips++;

                    System.out.println("Oops! You slipped " + slip + " steps back.");
                }
            }
        } while (distance < height);

        return totalSlips;
    }

    public static void description() {
        System.out.println(
                "This program simulates a person climbing a mountain.\nYou define the height, and the program will simulate the climb.\nYou have a 50% chance of either climbing or slipping.\nIf the person slips, they will slip back a random number of steps.\nIf the person climbs, they will climb a random number of steps.\nThe program will continue until the person reaches the top of the mountain.");
        System.out.println("***************************************************************************");
    }

}
