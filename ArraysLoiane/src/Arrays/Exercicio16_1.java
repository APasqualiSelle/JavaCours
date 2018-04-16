package Arrays;

import java.util.Scanner;

public class Exercicio16_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;
        int qteIguais15 = 0;
        int mediaSup15 = 0;
        int qtdMaior15 = 0;//aqui não consegui fazer sozinha
        int somaMaior15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento do vetor A de posição " + i);
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 15) {
                soma += vetorA[i];
            } else if (vetorA[i] == 15) {
                qteIguais15++;
            } else  {
              qtdMaior15++;
              somaMaior15+=vetorA[i];
              mediaSup15=somaMaior15/qtdMaior15;

            }

        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma dos valores inferiores à 15 = " + soma);
        System.out.println("A quantidade de números iguais a 15 = " + qteIguais15);
        System.out.println("A média dos números > 15 = " + mediaSup15);


    }
}
