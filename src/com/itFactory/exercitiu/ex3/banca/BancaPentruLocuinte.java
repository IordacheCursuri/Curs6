package com.itFactory.exercitiu.ex3.banca;

import com.itFactory.exercitiu.ex3.persoana.Persoana;

public class BancaPentruLocuinte implements UnitateBancara{
    @Override
    public double calculCredit(Persoana persoana) {
        double credit = persoana.getSalariuNet() * 100;
        return credit;
    }
}
