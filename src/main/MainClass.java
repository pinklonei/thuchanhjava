package main;

import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;

public class MainClass{     
    public static void main(String[] args){
    Hinhtron htron = new Hinhtron();
    htron.xuatten();
    htron.nhapbankinh();
    htron.tinhchuvi();
    htron.tinhdientich();
    htron.inchuvi();
    htron.indientich();

    Hinhtru htru = new Hinhtru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthetich();
    
    Hinhchunhat hcn = new Hinhchunhat();
    hcn.xuatten();
    hcn.nhapchieudai();
    hcn.nhapchieurong();
    hcn.tinhchuvi();
    hcn.tinhdientich();
    hcn.inchuvi();
    hcn.indientich();

    Hinhvuong hv = new Hinhvuong();
    hv.xuatten();
    hv.nhapcanh();
    hv.tinhchuvi();
    hv.tinhdientich();
    hv.inchuvi();
    hv.indientich();
    }

    }


    
