package BaithuchanhLab4.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua arrayList: ");
        int n = sc.nextInt();

        System.out.println("Nhap cac phan tu cua ArrayList: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arrList.add(x);
        }
        System.out.print("Cac phan tu ban da nhap vao arrayList la:");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        int max = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        System.out.println("\nPhan tu lon nhat trong arrList la: " + max);
    }
}