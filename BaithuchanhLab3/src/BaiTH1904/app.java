package BaiTH1904;

import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        DanhbaAB dba = new DanhbaAB();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc danh ba: ");
        int A=sc.nextInt();
        String arrFullname[] = new String[A];
        String arrphone[]=new String[A];
        dba.AddContact(arrFullname, arrphone);
        dba.DeleteContact(arrFullname, arrphone);
        dba.UpdateContact(arrFullname, arrphone);
        dba.SearchContact(arrFullname, arrphone);
    }
}
