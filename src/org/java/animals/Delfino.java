package org.java.animals;

public class Delfino extends Animale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Verso delfino");
    }

    @Override
    public void mangia() {
        System.out.println("Buoni i pesci!");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!");
    }
}
