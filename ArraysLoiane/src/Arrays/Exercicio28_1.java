package Arrays;

import java.util.Scanner;

public class Exercicio28_1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com os elementos do vetor A de posição " + i);
            vetorA[i] = scan.nextInt();
            vetorB[vetorA.length - 1 - i] = vetorA[i];

        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]);
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[vetorA.length - 1] = vetorA[i];
            System.out.print(vetorB[i]);
        }

    }

}
