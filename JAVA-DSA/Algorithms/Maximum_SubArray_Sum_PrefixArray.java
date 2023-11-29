
    


    
    import java.util.Scanner;

public class Maximum_SubArray_Sum_PrefixArray {
    public static void Sub_Array(int[] arr) {
        int sum=0;
        int max=0;
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i ==0 ? prefix[j]:prefix[j]-prefix[i-1];
                max=max<sum?sum:max;
            
            }System.out.println("\n");
             
        }System.out.println("Maximum Sub Array Sum ="+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element no. :"+(i+1));
            arr[i]=sc.nextInt();
            
        }
      
        System.out.println();
        Sub_Array(arr);
        sc.close();
    }
}


