import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1 ; i<=n ; i++){
            for (int a = 1 ; a<=n ; a++){
                System.out.printf("%d\t",i*a);
            }
            System.out.println(" ");
        }
    }
}

