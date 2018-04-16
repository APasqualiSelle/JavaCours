package Arrays;

import java.util.Scanner;

public class Exercicio15_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com a posição do vetorA " + i);
            vetorA[i] = scan.nextInt();

        }
        int par = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {

                par++;

            } else {

                impar++;
            }
        }

        int pourcentageP =  (100*par)/vetorA.length;
        int pourcentageI = (100*impar)/vetorA.length;


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");


        }

        System.out.println();

        System.out.println(pourcentageP+" % dos elementos do vetor A contém númeoros pares.");
        System.out.println(pourcentageI+" % dos elementos do vetor A contém númeoros ímpares.");


    }
}
