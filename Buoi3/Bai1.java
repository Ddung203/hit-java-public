import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; ++i){
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        for(int i = 1; i < n; ++i){
            if(arr[i] > max) max = arr[i];
        }

        int[] count = new int[max+1];

        for(int i = 0; i < n; ++i) {
            count[arr[i]]++;
        }

        for(int i = 0; i <= max; ++i){
            if(count[i] != 0)
                System.out.println("So " + i + " xuat hien " + count[i] + " lan.");
        }
    }
}