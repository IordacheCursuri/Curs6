package com.itFactory.exercitiu.ex1;

public class Dreptunghi implements FormeGeometrice, Test{

    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public Dreptunghi() {
    }

    @Override
    public double calculeazaArie() {
        double arie = this.lungime * this.latime;
        return arie;
    }

    @Override
    public double calculeazaPerimetru() {
        double perimetru = (lungime + latime) * 2;
        return perimetru;
    }


    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }
}
