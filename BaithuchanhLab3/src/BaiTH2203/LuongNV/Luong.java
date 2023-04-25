public class Luong {
    public static void main(String[] args) {
    Nhanvien nv = new Nhanvien();
    nv.nhapfullname();
    nv.nhaptuoi();
    nv.nhaphesoluong();
    System.out.printf("Luong cua nhan vien la: %.2f ", +nv.tinhluong());

    }
}
