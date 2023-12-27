import java.util.Scanner;

public class Row_Sum {
    public static int ROW_SUM(int[][]a ,int e) {
        if(e>a.length){
            System.out.println("Value Out Of Range");
            return 0;

        }int i=0,sum=0;
        while ( i!=a[0].length) {
            sum+=a[e][i];
            i++;
            
        }
        return sum;
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
        
          System.out.println("Enter the Row Number  to find the Sum");
          int element = sc.nextInt();
       System.out.println(ROW_SUM(a,element-1));

        sc.close();
        
    }
}
 