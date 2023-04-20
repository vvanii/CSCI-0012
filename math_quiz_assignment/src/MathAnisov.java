/*
Name: Vlad Anisov
Date: 04/19/2023
Description: This program will generate 5 random math questions and give the user a score based on how many they get correct.
Self-Grade: 100% as the program compiles and runs as intended and follows the guidelines of the assignment. Also I used all necessary methods and variables, and provided comments throughout the code to explain what each method does.
*/

// importing the util class to use the random and scanner objects.
import java.util.*;

public class MathAnisov {

    // i statically declared the random and scanner objects so that they can be used
    // in all methods.
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    // this is the main method which only calls the prep method that generates
    // everything.
    public static void main(String[] args) throws Exception {
        prep();
    }

    // this is the prep method, it calls the intro method, then it runs a while loop
    // that will repeat the test until the user decides to stop. It also calls the
    // populate method to generate the questions and answers, and the test method to
    // test the user.
    public static void prep() {
        String questions[] = new String[5];
        int answers[] = new int[5];
        int points[] = new int[5];

        intro();

        boolean repeat = true;

        while (repeat) {
            int num1 = rand.nextInt((20 - 11) + 1) + 11;
            int num2 = rand.nextInt((10 - 5) + 1) + 5;

            populate(questions, answers, points, num1, num2);

            int result = test(questions, answers, points);

            System.out.println("************************************************************");
            System.out.println("You received an overall score of " + result + " points.");
            System.out.println("Would you like to take another test? (y/n)");
            System.out.println("************************************************************");

            String input = scan.next();

            while (!input.equals("y") && !input.equals("n")) {
                System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
                input = scan.next();
            }

            repeat = input.equals("y");

        }

    }

    // this is the populate method, it takes in the arrays and the max and min
    // values and populates them with random values. It also calls the calculate
    // method to get the answer for each question.
    public static void populate(String[] quiz, int[] answer, int[] points, int max, int min) {
        char operation[] = { '+', '-', '*', '/' };

        for (int i = 0; i < quiz.length; i++) {
            int num1 = rand.nextInt((max - min) + 1) + min;
            int num2 = rand.nextInt((max - min) + 1) + min;
            int index = rand.nextInt((3 - 0) + 1) + 0;
            char op = operation[index];

            quiz[i] = num1 + " " + op + " " + num2 + " = ";

            answer[i] = calculate(num1, op, num2);

            points[i] = rand.nextInt((10 - 1) + 1) + 1;
        }
    }

    // this is the calculate method, it takes in the two numbers and the operation
    // in order to proceed with the calculation.
    public static int calculate(int num1, char op, int num2) {
        switch (op) {
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            default:
                return -1;
        }
    }

    // this is the test method, it takes in the arrays and the user's answers and
    // compares them to the correct answers. It also prints out the score for each
    // question and the overall score.
    public static int test(String[] questions, int[] answers, int[] values) {
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            System.out.print(questions[i]);
            int answer = scan.nextInt();

            if (answer == answers[i]) {
                score += values[i];
                System.out.print("Correct! You received " + values[i] + " points\n");
            } else {
                System.out.print("Incorrect! You received 0 points\n");
            }
        }
        return score;
    }

    // this is the intro method, it prints out the instructions for the user at the
    // beginning of the test.
    public static void intro() {
        System.out.println("******************************************************");
        System.out.println("Welcome to the Math Quiz!");
        System.out.println("You will be given 5 questions to answer.");
        System.out.println("Each question is worth a random amount of points.");
        System.out.println("You will be given your score at the end of the quiz.");
        System.out.println("Good luck!");
        System.out.println("******************************************************");
    }
}
