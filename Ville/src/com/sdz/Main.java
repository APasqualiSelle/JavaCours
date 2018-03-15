package com.sdz;

public class Main {

    public static void main(String[] args) {

       // Ville A = new Ville();
        //System.out.println(A.toString()); ex da méthode toString invoqué sans reecriture. = com.sdz.Ville@4554617c
     //   System.out.println(A);//ex du print de um objet A que herda tacitamente da mãe Objet = com.sdz.Ville@4554617c

       //Définition d'un tableau de villes null
        Ville[] tableau = new Ville[6];

        //Définition d'un tableau de noms de villes et un autre de nombre d'habitants
        String[] tab ={"Marseille", "Lille", "Caen", "Lyon","Paris", "Nantes"};
        int[] tab2={123456,78456,654987,5832165,1594,213};

        //Les trois premiers elements du tableau seront de villes,
        //et le reste, de capitales
        for(int i =0;i<6; i++){
            if(i <3){
                Ville V = new Ville(tab[i],tab2[i],"France");
                tableau[i] = V;
            } else {
                Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
                tableau[i] = C;
            }
        }
        //Il ne nous reste plus qu'à décrire tout notre tableau! toString est une méthode qu'appartient à la classe objet
       for(Ville v: tableau){
            System.out.println(v.decrisToi()+"\n");
        }
    }}



