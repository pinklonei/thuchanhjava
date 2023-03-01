import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int x;
        String numbers = "";
        do {
            System.out.print("Nhap vao so nguyen: ");
            x = sc.nextInt();
            tong = tong + x;
            numbers += x + "+";
        } while (tong <= 100);
        System.out.print("Tong cac so da nhap vao la: ");
        System.out.println(numbers.substring(0, numbers.length() - 1) + "=" + tong);
    }
}
