import java.util.Scanner;

public class M218 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0 ,j=0;
        String str = "";
        for (int i = 1 ;i<n;i++){
            j=1;
            str="";
            sum=0;
            while(sum<n && j<=n){
                sum +=j;
                if (sum==n){
                    str = str +Integer.toString(j);
                    System.out.println(str);
                } else{
            if (i==j){
                str= Integer.toString(j);
            }else{
                str = str+"+"+Integer.toString(j);
            }
            j++;
        }
    }
}}}
