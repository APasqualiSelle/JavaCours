package com.alineselle;

public interface Mitose extends Reproduction {

    public static void description(){

            Reproduction.description();
            System.out.println("Rédefinie dans Mitose.java");
        }

        default void reproduire(){
            System.out.println("Je me divise!");
        }
    }


