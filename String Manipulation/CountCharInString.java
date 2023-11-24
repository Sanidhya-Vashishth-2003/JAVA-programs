import java.util.*;

public class CountCharInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A STRING : ");
        String str = scanner.nextLine();
        int[] counts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            counts[ch]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }
    }
}