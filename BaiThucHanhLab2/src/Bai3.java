import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namsinh, tuoi;
        System.out.print("Nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.print("Nhap nam sinh cua ban: ");
        namsinh = sc.nextInt();
        tuoi = 2023 - namsinh;
        if (tuoi == 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        } else if (tuoi == 18) {
            System.out.println("Ban " + ten + " da gia");
        } else {
            System.out.println("Tuoi cua ban khong nam trong cac nhom tuoi duoc xac dinh");
        }
    }
}