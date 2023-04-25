package main;

import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;

public class MainClass {
    public static void main(String[] args) {

        Hinhtron htron = new Hinhtron();
        htron.xuatten("Hinh Tron");
        htron.nhapBanKinh(htron.nhapBanKinh());
        htron.tinhChuVi();
        htron.tinhDienTich();
        htron.inChuVi(htron.tinhChuVi());
        htron.inDienTich(htron.tinhDienTich());

        Hinhtru htru = new Hinhtru();
        htru.xuatten("Hinh Tru");
        htru.nhapChieuCao(htru.nhapchieuCao());
        htru.nhapBanKinh(htru.nhapBanKinh());
        htru.tinhTheTich();
        htru.inTheTich(htru.tinhTheTich());

        Hinhchunhat hcn = new Hinhchunhat();
        hcn.xuatten("Hinh Chu Nhat");
        hcn.nhapChieuDai(hcn.nhapchieuDai());
        hcn.nhapChieuRong(hcn.nhapchieuRong());
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi(hcn.tinhChuVi());
        hcn.inDienTich(hcn.tinhDienTich());

        Hinhvuong hv = new Hinhvuong();
        hv.xuatten("Hinh Vuong");
        hv.nhapCanh(hv.nhapCanh());
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi(hv.tinhChuVi());
        hv.inDienTich(hv.tinhDienTich());
    }
    
}