import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi cua ban: ");
        String str = sc.nextLine();
        sc.close();

        int chuhoa = 0;
        int chuthuong = 0;
        int chuso = 0;

        for (int i = 0; i < str.length(); i++) {
            char chu = str.charAt(i);
            if (Character.isUpperCase(chu)) {
                chuhoa++;
            } else if (Character.isLowerCase(chu)) {
                chuthuong++;
            } else if (Character.isDigit(chu)) {
                chuso++;
            }
        }
        System.out.println("So ky tu hoa trong chuoi: " + chuhoa);
        System.out.println("So ky tu thuong trong chuoi: " + chuthuong);
        System.out.println("So luong chu so trong chuoi: " + chuso);
    }
}
