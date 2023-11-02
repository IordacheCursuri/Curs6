package com.itFactory.abstracte;

public class Exemplu1 {
    public static void main(String[] args) {
        Masina masina = new Mercedes("GLK");

        masina.franeaza();

        System.out.println(masina.merge("repede"));

        Masina masina2 = new Ford("Focus");

        System.out.println(masina2.merge("rapid"));

        masina2.franeaza();

     //   Masina masina3 = new Masina(); // o clasa abstract nu poate fi instantiata




    }




}
