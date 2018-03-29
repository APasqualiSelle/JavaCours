

package com.alineselle;
import com.sdz.comportement.*;

import com.sdz.comportement.*;

public abstract class Personnage {

    //Nos instances de comportement par defaut
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();

    //constructeur par défaut
    public Personnage(){}

    //constructeur avec paramètres
    public Personnage(EspritCombatif espritCombatif,Soin soin, Deplacement deplacement){
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement=deplacement;
    }

    //Méthode de déplacement de personnage
    public void seDeplacer(){
        //on utilise les objets de déplacement de façon polymorphe: traduzindo. deplacement é um objeto da Interface Deplacement
        //deplacer é um método definido na interface Deplacement
       deplacement.deplacer();
    }

    //Méthode que les combattants utilisent
    public void combattre(){
        //on utilise les objets de déplacement de façon polymorphe
        espritCombatif.combat();
    }

    //méthode de soin
    public void soigner(){
        //On utilise les objets de déplacement de façon polymorphe
        soin.soigner();
    }

    //redéfinit le comportement de déplacement
    public void setDeplacement(Deplacement deplacement){
        this.deplacement = deplacement;
    }
    //Redéfinit le comportement au combat
    public void setEspritCombatif(EspritCombatif espritCombatif){
        this.espritCombatif=espritCombatif;
    }

//rédefinit le comportement de soin
    public void setSoin(Soin soin){
        this.soin=soin;
    }
    //evolution du code ci-dessus
    /*protected String armes = "", chaussure="",sacDeSoin="";

    //Méthode déplacement de personnage
    public void seDeplacer(){

        System.out.println("Je me déplace à pied.");
    }

    //Méthode que les combattants utilisent
    public  void combattre(){
        System.out.println("Je ne combats PAS!");
    }

    public void soigner(){
        System.out.println("Je ne soigne pas.");
    }

    protected void setArmes(String armes){
        this.armes=armes;
    }

    protected void setChaussure(String chaussure){
        this.chaussure=chaussure;
    }

    protected void setSacDeSoin(String sacDeSoin){
        this.sacDeSoin=sacDeSoin;
    }*/
}
