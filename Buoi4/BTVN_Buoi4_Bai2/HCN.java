package BTVN_Buoi4_Bai2;

import java.util.Scanner;

public class HCN {
    private double D;
    private double R;

    public HCN(){}

    public HCN(double d, double r){
        this.D = d;
        this.R = r;
    }

    public void setD(double D){
        this.D = D;
    }
    public void setR(double R){
        this.R = R;
    }

    public double getD(){
        return D;
    }

    public double getR(){
        return R;
    }

    public void nhap(){
        System.out.println("Nhập chiều dài của hình chữ nhật!");
        Scanner in = new Scanner(System.in);
        D = in.nextDouble();

        System.out.println("Nhập chiều rộng của hình chữ nhật!");
        R = in.nextDouble();
    }

    public void veHCN(){
        for(int i = 0; i < R; i++){
            for(int j = 0; j < D; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public double chuVi(){
        return (D+R)*2;
    }
    public double dienTich(){
        return D*R;
    }
}
