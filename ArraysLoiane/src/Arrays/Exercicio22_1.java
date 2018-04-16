package Arrays;

public class Exercicio22_1 {

   public static void main(String[] args){

       int[] numerosAleatorios = new int[10];

       for(int i=0;i<numerosAleatorios.length; i++){

            numerosAleatorios[i]=(int)Math.round(Math.random()*1);
           System.out.println(numerosAleatorios[i]);




       }

       int qte1 = 0;
       int qte0= 0;

       for(int i=0;i<numerosAleatorios.length;i++){

           if(numerosAleatorios[i] == 1){

               qte1++;
           }else if (numerosAleatorios[i] == 0){
               qte0++;
           }

       }
       int percentual1 = (100*qte1)/numerosAleatorios.length;
       int percentual0=(100*qte0)/numerosAleatorios.length;

       System.out.println("Foram impressos "+percentual1+ " % de numero 1");
       System.out.println("Foram impressoas "+percentual0+ " % de numero 0");
   }


}
