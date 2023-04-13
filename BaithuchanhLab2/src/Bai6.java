import java.util.Scanner;

public class Bai6 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        long giaithua = 1;
        do{
            System.out.print("Nhap mot so nguyen duong ");
            n = sc.nextInt();
        }while(n<=0);
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.println("Giai thua cua " + n + " la: " + giaithua);
    }
}
