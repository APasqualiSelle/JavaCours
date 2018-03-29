package com.alineselle;
import com.sdz.comportement.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

for(int i=0; i< tPers.length;i++){

    System.out.println("\nInstance de "+tPers[i].getClass().getSimpleName());
    System.out.println("**********************************************");
    tPers[i].combattre();
    tPers[i].seDeplacer();
    tPers[i].soigner();
}*/

Personnage pers = new Guerrier();
pers.soigner();
pers.setSoin(new Operation());//omg setSoin é um método definido em Personnage -> Operação é uma classe que implementa Soin
pers.soigner();

//evolution du code ci-dessus
       /* Personnage[] tPers ={new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};
        String[] tArmes={"pistolet", "pistolet","couteau","fusil à pompe","couteau"};
        String[] tSacDeSoin={"gros sac","gros sac","gros sac","gros sac","petit sac"};

        for(int i=0;i<tPers.length;i++){
            System.out.println("\nInstance de "+tPers[i].getClass().getSimpleName());
            System.out.println("*********************************************");
            tPers[i].combattre();
         tPers[i].setArmes(tArmes[i]);
           tPers[i].combattre();
           tPers[i].seDeplacer();
           tPers[i].soigner();
           tPers[i].setSacDeSoin(tSacDeSoin[i]);
           tPers[i].soigner();
*/

        }
    }

