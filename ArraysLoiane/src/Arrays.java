public class Arrays {

    public static void main(String[] args){

       /* double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
        double tempDia006 = 32.8;
        double tempDia007 = 30;
        double tempDia008 = 29.8;
        double tempDia009 = 31.5;*/

       double[] temperaturas = new double[365];
       temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        temperaturas[5] = 31.3;
        temperaturas[6] = 31.3;
        temperaturas[7] = 31.3;
        temperaturas[8] = 31.3;
        temperaturas[9] = 31.3;

        System.out.println("O valor da temperatura do dia  1 é "+temperaturas[0]);
        System.out.println("O tamanho do array: "+temperaturas.length);
        System.out.println("Valores do array "+temperaturas);//donne l'adresse de mémoire du array

       /* //quand j'utilise la boucle for, l'incrementation va être faite seulement après le premiere print
        //cest pour ça que j'augment mon i avec +1 dans la formule
        for(int i =0; i<temperaturas.length;i++){
            System.out.println("O valor da temperatura do dia "+(i+1)+" é :"+temperaturas[i]);

        }*/

        //autre façon de imprimer le for
        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
