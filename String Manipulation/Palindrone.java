/**
 * Palindrone
 */
public class Palindrone {
public static boolean Palindrone_String(String a) {
 

    for (int i = 0; i < a.length(); i++) {
        if(a.charAt(i)!=a.charAt(a.length()-i-1)){
            return false;
        }
        
    }
    return true;
}
    public static void main(String[] args) {
        
        System.out.println(Palindrone_String("racecar"));
        
    }
}