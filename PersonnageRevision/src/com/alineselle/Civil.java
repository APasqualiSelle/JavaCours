package com.alineselle;

import com.sdz.comportement.*;
public class Civil extends Personnage {

    public Civil(){

    }

    public Civil(EspritCombatif esprit,Soin soin, Deplacement dep){
        super(esprit,soin,dep);
    }





/*public void combattre(){
    if(this.armes.equals("couteau"))
        System.out.println("Attaque au couteau !");
    else
        System.out.println("Je ne combats PAS!");
}*/
}
