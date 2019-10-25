import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum =0;
        for (int i = 1 ;i<=n ; i++){
            double b ;
            double a=1;
            b = a/((2*i-1)*(2*i));
            sum = sum+b;
        }
        System.out.println(sum);
    }
}