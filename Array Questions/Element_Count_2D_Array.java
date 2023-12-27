import java.util.Scanner;

/**
 * Element_Count_2D_Array
 */
public class Element_Count_2D_Array {

    public static int count(int[][] a,int e) {
        
        int cycle=0,i=0,count=0;
        while (cycle!=a[0].length) {
            if(a[cycle][i]==e){
                count++;
            }i++;
            if(i==a[0].length){
             i=0;
             cycle++;
            }
        }
        System.out.println("Element "+e+" appears "+count+" Times in the Given array");
        return count;




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
        
          System.out.println("Enter the element to be count in the  marix");
          int element = sc.nextInt();
       count(a,element);

        sc.close();
    }
}