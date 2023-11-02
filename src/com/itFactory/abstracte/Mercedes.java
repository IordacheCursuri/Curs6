package com.itFactory.abstracte;

public class Mercedes extends Masina{

    public Mercedes(String nume) {
        super(nume);
    }

    @Override
    public String merge(String merge){
        return "Masina merge " + merge;
    }


}
