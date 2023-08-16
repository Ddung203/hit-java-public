package Bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = in.nextLine();

        boolean isSymmetric = ktraDoiXung(input);

        if (isSymmetric) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean ktraDoiXung(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
