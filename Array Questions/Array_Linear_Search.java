import java.util.Scanner;

public class Array_Linear_Search {
    public static int L_Search(String[] arr, String key) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equals(key)) {
                return index;
            }
        }
        return -1;

    }

    public static int L_Search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int L_Search(double[] arr, double key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int L_Search(float[] arr, float key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter your array type\n1.Int\n2.Float\n3.Double\n4.String");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
       switch (choice) {
        case 1:{
            System.out.println("enter array size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.nextInt();
                
            }System.out.println("Enter value to be search in array");
            int key = sc.nextInt();
               if(L_Search(arr, key)>=0){
                System.out.println("Given Key index value in array is "+L_Search(arr, key));
            }else{
                System.out.println("Given Key doesn't belongs to given array");
            }
            break;
        }

        case 2:{
            System.out.println("enter array size");
            int size = sc.nextInt();
            float[] arr = new float[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.nextFloat();
                
            }System.out.println("Enter value to be search in array");
            float key = sc.nextFloat();
               if(L_Search(arr, key)>=0){
                System.out.println("Given Key index value in array is "+L_Search(arr, key));
            }else{
                System.out.println("Given Key doesn't belongs to given array");
            }
            break;
        }
       case 3: {
            System.out.println("enter array size");
            int size = sc.nextInt();
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.nextDouble();
                
            }System.out.println("Enter value to be search in array");
            double key = sc.nextDouble();
               if(L_Search(arr, key)>=0){
                System.out.println("Given Key index value in array is "+L_Search(arr, key));
            }else{
                System.out.println("Given Key doesn't belongs to given array");
            }
            break;
        }
      case 4: {
            System.out.println("enter array size");
            int size = sc.nextInt();
            String[] arr = new String[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.next();
                
            }System.out.println("Enter value to be search in array");
            String key = sc.next();
               if(L_Search(arr, key)>=0){
                System.out.println("Given Key index value in array is "+L_Search(arr, key));
            }else{
                System.out.println("Given Key doesn't belongs to given array");
            }
            break;
        }
        default:
        {System.out.println("Wrong input ");
            break;}
            
       }
       sc.close();
    }

}
