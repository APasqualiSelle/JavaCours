import com.sdz.comportement.*;
public class Guerrier extends Personnage {

    /*public void combattre(){
       // System.out.println("Fusil, pistolet, couteau! Tout ce que tu veux!");
        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet !");
        else if(this.armes.equals("fusil de sniper"))
            System.out.println("Attaque au fusil de sniper !");
        else
            System.out.println("Attaque au couteau!");
    }*/

//    public void seDeplacer(){
//        System.out.println("Je me déplace à pied.");
//    }//PLUS besoin de cette méthode car nous avons maintenant le comportement par défaut dans Personnage

   public Guerrier(){// cela cest un constructeur

       this.espritCombatif = new CombatPistolet();
   }

   /*public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep){

       super(esprit, soin, dep);
   }*/


}
