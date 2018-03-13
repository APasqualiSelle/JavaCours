import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for(int i =0;i<vetorA.length;i++){

            System.out.println("O valor do vetor A na posição "+i);
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        int igual = 0;
        int media = 0;//A soma dos elementos dividido pela quantidade de elementos
        int someMaior15 = 0;
        int elementosMaior15 = 0;
        for(int i=0; i<vetorA.length;i++){

            if(vetorA[i] < 15){

                soma+=vetorA[i];
            }

            if(vetorA[i]==15){

                igual++;
            }

            if(vetorA[i]>15){

                someMaior15+=vetorA[i];
                elementosMaior15++;
                media = someMaior15/elementosMaior15;


            }

        }

        System.out.print("Vetor A = ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();

        System.out.println("A soma dos elementos inferiores a 15 ="+soma);
        System.out.println("A quantidade de elementos armazenados no vetor iguais a 15 = "+igual);
        System.out.println("A média dos elementos que são superiores a 15 = "+media);

    }
}
