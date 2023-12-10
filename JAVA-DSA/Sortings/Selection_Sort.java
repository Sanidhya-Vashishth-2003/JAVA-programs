
    import java.util.*;


public class Selection_Sort {
    public static void SelectionSort(int[] a) {
        for (int i=0;i<a.length-1;i++)
        {
           int Smallest=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[Smallest])
                {
                    Smallest=j;
                }
            
            }
            int temp = a[Smallest];
           a[Smallest] = a[i];
           a[i] = temp;


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
        Print_Arr(a);

       SelectionSort(a);
        System.out.println("Final Sorted Array");
        Print_Arr(a);
        sc.close();
    }

}
// Total Time Complexity  0(n^2)