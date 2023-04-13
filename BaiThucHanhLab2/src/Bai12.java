import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int hang = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cot = sc.nextInt();
        int[][] A = new int[hang][cot];
        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        int Max = A[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (A[i][j] > Max) {
                    Max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + Max);
    }
}
