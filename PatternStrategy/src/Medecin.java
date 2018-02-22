public class Medecin extends Personnage {

    public void combattre(){

       // System.out.println("Vive le scalpel!");
        if (this.armes.equals("pistolet"))
            System.out.println("Ataque au pistolet !");
        else
            System.out.println("Vive le scalpel!");
    }

//    public void seDeplacer(){
//
//        System.out.println("Je me déplace à pied.");
//    }

    public void soigner(){
        //System.out.println("Je soigne les blessures.");
        if(this.sacDeSoin.equals("petit sac"))
            System.out.println("Je peux recoudre des blessures. ");
        else
            System.out.println("Je soigne les blessures.");
    }

}
