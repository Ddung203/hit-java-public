package BTVN_Buoi4_Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        System.out.println("Nhập số lượng sách :");
        int n = in.nextInt();

        Sach[] list = new Sach[n];

        for(int i = 0; i < n; i++){
            System.out.println("\nNhập thông tin của sách thứ " + (i+1));
            list[i] = new Sach();
            list[i].nhap();
        }

        System.out.println("Thông tin sách:");
        System.out.printf("%-15s %-30s %-20s %-20s %-10s%n",
                "Mã sách", "Tên sách", "Tác giả", "Nhà xuất bản", "Giá tiền");
        System.out.println("======================================================================================================");
        for(int i = 0; i < n; i++)
            list[i].xuat();


    }
}
