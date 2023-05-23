package BaiTH1705;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, sochan = 0, trungbinhcong=0;
        System.out.print("Nhap so phan tu n: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Scanner sv = new Scanner(System.in);
            System.out.print("Nhap phan tu thu " +(i + 1)+ ":");
            int num = sv.nextInt();
            list.add(num);
        }
        for (int num : list) {
            if (num > 0 && num % 2 == 0) {
                sum += num;
                sochan++;}
    }
          trungbinhcong = sum/sochan;
          System.out.printf("Trung binh cong cua cac so chan la: " +trungbinhcong);
    }
}
    

