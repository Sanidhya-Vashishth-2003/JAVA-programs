import java.util.Scanner;

public class BarChart {
    public static int max(int[] array){
        int j=0;
        for (int i = 0; i < array.length; i++) {  
            //Compare elements of array with max  
           if(array[i] > j)  
               j = array[i];  
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size or the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value no."+(i+1));
            array[i]=sc.nextInt();
        }
        size = max(array);
        System.out.println(size);

        System.out.println();
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]<size)
                {
                    System.out.print("   ");
                    array[j]+=1;
                }
                else if(array[j]==size){
                    System.out.print(" * ");
                }
            }System.out.println();
           
            
        }
        sc.close(); 
        
    }
}
