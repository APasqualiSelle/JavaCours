import java.util.Scanner;

public class Exercicio18_1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];

for(int i = 0; idades.length > i; i++){

    System.out.println("Entre com a idade da pessoa numero "+i+1);
    idades[i]=scan.nextInt();

}
        int maiorIdade = idades[0];
        int indexMaior = 0;
        int indexMenor=0;
        int menorIdade = idades[0];

        for(int i=1;i<idades.length;i++){
            if(idades[i]>maiorIdade){
                maiorIdade=idades[i];
                indexMaior=i;
            }else if(idades[i]<menorIdade){
                menorIdade=idades[i];
                indexMenor=i;
            }
        }

        System.out.println("A maior idade é igual a "+maiorIdade+". Sua posição é o index de número "+indexMaior);
        System.out.println("A menor idade é igual a "+menorIdade+". Sua posição é o index de número "+indexMenor);
    }
}
