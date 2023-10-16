import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPrime(number)) {
            System.out.println(number + " IS A PRIME NUMBER.");
        } else {
            System.out.println(number + " IS NOT A PRIME NUMBER.");
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}