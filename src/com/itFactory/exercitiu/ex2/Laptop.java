package com.itFactory.exercitiu.ex2;

public class Laptop {

    private String marca;
    private double diagonalaMonitor;
    private Ram ram;
    private Ssd ssd;

    public Laptop(String marca, double diagonalaMonitor, Ram ram, Ssd ssd) {
        this.marca = marca;
        this.diagonalaMonitor = diagonalaMonitor;
        this.ram = ram;
        this.ssd = ssd;
    }

    public Laptop() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDiagonalaMonitor() {
        return diagonalaMonitor;
    }

    public void setDiagonalaMonitor(double diagonalaMonitor) {
        this.diagonalaMonitor = diagonalaMonitor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }
}
