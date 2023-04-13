import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();
        double tong = a + b;
        System.out.println("Tong cua 2 so la: " + tong);
        double hieu = a - b;
        System.out.println("Hieu cua 2 so la: " + hieu);
        double tich = a * b;
        System.out.println("Tich cua 2 so la: " + tich);
        if (b == 0) {
            System.out.println("Khong the chia cho so 0");
        } else {
            double thuong = a / b;
            System.out.println("Thuong cua 2 so la: " + thuong);
        }
        if (b == 0) {
            System.out.println("Khong the chia cho so 0");
        } else {
            double du = a % b;
            System.out.println("Chia lay du cua 2 so la: " + du);
        }
        System.out.println("So thu nhat lon hon so thu hai: " + (a > b));
        System.out.println("So thu nhat nho hon so thu hai: " + (a < b));
        System.out.println("So thu nhat lon hon hoac bang so thu hai: " + (a >= b));
        System.out.println("So thu nhat nho hon hoac bang so thu hai: " + (a <= b));
        System.out.println("So thu nhat bang so thu hai: " + (a == b));
        System.out.println("So thu nhat khac so thu hai: " + (a != b));
    }
}