package com.itFactory.abstracte;

public abstract class Masina {
    public String nume;

    public Masina(String nume){
        this.nume = nume;
    }

    public Masina(){
    }

    public abstract String merge(String merge);

    public void franeaza(){
        System.out.println("Masina de tipul " + this.nume + " franeaza");
    }




}
