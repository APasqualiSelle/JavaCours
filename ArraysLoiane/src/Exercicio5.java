import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length;i++){

            System.out.println("Entre com a posição de número "+ i);
            vetorA[i]=scan.nextInt();
            vetorB[i]=vetorA[i]*i;
            }

        System.out.println();
        System.out.print("Vetor A = ");
        for(int i =0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }

    }
}
