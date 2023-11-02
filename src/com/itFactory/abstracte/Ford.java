package com.itFactory.abstracte;

public class Ford extends Masina {


    public Ford(String nume) {
        super(nume);
    }

    public Ford() {
    }

    @Override
    public String merge(String merge) {
        return "Msina mea nu mai merge asa de " + merge;
    }

    @Override
    public void franeaza() {
        System.out.println("Ford-ul nu mai franeaza ca i s-au stricat franele");
    }
}
