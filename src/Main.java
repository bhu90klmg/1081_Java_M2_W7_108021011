import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat();
        float max = v1;
        float min = v1;
        for (int i=1; i<10; i++){
            v1 = scn.nextFloat();
            if (max<v1){
                max = v1;
            }
            else if (min>v1){
                min = v1;
            }
        }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);
    }
}

