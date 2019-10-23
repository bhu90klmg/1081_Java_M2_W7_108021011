import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N =scn.nextInt();
        int sum = 0;
        for(int i= 1 ; i<=N; i++){
            if (i%3==0){
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}

