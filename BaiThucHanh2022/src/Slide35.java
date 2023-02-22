import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap so thu nhat: ");
        a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        b = scanner.nextInt();
        int min = a;
        if (b < a) {
            min = b;
        }
        System.out.println("So nho nhat trong hai so la: " + min);
    }
}
