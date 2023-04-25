package shapes;

public class Hinhvuong extends Hinhhoc {
    private float canh;
    public void nhapCanh(float canh){
        this.canh=canh;
  }
public float tinhChuVi(){
        return canh*4;
  }
    public float tinhDienTich(){
        return canh*canh;
  }
}