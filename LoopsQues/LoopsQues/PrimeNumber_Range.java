
import java.util.Scanner;

public class PrimeNumber_Range {
    public static String Range_Prime(int range) {
        System.out.println("\n\n\n\n\n");
        boolean flag = false;
        for (int j = 2; j <= range; j++) {
            flag = false;
            for (int i = 2; i <= (j / 2); i++) {

                if (i != j) {
                    if (j % i == 0) {
                        flag = true;
                        break;

                    }
                }

            }
            if (flag == false) {
                System.out.println (j + " is a Prime Number");
            } else {
                System.out.println(j + " is a composite number");
            }

        }
        return ("Code completed with 0 errors");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to check all prime & composite no. b/w them");
        int range = sc.nextInt();
        System.out.println(Range_Prime(range));

        sc.close();
    }
}
