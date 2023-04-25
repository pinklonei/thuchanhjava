package shapes;

import java.util.Scanner;

public class Hinhhoc{
    Scanner sc = new Scanner(System.in);
    public float nhapBanKinh(){
    System.out.print("\nNhap ban kinh: ");
        return sc.nextFloat(); 
  }
    public float nhapchieuDai(){
    System.out.print("\nNhap chieu dai: ");
        return sc.nextFloat(); 
  }
    public float nhapchieuRong(){
    System.out.print("\nNhap chieu rong: ");
        return sc.nextFloat(); 
  }
    public float nhapchieuCao(){
    System.out.print("\nNhap chieu cao: ");
        return sc.nextFloat(); 
  }
  public float nhapCanh(){
    System.out.print("\nNhap canh: ");
        return sc.nextFloat();
  }
    public void xuatten(String ten){
        System.out.println("\n\n----" + ten + "----");
    }
    public void inChuVi(float chuVi){
        System.out.println("Chu vi = "+ chuVi);
    }
    public void inDienTich(float dienTich){
        System.out.println("Dien tich = "+ dienTich);
    }
    public void inTheTich(float theTich){
        System.out.println("The tich = "+ theTich);
    }
}