package shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieucao;
    public Hinhtru(){
        ten = " Hinhtru";
    }
    public void  nhapchieucao(){
        nhapbankinh();
        System.out.print("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;

    }
    
}
