package com.itFactory.exercitiu.ex1;

public class Patrat implements FormeGeometrice{

    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    @Override
    public double calculeazaArie() {
        double arie = this.latura * this.latura;
        return arie;
    }

    @Override
    public double calculeazaPerimetru() {
        double perimetru = 4 * this.latura;
        return perimetru;

    }
}
