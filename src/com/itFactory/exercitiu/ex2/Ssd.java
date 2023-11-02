package com.itFactory.exercitiu.ex2;

public class Ssd {

    private String producator;
    private int capacitate;

    public Ssd(String producator, int capacitate) {
        this.producator = producator;
        this.capacitate = capacitate;
    }

    public Ssd() {
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }
}
