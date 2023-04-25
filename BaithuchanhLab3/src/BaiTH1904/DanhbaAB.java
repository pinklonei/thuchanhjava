package BaiTH1904;

import java.util.Scanner;

public class DanhbaAB extends Danhba{
   
   public void  AddContact(String arrFullname[],String arrphone[]){
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i < arrFullname.length; i++){
      System.out.print("\nNhap ten: ");
      arrFullname[i] = sc.nextLine();
      System.out.print("\nNhap SDT cua " + arrFullname[i] +": ");
      arrphone[i] = sc.nextLine();
      }
   }
   public void  DeleteContact(String arrFullname[],String arrphone[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nNhap ten lien he can xoa: ");
      String name = sc.nextLine();
      boolean kt = false;
      for(int i = 0; i < arrFullname.length; i++){
         if(arrFullname[i].equals(name)){
            arrFullname[i] = "null";
            arrphone[i] = "null";
            kt = true;}
         }
         if(kt==false){
            System.out.print("\nTen ko ton tai trong danh ba!");
      }
   }
   public void  UpdateContact(String arrFullname[],String arrphone[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nNhap ten lien he can sua SDT: ");
      String name = sc.nextLine();
      boolean kt = false;
      for(int i = 0; i < arrFullname.length; i++){
         if(arrFullname[i].equals(name)){
            System.out.print("\nNhap Sdt moi cua " + name + ": ");
            arrphone[i]=sc.nextLine();
            kt = true;}
   }
            if(kt==false){
               System.out.print("\nTen ko ton tai trong danh ba!");
         }
   }
   public void  SearchContact(String arrFullname[],String arrphone[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nNhap ten lien he can tim: ");
      String name = sc.nextLine();
      boolean kt = false;
      for(int i  = 0; i < arrFullname.length; i++){
         if(arrFullname[i].equals(name)){
            System.out.print("\nSdt cua " + name + " la: "+ arrphone[i]);
            kt = true;}
         }
         if(kt==false){
            System.out.print("\nTen ko ton tai trong danh ba!");
      }
   }
}  