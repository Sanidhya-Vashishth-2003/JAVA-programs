import java.util.Scanner;

public class Sub_Array_of_Array {
    public static void Sub_Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i; j < arr.length; j++) {
                System.out.print(" [ ");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(" "+arr[j2]+" ");
                    
                }System.out.print(" ] ");
            }System.out.println("\n");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element no. :"+(i+1));
            arr[i]=sc.nextInt();
            
        }System.out.println("\nAll the Sub Array of given Array \n");
        Sub_Array(arr);
        sc.close();
    }
}
