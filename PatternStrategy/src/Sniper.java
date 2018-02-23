import com.sdz.comportement.CombatPistolet;

public class Sniper extends Personnage {

    /*public void combattre() {
      *//*  //System.out.println("Je me sers de mon fusil  à la lunette!");
        if(this.armes.equals("fusil à pompe"))
            System.out.println("Attaque au fusil à pompe !");
        else
            System.out.println("Je me sers de mon fusil à lunette !");
    }

  *//**//*  public void seDeplacer(){
        System.out.println("Je me déplace à pied.");
    }*//*

    }*/

    public Sniper() {
        this.espritCombatif = new CombatPistolet();
    }
}
