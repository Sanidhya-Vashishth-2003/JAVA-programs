
import java.util.Scanner;

public class Sub_Array_String_Char {
    public static void Sub_Array(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i; j < arr.length; j++) {
                System.out.print(" [ ");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(" "+arr[j2]+" ");
                    
                }System.out.print(" ] ");
            }System.out.println("\n");

        }
    }
     public static void Sub_Array(char[] arr) {
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
          sc.nextLine();
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element no. :"+(i+1));
            arr[i]=sc.nextLine();
            
        }System.out.println("\nAll the Sub Array of given Array \n");
        Sub_Array(arr);
        sc.close();
    }
}


