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
      /*  Ville v = new Ville();
        Ville v1 = new Ville("Marseille", 123456, "France");
        Ville v2 = new Ville ("Rio", 321654, "Brésil");
*/
     /*   System.out.println("\n v = " + v.getNom()+" ville de "+v.getNombreHabitants()+" habitants se " + "situant en " +v.getNomPays());

        System.out.println(" v1 = "+v1.getNom()+ " ville de "+v1.getNombreHabitants()+ " habitants se" +
               " situant en "+v1.getNomPays());

        System.out.println("\n v2 = "+ v2.getNom()+ " ville de "+v2.getNombreHabitants()+ " habitants se" +
                " situant en "+v2.getNomPays());*/

        /* Nous allons maintenant interchanger les villes v1 et v2
        tout ça par l'intermédiaire d'un autre objet Ville
         */

      /*  Ville temp = new Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitants()+ " habitants se" +
                " situant en "+v1.getNomPays());

        System.out.println((" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitants()+ " habitants se" +
                " situant en "+v2.getNomPays()));

        *//*
        nous allons maintenant interchanger leurs noms
        cette fois par le biais de leurs mutateurs
         *//*

        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");

        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitants()+ " habitants se" +
                " situant en "+v1.getNomPays());
        System.out.println((" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitants()+ " habitants se " +
                " situant en "+v2.getNomPays()+"\n\n"));
*/

      /*  //Définition d'un tableau de villes null
        Ville[] tableau = new Ville[6];

        //Définition d'un tableau de noms de villes et un autre de nombre d'habitants
        String[] tab ={"Marseille", "lille", "caen", "lyon","paris", "nantes"};
        int[] tab2={123456,78456,75832165,1594,213};

        //Les trois premiers elements du tableau seront de villes,
        //et le reste, de capitales
        for(int i =0;i<6; i++){

            if(i <3){
                Ville V = new Ville(tab[i],tab2[i],"France");
                tableau[i] = V;
            } else {
                Capitale C = new Capitale(tab[i],tab2[i], "france", "la Tour Eiffel");
                tableau[i] = C;
            }
        }

        //Il ne nous reste plus qu'à décrire tout notre tableau!
        for(Ville V: tableau){
            System.out.println(V.decrisToi()+"\n");
        }
        */
     /* Ville V = new Ville("Lyon", 654,"France");
      Ville V2 = new Ville("Lille", 123, "France");
        System.out.println(V.comparer(V2));*/

     Capitale brasilia = new Capitale("Brasília", 189090909,"Brésil", "Planalto");
     /*System.out.println(brasilia.getNombreHabitants());
        System.out.println(brasilia.getCategorie());
        System.out.println(Capitale.getNbreInstancesBis());*/
        System.out.println(brasilia.decrisToi("Lula"));

    }
}
