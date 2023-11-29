import java.util.Scanner;

public class Binary_Search_Array {
    public static int Binary_Search(int[] arr,int key) {
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Sorted Array");

        int size=sc.nextInt();
        int[] arr = new int [size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element no. "+i+1);
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter Element to be Searched in array :");
        int key = sc.nextInt();
        if(Binary_Search(arr, key)>=0){
System.out.println("Elemnt Address in Array ="+Binary_Search(arr, key));
        }else{
            System.out.println("Given Key Doesn't Exist in Array");
        }
        
        sc.close();
        
    }
}
