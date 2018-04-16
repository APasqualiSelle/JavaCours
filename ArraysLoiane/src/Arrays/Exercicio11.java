package Arrays;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento do VetorA, posição " + i);
            vetorA[i] = sc.nextInt();


        }
        System.out.print("Os valores pares  do vetorA = ");

        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++) {

            if(vetorA[i]% 2 == 0){

                qtdPares++;

            }

            }
        System.out.println();
        System.out.println("Qtde de números pares = "+qtdPares);

    }
}
