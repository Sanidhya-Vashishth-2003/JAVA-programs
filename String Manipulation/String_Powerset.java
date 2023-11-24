import java.util.*;

public class String_Powerset{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        List<String> powerSet = generatePowerSet(input);
        
        System.out.println("Power Set:");
        for (String subset : powerSet) {
            System.out.print(subset+" ");
        }
        scanner.close();
    }

    // Function to generate power set
    private static List<String> generatePowerSet(String input) {
        List<String> result = new ArrayList<>();
        int n = input.length();
        int powSetSize = (int) Math.pow(2, n);

        // Run a loop for all possible subsets
        for (int counter = 0; counter < powSetSize; counter++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                // Check if jth bit is set in the counter
                if ((counter & (1 << j)) != 0) {
                    subset.append(input.charAt(j));
                }
            }
            result.add(subset.toString());
        }

        return result;
        
    }
}
