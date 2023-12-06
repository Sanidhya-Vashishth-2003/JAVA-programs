import java.util.Scanner;
 public class String_Reverse {

    public static void main (String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your String to reverse it");
        String s = sc.nextLine();
 
       

      System.out.print("Original word: ");

     System.out.println(s);

      
     StringBuilder sb = new StringBuilder(s);
     sb.reverse();
     s = sb.toString();
      System.out.println("Reversed word: "+ s);
    sc.close();
      

    }
}