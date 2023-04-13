import java.util.Scanner;

public class Nhanvien {
    public String fullname; int tuoi; float luong, hesoluong;
    public float luongcoban = 1490000;
    public float tinhluong(){
        luong = hesoluong*luongcoban;
        return luong;
    }
    public void nhapfullname(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        fullname = sc.nextLine();
    }
    public void nhaptuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }
    public void nhaphesoluong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so luong: ");
        hesoluong = sc.nextFloat();
    }

    }
