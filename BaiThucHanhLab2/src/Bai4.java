import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao mot so nguyen tu 1 den 12: ");
        n = sc.nextInt();
        String tenthang;
        switch (n) {
            case 1:
                tenthang = "Thang 1";
                break;
            case 2:
                tenthang = "Thang 2";
                break;
            case 3:
                tenthang = "Thang 3";
                break;
            case 4:
                tenthang = "Thang 4";
                break;
            case 5:
                tenthang = "Thang 5";
                break;
            case 6:
                tenthang = "Thang 6";
                break;
            case 7:
                tenthang = "Thang 7";
                break;
            case 8:
                tenthang = "Thang 8";
                break;
            case 9:
                tenthang = "Thang 9";
                break;
            case 10:
                tenthang = "Thang 10";
                break;
            case 11:
                tenthang = "Thang 11";
                break;
            case 12:
                tenthang = "Thang 12";
                break;
            default:
                tenthang = "Khong hop le";
                break;
        }
        System.out.println(tenthang);
    }
}