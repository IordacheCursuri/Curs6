package com.itFactory.exercitiu.ex1;

public class Exercitiul5 {

    public static void main(String[] args) {

      //  FormeGeometrice formeGeometrice = new Dreptunghi(56, 40);

        FormeGeometrice formeGeometrice = new Patrat(56);

        double arie = formeGeometrice.calculeazaArie();

        double perimetru = formeGeometrice.calculeazaPerimetru();

        System.out.println("Aria este: " + arie  + " perimetrul este: " + perimetru);


    }


}
