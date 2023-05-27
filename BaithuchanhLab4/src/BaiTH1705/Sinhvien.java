package BaiTH1705;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Sinhvien {
    private String MaSV;
    private String Fullname;
    private String lop;
    Scanner sc = new Scanner(System.in);
    public String getMaSV() {
        return MaSV;}
    public void setMaSV(String maSV) {
        MaSV = maSV;}
    public String getFullname() {
        return Fullname;}
    public void setFullname(String fullname) {
        Fullname = fullname;}
    public String getLop() {
        return lop;}
    public void setLop(String lop) {
        this.lop = lop;
    }
    public static void main(String[] args) {
        Map<String, Sinhvien> Sv = new HashMap<>();
        Sinhvien sv = new Sinhvien();
        sv.nhapthongtin(Sv);
        sv.timkiemlop(Sv);
        sv.timkiemsv(Sv);
    }

    public void nhapthongtin(Map<String, Sinhvien> Sv) {
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Sinhvien sv = new Sinhvien();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");

            System.out.print("Ma sinh vien: ");
            String MaSV = sc.nextLine();
            sv.setMaSV(MaSV);

            System.out.print("Nhap ho ten: ");
            String Fullname = sc.nextLine();
            sv.setFullname(Fullname);

            System.out.print("Nhap ten lop: ");
            String lop = sc.nextLine();
            sv.setLop(lop);

            Sv.put(MaSV, sv);
        }
    }

    public void timkiemlop(Map<String, Sinhvien> Sv) {
        System.out.print("Nhap ten lop de tim kiem: ");
        String tenlop = sc.nextLine();
        System.out.println("Danh sach sinh vien thuoc Lop " + tenlop + ":");
        for (Sinhvien sv : Sv.values()) {
            if (sv.getLop().equals(tenlop)) {
                System.out.println("Ma SV: " + sv.getMaSV() + ", Ho va ten: " + sv.getFullname());
        }
    }
 }
    public void timkiemsv(Map<String, Sinhvien> Sv){
        System.out.print("Nhap vao ma sinh vien de tim kiem: ");
        String MaSV = sc.nextLine();
        Sinhvien sv = Sv.get(MaSV);
        if (sv != null) {
            System.out.println("Ho va ten: " + sv.getFullname() + ", Lop: " + sv.getLop());
        } else {
            System.out.println("Khong tim thay sinh vien co Ma SV: " + MaSV);

    }
}
}
   