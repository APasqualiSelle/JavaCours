package com.sdz;

public class Capitale extends Ville {

    private String monument;

    public Capitale(String pNom, int pNbre, String pPays, String monument) {
        super(pNom, pNbre, pPays);
        this.monument = monument;
    }


    public String decrisToi(String president) {
       String str = super.decrisToi()+" le president est "+president;
       return str;
    }

    /* //Constructeur par défaut
    public Capitale(){
        //ce mot clé appelle le constructeur de la classe mère
        super();
        //this.nomVille = "toto";
        monument = "aucun";
    }
//méthode type String
    public String decrisToi(){

        String str =super.decrisToi()+"\n\t ====> "+this.monument+" en est un monument";
        System.out.println("Invocation de super.descrisToi()");
        return str;
    }

    //Constructeur d'initialisation de capitale
    *//*public Capitale(String nom, int hab, String pays, String monument){

        super(nom, hab, pays);
        this.monument = monument;
    }*//*

    public Capitale(String pNom, int pNbre, String pPays, String monument) {
        super(pNom, pNbre, pPays);
        this.monument = monument;
    }

    //retourne le nom du monument
    public String getMonument() {
        return monument;
    }

    //définit le nom du monument
    public void setMonument(String monument) {
        this.monument = monument;
    }*/
}
