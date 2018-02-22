import com.sdz.comportement.*;

public abstract class Personnage {

    //Nos instances de comportement
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();

    public Personnage() {
    }

    //Constructeur avec paramètres

    public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;

    }


    //    //Méthode de déplacement de personnage
//    public abstract void seDeplacer();
//
//    //méthode que les combattants utilisent
//    public abstract void combattre();
    //méthode de comportement par défaut:

    /* protected String armes = "", chaussure = " ", sacDeSoin = "";

     public void seDeplacer(){
         System.out.println("Je me déplace à pied.");
     }

     public void combattre(){
         System.out.println("Je ne combat PAS!");
     }

     public void soigner(){
         System.out.println("Je ne soigne pas.");
     }

     //utilisations de mutateurs = setters pour defenir après pour chaque
     //personnage leurs armes, chaussure et sac de soin

     protected void setArmes(String armes){

         this.armes = armes;
     }

     protected void setChaussure(String chaussure){
         this.chaussure = chaussure;
     }
     protected void setSacDeSoin(String sacDeSoin){
         this.sacDeSoin = sacDeSoin;
     }
 */
    //Méthode de déplacement de personnage
    public void seDeplacer() {
        //On utilise les objets de déplacement de façon polymorphe
        deplacement.deplacer();
    }

    //Méthode que les combattants utilisent
    public void combattre() {
        //On utilise les objets de déplacement de façon polymorphe
        espritCombatif.combat();
    }

    //Méthode de soin
    public void soigner() {
        //On utilise les objets de soin de façon polymorphe
        soin.soigne();
    }

    //redéfinit le comportement au combat
    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    //redéfinit le comportement de soin
    public void setSoin(Soin soin){
        this.soin = soin;
    }

    //redéfinit le comportement de déplacement
    public void setDeplacement(Deplacement deplacement){
        this.deplacement = deplacement;
    }
}

