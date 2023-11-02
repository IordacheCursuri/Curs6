package com.itFactory.exercitiu.ex3.banca;

import com.itFactory.exercitiu.ex3.persoana.Persoana;

public class Exercitiu7 {
    public static void main(String[] args) {

        Persoana persoana = new Persoana();

        persoana.setCnp("18825697885441");
        persoana.setNume("Gigel");
        persoana.setVarsta("40");
        persoana.setSalariuNet(10000);

        UnitateBancara unitateBancara = new BancaPentruLocuinte();

        double credit = unitateBancara.calculCredit(persoana);


        System.out.println("Valoarea creditului pentru: " + persoana.getNume() + " este de: -> " + credit);





    }


}
