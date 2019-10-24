import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner scn = new Scanner( System.in );
        int x = scn.nextInt();
        for (int z = 1;z <= x;z++){//將所有數字拿去測試
            boolean ck235 = false;
            for(int i=2; i<=z; i++){
                if(z%i==0){//可以整除->i是z的因數
                    boolean check = true;
                    for(int j=2; check && j<i; j++){
                        if(i%j==0){//i可以被整除->i不是質因數
                            check = false;
                        }
                    }
                    if(check){

                        if (i==2 || i==3 || i==5){//判斷質因數是否為2或3或5
                            ck235 = true;
                        }else {
                            ck235 = false;

                        }
                    }
                }
            }

            if (ck235){
                ans = ans + z;
            }
        }
        System.out.println(ans);
    }
}