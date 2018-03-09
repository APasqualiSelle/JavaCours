import java.util.Scanner;
public class Exercicio13 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for(int i =0;i<vetorA.length;i++){
            System.out.println("Entre com o elemento do vetorA de posição "+ i);
            vetorA[i]=scan.nextInt();

        }

        System.out.println();
        System.out.print("Vetor A = ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
       int somaMultiplos = 0;
       for(int i=0;i<vetorA.length;i++){

           if(vetorA[i]% 5 == 0){
               somaMultiplos+=vetorA[i];
           }
       }

        System.out.println("A soma dos mútliplos de 5 = "+somaMultiplos);


    }
}
