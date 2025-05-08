package org.java.animals;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        Delfino delfino = new Delfino();
        Leone leone = new Leone();

        System.out.println("-- Cane --");
        cane.dormi();
        cane.mangia();
        cane.verso();

        System.out.println("-- Leone --");
        leone.dormi();
        leone.mangia();
        leone.verso();

        System.out.println("-- Delfino --");
       delfino.dormi();
       delfino.mangia();
       delfino.verso();

       faiCamminare(cane);
       faiCamminare(leone);
       faiNuotare(delfino);
    }

    static void faiCamminare(ICamminante animaleCamminante) {
        animaleCamminante.cammina();
    }

    static void faiNuotare(INuotante animaleNuotante) {
        animaleNuotante.nuota();
    }

}
