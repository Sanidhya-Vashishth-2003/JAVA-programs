import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array Elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input: Rotation Direction
        System.out.print("Enter rotation direction (L for Left, R for Right): ");
        char direction = scanner.next().charAt(0);

        // Input: Number of Rotations
        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();

        // Perform Array Rotation
        rotateArray(array, direction, rotations);

        // Display Rotated Array
        System.out.println("Rotated Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    private static void rotateArray(int[] arr, char direction, int rotations) {
        int n = arr.length;
        rotations %= n; // Ensure rotations do not exceed array size

        if (direction == 'L' || direction == 'l') {
            reverseArray(arr, 0, rotations - 1);
            reverseArray(arr, rotations, n - 1);
            reverseArray(arr, 0, n - 1);
        } else if (direction == 'R' || direction == 'r') {
            reverseArray(arr, n - rotations, n - 1);
            reverseArray(arr, 0, n - rotations - 1);
            reverseArray(arr, 0, n - 1);
        }
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}