import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, num, TB;
        System.out.print("Nhap so phan tu cua day so: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            num = sc.nextInt();
            sum+=num;
        }
        TB = sum/n;
        System.out.printf("Trung binh cong cua day so da nhap la: %d ", +TB);
    }
    
}
