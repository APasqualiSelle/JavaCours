package com.sdz;


public class Ville {


    //variables d'instance
    protected String nomVille;
    protected String nomPays;
    protected int nbreHabitants;
    protected char categorie;

    //variables de classe public qui comptent les instances: variables de classes
    public static int nbreInstances = 0;

    //variable de classe privée  qui comptera aussi les instances
    private static int nbreInstancesBis = 0;

    //Constructor par défaut sans paramètres


    public Ville() {

        System.out.println("Création d'une Ville !");
        this.nomVille = "Inconnu";
        this.nomPays = "Inconnu";
        this.nbreHabitants = 0;
        this.setCategorie();
        //On incrémente nos variables de classe à chaque appel aux constructeurs
        nbreInstances++;
        nbreInstancesBis++;
    }

    //Constructor avec paramètres
    //j'ai ajouté un <<p>> en première lettre de paramètres
    //Ce n'est pas une convention, mais ça peut être un bon moyen
    //de les répérer
    public Ville(String pNom, int pNbre, String pPays) throws
            NombreHabitantException, NomVilleException {
        if (pNbre < 0)
            throw new NombreHabitantException(pNbre);
        if(pNom.length()<3)
            throw new NomVilleException("le nom de la ville est inférieur à 3 caractères! nom = "+pNom);
        else
                 {
                nbreInstances++;
                nbreInstancesBis++;
                System.out.println("Création d'une ville avec des paramètres!!!");
                nomVille = pNom;
                nomPays = pPays;
                nbreHabitants = pNbre;
                this.setCategorie();
                //On incrémente nos variables de classe à chaque appel aux constructeurs

            }

        }


        //Les variables et les constructeurs n'ont pas changé...

        //************************** ACCESSEURS ****************


        public static int getNbreInstancesBis () {//l'accesseur est aussi déclarée static
            return nbreInstancesBis;
        }

        public char getCategorie () {
            return categorie;
        }

        //Retourne le nom de la Ville
        public String getNom () {
            return nomVille;
        }

        public String getNomPays () {
            return nomPays;
        }

        public int getNombreHabitants () {//I think he changes the name of the methode on purpose ;-)
            return nbreHabitants;
        }

        //*************************** MUTATEURS *****************************

        //Définit le nom de la Ville


        public void setNom (String pnomVille){
            this.nomVille = pnomVille;
        }

        public void setNomPays (String nomPays){

            this.nomPays = nomPays;
        }
        public void setNbreHabitants ( int nbre){

            nbreHabitants = nbre;
            this.setCategorie();
        }


        //Définit la categorie de la Ville
        private void setCategorie () {

            int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
            char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

            int i = 0;//this 'i' has NOTHING to do with the values of the array, that is 0, 1000, 10000, etc
            //but this 'i' corresponds to the same way of an array lecture, that is we start from the 0
            while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
                i++;


            this.categorie = categories[i];//it does NOT belong to the boucle:  //se o boucle while tem apenas uma linha, podemos não colocar {}. Isto para explicar que 'this.categorie = categories{i}
            //não está no boucle.


        }

        //retourne la description de la Ville
        public String decrisToi () {
            return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
                    + " habitant(s) => elle est donc de catégorie : " + this.categorie;
        }

        //Retourne une chaîne de caractères selon le résultat de la comparaison
        public String comparer (Ville v1){

            String str = new String();

            if (v1.getNombreHabitants() > getNombreHabitants())//au lieu de this.nbreHabitants
                str = v1.getNom() + " est une ville plus peuplée que " + this.nomVille;
            else
                str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();
            return str;
        }

        //méthode toString de la classe Object
    public String toString(){
        return "\n\n\t\t"+this.nomVille+" est une ville de "+this.nomPays+" elle  comporte : "+this.nbreHabitants+" ==> elle" +
                " est donc de catégorie :"+this.categorie;
    }


        public int hashCode () {

            final int prime = 31;
            int result = 1;

            result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
            result = prime * result + ((nomVille == null) ? 0 : nomVille.hashCode());
            return result;
        }
    }





