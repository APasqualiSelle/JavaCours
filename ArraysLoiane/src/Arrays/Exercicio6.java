package Arrays;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[]vetorB = new int[vetorA.length];
        int[]vetorC = new int[vetorB.length];

    for (int i=0;i<vetorA.length;i++){

        System.out.println("Entre com o valor do vetorA posição: " + i);
        vetorA[i]=scan.nextInt();
        }

        for(int i = 0; i<vetorB.length;i++){
            System.out.println("Entre com o valor do vetorB posição: " + i);
            vetorB[i]=scan.nextInt();
        }

        for (int i = 0;i<vetorC.length;i++){

        vetorC[i]=vetorA[i]+vetorB[i];
        }

        System.out.print("Vetor A = ");
    for(int i =0;i<vetorA.length;i++){
        System.out.print(vetorA[i]+" ");
    }
        System.out.println();
        System.out.print("Vetor B = ");
        for(int i = 0;i<vetorB.length;i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.println();
        System.out.print("Vetor C = ");
        for(int i =0;i<vetorC.length;i++){
            System.out.print(vetorC[i]+" ");

        }



    }

}
