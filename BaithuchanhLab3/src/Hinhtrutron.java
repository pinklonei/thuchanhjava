import java.util.Scanner;

public class  Hinhtrutron{
        public float bankinh, chuvi, dientich, thetich, chieucao; 
        final float PI = 3.14f;
    public float tinhchuvi(){
        chuvi = 2*bankinh*PI+2*PI*bankinh*chieucao;
        return chuvi;
    }
    public float tinhdientich(){
        dientich = 2*PI*bankinh*chieucao + 2*PI*bankinh*bankinh;
        return dientich;
    }
    public float tinhthetich(){
        thetich = PI*bankinh*bankinh*chieucao;
        return thetich;
    }
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ban kinh r: ");
        bankinh = sc.nextFloat();
    }
    public void nhapchieucao(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap vao chieu cao h: ");
        chieucao = sc.nextFloat();
    }
 
    }
     

    



