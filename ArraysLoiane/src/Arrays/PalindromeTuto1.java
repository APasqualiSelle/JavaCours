package Arrays;

import java.util.Scanner;

public class PalindromeTuto1 {

    public static void main(String[] args){

        Scanner inputString = new Scanner (System.in);
        System.out.println("Enter a String");
        String str=inputString.next();
        inputString.close();
        String revString=" ";
        char[] ch=str.toCharArray();
        //last character


        for(int i=ch.length-1;i>=0;i--){

            //concatenação vai dar uma string
            revString = revString+ch[i];
        }
        System.out.println(str +" inversé = "+revString);

       // System.out.println(revString);
       if(str.equals(revString)){
           System.out.println(str+" est un palidrome.");
       }else {
           System.out.println(str + " n'est pas un palindrome.");
       }
        System.out.println("Oi");
    }
}
