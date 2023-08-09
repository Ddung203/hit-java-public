import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {

    public static int gt(int n){
        if(n == 1) return 1;

        return n * gt(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        do {
            System.out.println("Nhap vao soo nguyen duong n: ");
            n = in.nextInt();
        }while (n <= 0);

        double S = 0, P = 0;

        for(int i = 1; i <=n; i++){
            S += 1.0/i;
            P += gt(i);
        }

        System.out.println("S = " + S);
        System.out.println("P = " + P);

    }
}
