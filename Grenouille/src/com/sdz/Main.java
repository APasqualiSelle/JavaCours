package com.sdz;

import java.util.Scanner;

public class Main {

    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        int bebe = 0, grenouille = 0, semaine = 0, total=0, ancienBebe =0;


        System.out.println("Combien d'adultes y-a-t-il dans la marre?");
        int adultes = clavier.nextInt();
        total=adultes;

        while(total < 400){
            System.out.println("Semaine "+semaine+" : "+bebe+" bebes "+adultes+" adultes.Total = "+total);
            ancienBebe=bebe;
            bebe=adultes*2;
            if(adultes<=4){
                adultes=0;
            }else{
                adultes=adultes-4;
            }
            adultes=adultes+ancienBebe;
            total=adultes+bebe;
            semaine++;
        }

        System.out.println("Il a fallu "+semaine+" semaines pour remplir la marre.");
    }
}









