package BTVN_Buoi4_Bai3;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien:");
        maSinhVien = in.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen = in.nextLine();
        System.out.println("Nhap diem Toan:");
        diemToan = in.nextDouble();
        System.out.println("Nhap diem Ly:");
        diemLy = in.nextDouble();
        System.out.println("Nhap diem Hoa:");
        diemHoa = in.nextDouble();
    }

    public void xuat() {
        System.out.printf("%-10s %-20s %-8.2f %-8.2f %-8.2f %-8.2f%n",
                maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB());
    }

    public float diemTB() {
        return (float) ((diemToan + diemLy + diemHoa) / 3);
    }
}

