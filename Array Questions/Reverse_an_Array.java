import java.util.Scanner;

public class Reverse_an_Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Elemnt no. :"+(i+1));
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <(arr.length-1-i); i++) {
            
               arr[i]= arr[i]+arr[arr.length-1-i];
               arr[arr.length-1-i]=arr[i]-arr[arr.length-1-i];
               arr[i]= arr[i]-arr[arr.length-1-i];
            
        }
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }

sc.close();
    }
}
