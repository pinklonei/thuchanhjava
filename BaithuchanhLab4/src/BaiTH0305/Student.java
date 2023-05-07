package BaiTH0305;

import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }

    public void hienthithongtin() {
        System.out.println("Ho va ten: " + FullName);
        System.out.println("Tuoi: " + Age);
    }
}