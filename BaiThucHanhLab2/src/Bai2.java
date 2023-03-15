import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap mot so nguyen: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.printf("So vua nhap la so chan", +n);
        } else {
            System.out.printf("So vua nhap la so le", +n);
        }
    }
}

