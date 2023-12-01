import java.util.*;

public class Tapping_Rainwater { 

	
	public static int max_Water(int[] arr, int n) 
	{ 

		
		int res = 0; 

	
		for (int i = 1; i < n - 1; i++) { 

			
			int left = arr[i]; 
			for (int j = 0; j < i; j++) { 
				left = Math.max(left, arr[j]); 
			} 

		
			int right = arr[i]; 
			for (int j = i + 1; j < n; j++) { 
				right = Math.max(right, arr[j]); 
			} 

			res += Math.min(left, right) - arr[i]; 
		} 
		return res; 
	} 

	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
		int[] arr = new int[size] ;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element no "+(i+1));
            arr[i]= sc.nextInt();
        }
		

		System.out.print("Total Trapped Water =: "+max_Water(arr, size)); 
        sc.close();
	} 
} 


