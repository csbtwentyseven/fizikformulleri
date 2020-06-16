package com.example.fizikdonusturucu;

public class KinHesapCls {
    double kutle;
    double hiz;

    public KinHesapCls(double kutle,double hiz){
        this.kutle = kutle;
        this.hiz = hiz;
    }

    public String getKinDeger(){
        double enerjiHesap = (this.kutle * Math.pow(this.hiz,2.0)) * 1/2; // Kinetik Enerji Formülü 1/2 * m * v^2
        String enerji = String.valueOf(enerjiHesap);
        return enerji;
    }
}
