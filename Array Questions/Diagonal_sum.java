import java.util.Scanner;

public class Diagonal_sum {
    public static int[] D_Sum(int[][] a) {
        int[] x = {0,0};
        for (int i = 0; i < a.length; i++) {
            x[0]+=a[i][i];
            x[1]+=a[i][a.length-i-1];
        }
        
        return x;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int row=-1,column=9;
      while(row!=column){
          System.out.println("Enter the row size of the of matrix");
         row = sc.nextInt();
        System.out.println("Enter the  column size of the of matrix");
         column = sc.nextInt();
        if(row!=column){
            System.out.println("Row and Column must be equal to perform the following operation\nTry Again");
        }
      }
        int[][] a = new int[row][column];
        for (int i = 0; i < row; i++) {
           for (int j = 0; j < column; j++) {
             System.out.println("Enter Element number "+i+j);
             a[i][j] = sc.nextInt();
           }
           }
           System.out.println("Diagonal Sum of Matrix :- "+ D_Sum(a)[0]+" && "+D_Sum(a)[1]);
        
    }
    
}
