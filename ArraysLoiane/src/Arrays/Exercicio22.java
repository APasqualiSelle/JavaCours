package Arrays;

public class Exercicio22 {

    public static void main(String[]args) {

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = (int) Math.round(Math.random() * 1);
            System.out.println(vetorA[i]);
        }

        int qte1 = 0;
        int qte0 = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] == 0) {

                qte0++;

            } else if (vetorA[i] == 1) {
                qte1++;
            }

        }

        //10 elementos = 100 %
        //qtd - x
        //x =(
        int pourcentage1 = (qte1*100)/vetorA.length;
        int pourcentage0=(qte0*100)/vetorA.length;
        System.out.println("A porcentagem de 1 = "+pourcentage1+" %");
        System.out.println("A porcentagem de 0 = "+pourcentage0+" % ");


    }


}
