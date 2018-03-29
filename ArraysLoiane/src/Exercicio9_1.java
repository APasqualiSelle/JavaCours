import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9_1 {

    public static void main(String[] args) {


        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[]vetorC=new double[vetorB.length];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a posição do vetor A de numero " + (i+1));
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com a posição do vetor B de numero " + (i+1));
            vetorB[i] = scan.nextInt();
        }

        for(int i=0;i<vetorA.length;i++){
            vetorC[i] = (int)(vetorA[i]/vetorB[i]);
        }
        System.out.print("vetorA = ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.print("vetorB = ");
        for(int i=0;i<vetorB.length;i++){
            System.out.print(vetorB[i]+" ");
        }
        //para formatar o output
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println();
        System.out.print("vetorC = ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorC[i]+" ");
        }


    }
}
