package BaiTH1705;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Slide113{
    public static void main(String[] args) {
        HashSet<String> aHashSet=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Nhap loai trai cay:");
            String p =sc.nextLine(); 
            aHashSet.add(p);
            if(p.equals("")){
            break; } 
            System.out.println("Danh sach trai cay vua nhap");
            System.out.println(aHashSet);
            System.out.println("Nhap ten can tim");
                 String o = sc.nextLine();
                 if(aHashSet.contains(o)){
            System.out.println("Co trai cay trong danh sach: ");}
                 else{
            System.out.println("Khong co trai cay trong danh sach: ");
        }
            System.out.println("Nhap ten trai cay can xoa: ");
                 String u = sc.nextLine();
                 if(aHashSet.contains(u)){
                 aHashSet.remove(u);
            System.out.println(aHashSet);}
                 else{
            System.out.println("Khong co trai cay trong danh sach: ");
        }
            ArrayList<String> list= new ArrayList<>();
                 while(true){
            System.out.println("Nhap loai trai cay:");
                String  l = sc.nextLine(); 
                list.add(l);
                if(l.equals("")){
                break; } 
            System.out.println("day list");
                for (String qq : list){
                System.out.println(qq);
                for (String m:list){
                if(!aHashSet.contains(m)){
                aHashSet.add(m);
            }
        }
            System.out.println("Danh sach vua cap nhat");
                Iterator<String> iterator = aHashSet.iterator();
                while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
                for (int i=0 ; i < list.size(); i++){
                if(aHashSet.contains(list.get(i))){
                aHashSet.remove(list.get(i));
            }
        }
        System.out.println("Sau khi cap nhat");
       System.out.println(aHashSet);
     }
    }
}
}
}