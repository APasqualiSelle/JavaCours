package com.sdz;

public class Capitale extends Ville {

    private String monument;


 /*   //Constructeur par défaut
    public Capitale(){
        //ce mot clé appelle le constructeur de la classe mère
        super();
        *//* this.nomVille = "toto"; *//*
        monument = "aucun";
    }*/

   /* //Constructeur d'initialisation de capitale
    public Capitale(String nom, int hab, String pays, String monument){

        super(nom, hab, pays);
        this.monument = monument;
    }*/


//méthode type String
    public String decrisToi() {

        String str = super.decrisToi() + "\n\t ====> " + this.monument + " en est un monument";
        System.out.println("Invocation de super.descrisToi()");
        return str;

    }
    //retourne le nom du monument
    public String getMonument() {
        return monument;
    }

    //définit le nom du monument
    public void setMonument(String monument) {
        this.monument = monument;
    }

   //méthode toString de la Classe Objet : retourne un String décrivant l'objet en question
    public String toString(){
        String str=super.toString()+"\n \t ==>"+this.monument + " en est un monument";
        return str;
    }

}
