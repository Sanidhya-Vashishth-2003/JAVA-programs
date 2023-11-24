import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pattern in even terms");
        int range = sc.nextInt();
        if(range%2!=0){
            range+=1;
        }
        for (int i = 0; i < range; i++) {
            
            for (int j = 0; j <i+1 && i<(range/2); j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < Math.pow(2,(range/2)-1-i) && (Math.pow(2,(range/2)-1-i))>1 && i<(range/2); j++) {
                System.out.print("  ");
                
            } for (int j = 0; j <i+1 && i<(range/2); j++) {
                System.out.print(" *");
            }
            for (int j =0; j < range -i  && i>=(range/2); j++) {
                System.out.print(" *");
            }
              for (int j = 0; j < Math.pow(2,i-(range/2)) && (Math.pow(2,i-(range/2)))>1 && i>=(range/2); j++) {
                System.out.print("  ");
              }
               for (int j =0; j < range -i  && i>=(range/2); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
