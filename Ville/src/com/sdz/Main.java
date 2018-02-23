package com.sdz;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* *//*  Ville ville = new Ville();
        System.out.println(ville.nomVille);
        ville.nomVille = "la tête à ToTo !!!!";
        System.out.println(ville.nomVille);

    //pour imprimer les paramètres il faut que l'objet appele les variables
    //d'instance avec un '.' Ex. System.out.println(ville1.nomPays)
        //l'ordre est respctée--> aucun souci
        Ville ville1 = new Ville("Marseille", 123456789, "France");

        Ville ville2 = new Ville("Marseille", 123456789,"France" );
        ville2.nomPays ="La tête à tutu!!!!";
        System.out.println(ville2.nomPays);*//*
         */

        //************************************2e partie du cours ***********************
        Ville v = new Ville();
        Ville v1 = new Ville("Marseille", 123456, "France");
        Ville v2 = new Ville ("Rio", 321654, "Brésil");

     /*   System.out.println("\n v = " + v.getNom()+" ville de "+v.getNombreHabitants()+" habitants se " + "situant en " +v.getNomPays());

        System.out.println(" v1 = "+v1.getNom()+ " ville de "+v1.getNombreHabitants()+ " habitants se" +
               " situant en "+v1.getNomPays());

        System.out.println("\n v2 = "+ v2.getNom()+ " ville de "+v2.getNombreHabitants()+ " habitants se" +
                " situant en "+v2.getNomPays());*/

        /* Nous allons maintenant interchanger les villes v1 et v2
        tout ça par l'intermédiaire d'un autre objet Ville
         */

        Ville temp = new Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitants()+ " habitants se" +
                " situant en "+v1.getNomPays());

        System.out.println((" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitants()+ " habitants se" +
                " situant en "+v2.getNomPays()));

        /*
        nous allons maintenant interchanger leurs noms
        cette fois par le biais de leurs mutateurs
         */

        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");

        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitants()+ " habitants se" +
                " situant en "+v1.getNomPays());
        System.out.println((" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitants()+ " habitants se " +
                " situant en "+v2.getNomPays()+"\n\n"));



    }
}
