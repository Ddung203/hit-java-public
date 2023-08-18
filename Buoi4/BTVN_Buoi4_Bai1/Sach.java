package BTVN_Buoi4_Bai1;

import java.util.Scanner;

public class Sach {
    private String masach;
    private String tensach;
    private String tacgia;
    private String nxb;
    private double giatien;

    public Sach(){}

    public Sach(String ma, String ten, String tg, String nxb, double gia){
        masach = ma;
        tensach = ten;
        tacgia = tg;
        this.nxb = nxb;
        giatien = gia;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public void nhap(){
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap ma sach:");
        masach = in.nextLine();
        System.out.println("Nhap ten sach:");
        tensach = in.nextLine();
        System.out.println("Nhap ten tac gia:");
        tacgia = in.nextLine();
        System.out.println("Nhap ten nha xuat ban:");
        nxb = in.nextLine();
        System.out.println("Nhap gia tien:");
        giatien = in.nextDouble();
    }

    public void xuat(){
        System.out.printf("%-15s %-30s %-20s %-20s %-10.2f%n",
                masach, tensach, tacgia, nxb, giatien);
    }

}




















