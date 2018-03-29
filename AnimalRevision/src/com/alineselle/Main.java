package com.alineselle;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /* Animal l = new Loup("Gris bleuté", 20);

        l.boire();
        l.manger();
      //  l.deplacement();
        l.crier();
        System.out.println(l.toString());*/

        Chien c = new Chien("Gris bleauté",20);
        //les méthods d'un Chien
        c.boire();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());
        System.out.println("-------------------------------");

        //Les méthodes de l'Interface
        c.faireCalin();
        c.faireLeBeau();
        c.faireLechouille();

        System.out.println("-------------------------------");

        //Utilisons le polymorphisme de notre interface
        Rintintin r = new Chien();
        r.faireLeBeau();
        r.faireCalin();
        r.faireLechouille();


    }
}
