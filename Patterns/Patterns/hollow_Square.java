import java.util.*;

public class hollow_Square{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter range");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||i==0||i==n-1||j==n-1)
                {
                   
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }sc.close();
    }
}