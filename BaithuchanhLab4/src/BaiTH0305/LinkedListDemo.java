package BaiTH0305;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> StList = new LinkedList<Student>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguoi can them vao danh sach: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Student st = new Student();
            System.out.println("Nhap thong tin nguoi thu " + (i+1) + ":");
            st.nhapthongtin();
            StList.add(st);
        }

        System.out.println("Danh sach nguoi vua nhap la:");
        for (Student st : StList) {
            st.hienthithongtin();
        }
    }
}
