import java.util.Random;
import java.util.Scanner;

public class RandomNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of random names you want to generate: ");
        int limit = scanner.nextInt();
        
        for (int i = 0; i < limit; i++) {
            String randomName = generateRandomName();
            System.out.println(randomName);
        }
        
        scanner.close();
    }

    private static String generateRandomName() {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack"};
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }
}
