package shapes;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float bankinh;
    public Hinhtron(){
        ten = "Hinhtron";
    }
    public void nhapbankinh(){
        System.out.print("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
    
}

