package Arrays;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for(int i = 0; i<notas1.length;i++){

            System.out.println("Entre com as notas do 1 bimestre do aluno  "+(i+1));
            notas1[i] = scan.nextDouble();

            System.out.println("Entre com as notas do 2 bimestre do aluno  "+(i+1));
            notas2[i] = scan.nextDouble();

            resultados[i]=(notas1[i]+notas2[i])/2;


        }

        System.out.print("Notas 1 = ");
        for(int i = 0;i<notas1.length;i++){
            System.out.print(notas1[i]+ " ");
        }
        System.out.println();
        System.out.print("Notas 2 = ");
        for(int i =0;i<notas1.length;i++){
            System.out.print(notas2[i]+" ");
        }

        System.out.println();

        for(int i=0; i<resultados.length;i++){

            if(resultados[i]>= 7){
                System.out.print("Aluno " + (i+1) +" = aprovado. Média = ");
                System.out.println(resultados[i]);
            }else {
                System.out.print("Aluno " + (i+1)+ " = reprovado. Média = ");
                System.out.println(resultados[i]);
            }
        }


    }
}
