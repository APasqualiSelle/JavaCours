package Arrays;

import java.util.Scanner;

public class Exercicio10_1 {

    public static void main(String[]args){

        int[]vetorA=new int[10];
        int[]vetorB=new int[vetorA.length];

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<vetorA.length;i++){
            System.out.println("Entre com o elemento do vetor A de posição "+i);
            vetorA[i]=scan.nextInt();
            vetorB[i]= vetorA[i]%2;
        }

        System.out.print("Vetor A = ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for(int i=0;i<vetorB.length;i++){
            System.out.print(vetorB[i]+" ");
        }
    }
}
