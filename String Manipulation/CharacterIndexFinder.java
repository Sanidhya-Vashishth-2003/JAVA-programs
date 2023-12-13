import java.util.Scanner;

public class CharacterIndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input character to find
        System.out.print("Enter a character to find its index: ");
        char targetChar = scanner.next().charAt(0);

        // Find index of the character
        int index = findCharacterIndex(inputString, targetChar);

        // Display the result
        if (index != -1) {
            System.out.println("Index of '" + targetChar + "': " + index);
        } else {
            System.out.println("Character not found in the string.");
        }

        scanner.close();
    }

    // Method to find the index of a character in a string
    private static int findCharacterIndex(String str, char targetChar) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                return i;
            }
        }
        // Return -1 if the character is not found
        return -1;
    }
}
