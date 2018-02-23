package com.sdz;

public class Ville {
 private String nomVille;
    private String nomPays;
  private  int nbreHabitants;
  private char categorie;

    //Constructor par défaut sans paramètres

    public Ville() {

        System.out.println("Création d'une Ville !");
        this.nomVille = "Inconnu";
        this.nomPays = "Inconnu";
        this.nbreHabitants = 0;
    }

    //Constructor avec paramètres
    //j'ai ajouté un <<p>> en première lettre de paramètres
    //Ce n'est pas une convention, mais ça peut être un bon moyen
    //de les répérer
    public Ville(String pNom, int pNbre, String pPays){

        System.out.println("Création d'une ville avec des paramètres!!!");
        nomVille = pNom;
        nomPays=pPays;
        nbreHabitants=pNbre;
    }

    //Les variables et les constructeurs n'ont pas changé...

    //************************** ACCESSEURS ****************

    //Retourne le nom de la Ville
    public String getNom(){
            return nomVille;
    }

    public String getNomPays(){
        return nomPays;
    }

    public int getNombreHabitants(){//I think he changes the name of the methode on purpose ;-)
        return nbreHabitants;
    }

    //*************************** MUTATEURS *****************************

    //Définit le nom de la Ville


    public void setNom(String pnomVille) {
        this.nomVille = pnomVille;
    }

    public void setNomPays(String nomPays){

        this.nomPays = nomPays;
        }
        public void setNbreHabitants(int nbre){

        nbreHabitants = nbre;
        this.setCategorie();
        }


        //Définit la categorie de la Ville
    private void setCategorie(){

        int bornesSuperieures[] = {0, 1000, 10000, 100000,500000,1000000,5000000,10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;//this 'i' has NOTHING to do with the values of the array, that is 0, 1000, 10000, etc
        //but this 'i' corresponds to the same way of an array lecture, that is we start from the 0
        while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
            i++;


        this.categorie = categories[i];//it does NOT belong to the boucle
    }
    //se o boucle while tem apenas uma linha, podemos não colocar {}. Isto para explicar que 'this.categorie = categories{i}
    //não está no boucle.


}


