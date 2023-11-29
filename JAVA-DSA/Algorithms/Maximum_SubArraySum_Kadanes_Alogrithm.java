

    


    
    import java.util.Scanner;

public class Maximum_SubArraySum_Kadanes_Alogrithm {
    public static void Kadanes (int[] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        if(sum<0){
            sum=0;
        }
           max = Math.max(sum,max);
        }
        System.out.println("Maximum Sum in Sub Array is " +max);
       } 

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

      
        System.out.println();
       
        
        
        Kadanes(arr);
        sc.close();
    }
}


