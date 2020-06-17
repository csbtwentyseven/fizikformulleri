package com.example.fizikdonusturucu;

public class HesapCls {
    double kutle;
    double hiz;
    double yercekimi;
    double yukseklik;

    public HesapCls(double kutle, double hiz){
        this.kutle = kutle;
        this.hiz = hiz;
    }

    public HesapCls(double kutle, double yercekimi,double yukseklik){
        this.kutle = kutle;
        this.yercekimi = yercekimi;
        this.yukseklik = yukseklik;
    }

    public String getKinDeger(){
        double enerjiHesap = (this.kutle * Math.pow(this.hiz,2.0)) * 1/2; // Kinetik Enerji Formülü 1/2 * m * v^2
        String enerji = String.valueOf(enerjiHesap);
        return enerji;
    }

    public String getPotDeger(){
        double enerjiHesap = this.kutle * this.yukseklik * this.yercekimi; // Potansiyel Enerji Formülü m * g * h
        String enerji = String.valueOf(enerjiHesap);
        return enerji;
    }
}
