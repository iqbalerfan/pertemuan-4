package com.praktikum;

public class Balok {
    double panjang, lebar, tinggi;


    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }


    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }


    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
