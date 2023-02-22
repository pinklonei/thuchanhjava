import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.print("Nhap he so a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        c = scanner.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
