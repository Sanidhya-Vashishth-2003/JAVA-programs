
import java.util.*;

// Main Class

public class _2_D_Array_Swap {

    // Method 1

    // To swap First and Last Row

    public static void swap_First_last(int arr[][])

    {

        int rws = arr.length;

        // Interchanging of elements between the

        // first and last rows

        for (int j = 0; j < arr[0].length; j++) {

            // Using temporary variable so in order

            // not to lose the values of the matrix

            // Simply, swapping the values stored

            int temp = arr[0][j];

            arr[0][j] = arr[rws - 1][j];

            arr[rws - 1][j] = temp;

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of 2-d array");
        System.out.println("Enter row size");
        int r_size = sc.nextInt();
        System.out.println("Enter column size");
        int c_size = sc.nextInt();

        int arr[][] = new int[r_size][c_size];
        for (int i = 0; i < r_size; i++) {
            for (int j = 0; j < c_size; j++) {
                System.out.println("Enter Value of [" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();

            }

        }

        // Display message only

        System.out.println("Your Given Matrix is: ");

        // Printing the Input matrix

        for (int j = 0; j < arr.length; j++) {

            for (int k = 0; k < arr[0].length; k++)

                // Print the elements of the input matrix

                System.out.print(arr[j][k] + " ");

            // New line as row ended

            System.out.println();

        }

        System.out.println("Final Transposed matrix is : ");

        // Calling the (method1) to swap rows in a matrix

        swap_First_last(arr);

        // Printing the Swapped matrix

        for (int j = 0; j < arr.length; j++) {

            for (int k = 0; k < arr[0].length; k++)

                // Print the elements of the swapped matrix

                System.out.print(arr[j][k] + " ");

            // New line as row ended

            System.out.println();

        }

    }
}