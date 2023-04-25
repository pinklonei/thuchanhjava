package shapes;

public class Hinhtron extends Hinhhoc {
    private float banKinh;
    private final float PI=3.14f;
    public void nhapBanKinh(float banKinh){
      this.banKinh=banKinh;
    }
    public float tinhChuVi(){
      return 2*PI*banKinh;
    }
    public float tinhDienTich(){
      return PI*banKinh*banKinh;
    }
}