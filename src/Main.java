import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        int n = scn.nextInt();
        int sum =0 ;
        for (int i =2;i<=n;i++){
            int j=i;
            while (j%2==0){
                j/=2;
            }
            while(j%3==0){
                j/=3;
            }
            while(j%5==0){
                j/=5;
            }
            if (j==1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
