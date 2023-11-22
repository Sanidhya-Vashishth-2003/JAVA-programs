import java.util.Scanner;

public class PassorFail_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks;
        System.out.println("Enter your marks out of 100");
        marks = sc.nextFloat();
        String s = (marks>=33)?"Congratulation you have passed the examination" :"You have failed the examination try harder next time";
        System.out.println(s);
        sc.close();
    }
}
