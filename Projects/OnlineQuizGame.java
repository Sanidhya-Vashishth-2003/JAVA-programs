import java.util.Scanner;

public class OnlineQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Online Quiz Game!");

        // Question 1
        System.out.println("\nQuestion 1: What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) London");
        System.out.println("c) Paris");
        String answer1 = scanner.nextLine().toLowerCase();

        if (answer1.equals("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is Paris.");
        }

        // Question 2
        System.out.println("\nQuestion 2: Which planet is known as the Red Planet?");
        System.out.println("a) Mars");
        System.out.println("b) Venus");
        System.out.println("c) Jupiter");
        String answer2 = scanner.nextLine().toLowerCase();

        if (answer2.equals("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is Mars.");
        }

        // Question 3
        System.out.println("\nQuestion 3: What is the largest mammal on Earth?");
        System.out.println("a) Elephant");
        System.out.println("b) Blue Whale");
        System.out.println("c) Giraffe");
        String answer3 = scanner.nextLine().toLowerCase();

        if (answer3.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is Blue Whale.");
        }

        // Display final score
        System.out.println("\nQuiz completed! Your final score is: " + score + "/3");

        scanner.close();
    }
}
