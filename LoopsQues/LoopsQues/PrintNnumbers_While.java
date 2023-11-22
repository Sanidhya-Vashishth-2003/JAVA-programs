import java.util.Scanner;

public class PrintNnumbers_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter Range");
        int range = sc.nextInt();
        System.out.println();
        while(i<=range){
            System.out.print(i+",");
            i+=1;
        }
        sc.close();
    }
}
