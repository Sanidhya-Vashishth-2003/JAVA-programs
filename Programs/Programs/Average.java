import java.util.*;
public class Average{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.println("Enter total numbers you want to find averge of");
    size = sc.nextInt();
    int[] numbers = new int[size];
    size=0;
    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Enter value no."+(i+1));
        numbers[i]=sc.nextInt();
        size+=numbers[i];
    }
    System.out.println("Average = : "+"("+size+"/"+numbers.length+")"+"= "+size/numbers.length);
   sc.close();
}
}