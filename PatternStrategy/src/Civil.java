public class Civil extends Personnage {


    //PLUS besoin de déclarer ces comportements ici car nous avons déjà sur Personnage
    /* public void combattre(){
         System.out.println("Je ne combat PAS!");
    }

    public void seDeplacer(){
        System.out.println("Je me déplace à pied.");
    }*/

    public void combattre(){
        if(this.armes.equals("couteau"))
            System.out.println("Attaque au couteau!");
        else
            System.out.println("Je ne combat PAS !");
    }

}

