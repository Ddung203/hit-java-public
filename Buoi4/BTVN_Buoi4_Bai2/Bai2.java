package BTVN_Buoi4_Bai2;

public class Bai2 {
    public static void main(String[] args) {
        HCN a = new HCN();

        a.nhap();

        System.out.println("\nVẽ HCN:");
        a.veHCN();
        System.out.println("Chu vi của hình chữ nhật là: " + a.chuVi());
        System.out.println("Diện tích của hình chữ nhật là: " + a.dienTich());
    }
}
