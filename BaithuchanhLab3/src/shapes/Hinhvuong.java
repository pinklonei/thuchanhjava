package shapes;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat{
    public Hinhvuong(){
        ten = "Hinhvuong";

    }
    public void nhapcanh(){
        System.out.print("Canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
        
    }
    
}
