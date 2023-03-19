import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Nhap mang A:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        System.out.print("\nMang da sap xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
