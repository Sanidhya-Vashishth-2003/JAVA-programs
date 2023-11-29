import java.util.Scanner;

public class Largest_Element_in_Array {
    public static int Largest(int[] arr) {
        int l=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }
    public static String Largest(String[] arr) {
        int l=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>l){
                l=i;
            }
            
        }
        return arr[l];
    }
    public static double Largest(double[] arr) {
        double l=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>l){
                l=arr[i];
            }
            
        }
        return l;
        
    }
    public static float Largest(float[] arr) {
        float l=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>l){
                l=arr[i];
            }
        }
        return l;
        
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
                
            }System.out.println("Largest element of the given array is :"+Largest(arr));
            break;
        }

        case 2:{
            System.out.println("enter array size");
            int size = sc.nextInt();
            float[] arr = new float[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.nextFloat();
                
            }System.out.println("Largest element of the given array is :"+Largest(arr));
            break;
        }
       case 3: {
            System.out.println("enter array size");
            int size = sc.nextInt();
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.nextDouble();
                
            }System.out.println("Largest element of the given array is :"+Largest(arr));
            break;
        }
      case 4: {
            System.out.println("enter array size");
            int size = sc.nextInt();
            String[] arr = new String[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no. "+i+1);
                arr[i]=sc.next();
                
            }System.out.println("Largest element of the given array is :"+Largest(arr));
            break;
        }
        default:
        {System.out.println("Wrong input ");
            break;}
            
       }
       sc.close();
    }
}
