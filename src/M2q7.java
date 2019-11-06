import java.util.Scanner;

public class M2q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int p = Math.max(m,n);
        int q = Math.min(m,n);
        while (true){
            if (p%q==0){
                break;
            }
            int tmp = p%q;
            p=q;
            q= tmp;
        }
        System.out.println(q);
        System.out.println((n*m)/q);
    }
}
