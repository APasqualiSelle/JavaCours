package Arrays;

public class Exercicio22_2 {

    public static void main(String[]args){

int[]vetorA = new int[10];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i]=(int)Math.round(Math.random()*1);
            System.out.println(vetorA[i]);
        }
        //pourcentage
        int compteur1 =0;
        int compteur0 =0;
        for(int i=0;i<vetorA.length;i++){
            if(vetorA[i]%2 == 0){
                compteur0++;
            } else if(vetorA[i]%2==1){
               compteur1++;
            }
        }
        int pourcentage1 = 0;
        int pourcentage0=0;

        for(int i=0;i<vetorA.length;i++){
             pourcentage1 = (compteur1 * 100)/vetorA.length;
             pourcentage0=(compteur0* 100)/vetorA.length;


        }


        System.out.println("O vetor A contém "+ pourcentage1+ " % de 1 et "+pourcentage0+" % de 0 .");
    }


}
