package com.alineselle;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "Sausage and Bacon", 14.54, "white");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");

    }
        @Override
        public void addHamburgerAddition4(String name,double price){
            System.out.println("Cannot add additional items to a deluxe hamburger");
        }
    }

