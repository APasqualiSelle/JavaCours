package com.alineselle;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* int j = 20, i =0;
        try{
            System.out.println(j/i);
        }catch(ArithmeticException e){
            System.out.println("Division par zero !"+e.getMessage());
        }

        System.out.println("Coucou à toi!");
    }*/
        try{
            System.out.println(" =>"+(1/0));
        }catch(ClassCastException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("action faite systématiquement");
        }
    }
}
