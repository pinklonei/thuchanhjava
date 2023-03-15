import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        while (tong <= 100) {
            System.out.print("Nhap mot so nguyen: ");
            int n = sc.nextInt();
            tong += n;}
        System.out.println("Tong cua cac so da nhap la: " + tong);
    }
}
