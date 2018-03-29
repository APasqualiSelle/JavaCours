package com.alineselle;

public interface Reproduction {

    public static void description(){
        System.out.println("Méthode statique dans une Interface");
    }

    public void test();
    default void alienigena(){
        System.out.println("Minha casa...telefone...");
    }
}
