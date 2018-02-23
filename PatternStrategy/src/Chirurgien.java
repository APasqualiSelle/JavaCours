import com.sdz.comportement.*;
public class Chirurgien extends Personnage {

  /*  public void combattre(){
        System.out.println("Je ne combat PAS!");
    }

    public void seDeplacer(){
        System.out.println("Je me déplace à pied.");
    }*//*

    public void soigner(){
        //System.out.println("Je fais des opérations.");
        if(this.sacDeSoin.equals("gros sac"))
            System.out.println("Je fais de merveilles.");
        else
            System.out.println("Je fais des opérations.");
    }*/
public Chirurgien(){

    this.soin = new Operation();
}



}
