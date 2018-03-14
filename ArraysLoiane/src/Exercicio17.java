import java.util.Scanner;

public class Exercicio17 {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre a idade(valor armazenado) de posição " + i);
            vetorA[i] = scan.nextInt();
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }


        int qtePessoasMaior15 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {

                qtePessoasMaior15++;
            }

            }

        System.out.println();
        System.out.println("A quantidade de pessoas com idade superior a 35 é igual a "+qtePessoasMaior15);
    }
}
