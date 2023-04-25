package shapes;

public class Hinhtru extends Hinhtron{
    private float banKinh;
    private final float PI = 3.14f;
    private float chieuCao;
    public void nhapChieuCao(float chieuCao){
       this.chieuCao=chieuCao;
    }
    public void nhapBanKinh(float banKinh){
        this.banKinh=banKinh;
    }
    public float tinhTheTich(){
       return PI*banKinh*banKinh*chieuCao;
    }
}