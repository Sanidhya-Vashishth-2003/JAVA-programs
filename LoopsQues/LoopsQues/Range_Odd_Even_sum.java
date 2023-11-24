import java.util.Scanner;

public class Range_Odd_Even_sum {
    public static int[] Sum(int range) {
        int[] array = new int[2];
        for (int i = 1; i <= range; i++) {
            if(i%2==0){
                array[0]+=i;
            }else{
                array[1]+=i;
            }
            
        }
        return array;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Range");
    int range = sc.nextInt();
    int a =  Sum(range)[0];
 int b = Sum(range)[1];
   System.out.println("Sum of Even number's b/w 1-"+range+" = "+a+"\nSum of Odd  number's b/w 1-"+range+" = "+b);
  
    sc.close();

    

    
  }  
}
