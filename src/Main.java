import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char b = scn.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n; a++) {
                System.out.print(b);
            }
            System.out.println(" ");
        }
    }
}

