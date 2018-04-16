package Arrays;

import java.util.Scanner;

public class Exercicio19_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[4];
        double[] nota2 = new double[nota1.length];
        double[] resultados = new double[nota1.length];


        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Entre com a primeira nota do aluno: " + (i + 1));
            nota1[i] = scan.nextDouble();
            System.out.println("Entre com a segunda nota do aluno: " + (i + 1));
            nota2[i] = scan.nextDouble();

            resultados[i] = (nota1[i] + nota2[i]) / 2;

        }
        System.out.println("Resultados finais : ");
        for (int i = 0; i < resultados.length; i++) {

            System.out.println(resultados[i]);
        }

        System.out.println();
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] >= 7) {
                System.out.println("Aluno " + (i + 1) + " : aprovado");
            } else if (resultados[i] < 7) {
                System.out.println("Aluno " + (i + 1) + " : reprovado");
            }


        }
    }
}
