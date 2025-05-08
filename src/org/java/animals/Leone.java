package org.java.animals;

public class Leone extends Animale implements ICamminante {
    @Override
    public void verso() {
        System.out.println("Roaaar");
    }

    @Override
    public void mangia() {
        System.out.println("Buone le gazzelle!");
    }

    @Override 
    public void cammina() {
        System.out.println("Sto camminando!");
    }
}
