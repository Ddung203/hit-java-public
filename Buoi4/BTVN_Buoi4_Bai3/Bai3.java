package BTVN_Buoi4_Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số sinh viên:");
        int n = in.nextInt();

        SinhVien[] list = new SinhVien[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin của sinh viên thứ " + (i+1));
            list[i] = new SinhVien();
            list[i].nhap();
        }

        System.out.println("Danh sách các sinh viên:");
        System.out.printf("%-10s %-20s %-8s %-8s %-8s %-8s%n",
                "Mã SV", "Họ tên", "Điểm Toán", "Điểm Lý", "Điểm Hóa", "Điểm TB");
        System.out.println("=======================================================================");
        for(int i = 0; i < n; i++) {
            list[i].xuat();
        }

    }
}
