import java.util.Scanner;

public class Array_Odd_Even_sum {
    public static int[] Sum(int[] range) {
        int[] array = new int[2];
        for (int i = 0; i < range.length; i++) {
            if(range[i]%2==0){
                array[0]+=range[i];
            }else{
                array[1]+=range[i];
            }
            
        }
        return array;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of elements");
    int range =  sc.nextInt();
    int array[] = new int[range];
    for (int i = 0; i < array.length; i++) {
      System.out.println("Enter Element no. "+(i+1));
      array[i]=sc.nextInt();
    }
   System.out.println("Sum of Even number's of given array = "+Sum(array)[0]+"\nSum of Odd  number's of given array = "+Sum(array)[1]);
  
    sc.close();

    

    
  }  
}
