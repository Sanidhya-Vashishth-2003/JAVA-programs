import java.util.Scanner;

public class Matrix_Addition{  
public static void main(String args[]){  
//creating two matrices    
Scanner sc = new Scanner(System.in);
System.out.println("Enter Row size of array");
int row = sc.nextInt();
System.out.println("Enter Column Size of array");
int column = sc.nextInt();
int a[][]= new int[row][column];
int b[][]= new int[row][column];
for (int i = 0; i < row; i++) {
    for (int j = 0; j < column; j++) {
        System.out.println("Enter Value of Array 1["+i+"]["+j+"]");
        a[i][j]=sc.nextInt();
    }
     for (int j = 0; j < column; j++) {
        System.out.println("Enter Value of Array 2["+i+"]["+j+"]");
        b[i][j]=sc.nextInt();
    }
    
}
   
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<row;i++){    
for(int j=0;j<column;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}