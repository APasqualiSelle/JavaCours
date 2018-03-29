import java.util.Scanner;

public class PalindromeTuto2 {

    public static void main(String[]args){
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input String : ");
        String word = scan.nextLine();

        for (int i = word.length()-1;i>=0;i--){

            reverse=reverse+word.charAt(i);//um tableau não tem o mesmo valor que sa lenght por que aline.length = 5
            //aline[i] = 0, 1, 2, 3, 4 Então tira-se um do lenght (-1) para poder verificar
            // indice começa com 4 , depois 3, 2, 1, 0
            //e posição 4, ensuite 3, 2, 1 e 0. Se fosse a longuer, a comparação comecaria
            //por 5 depois 4, 3, 2, 1,
        }

        if(word.equals(reverse)){
            System.out.println("Given String is a palindrome");
        }else {
            System.out.println("Given string is NOT a palindrome");
        }
    }
}
