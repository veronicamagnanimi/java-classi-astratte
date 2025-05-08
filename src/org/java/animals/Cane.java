package org.java.animals;

public class Cane extends Animale implements ICamminante{
    @Override
    public void verso() {
        System.out.println("Bau bau");
    };

    @Override
    public void mangia() {
        System.out.println("Buoni i croccantini!");
    }

    @Override 
    public void cammina() {
        System.out.println("Sto camminando!");
    }
}
