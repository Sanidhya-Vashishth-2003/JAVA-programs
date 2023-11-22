import java.util.*;
public class Selection_sort {
    public static void  main(String[] args) {
        int size,i,j,Smallest;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Total no of elements you want to append in Array");
        size=sc.nextInt();
        int[] Value =new int[size];
        for ( i=0;i<size;i++)
        {
            System.out.print("Enter Element no : "+(i+1)+" =>>");
            Value[i] = sc.nextInt();
            System.out.println();
        }
        // Selection_sort process



       
        for (i=0;i<size;i++)
        {
            Smallest=i;
            for(j=i+1;j<size;j++)
            {
                if(Value[j]<Value[Smallest])
                {
                    Smallest=j;
                }
            
            }
            int temp = Value[Smallest];
           Value[Smallest] = Value[i];
           Value[i] = temp;


        }
        System.out.println("After Insertion Sort");
        for ( i=0;i<size;i++)
        {
            System.out.print("\t"+Value[i]);
           
        }
    }

    
}
