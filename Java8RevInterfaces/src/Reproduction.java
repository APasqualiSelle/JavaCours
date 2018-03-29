public interface Reproduction {

    public static void description() {
        System.out.println("Méthode statique dans une interface");
    }

  //  void tester();//test avec une methode abstract
    default void tester (){
        System.out.println("Je teste avec la méthode default");
    }
    }



