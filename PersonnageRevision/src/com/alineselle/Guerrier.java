package com.alineselle;

import com.sdz.comportement.*;

public class Guerrier extends Personnage {

    //constructeur sans paramètres
    public Guerrier() {
        this.espritCombatif = new CombatPistolet();
    }



    //constructeur avec paramètres
    public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}

    //evolution du code ci-dessus
   /* public void combattre(){

        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet !");
        else if(this.armes.equals("fusil de sniper"))
            System.out.println("Attaque au fusil de sniper");
        else
                System.out.println("Attaque au couteau!");
    }*/

    //evolution du code ci-dessus
   /* public void combattre(){
        System.out.println("Fusil, pistolet, couteau! Tout ce que tu veux!");
    }*/




