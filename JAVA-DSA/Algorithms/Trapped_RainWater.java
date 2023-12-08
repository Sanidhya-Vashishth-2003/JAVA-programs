// This Code is Contributed by Sanidhya Vashishtha


/**
 * Trapped_RainWater
 */
//Importing Scanner Class
import java.util.Scanner;

public class Trapped_RainWater {
public static void Trapped_Rain_Water(int[] arr) {
 
    int[] L_max = new int[arr.length];
    {

    
    int[] R_max = new int[arr.length];
    L_max[0]=arr[0];
    R_max[arr.length-1]=arr[arr.length-1];
    

   //Inserting elements in left max and right max array
    
    for (int i = 1; i < arr.length; i++) {
         L_max[i]=Math.max(arr[i], L_max[i-1]);
          R_max[arr.length-2-i+1]=Math.max(arr[arr.length-2-i+1],R_max[arr.length-2-i+1+1]);
    }
        
   

    
   int trapped_Water=0;
//    calculating total trapped water and trapped water in each individual bars
    for (int i = 0; i < R_max.length; i++) {
        //WaterLevel(min(Leftmax,Rightmax))-Height[i]
        trapped_Water+=Math.min(L_max[i], R_max[i])   - arr[i];
        L_max[i]=Math.min(L_max[i], R_max[i])   - arr[i];
    }
    System.out.println("Total Trapped Water =:"+trapped_Water);
}
    System.out.print("Trapped RainWater in each Bars = ");
    for (int i = 0; i < L_max.length; i++) {
        System.out.print(L_max[i]+" , ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total height in the array");
        int size = sc.nextInt();
        System.out.println("Enter The Height Array Elements");
        //Defining Height Array
        int[] arr = new int[size];
        //Taking Array Elements from the user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element no."+(i+1)+" of the array");
            arr[i]=sc.nextInt();
        }
       Trapped_Rain_Water(arr);
        

//Closing Leaked sc
sc.close();
    }
}
//Total Time Complexity = 0(n)
