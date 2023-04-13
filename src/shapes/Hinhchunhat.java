package shapes;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public float dai, rong;
    public Hinhchunhat(){
        ten = "Hinhchunhat";
    }
    public void nhapchieudai(){
        System.out.print("Chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapchieurong(){
        System.out.print("Chieu rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2* (dai+rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
}
