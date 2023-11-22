import java.util.Scanner;

//Bubble Sort
import java.util.*;
public class Bubble_Sort {
    
    public static void main(String[] args) {
        int size,i,j,f;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Total no of elements you want to append in Value");
        size=sc.nextInt();
        int[] Value =new int[size];
        for ( i=0;i<size;i++)
        {
            System.out.println("Enter Element no :-"+(i+1));
            Value[i] = sc.nextInt();
        }
        // Sorting process
        for (i= 0 ; i < size - 1; i++)
  {
    for (j = 0 ; j < size - i - 1; j++)
    {
      if (Value[j] > Value[j+1]) /* For decreasing order use '<' instead of '>' */
      {
        f       = Value[j];
        Value[j]   = Value[j+1];
        Value[j+1] = f;
      }
    }
  }
        for ( i=0;i<size;i++)
        {
            System.out.print(Value[i]);
            
        }
    }


}