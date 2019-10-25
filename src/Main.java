import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        int b ;
        for (int i=1; i<=n; i++){
             b = (int) Math.pow(2,i);
            sum = sum +b ;
        }
        System.out.println(sum);
    }
}

