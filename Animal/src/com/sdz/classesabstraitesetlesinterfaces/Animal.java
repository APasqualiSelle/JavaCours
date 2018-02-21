package com.sdz.classesabstraitesetlesinterfaces;

abstract class Animal {

    protected String couleur;
    protected int poids;


        abstract void manger(){//Une méthode abstraite
            System.out.println("Je mange de la viande.");
        }
}
