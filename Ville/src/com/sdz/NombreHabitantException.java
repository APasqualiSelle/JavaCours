package com.sdz;

public class NombreHabitantException extends Exception {

    public NombreHabitantException(int nbre){
        System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants negatif !");
        System.out.println("\t => "+nbre);
    }
}
