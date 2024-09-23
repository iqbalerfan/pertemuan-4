package com.praktikum;

public class Kubus { double sisi;

    // Konstruktor
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Method menghitung volume kubus
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Method  menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
