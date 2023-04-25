package shapes;

public class Hinhchunhat extends Hinhhoc {
    private float dai;
    private float rong;
    public void nhapChieuDai(float dai){
        this.dai=dai;
    }
    public void nhapChieuRong(float rong){
        this.rong=rong;
    }
    public float tinhChuVi(){
        return 2*(dai+rong);
    }
    public float tinhDienTich(){
        return dai*rong;
    }
}