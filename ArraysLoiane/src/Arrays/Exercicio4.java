package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int[] vetorA = new int [15];
        double[] vetorB = new double[vetorA.length];

        for(int i =0;i < vetorA.length;i++){
            System.out.println("Entre com o valor da posição "+ i);
            vetorA[i]=scan.nextInt();
            vetorB[i]=Math.sqrt(vetorA[i]);
            }

            DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println();
        System.out.print("Vetor A = ");
        for(int i =0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(df.format(vetorB[i])+ " ");
        }

    }
}
