import java.util.Scanner;

public class Shortest_path {
    public static int Find_Shortest_Path(String a,int A,int B) {
        int x =0,y=0;
        
        for (int i = 0; i < a.length(); i++) {

            if(a.charAt(i)=='N'||a.charAt(i)=='n'){
                y++;
            }else if(a.charAt(i)=='S'||a.charAt(i)=='s'){
                y--;
            }  else if(a.charAt(i)=='E'||a.charAt(i)=='e'){
                x++;
            }  else if(a.charAt(i)=='W'||a.charAt(i)=='e'){
                x--;
            }
        }
       return (int) (Math.sqrt(Math.pow((double)(x-A),(double)2)+Math.pow((double)(y-B),(double)2)));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the directions in \nFor North type N or n\nFor South type S or s\nFor East type E or e\nFor East type W or w\n") ;
        System.out.println("Enter your String");
        String s = sc.nextLine();
        System.out.println("Enter your Coordinates X and Y\nEnter X");
        int x = sc.nextInt();
        System.out.println("Enter Y");
        int y = sc.nextInt();
      System.out.println( "You need to travel "+ Find_Shortest_Path(s,x,y)+ " Steps");
        sc.close();
               

    }
}
