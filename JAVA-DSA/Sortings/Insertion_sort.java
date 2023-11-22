import java.util.Scanner;
class insertion_sort {
public static void  main(String[] args) {
    int size,i,j;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Total no of elements you want to append in Value");
    size=sc.nextInt();
    int[] Value =new int[size];
    
  
    for ( i=0;i<size;i++)
    {
        System.out.print("Enter Element no : "+(i+1)+" =>>");
        Value[i] = sc.nextInt();
        System.out.println();
    }
    // Insertion_sort process
    for( i=1; i<size; i++) {
                   int current = Value[i];
                   j = i - 1;
                       while(j >= 0 && Value[j] < current) {
                           //Keep swapping
                           Value[j+1] = Value[j];
                           j--;
                       }
                   Value[j+1] = current;
               }
              
           


   
   
    System.out.println("After Insertion Sort");
    for ( i=0;i<size;i++)
    {
        System.out.print("\t"+Value[i]);
       
    }
}
 }