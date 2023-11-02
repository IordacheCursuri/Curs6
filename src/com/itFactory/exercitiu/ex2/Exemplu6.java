package com.itFactory.exercitiu.ex2;

public class Exemplu6 {

    public static void main(String[] args) {

        Ram ram = new Ram();
        ram.setCapacitate(32);
        ram.setTipMemorie("Kingston");


        Ssd ssd = new Ssd();
        ssd.setCapacitate(3);
        ssd.setProducator("Seagate");

        Laptop laptop = new Laptop();
        laptop.setMarca("Asus");
        laptop.setRam(ram);
        laptop.setSsd(ssd);


        System.out.println(laptop.getMarca());
        System.out.println(laptop.getRam().getCapacitate());
        System.out.println(laptop.getRam().getTipMemorie());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




    }


}
