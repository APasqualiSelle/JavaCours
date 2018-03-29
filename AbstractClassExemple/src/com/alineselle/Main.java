package com.alineselle;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        MaheshePhone obj = new SureshPhone();
        obj.call();
        obj.dance();
        obj.move();
        obj.cook();*/

        IPhone obj = new IPhone();
       Samsung4 obj1 = new Samsung4();
        show(obj1);

    }
        public static void show(Phone obj1){
           obj1.showConfig();
        }

        public static void show(Samsung4 obj){
        obj.showConfig();
        }
    }

