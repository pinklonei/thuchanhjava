import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int dem = 0;
        System.out.print("Nhap vao mot chuoi khong qua 80 ky tu: ");
        String x = sc.nextLine();
        System.out.print("Nhap vao mot ky tu bat ky: ");
        ch = sc.next().charAt(0);
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ch) {
                dem++;
            }
        }
        System.out.printf("Ky tu '%c' xuat hien %d lan trong chuoi ", ch, dem, x);
    }
}