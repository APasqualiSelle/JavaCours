import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o número de posição " + i);
            vetorA[i] = scan.nextInt();
        }


        System.out.println();
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        double soma=0;
        double impar=0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 != 0) {
                soma+=vetorA[i];
                impar++;
            }

        }
        System.out.println();
double media = soma/impar;
        System.out.println("A soma dos valores armazenados impares = "+ soma);
        System.out.println("A média da soma  dos elementos ímpares do vetor A = "+media);

    }
}
