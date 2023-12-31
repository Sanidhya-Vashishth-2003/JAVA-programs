import java.util.Scanner;

/**
 * LowerCaseVowel_Appeared
 */
public class LowerCaseVowel_Appeared {
public static String HowManyLowerUpperCaseVowel(String a){
    int times_lower=0,times_upper=0;
for (int i = 0; i < a.length(); i++) {
    char s = a.charAt(i);
    if(Character.isLowerCase(s)){
switch (s) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        {
           times_lower++;
           break;
        }
        default:
        {
            break;
        }

   
}




    }
 
    else if(Character.isUpperCase(s)){
switch (s) {
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
        {
           times_upper++;
           break;
        }
        default:
        {
            break;
        }

   
}




    }


}

    return "Lower Case Vowel ="+times_lower+"\nUpper Case vowel ="+times_upper;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println(HowManyLowerUpperCaseVowel(s));
        sc.close();
        
    }
}