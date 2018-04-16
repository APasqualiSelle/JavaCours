package Arrays;

import java.util.Scanner;

public class Exercicio20_1 {

 public static void main(String[] args){

     Scanner scan = new Scanner(System.in);

     double[] valoresEmReal = new double[20];
     double cotacaoDolar;
     System.out.println("Entre com a cotação do dólar de hoje : ");
     cotacaoDolar = scan.nextDouble();
     for(int i = 0;i<valoresEmReal.length;i++){

         valoresEmReal[i]= cotacaoDolar * (i+1);
     }

     System.out.println("Lista dos 20 valores convertidos do dólar para o real : ");
     for(int i=0;i<valoresEmReal.length;i++){
         System.out.println(valoresEmReal[i]+" equivalentes a "+(i+1)+" dólar.");
     }
 }
}
