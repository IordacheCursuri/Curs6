package com.itFactory.exercitiu.ex2;

public class Ram {

    private String tipMemorie;
    private int capacitate;


    public Ram(String tipMemorie, int capacitate) {
        this.tipMemorie = tipMemorie;
        this.capacitate = capacitate;
    }

    public Ram() {
    }

    public String getTipMemorie() {
        return tipMemorie;
    }

    public void setTipMemorie(String tipMemorie) {
        this.tipMemorie = tipMemorie;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }
}
