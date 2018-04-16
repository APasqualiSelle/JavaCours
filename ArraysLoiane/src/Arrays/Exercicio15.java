package Arrays;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o número de posição " + i);
            vetorA[i] = scan.nextInt();

        }


        int par = 0;
        int impar = 0;


        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                par++;


            }

            par = vetorA.length - impar;

            System.out.println();
            System.out.print("Vetor A = ");
            for (i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + " ");

            }
            System.out.println();

            System.out.println("Vetor A contém " + par + " elementos pares et " + impar + " elementos ímpares.");

            //vetorA.length - 100%
            //par           - x
            //=x.vetorA.length == par * 100
            //=x ==(par * 100)/vetorA.length
            double pourcentagemPar = (par * 100) / vetorA.length;
            double pourcentagemImpar = (impar * 100) / vetorA.length;

            System.out.println("Vetor A contém " + pourcentagemPar + " % de elementos pares et " + pourcentagemImpar + " % de elementos ímpares.");
        }
    }}
