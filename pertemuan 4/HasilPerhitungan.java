package com.praktikum;

public class HasilPerhitungan {
    public static void main(String[] args) {

        Kubus kubus = new Kubus(5);
        System.out.println("volume kubus adalah : " + kubus.hitungVolume());
        System.out.println("luas permukaan kubus adalah : " + kubus.hitungLuasPermukaan());


        Balok balok = new Balok(8, 4, 2);
        System.out.println("volume balok adalah : " + balok.hitungVolume());
        System.out.println("luas permukaan balok adalah : " + balok.hitungLuasPermukaan());
    }
}
