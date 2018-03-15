package com.sdz.classesabstraitesetlesinterfaces;

abstract class Animal {

    protected String couleur;
    protected int poids;


        protected void manger(){//Une méthode abstraite
            System.out.println("Je mange de la viande.");
        }

        protected void boire(){
            System.out.println("Je bois de l'eau!");
        }

        abstract void deplacement();
        abstract void crier();

        public String toString(){
            String str = "Je suis un objet de la " + this.getClass().getSimpleName() + " , je suis " + this.couleur + " je pèse " + this.poids;
            return str;

        }
}
