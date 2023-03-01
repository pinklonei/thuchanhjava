import java.util.Scanner;

public class l {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Nhập số nguyên: ");
            number = input.nextInt();
            sum += number;
        } while (sum <= 100);

        System.out.print("Tổng các số đã nhập vào là: ");
        for (int i = 1; i <= sum; i++) {
            if (i != sum) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=" + sum);
            }
        }
    }
}
