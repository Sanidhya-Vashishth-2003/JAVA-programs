import java.util.Scanner;

/**
 * 2_D_Array_Search
 */
public class _2_D_Array_Search {
public static boolean search(int e,int[][] a) {
    int cycle=0,i=0;
   while (cycle!=a[0].length) {
       if(a[cycle][i]==e){
        System.out.println("Element found at index ("+cycle+","+i+")");
        return true;
       }i++;
       if(i==a[0].length){
        i=0;
        cycle++;
       }
   }
   System.out.println("Element not found");
   return false;
   //Time complexity =0(n)
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the of matrix");
        int row = sc.nextInt();
        System.out.println("Enter the  column size of the of matrix");
        int column = sc.nextInt();
        int[][] a = new int[row][column];
        for (int i = 0; i < row; i++) {
           for (int j = 0; j < column; j++) {
             System.out.println("Enter Element number "+i+j);
             a[i][j] = sc.nextInt();
           }
           }
          System.out.println("Enter the element to be searched in marix");
          int element = sc.nextInt();
       search(element, a);

        sc.close();
    }
}