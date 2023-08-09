import java.util.Scanner;

public class Bai3 {
    public static boolean snt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }

        return n > 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        do {
            System.out.println("Nhap vao so nguyen duong n: ");
            n = in.nextInt();
        }
        while (n<=0);

        System.out.println(snt(n) ? n + " la so nguyen to." : n + " khong la so nguyen to.");

    }
}
