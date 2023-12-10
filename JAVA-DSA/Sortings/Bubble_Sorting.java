import java.util.Scanner;

public class Bubble_Sorting {
    public static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int swap =0;
            if(i>0&&swap==0){
                System.out.println("Array already Sorted \nBreaking Code.............");
                break;
            }
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap++;
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
              
            }
        }
    }

    public static void Print_Arr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Values you want to insert?");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Elemnt number " + (i + 1));
            a[i] = sc.nextInt();
        }

        BubbleSort(a);
        System.out.println("Final Sorted Array");
        Print_Arr(a);
        sc.close();
    }

}
// Total Time Complexity  0(n^2)