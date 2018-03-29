class Alien implements Pondre, Mitose {

   public void reproduire() {

       System.out.println("Je suis un alien et ");
       Pondre.super.reproduire();
       Mitose.super.reproduire();

   }
   //methode abstract de Reproduction modifié pour pouvoir être utilisé
   /* public void tester(){
        System.out.println("Je teste");
    }*/
}
