package Arrays;
import java.util.Scanner;

public class Exercicio29 {
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length*2];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com os elementos do vetor A de posição "+i);
            vetorA[i]=scan.nextInt();
            vetorC[i]=vetorA[i];
        }
       for (int i = 0; i < vetorB.length; i++){
            System.out.println("Entre com os elementos do vetor B de posição "+i);
            vetorB[i]=scan.nextInt();
            vetorC[vetorA.length+i]=vetorB[i];
        }

        System.out.print("Vetor A = ");
        for(int i = 0;i<vetorA.length;i++) {
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for(int i = 0;i<vetorB.length;i++) {
            System.out.print(vetorB[i]+" ");
        }

        System.out.println();
        System.out.print("Vetor C = ");
        for(int i = 0;i<vetorC.length;i++) {
            System.out.print(vetorC[i]+" ");
        }



    }
}
