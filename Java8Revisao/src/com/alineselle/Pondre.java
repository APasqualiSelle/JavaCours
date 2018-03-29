package com.alineselle;

public interface Pondre extends Reproduction {

    public static void description(){
        Reproduction.description();
        System.out.println("Rédefinie dans Pondre.java");

        }

        default void reproduire(){
            System.out.println("Je ponds des oeufs !");
        }
    }

