import java.util.Scanner;

public class Find_Duplicate_Characters {    
     public static void main(String[] args) {  
        System.out.println("Enter Your String");
        Scanner sc = new Scanner(System.in)  ;
        String string1 =  sc.nextLine(); 
        int count;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string are: ");    
         
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
               
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    

                sc.close();
        }    
    }    
}