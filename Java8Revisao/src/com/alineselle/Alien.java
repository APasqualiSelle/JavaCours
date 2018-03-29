package com.alineselle;

public class Alien implements Pondre,Mitose {

    @Override
    public void test() {
        System.out.println("testando 2...");
    }

    public void reproduire(){
        System.out.println("Je suis un alien et: ");
        Pondre.super.reproduire();
        Mitose.super.reproduire();
    }

}
