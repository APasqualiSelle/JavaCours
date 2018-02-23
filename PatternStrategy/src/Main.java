

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper (), new Medecin()};
        String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil à pompe", "couteau"};


        *//*for(Personnage p: tPers){

            System.out.println("\nInstance de " + p.getClass().getName());
            System.out.println("**********************************************************");
            p.combattre();
            p.seDeplacer();

        }*//*

        for(int i = 0; i < tPers.length; i++){

            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("**********************************************");
            tPers[i].combattre();
            //parcourir les armes de tous les personnages:
            tPers[i].setArmes(tArmes[i]);
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();


        }*/
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin(), new Chirurgien(), new Sniper()};

        for (int i = 0; i < tPers.length; i++) {

            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("**********************************************");
            tPers[i].soigner();
            tPers[i].seDeplacer();
            tPers[i].combattre();
        }

    }
}
