import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 3, 8, 5, 10};
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        System.out.println("Array after removing duplicates: " + uniqueNumbers);
    }
}
