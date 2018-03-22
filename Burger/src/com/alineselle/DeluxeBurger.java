package com.alineselle;

public class DeluxeBurger extends BasicBurger {

    private boolean drinks;
    private boolean chips;
    double total;
    double drinksPrice = 0.45;
    double chipsPrice = 0.50;

    public DeluxeBurger(double price, boolean meat, String rollType) {

        super(price, meat, rollType);


    }

    public void choosenDeluxeAdditions(boolean drinks, boolean chips) {
        System.out.println("Total additions : ");
        if (drinks == true) {

            System.out.println("Drinks = 0.45");
        }
        if (chips == true) {
            System.out.println("Chips = 0.50");
        }

        System.out.println("**********************");
        this.chips=chips;
        this.drinks=drinks;
    }


    private double sumDeluxeAdditions() {


        if (this.drinks == true) {

            total += this.drinksPrice;

        }
        if (this.chips == true) {
            total += this.chipsPrice;

        }

        return this.total;
    }

    @Override
    public double totalAmount() {

        return  super.getBasePrice()+this.sumDeluxeAdditions();
    }

    @Override
    public String getName() {
        return "Deluxe";
    }


    }










