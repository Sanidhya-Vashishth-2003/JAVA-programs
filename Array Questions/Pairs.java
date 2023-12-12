package Arrays;

public class Pairs {

    public static void printPair(int number[]){
        int tp=0;
        int n = number.length;
        for (int i=0;i<n-1;i++){
            //int current = number[i];
            for(int j=i+1;j<n;j++){
                System.out.println("(" +number[i]+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tp);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        printPair(number);
    }
    
}