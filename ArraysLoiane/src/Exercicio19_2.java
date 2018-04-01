import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19_2 {

    public static void main(String[] main){

        double notasBimestrais1[] = new double[10];
        double notasBimestrais2[] = new double[notasBimestrais1.length];
        double resultat[]=new double[notasBimestrais1.length];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<notasBimestrais1.length;i++){
            System.out.println("Entre com a primeira nota bimestral do aluno "+(i+1));
            notasBimestrais1[i]= scan.nextDouble();
        }

        for(int i=0;i<notasBimestrais2.length;i++){
            System.out.println("Entre com a segunda nota bimestral do aluno "+(i+1));
            notasBimestrais2[i]=scan.nextDouble();
        }

        for(int i=0;i<resultat.length;i++){
            resultat[i]=(notasBimestrais1[i]+notasBimestrais2[i])/2;
        }
        System.out.print("As primeiras notas bimestrais são :");
        for (int i=0;i<notasBimestrais1.length;i++){
            System.out.print(notasBimestrais1[i]+" ");
        }
        System.out.println();
        System.out.print("As segundas notas bimestrais são :");
        for(int i=0;i<notasBimestrais2.length;i++){
            System.out.print(notasBimestrais2[i]+" ");
        }
        System.out.println();
        System.out.print("A média das notas bimestrais são ");
        for(int i=0;i<resultat.length;i++){
            System.out.print(resultat[i]+" ");
        }
        System.out.println();
        DecimalFormat df = new DecimalFormat("###,###.##");
        for(int i=0;i<resultat.length;i++){
            if(resultat[i]>=7){
                System.out.println("Aluno "+(i+1)+" aprovado.");
            }else {
                System.out.println("Aluno "+(i+1)+" reprovado.");
            }
        }

    }
}
