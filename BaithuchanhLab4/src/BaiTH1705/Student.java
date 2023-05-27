package BaiTH1705;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    public String ten;
    public Float diem;

    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        Student std = new Student();
        std.nhapthongtin(list);
        std.thilai(list);
        std.diemcao(list);
        std.timkiem(list);
    }

    public void nhapthongtin(List<Student> list) {
        System.out.println("Nhap thong tin sinh vien: ");
        while (true) {
            Student std = new Student();
            System.out.print("Nhap ho ten: ");
            String ten = sc.nextLine();
            if (ten.equals("")) {
                break;
            }
            std.ten = ten;
            System.out.print("Nhap diem: ");
            Float diem = sc.nextFloat();
            std.diem = diem;
            list.add(std);
            sc.nextLine();
        }
    }

    public void thilai(List<Student> list) {
        int svtl = 0;
        System.out.println("Thong tin sinh vien phai thi lai:");
        for (Student std : list) {
            if (std.diem <= 5) {
                svtl++;
                System.out.println("Ho ten: " + std.ten + "  Diem: " + std.diem);
            }
        }
        System.out.println("Tong so sinh vien phai thi lai la: " + svtl);
    }

    public void diemcao(List<Student> list) {
        Float diemCaoNhat = Float.MIN_VALUE;
        System.out.println("Thong tin sinh vien co diem cao nhat: ");
        for (Student std : list) {
            if (std.diem > diemCaoNhat) {
                diemCaoNhat = std.diem;
            }
        }
        for (Student std : list) {
            if (std.diem.equals(diemCaoNhat)) {
                System.out.println("Ho ten: " + std.ten + "  Diem: " + std.diem);
            }
        }
    }

    public void timkiem(List<Student> list) {
        System.out.print("Nhap ten sinh vien can tim: ");
        String tensv = sc.nextLine();
        boolean kt = false;
        for (Student std : list) {
            if (std.ten.equals(tensv)) {
                System.out.println("Thong tin sinh vien tim duoc:");
                System.out.println("Ho ten: " + std.ten + ", Diem: " + std.diem);
                kt = true;
                break;
            }
        }
        if (!kt) {
            System.out.println("Khong tim thay sinh vien: \"" + tensv + "\"");
        }
    }
}
